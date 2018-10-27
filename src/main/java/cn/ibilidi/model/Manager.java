package cn.ibilidi.model;

public class Manager {
    private String openid;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "openid='" + openid + '\'' +
                '}';
    }
}
