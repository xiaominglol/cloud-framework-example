package com.gemini.boot.framework.redis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gemini.boot.framework.redis.moder.Menu;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper extends BaseMapper<Menu> {

}
