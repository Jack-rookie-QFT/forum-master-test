package cn.edu.guet.mapper;

import cn.edu.guet.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User login(@Param("username") String username, @Param("password") String password);
<<<<<<< HEAD
    User getUserById(String id);
=======
>>>>>>> acf81b3994e9ed39ab420bdae92509ad801dd801
}
