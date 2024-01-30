package com.example.kitchener;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;


@AutoConfiguration
@ConditionalOnBean({KitchenConnector.class})
public class StarterConfiguration {
    @Bean
    KitchenerService kitchenerService(KitchenConnector kitchenConnector) {
        return new KitchenerService(kitchenConnector);
    }
}
