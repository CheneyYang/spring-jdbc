package com.iooiee.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.iooiee.commons.MemcardPageModel;
import com.iooiee.entity.MemberCardProduct;
import com.iooiee.mappers.MemcardDao;
import com.iooiee.service.MemcardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 *
 * @Author: Yanggc
 * DateTime: 10/26 17:39
 */
@Service
public class MemcardServiceImpl implements MemcardService {

    @Autowired
    MemcardDao memcardDao;

    /**
     * 第一种方式进行分页查询
     * @param memcardPageModel
     * @return
     */

    @Override
    public Page<MemberCardProduct> searchMemcard(MemcardPageModel memcardPageModel) {
        Page<MemberCardProduct> currPage = new Page<>(memcardPageModel.getPageNum(), memcardPageModel.getPageSize());

        Page<MemberCardProduct> memberCardProductIPage = memcardDao.selectPage(currPage, null);
        List<MemberCardProduct> records = memberCardProductIPage.getRecords();
        for(MemberCardProduct  currMemberCardProduct :  records){
            System.out.println(currMemberCardProduct.toString());
        }
        return memberCardProductIPage;
    }

//    @Override
//    public PageResult<MemberCardProduct> getListPage(MemcardPageModel memberCardModel) {
//        memcardDao.getListPage(page, memberCardModel.getClubId(), memberCardModel.getCardName(),
//                memberCardModel.getCardType(), memberCardModel.getSupportStoreType(), memberCardModel.getAppSale(), memberCardModel.getCreateStoreId(),
//                memberCardModel.getCreateStoreName(), memberCardModel.getCreateUser(), memberCardModel.getOnsale(), memberCardModel.getSellStatus());
//    }




}
