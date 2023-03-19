package tr.com.metea.i18nbestpractice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tr.com.metea.i18nbestpractice.util.MessageUtil;

/**
 * @author Mete Aydin
 * <p>
 * 19.03.2023
 */

@RestController
@RequestMapping("/api")
public class MessageController {
    @Autowired
    private MessageUtil messageUtil;

    @GetMapping("/{key}")
    public String getLocaleMessage(@PathVariable("key") String key) {
        return messageUtil.get("message." + key);
    }
}