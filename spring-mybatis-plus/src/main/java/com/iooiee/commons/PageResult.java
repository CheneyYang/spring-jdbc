package com.iooiee.commons;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
 * Description:
 *  Mybatis-plus 分页条件结果二次封装
 *
 *
 * @Author: Yanggc
 * DateTime: 10/12 12:24
 */
public class PageResult<T> {

    private Integer code;

    private String msg;

    private Object data ;


    //总记录数
    private Long total;

    //每页记录数
    private Long pageSize;

    //总页数
    private Long totalPages;

    //当前页码
    private Long currPage;


    public void setResultCode(ResultCodeEnum code) {
        this.code = code.code();
        this.msg = code.message();
    }


    private PageResult() {
        //设置默认值
        this.total = 0L;
        this.pageSize = 0L;
        this.totalPages = 1L;
        this.currPage = 1L;
    }

    public static <T> PageResult<T> success(Page<T> page) {
        PageResult<Object> pageResult = new PageResult<>();
        pageResult.setResultCode(ResultCodeEnum.SUCCESS);
        pageResult.setData(page.getRecords());
        pageResult.setCurrPage(page.getCurrent());
        pageResult.setTotal(page.getTotal());
        pageResult.setPageSize(page.getSize());
        pageResult.setTotalPages(page.getPages());
        return (PageResult<T>) pageResult;
    }

    public static <T> PageResult<T> failure(String failMsg) {
        PageResult<T> pageResult = new PageResult<T>();
        // 201 自定义失败标识消息
        pageResult.setCode(201);
        pageResult.setMsg(failMsg);
        return pageResult;
    }

    public static <T> PageResult<T> failure(ResultCodeEnum resultCodeEnum) {
        PageResult<T> pageResult = new PageResult<T>();
        pageResult.setResultCode(resultCodeEnum);
        return pageResult;
    }


    // 自定义返回数据类型
    public PageResult<T> data(Object data) {
        this.setData(data);
        return this;
    }


    /**
     *     getter setter
     */
    public Integer getCode() {
        return code;
    }

    private void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public PageResult<T> setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getData() {
        return data;
    }

    private void setData(Object data) {
        this.data = data;
    }

    public Long getTotal() {
        return total;
    }

    private void setTotal(Long total) {
        this.total = total;
    }

    public Long getPageSize() {
        return pageSize;
    }

    private void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotalPages() {
        return totalPages;
    }

    private void setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
    }

    public Long getCurrPage() {
        return currPage;
    }

    private void setCurrPage(Long currPage) {
        this.currPage = currPage;
    }
}
