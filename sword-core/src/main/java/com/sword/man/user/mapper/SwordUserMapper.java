package com.sword.man.user.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.sword.man.common.mapper.MysqlCommonMapper;
import com.sword.man.user.entity.SwordUser;

@Mapper
@Repository
public interface SwordUserMapper extends MysqlCommonMapper<SwordUser>{

}
