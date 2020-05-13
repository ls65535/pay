package com.ls.pay.service.impl;

import com.ls.pay.dao.ItemDao;
import com.ls.pay.po.TbItem;
import com.ls.pay.service.ItemService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ls
 * @date 2020/5/2 16:52
 */
@Service
public class ItemServiceImpl implements ItemService {
  @Autowired
  private ItemDao itemDao;

  @Override
  public List<TbItem> getAllItem() {
    List<TbItem> itemList = itemDao.selectList(null);
    return itemList;
  }

  @Override
  public TbItem getItemById(Long id) {
    TbItem item = itemDao.selectById(id);
    return item;
  }
}
