package com.sword.man.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sword.man.common.entity.ResultEntity;
import com.sword.man.user.entity.SwordUser;
import com.sword.man.user.service.SwordUserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "用户信息管理接口", description="用户信息管理接口") 
@RequestMapping("/api/user")
@RestController
public class UserController {
	
	@Autowired
	private SwordUserService userService;
	
	@RequestMapping(value = "/queryAllUser", method = RequestMethod.GET)
	@ApiOperation(value="查询所有用户接口", notes = "查询所有用户接口")
	public ResultEntity<List<SwordUser>> queryAllUser() {
		return userService.queryAllUser();
	}

}
