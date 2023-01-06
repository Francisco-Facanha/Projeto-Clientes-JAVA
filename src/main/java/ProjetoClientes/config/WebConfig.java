package ProjetoClientes.config;

import org.apache.catalina.filters.CorsFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.Arrays;
import java.util.List;

import static org.aspectj.weaver.tools.cache.SimpleCacheFactory.path;

@Configuration
public class WebConfig {
@Bean
    public FilterRegistrationBean<CorsFilter>corsFilterFilterRegistrationBean(){

        List<String> all = Arrays.asList("*");
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        CorsConfiguration.setAllowedOrigins(all);
        CorsConfiguration.setAllowedHeaders(all);
        CorsConfiguration.setAllowedMethods(all);
        CorsConfiguration.setAllowedCredentials(true);
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

        source.registerCorsConfiguration(path:"/**",corsConfiguration);

        CorsFilter corsFilter = new CorsFilter(source);
        FilterRegistrationBean<CorsFilter> filter = new FilterRegistrationBean<>(corsFilter);

        filter.setOrder(Ordered.HIGHEST_PRECEDENCE);
        return filter;
   }
}
