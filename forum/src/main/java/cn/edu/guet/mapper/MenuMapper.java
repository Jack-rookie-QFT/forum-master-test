package cn.edu.guet.mapper;

import cn.edu.guet.model.Menu;

import java.util.List;

public interface MenuMapper {
    List<Menu> getAllMenu();
    List<Menu> getMenuById(String userid);
}
