package com.qf.admin.pojo.po;

public class StudenPage {
    private int pageIndex;
    private int pageSize;
    private int index;
    private int totalStuden;
    private int totalPage;

    public int getTotalStuden() {
        return totalStuden;
    }

    public void setTotalStuden(int totalStuden) {
        this.totalStuden = totalStuden;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getIndex() {
        return (pageIndex-1)*pageSize;
    }

    @Override
    public String toString() {
        return "StudenPage{" +
                "pageIndex=" + pageIndex +
                ", pageSize=" + pageSize +
                ", index=" + index +
                ", totalStuden=" + totalStuden +
                ", totalPage=" + totalPage +
                '}';
    }
}
