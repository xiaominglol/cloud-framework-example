package com.gemini.boot.framework.mybatis.service;

import com.gemini.boot.framework.mybatis.mapper.MenuMapper;
import com.gemini.boot.framework.mybatis.po.MenuPo;
import com.gemini.boot.framework.mybatis.vo.MenuVo;

public interface MenuService extends CrudService<MenuVo, MenuPo, MenuMapper> {

}
