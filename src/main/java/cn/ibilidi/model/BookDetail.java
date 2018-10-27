package cn.ibilidi.model;

import java.util.Date;

public class BookDetail {
    private String bookid;
    private Date date;
    private int sjindex;
    private int status;

    @Override
    public String toString() {
        return "BookDetail{" +
                "bookid='" + bookid + '\'' +
                ", date=" + date +
                ", sjindex=" + sjindex +
                ", status=" + status +
                '}';
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getSjindex() {
        return sjindex;
    }

    public void setSjindex(int sjindex) {
        this.sjindex = sjindex;
    }
}
