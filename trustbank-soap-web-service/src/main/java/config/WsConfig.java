package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;

@Configuration
@EnableWs
public class WsConfig extends WsConfigurerAdapter {

    @Bean
    public DefaultWsdl11Definition defaultWsdl11Definition() {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("AddServicePort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://trustbanc.com/addservice");
//        wsdl11Definition.setSchema(addSchema());
        return wsdl11Definition;

    }
}
