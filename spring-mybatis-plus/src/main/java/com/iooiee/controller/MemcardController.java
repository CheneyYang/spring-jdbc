package com.iooiee.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.iooiee.commons.MemcardPageModel;
import com.iooiee.commons.PageResult;
import com.iooiee.entity.MemberCardProduct;
import com.iooiee.service.MemcardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description:
 *
 * @Author: Yanggc
 * DateTime: 10/26 17:19
 */
@RestController
public class MemcardController {
    @Autowired
    MemcardService memcardService;
    /**
     * 分页查询
     */
    @PostMapping("/search/onsale")
    public PageResult onsaleMembercardList(@RequestBody MemcardPageModel memberCardModel){
        Page<MemberCardProduct> memberCardProductPage = memcardService.searchMemcard(memberCardModel);
        return PageResult.success(memberCardProductPage);
    }

    /**
     * 分页自定义返回参数
     * @param memberCardModel
     * @return
     */
    @PostMapping("/search/pageResult")
    public String pageResult(@RequestBody MemcardPageModel memberCardModel){





        Page<MemberCardProduct> memberCardProductPage;

        return "123132";
    }


    /**
     * PageResult测试
     */
    @PostMapping("/search/searchCommData")
    public PageResult searchCommData(@RequestBody MemcardPageModel memberCardModel){


        if (memberCardModel == null) {
            memberCardModel = new MemcardPageModel();
        }
        //添加可售并且在售状态
        memberCardModel.setSellStatus(1);
        memberCardModel.setOnsale(1);
        Page<MemberCardProduct> memberCardProductPage = memcardService.searchCommData(memberCardModel);
        return PageResult.success(memberCardProductPage);
    }


}
