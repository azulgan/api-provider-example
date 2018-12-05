package sg.apicontract.example.provider.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;
import sg.apicontract.example.provider.dto.GreetingBean;
import sg.apicontract.example.provider.dto.PricingBean;

import java.time.LocalDate;

/**
 * (c) aguegan, 2018
 * User: aguegan
 * Date: 12/5/18
 * Time: 12:29 PM
 */
@Slf4j
public class GreetingControllerIT {

     @Test
    public void testGreeting() {
        RestTemplate restTemplate = new RestTemplate();
        GreetingBean res = restTemplate.getForObject("http://localhost:8080/greeting", GreetingBean.class);
        log.info(res.toString());
        Assert.assertEquals("Test: World", res.getMessage());
    }

    @Test
    public void testPricing() {
        RestTemplate restTemplate = new RestTemplate();
        PricingBean res = restTemplate.getForObject("http://localhost:8080/pricing?method=vanilla", PricingBean.class);
        log.info(res.toString());
        Assert.assertTrue(res.getValue() < 3.0);
//        Assert.assertEquals(LocalDate.now(), res.getRefDate());
    }

}
