package com.iooiee.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.iooiee.commons.MemcardPageModel;
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
     * 门店上架的卡库
     */
    @PostMapping("/search/onsale")
    public IPage<MemberCardProduct> onsaleMembercardList(@RequestBody MemcardPageModel memberCardModel){
        return memcardService.searchMemcard(memberCardModel);
    }
}
