package com.iooiee.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.iooiee.entity.MemberCardProduct;
import org.springframework.stereotype.Repository;


/**
 * Description:
 *
 * @Author: Yanggc
 * DateTime: 10/26 17:45
 */
@Repository
public interface MemcardDao extends BaseMapper<MemberCardProduct> {
    Page<MemberCardProduct> queryAll(MemberCardProduct memberCardProduct);

//    List<MemberCardProduct> getListPage(Page page, @Param("clubId") Long clubId, @Param("cardName") String cardName, @Param("cardType") Integer cardType,
//                                        @Param("supportStoreType") Integer supportStoreType, @Param("appSale") Integer appSale,
//                                        @Param("createStoreId") Long createStoreId, @Param("createStoreName") String createStoreName,
//                                        @Param("createUser") String createUser, @Param("onsale") Integer onsale, @Param("sellStatus") Integer sellStatus);}
}