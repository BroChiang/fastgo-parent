package cn.itsource.fastgo.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * 封装分页数据
 * @param <T>
 */
public class PageList<T> {

    //总条数
    private Long total;
    //当前页数据
    private List<T> rows = new ArrayList<T>();

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public PageList() {
    }

    public PageList(long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }
}
