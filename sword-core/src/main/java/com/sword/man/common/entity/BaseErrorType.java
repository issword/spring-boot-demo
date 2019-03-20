package com.sword.man.common.entity;

public class BaseErrorType
{
	
  public static final BaseErrorType SYSTEM_PARAMETER_ERROR_ERROR = new BaseErrorType("999001", "SYSTEM_PARAMETER_ERROR", "请求参数错误");
  
  String code;
  String name;
  String msg;
  
  public BaseErrorType() {}
  
  public BaseErrorType(String code, String name, String msg)
  {
    this.name = name;
    this.code = code;
    this.msg = msg;
  }
  
  public String getCode()
  {
    return this.code;
  }
  
  public void setCode(String code)
  {
    this.code = code;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public void setName(String name)
  {
    this.name = name;
  }
  
  public String getMsg()
  {
    return this.msg;
  }
  
  public void setMsg(String msg)
  {
    this.msg = msg;
  }
  
  public String toString()
  {
    return "{code='" + this.code + '\'' + ", name='" + this.name + '\'' + ", msg='" + this.msg + '\'' + '}';
  }
  
}
