package cn.ibilidi.model;

import java.util.Date;

public class Formid {
    private String openid;
    private String formid;
    private Date expire;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getFormid() {
        return formid;
    }

    public void setFormid(String formid) {
        this.formid = formid;
    }

    public Date getExpire() {
        return expire;
    }

    public void setExpire(Date expire) {
        this.expire = expire;
    }

    @Override
    public String toString() {
        return "Formid{" +
                "openid='" + openid + '\'' +
                ", formid='" + formid + '\'' +
                ", expire=" + expire +
                '}';
    }
}
