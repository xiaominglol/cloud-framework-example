package com.gemini.boot.framework.redis.moder;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@TableName("t_member")
public class Menu implements Serializable {

    @TableId(value = "member_id")
    private Long memberId;

    private String memberName;
}
