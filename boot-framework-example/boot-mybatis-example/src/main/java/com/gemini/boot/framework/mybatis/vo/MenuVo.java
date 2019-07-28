package com.gemini.boot.framework.mybatis.vo;

import com.gemini.boot.framework.mybatis.po.BasePo;
import lombok.Data;

/**
 * 菜单数据库实体
 *
 * @author 小明不读书
 * @date 2017-11-02
 */
@Data
public class MenuVo extends BasePo {

    /**
     * 上级菜单，如果为null，则为顶级菜单
     */
    private Integer pid;

    /**
     * 菜单名称
     */
    private String name;

    /**
     * 菜单类型（Directory：目录，Menu：菜单，Button：按钮）
     */
    private String type;

    /**
     * 菜单url
     */
    private String url;

    /**
     * 菜单打开方式（_self：当前页打开，_blank：新窗口打开）
     */
    private String target;

    /**
     * 菜单icon
     */
    private String icon;

    /**
     * 权限编码
     */
    private String permissionsCode;

    /**
     * 排序
     */
    private Integer sort;


}