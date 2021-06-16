package kg.aleksandrov.deliverymvp.config;

import kg.aleksandrov.deliverymvp.models.entity.Courier;
import kg.aleksandrov.deliverymvp.models.entity.Order;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class CourierConfig {
    @Bean
    public List<Courier> getCouriers(){
        return new ArrayList<>();
    }
}
