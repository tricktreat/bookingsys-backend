package cn.ibilidi.service;

import cn.ibilidi.model.Template;

public interface IMessageService {
    void sendFormMessage(Template template, String template_id);
}
