package com.iooiee.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * Page请求参数，封装类型
 * @Author: Yanggc
 * DateTime: 2020-11-01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemcardBasePageReq {
    private String cardName;
    private String cardType;
    private Long pageSize;
    private Long currPage;

}
