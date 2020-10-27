package com.iooiee.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.iooiee.commons.MemcardPageModel;
import com.iooiee.entity.MemberCardProduct;

/**
 * Description:
 *
 * @Author: Yanggc
 * DateTime: 10/26 17:30
 */

public interface MemcardService {

    Page<MemberCardProduct> searchMemcard(MemcardPageModel memcardPageModel);
}
