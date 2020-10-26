package com.iooiee.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
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
    public IPage<MemberCardProduct> searchMemcard(MemcardPageModel memcardPageModel) {
        IPage<MemberCardProduct> currPage = new Page<>(memcardPageModel.getPageNum(), memcardPageModel.getPageSize());

        IPage<MemberCardProduct> memberCardProductIPage = memcardDao.selectPage(currPage, null);
        List<MemberCardProduct> records = memberCardProductIPage.getRecords();
        for(MemberCardProduct  currMemberCardProduct :  records){
            System.out.println(currMemberCardProduct.toString());
        }
        return memberCardProductIPage;
    }

    /**
     * 条件查询
     * @param memcardPageModel
     * @return
     */
//    @Override
//    public IPage<MemberCardProduct> searchMemcardByParam(MemcardPageModel memcardPageModel) {
//
//        Page<MemberCardProduct> currPage = new Page<>(memcardPageModel.getPageNum(), memcardPageModel.getPageSize());
//
//        QueryWrapper<MemcardPageModel> qw = new QueryWrapper<>();
//
//        qw.eq("cardType", memcardPageModel.getCardType());
//
//
//        return memcardDao.selectPage(currPage, qw);
//    }


}
