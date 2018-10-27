package cn.ibilidi.model;

import java.util.HashMap;

public class Message {
    private String touser;
    private String template_id;
    private String page;
    private String form_id;
    private String emphasis_keyword;
    private Template data;

    @Override
    public String toString() {
        return "Message{" +
                "touser='" + touser + '\'' +
                ", template_id='" + template_id + '\'' +
                ", page='" + page + '\'' +
                ", form_id='" + form_id + '\'' +
                ", emphasis_keyword='" + emphasis_keyword + '\'' +
                ", data=" + data +
                '}';
    }

    public String getTouser() {
        return touser;
    }

    public void setTouser(String touser) {
        this.touser = touser;
    }

    public String getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(String template_id) {
        this.template_id = template_id;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getForm_id() {
        return form_id;
    }

    public void setForm_id(String form_id) {
        this.form_id = form_id;
    }

    public String getEmphasis_keyword() {
        return emphasis_keyword;
    }

    public void setEmphasis_keyword(String emphasis_keyword) {
        this.emphasis_keyword = emphasis_keyword;
    }

    public Object getData() {
        return data;
    }

    public void setData(Template data) {
        this.data = data;
    }
}
