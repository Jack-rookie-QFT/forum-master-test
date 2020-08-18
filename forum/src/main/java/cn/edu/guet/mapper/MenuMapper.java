package cn.edu.guet.mapper;

import cn.edu.guet.model.Menu;

import java.util.List;

public interface MenuMapper {
    Menu getMenusById(String id);
    List<Menu> getAllMenus();
}
