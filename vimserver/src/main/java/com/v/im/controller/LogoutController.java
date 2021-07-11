package com.v.im.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.oauth2.provider.token.ConsumerTokenServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 退出登录
 *
 * @author 乐天
 * @since 2018-10-07
 */
@Controller
public class LogoutController {

    @Resource
    @Qualifier("consumerTokenServices")
    ConsumerTokenServices consumerTokenServices;

    /**
     * 退出登录功能
     *
     * @param access_token token
     * @return json
     */
    @PostMapping("/oauth/logout")
    @ResponseBody
    public boolean revokeToken(String access_token) {
        return consumerTokenServices.revokeToken(access_token);
    }
}
