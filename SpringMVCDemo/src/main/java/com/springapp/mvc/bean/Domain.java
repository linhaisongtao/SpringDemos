package com.springapp.mvc.bean;

/**
 * Created by daisongsong on 2015/12/29.
 */
public class Domain {
    private String mName;
    private String mIp;
    private long mExpire;

    public Domain(String name, String Ip, long expire) {
        mName = name;
        mIp = Ip;
        mExpire = expire;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getIp() {
        return mIp;
    }

    public void setIp(String ip) {
        mIp = ip;
    }

    public long getExpire() {
        return mExpire;
    }

    public void setExpire(long expire) {
        mExpire = expire;
    }

}
