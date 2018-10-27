package cn.ibilidi.model;

import java.util.Date;
import java.util.List;

public class BookItem {
    private String openid;
    private String bookid;
    private Date yysj;
    private int status;
    private List<BookDetail> bookdetaillist;
    private String comment;
    private User user;

    @Override
    public String toString() {
        return "BookItem{" +
                "openid='" + openid + '\'' +
                ", bookid='" + bookid + '\'' +
                ", yysj=" + yysj +
                ", status=" + status +
                ", bookdetaillist=" + bookdetaillist +
                ", comment='" + comment + '\'' +
                ", user=" + user +
                '}';
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }



    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public Date getYysj() {
        return yysj;
    }

    public void setYysj(Date yysj) {
        this.yysj = yysj;
    }

    public List<BookDetail> getBookdetaillist() {
        return bookdetaillist;
    }

    public void setBookdetaillist(List<BookDetail> bookdetaillist) {
        this.bookdetaillist = bookdetaillist;
    }
}
