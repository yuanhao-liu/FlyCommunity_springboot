package com.neusoft.mapper;

import com.neusoft.domain.UserQiandao;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.Map;
@Mapper
@Component
public interface UserQiandaoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserQiandao record);

    int insertSelective(UserQiandao record);

    UserQiandao selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserQiandao record);

    int updateByPrimaryKey(UserQiandao record);

    UserQiandao selectByUserID(Integer id);

    Map<String,Object> selectForQiandao(Integer id);
}