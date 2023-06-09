package tr.com.metea.springbooti18n.config;

/**
 * @author Mete Aydin
 * <p>
 * 19.03.2023
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class I18NConfig {

    @Bean
    public ResourceBundleMessageSource messageSource() {
        final ResourceBundleMessageSource source = new ResourceBundleMessageSource();
        source.setBasename("messages/messages");
        return source;
    }
}
