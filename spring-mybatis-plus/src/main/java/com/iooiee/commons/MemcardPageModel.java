package com.iooiee.commons;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description:
 *
 * @Author: Yanggc
 * DateTime: 10/26 17:24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemcardPageModel{

    private Long clubId;

    private String cardName;

    private Integer cardType;

    private Integer supportStoreType;

    private Integer appSale;

    private Long createStoreId;

    private String createStoreName;

    private String createUser;

    private Integer onsale;

    private Integer sellStatus;

    private Integer pageNum;

    private Integer pageSize;

}
