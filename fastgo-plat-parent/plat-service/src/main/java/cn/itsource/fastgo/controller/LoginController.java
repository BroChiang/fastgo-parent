package cn.itsource.fastgo.controller;

import cn.itsource.fastgo.service.IEmployeeService;
import cn.itsource.fastgo.utils.AjaxResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * @author AFSZSTHL
 * @version 1.0
 * @className LoginController
 * @description TODO
 * @date 2019/5/11  22:46
 */
@RestController
public class LoginController {

    @Autowired
    private IEmployeeService employeeService;

    @PostMapping("/login")
    @ApiOperation(value = "登录接口")
    public AjaxResult login(@RequestBody Map<String,Object> params){

        String username = (String) params.get("username");
        String password = (String) params.get("password");

        if("admin".equals(username)&&"admin".equals(password)){
            //登录成功
            return AjaxResult.me();
        }else{
            //登录失败
            return AjaxResult.me().setSuccess(false).setMessage("用户名或密码错误!");
        }

    }

}
