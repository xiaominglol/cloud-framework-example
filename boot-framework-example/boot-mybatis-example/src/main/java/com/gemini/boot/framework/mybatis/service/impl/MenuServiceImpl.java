package com.gemini.boot.framework.mybatis.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.gemini.boot.framework.mybatis.po.MenuPo;
import com.gemini.boot.framework.mybatis.service.MenuService;
import com.gemini.boot.framework.mybatis.mapper.MenuMapper;
import com.gemini.boot.framework.mybatis.vo.MenuVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 风控等級限额
 *
 * @author wenge.cai
 */
@Slf4j
@Service
public class MenuServiceImpl extends CrudServiceImpl<MenuVo, MenuPo, MenuMapper> implements MenuService {

    @Override
    public QueryWrapper<MenuPo> wrapper(MenuVo vo) {
        return super.wrapper(String.valueOf(vo));
    }
}
