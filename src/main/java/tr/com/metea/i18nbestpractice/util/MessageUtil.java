package tr.com.metea.i18nbestpractice.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;

/**
 * @author Mete Aydin
 * <p>
 * 19.03.2023
 */
@Service
public class MessageUtil {

    @Autowired
    private MessageSource messageSource;

    public String get(String code) {
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage(code, null,
                locale);

    }

    public String get(String code, String[] args) {
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage(code, args,
                locale);

    }
}
