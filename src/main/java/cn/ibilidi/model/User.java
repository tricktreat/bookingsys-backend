package cn.ibilidi.model;

public class User {

    private String openid;
    private String xh;
    private String xm;
    private String sjh;
    private String zy;
    private String headurl;
    private String nc;
    private int manager;

    @Override
    public String toString() {
        return "User{" +
                "openid='" + openid + '\'' +
                ", xh='" + xh + '\'' +
                ", xm='" + xm + '\'' +
                ", sjh='" + sjh + '\'' +
                ", zy='" + zy + '\'' +
                ", headurl='" + headurl + '\'' +
                ", nc='" + nc + '\'' +
                ", manager=" + manager +
                '}';
    }

    public int getManager() {
        return manager;
    }

    public void setManager(int manager) {
        this.manager = manager;
    }

    public String getNc() {
        return nc;
    }

    public void setNc(String nc) {
        this.nc = nc;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh == null ? null : xh.trim();
    }

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm == null ? null : xm.trim();
    }

    public String getSjh() {
        return sjh;
    }

    public void setSjh(String sjh) {
        this.sjh = sjh == null ? null : sjh.trim();
    }

    public String getZy() {
        return zy;
    }

    public void setZy(String zy) {
        this.zy = zy == null ? null : zy.trim();
    }

    public String getHeadurl() {
        return headurl;
    }

    public void setHeadurl(String headurl) {
        this.headurl = headurl == null ? null : headurl.trim();
    }
}