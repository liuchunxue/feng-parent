package com.feng.module.test.dao;

import com.feng.module.test.entity.Config;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
public interface TestMapper{
    List<Config> listConfig();
    @Select(" select * from sys_config where  variable= #{variable}")
    List<Config> findByVariable(@Param("variable") String variable);
}
