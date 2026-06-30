
package com.PaymentServie.paymentservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CartRestConsumer {
    @Autowired
    private DiscoveryClient discoveryClient;

    public String getCartData() {
        List<ServiceInstance> instances = discoveryClient.getInstances("CART-SERVICE");
        if (instances == null || instances.isEmpty()) {
            return "No instances of CART-SERVICE found";
        }
        ServiceInstance serviceInstance = instances.get(0);
        String baseUrl = serviceInstance.getUri() + "/cart/items";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(baseUrl, String.class);
    }
}
