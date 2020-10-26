package com.iooiee.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("saas_membercard_porduct")
public class MemberCardProduct{

    private Long id;

    private Long createClubId;

    private String createClubName;

    private Long createStoreId;

    private String createStoreName;

    private Long createUserId;

    private String createUserName;


    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createDatetime;

    private String cardName;

    private String cardDesc;

    private Integer cardType;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime saleMaxDate;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime saleMinDate;


    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime startSaleDate;


    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime endSaleDate;

    private Integer entranceTimes;

    private Integer maxGiftEntrance;

    private Integer validDay;

    private Integer maxGiftDays;

    private Integer allowedLeave;

    private Integer memberLimit;

    private Integer supportStoreType;

    private String supportStoreIds;

    private BigDecimal referencePrice;

    private Integer referenceDiscount;

    private BigDecimal sellPrice;

    private Integer sellDiscount;

    private Integer openMethod;

    private Integer cartOpenLimit;

    private Integer editable;

    private Integer appSale;

    private Integer onsale;

    private String cardImg;

    private String allowTime;

    private String area;

    private String extraParams;


}