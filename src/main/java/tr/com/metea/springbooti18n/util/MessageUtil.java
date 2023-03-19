package tr.com.metea.springbooti18n.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

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
}
