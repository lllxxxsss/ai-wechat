package com.tencent.wxcloudrun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * index控制器
 */
@RestController
@RequestMapping("/wechat")
public class WechatController {

  /**
   * 消息msg
   */
  @PostMapping("/msg")
  public String index() {
    return "index";
  }

}
