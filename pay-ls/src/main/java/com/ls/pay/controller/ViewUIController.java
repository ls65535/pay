package com.ls.pay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ls
 * @date 2020/5/2 17:04 页面跳转
 */
@Controller
public class ViewUIController {

  //跳转到主要
  @RequestMapping("/doIndexUI")
  public String doIndexUI() {
    return "index";//index.html
  }

  //跳转到登录页面
  @GetMapping("/doLoginUI")
  public String doLoginUI() {

    return "login";
  }

  @RequestMapping("/item")
  public String leave() {

    return "item/item";
  }

  //3.购买
  @RequestMapping("/buy")
  public String leaveModify() {
    return "item/buy";
  }
}
