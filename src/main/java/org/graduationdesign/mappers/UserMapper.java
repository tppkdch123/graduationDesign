package org.graduationdesign.mappers;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.graduationdesign.entity.User;
import org.graduationdesign.entity.UserExample;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    boolean judgePassword(@Param("password") String password,@Param("email") String email);
}