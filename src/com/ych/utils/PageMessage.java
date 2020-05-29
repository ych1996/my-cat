package com.ych.utils;

import java.util.List;

public class PageMessage<t> {
    //封装当前页面的数据信息
    private  List<t> pagexinxi;
    //当前页面数据数量
    private int dangqiannum = 10;
    //总数据量
    private int zongshujunum;
    //当前页数
    private int dangqianyeshu = 1;
    //最大页数
    private int zongyeshu;
    //是否有上一页
    private boolean shangyiye;
    //是否有下一页
    private boolean xiayiye;

    public List<t> getPagexinxi() {
        return pagexinxi;
    }

    public void setPagexinxi(List<t> pagexinxi) {
        this.pagexinxi = pagexinxi;
    }

    public int getDangqiannum() {
        return dangqiannum;
    }

    public void setDangqiannum(int dangqiannum) {
        this.dangqiannum = dangqiannum;
    }

    public int getDangqianyeshu() {
      return dangqianyeshu;
    }

    public void setDangqianyeshu(int dangqianyeshu) {
        if(dangqianyeshu < 1){
            this.dangqianyeshu = 1;
        }else if(dangqianyeshu > this.zongyeshu){
            this.dangqianyeshu = this.zongyeshu;
        }else {
            this.dangqianyeshu = dangqianyeshu;
        }
    }

    public int getZongyeshu() {
        return (this.zongshujunum + this.dangqiannum -1) / this.dangqiannum;
    }

    /**
     * public void setZongyeshu(int zongyeshu) {
        this.zongyeshu = zongyeshu;
    }
    */
    public boolean isShangyiye() {
        return this.dangqianyeshu == 1 ? false : true;
    }

//    public void setShangyiye(boolean shangyiye) {
//        this.shangyiye = shangyiye;
//    }

    public boolean isXiayiye() {
        return this.dangqianyeshu == this.zongyeshu ? false : true;
    }

    public int getZongshujunum() {
        return zongshujunum;
    }

    public void setZongshujunum(int zongshujunum) {
        this.zongshujunum = zongshujunum;
    }
//    public void setXiayiye(boolean xiayiye) {
//        this.xiayiye = xiayiye;
//    }
}
