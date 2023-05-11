package com.feng.module.test.service;

import com.feng.module.test.dao.TestMapper;
import com.feng.module.test.entity.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import java.util.List;

@Service
public class TestService {
    @Autowired
    private TestMapper testMapper;
    @Autowired
    private TransactionTemplate transactionTemplate;

    @Transactional
    public List<Config> listConfig() {
        return testMapper.listConfig();
    }

    /**
     * 编程式事务，支持代码块事务2
     * @param s
     * @return
     */
    public List<Config> findByVariable(String s) {
        List<Config> list = transactionTemplate.execute(new TransactionCallback<List<Config>>() {
            @Override
            public List<Config> doInTransaction(TransactionStatus transactionStatus) {
                return testMapper.findByVariable(s);
            }
        });
        return list;
    }
}
