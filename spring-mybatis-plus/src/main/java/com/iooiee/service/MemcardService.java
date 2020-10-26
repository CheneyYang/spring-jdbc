package com.iooiee.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.iooiee.commons.MemcardPageModel;
import com.iooiee.entity.MemberCardProduct;

/**
 * Description:
 *
 * @Author: Yanggc
 * DateTime: 10/26 17:30
 */

public interface MemcardService {

    IPage<MemberCardProduct> searchMemcard(MemcardPageModel memcardPageModel);
//    IPage<MemberCardProduct> searchMemcardByParam(MemcardPageModel memcardPageModel);
}
