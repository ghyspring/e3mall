package cn.e3mall.service.impl;

import cn.e3mall.dao.TbItemMapper;
import cn.e3mall.pojo.TbItem;
import cn.e3mall.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:Pineapple
 * @Date: 2018/4/10 21:12
 */
@Service
public class ItemServiceImpl implements ItemService{

    @Autowired
    private TbItemMapper itemMapper;

    /**
     * 根据商品id查询
     * @param id
     * @return
     */
    @Override
    public TbItem getItemById(long id) {
        return itemMapper.selectByPrimaryKey(id);
    }
}
