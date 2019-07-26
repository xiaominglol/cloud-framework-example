package com.gemini.boot.framework.mybatis.controller;

import com.gemini.boot.framework.mybatis.service.MenuService;
import com.gemini.boot.framework.mybatis.vo.MenuVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * 限額訂單
 *
 * @author wenge.cai
 */
@Slf4j
@RestController
@RequestMapping("/menu")
public class MenuController {

    @Autowired
    MenuService menuService;

    @GetMapping("/{id}")
    public Mono<MenuVo> get(@PathVariable final Long id) {
        return Mono.just(menuService.get(id));
    }

    @PostMapping("/list")
    public Mono<List<MenuVo>> list(@RequestBody final MenuVo dto) {
        return Mono.just(menuService.list(dto));
    }

    @PostMapping
    public Mono<Boolean> insert(@RequestBody final MenuVo dto) {
        menuService.insert(dto);
        return Mono.just(true);
    }

    @PutMapping
    public Mono<Boolean> update(@RequestBody final MenuVo dto) {
        menuService.update(dto);
        return Mono.just(true);
    }

    @DeleteMapping("/{id}")
    public Mono<Boolean> delete(@PathVariable final Long id) {
        menuService.delete(id);
        return Mono.just(true);
    }
}
