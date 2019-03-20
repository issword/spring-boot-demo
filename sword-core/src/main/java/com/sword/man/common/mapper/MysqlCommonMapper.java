package com.sword.man.common.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

public interface MysqlCommonMapper<T> extends Mapper<T>, MySqlMapper<T>{

}
