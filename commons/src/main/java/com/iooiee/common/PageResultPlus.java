package com.iooiee.common;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;

import java.util.List;

/**
 * Description:
 *  Mybatis- Plus 自定义分页
 *
 * @Author: Yanggc
 * DateTime: 10/23 15:23
 */
public class PageResultPlus<T> extends Result<T> implements IPage<T>{


    //总记录数
    private Long total;

    //每页记录数
    private Long pageSize;

    //总页数
    private Long totalPages;

    //当前页码
    private Long currPage;



    public PageResultPlus(){
        this.total = 0L;
        this.pageSize = 10L;
        this.currPage = 1L;
        this.totalPages = 1L;
    }

    public PageResultPlus(long currPage, long pageSize) {
        this(currPage, pageSize, 0L);
    }

    public PageResultPlus(long currPage, long pageSize, long total) {
        this.total = 0L;
        this.pageSize = 10L;
        this.total = 1L;
        this.totalPages = total % pageSize == 0 ? total / pageSize : total / pageSize + 1;

        if (currPage > 1L) {
            this.currPage = currPage;
        }
        this.pageSize = pageSize;
        this.total = total;
    }




    public static <T> PageResultPlus<T> success() {
        PageResultPlus<T> pageResultPlus = new PageResultPlus<>();
        pageResultPlus.setResultCode(ResultCodeEnum.SUCCESS);
        return pageResultPlus;
    }

    public static <T> PageResultPlus<T> failure(ResultCodeEnum resultCodeEnum) {
        PageResultPlus<T> PageResultPlus = new PageResultPlus<>();
        PageResultPlus.setResultCode(resultCodeEnum);
        return PageResultPlus;
    }





    public boolean hasPrevious() {
        return this.currPage > 1L;
    }

    public boolean hasNext() {
        return this.currPage < this.getPages();
    }

    @Override
    public List<OrderItem> orders() {
        return null;
    }

    @Override
    public List<T> getRecords() {
        return null;
    }

    @Override
    public IPage<T> setRecords(List<T> records) {
        return null;
    }

//    @Override
//    public long getTotal() {
//        return 0;
//    }

    @Override
    public IPage<T> setTotal(long total) {
        return null;
    }

    @Override
    public long getSize() {
        return 0;
    }

    @Override
    public IPage<T> setSize(long size) {
        return null;
    }

    @Override
    public long getCurrent() {
        return 0;
    }

    @Override
    public IPage<T> setCurrent(long current) {
        return null;
    }



    /**
     *     getter setter
     * @return
     */
    @Override
    public long getTotal() {
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


}
