package cn.edu.guet.controller;

import cn.edu.guet.common.Result;
import cn.edu.guet.model.User;
import cn.edu.guet.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    IUserService userService;

<<<<<<< HEAD
    @Autowired
    IUserService userService;

=======
>>>>>>> acf81b3994e9ed39ab420bdae92509ad801dd801
    @RequestMapping(value = "login",method = {RequestMethod.POST})
    @ResponseBody
    public Result login(String username, String password){
        System.out.println("用户名:"+username);
        System.out.println("密码:" + password);
        User user=userService.login(username,password);
        if (user!=null){
<<<<<<< HEAD
            return Result.success(200,"登陆成功",user);
        }else {
            return Result.fail(404,"登陆失败");
=======
            return Result.success(user);
        }else {
            return Result.fail();
>>>>>>> acf81b3994e9ed39ab420bdae92509ad801dd801
        }
    }
    @RequestMapping("saveUser")
    public void saveUser(String user){
    }
}
