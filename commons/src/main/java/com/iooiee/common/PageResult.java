package com.iooiee.common;

/**
 * Description:
 *
 * @Author: Yanggc
 * DateTime: 10/23 12:24
 */
public class PageResult<T> extends Result<T> {

    //总记录数
    private Long total;

    //每页记录数
    private Long pageSize;

    //总页数
    private Long totalPages;

    //当前页码
    private Long currPage;

    private T data ;


    private PageResult() {
    }

    public PageResult(Long total, Long pageSize, Long totalPages, Long currPage) {
        this.total = total;
        this.pageSize = pageSize;
        this.totalPages = totalPages;
        this.currPage = currPage;
    }

    public static <T> PageResult<T> success() {
        PageResult<T> pageResult = new PageResult<T>();
        pageResult.setResultCode(ResultCodeEnum.SUCCESS);

        return pageResult;
    }

    public static <T> PageResult<T> failure(ResultCodeEnum resultCodeEnum) {
        PageResult<T> pageResult = new PageResult<T>();
        pageResult.setResultCode(resultCodeEnum);
        return pageResult;
    }


    // 自定义返回数据
    public PageResult<T> data(T data) {
        this.setData(data);
        return this;
    }


    /**
     *     getter setter
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
    }

    public Long getCurrPage() {
        return currPage;
    }

    public void setCurrPage(Long currPage) {
        this.currPage = currPage;
    }

    @Override
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
