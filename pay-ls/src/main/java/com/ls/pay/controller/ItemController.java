package com.ls.pay.controller;

import com.ls.pay.helper.req.JsonResult;
import com.ls.pay.po.TbItem;
import com.ls.pay.service.ItemService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ls
 * @date 2020/5/2 16:51
 */
@RestController
@RequestMapping("/item")
public class ItemController {

  @Autowired
  private ItemService itemService;

  @GetMapping("/queryAllItem")
  @ApiOperation(value = "查询所有的商品",tags = {"item"})
  public JsonResult<List<TbItem>> queryAllItem(){
    List<TbItem> itemList= itemService.getAllItem();
    return JsonResult.ok(itemList);

  }
  @PostMapping("/getItemById")
  @ApiOperation(value = "获取商品",tags = {"item"})
  public JsonResult<TbItem> getItemById(
      @ApiParam(value = "商品Id",required = true) @RequestParam Long id){
    TbItem item= itemService.getItemById(id);
    return JsonResult.ok(item);

  }

}
