package cn.ibilidi.global;

public class GlobalConstants {
    public static String STATE="state";
    public static String MESSAGE="message";
    public static String DATA="data";
    public static String TIME="time";
    public static String APPID="wx03cb413915150d39";
    public static String SECRET="7a8909803018daf509c3a18cb5cf6054";
    public static String WX_LOGIN_URL="https://api.weixin.qq.com/sns/jscode2session?grant_type=authorization_code&appid="+APPID+"&secret="+SECRET+"&js_code=";
    public static String WX_TOKEN_URL="https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid="+APPID+"&secret="+SECRET;
    public static String WX_TEMPLETE_URL="https://api.weixin.qq.com/cgi-bin/message/wxopen/template/send?access_token=";
}
