package com.gemini.cloud.framework.redis.service;

import com.gemini.cloud.framework.redis.moder.Member;

import java.util.List;

public interface MemberService {
    List<Member> list();
}
