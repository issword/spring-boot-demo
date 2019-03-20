package com.sword.man.user.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.sword.man.common.entity.ResultEntity;
import com.sword.man.user.entity.SwordUser;
import com.sword.man.user.mapper.SwordUserMapper;

import tk.mybatis.mapper.entity.Example;

@Service
public class SwordUserService {
	
	@Resource
	private SwordUserMapper swordUserMapper;
	
	public ResultEntity<List<SwordUser>> queryAllUser() {
		Example example = new Example(SwordUser.class);
		Example.Criteria criteria = example.createCriteria();
		criteria.andLike("userName", "王");
		PageHelper.startPage(1, 2, "user_id desc");
		List<SwordUser> list = swordUserMapper.selectByExample(example);
		return new ResultEntity<>(list);
	}

}
