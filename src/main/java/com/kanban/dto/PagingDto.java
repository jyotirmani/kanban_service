package com.kanban.dto;

public class PagingDto {

    private int page;
    private int pagesize;
    private int pagecount;


    private int[] tasks = new int[3];

    protected PagingDto() {
        // Default for Spring
    }

    public PagingDto(int page, int pagesize, int pagecount) {
        this.page = page;
        this.pagesize = pagesize;
        this.pagecount = pagecount;
    }

    public int getPage() {
        return page;
    }

    public int getPagesize() {
        return pagesize;
    }

    public int getPagecount() {
        return pagecount;
    }

}
