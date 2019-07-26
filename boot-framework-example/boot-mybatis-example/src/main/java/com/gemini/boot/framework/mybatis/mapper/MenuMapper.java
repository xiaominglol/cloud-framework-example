package com.gemini.boot.framework.mybatis.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gemini.boot.framework.mybatis.po.MenuPo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MenuMapper extends BaseMapper<MenuPo> {

}