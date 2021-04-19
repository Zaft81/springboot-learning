package com.jzweb.springboot.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ryan
 * @version 1.0
 * @date 11/22/2020
 */
@Api(tags = "接口用例")
@RestController
@RequestMapping("/api/login")
public class LoginController
{
    @ApiOperation(value = "登录",notes = "接口登录",produces = "application/json")
    @ApiImplicitParams({@ApiImplicitParam(name = "uname",value = "user name",required = true,dataType = "String"),
            @ApiImplicitParam(name = "pwd",value = "password",required = true,dataType = "String")})
    @RequestMapping(value = "/in", method = RequestMethod.POST)
    public Map<String, String> login(String uname,String pwd)
    {
        Map<String, String> map = new HashMap<>();
        map.put("uname",uname);
        return map;
    }

    @ApiOperation(value = "菜单",notes = "获取菜单",produces = "application/json")
    @RequestMapping(value = "/menu", method = RequestMethod.GET)
    public Map<String, String> menu(){
        return new HashMap<>();
    }

}
