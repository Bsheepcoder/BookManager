package com.book.mapper;

import com.book.entity.AuthUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select * from user where username = #{username}")
    AuthUser getPasswordByUsername(String username);

    @Options(useGeneratedKeys = true,keyColumn = "id",keyProperty = "id")
    @Insert("insert into users(username,password,role,mail) values(#{username},#{password},#{role},#{mail})")
    int registerUser(AuthUser user);
}
