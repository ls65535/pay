package com.ls.pay.service;

import com.ls.pay.po.TbItem;
import java.util.List;

/**
 * @author ls
 * @date 2020/5/2 16:52
 */
public interface ItemService {

  List<TbItem> getAllItem();

  TbItem getItemById(Long id);
}
