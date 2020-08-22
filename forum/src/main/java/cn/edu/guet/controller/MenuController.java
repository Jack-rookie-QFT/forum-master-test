package cn.edu.guet.controller;

import cn.edu.guet.model.Menu;
import cn.edu.guet.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("menu")
public class MenuController {

    @Autowired
    IMenuService menuService;

    @RequestMapping(value = "getAllMenu",method = RequestMethod.POST)
    @ResponseBody
    public List<Menu> getAllMenu(){
        return menuService.getAllMenu();
    }
    @RequestMapping(value = "getMenuById",method = RequestMethod.POST)
    @ResponseBody
    public List<Menu> getMenuById(String userid){
        return menuService.getMenuById(userid);
    }
}
