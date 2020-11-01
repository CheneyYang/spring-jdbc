package com.iooiee.entity;

import java.math.BigDecimal;
import java.util.Date;

public class MemcardBase {
    private Long id;

    private Long createClubId;

    private String createClubName;

    private Long createStoreId;

    private String createStoreName;

    private Date createDatetime;

    private Long createUserId;

    private String createUserName;

    private String cardName;

    private String cardDesc;

    private Integer cardType;

    private Date saleMaxDate;

    private Date saleMinDate;

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

    private Integer editable;

    private String extraParams;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCreateClubId() {
        return createClubId;
    }

    public void setCreateClubId(Long createClubId) {
        this.createClubId = createClubId;
    }

    public String getCreateClubName() {
        return createClubName;
    }

    public void setCreateClubName(String createClubName) {
        this.createClubName = createClubName == null ? null : createClubName.trim();
    }

    public Long getCreateStoreId() {
        return createStoreId;
    }

    public void setCreateStoreId(Long createStoreId) {
        this.createStoreId = createStoreId;
    }

    public String getCreateStoreName() {
        return createStoreName;
    }

    public void setCreateStoreName(String createStoreName) {
        this.createStoreName = createStoreName == null ? null : createStoreName.trim();
    }

    public Date getCreateDatetime() {
        return createDatetime;
    }

    public void setCreateDatetime(Date createDatetime) {
        this.createDatetime = createDatetime;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName == null ? null : createUserName.trim();
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName == null ? null : cardName.trim();
    }

    public String getCardDesc() {
        return cardDesc;
    }

    public void setCardDesc(String cardDesc) {
        this.cardDesc = cardDesc == null ? null : cardDesc.trim();
    }

    public Integer getCardType() {
        return cardType;
    }

    public void setCardType(Integer cardType) {
        this.cardType = cardType;
    }

    public Date getSaleMaxDate() {
        return saleMaxDate;
    }

    public void setSaleMaxDate(Date saleMaxDate) {
        this.saleMaxDate = saleMaxDate;
    }

    public Date getSaleMinDate() {
        return saleMinDate;
    }

    public void setSaleMinDate(Date saleMinDate) {
        this.saleMinDate = saleMinDate;
    }

    public Integer getEntranceTimes() {
        return entranceTimes;
    }

    public void setEntranceTimes(Integer entranceTimes) {
        this.entranceTimes = entranceTimes;
    }

    public Integer getMaxGiftEntrance() {
        return maxGiftEntrance;
    }

    public void setMaxGiftEntrance(Integer maxGiftEntrance) {
        this.maxGiftEntrance = maxGiftEntrance;
    }

    public Integer getValidDay() {
        return validDay;
    }

    public void setValidDay(Integer validDay) {
        this.validDay = validDay;
    }

    public Integer getMaxGiftDays() {
        return maxGiftDays;
    }

    public void setMaxGiftDays(Integer maxGiftDays) {
        this.maxGiftDays = maxGiftDays;
    }

    public Integer getAllowedLeave() {
        return allowedLeave;
    }

    public void setAllowedLeave(Integer allowedLeave) {
        this.allowedLeave = allowedLeave;
    }

    public Integer getMemberLimit() {
        return memberLimit;
    }

    public void setMemberLimit(Integer memberLimit) {
        this.memberLimit = memberLimit;
    }

    public Integer getSupportStoreType() {
        return supportStoreType;
    }

    public void setSupportStoreType(Integer supportStoreType) {
        this.supportStoreType = supportStoreType;
    }

    public String getSupportStoreIds() {
        return supportStoreIds;
    }

    public void setSupportStoreIds(String supportStoreIds) {
        this.supportStoreIds = supportStoreIds == null ? null : supportStoreIds.trim();
    }

    public BigDecimal getReferencePrice() {
        return referencePrice;
    }

    public void setReferencePrice(BigDecimal referencePrice) {
        this.referencePrice = referencePrice;
    }

    public Integer getReferenceDiscount() {
        return referenceDiscount;
    }

    public void setReferenceDiscount(Integer referenceDiscount) {
        this.referenceDiscount = referenceDiscount;
    }

    public Integer getEditable() {
        return editable;
    }

    public void setEditable(Integer editable) {
        this.editable = editable;
    }

    public String getExtraParams() {
        return extraParams;
    }

    public void setExtraParams(String extraParams) {
        this.extraParams = extraParams == null ? null : extraParams.trim();
    }
}