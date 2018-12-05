package sg.apicontract.example.provider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import sg.apicontract.example.provider.dto.GreetingBean;
import sg.apicontract.example.provider.dto.PricingBean;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.IsoFields;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;

@Controller
public class GreetingController {

    @RequestMapping(value = "/greeting", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public GreetingBean greeting(@RequestParam(name="name", required=false, defaultValue="World") String name) {
//        model.addAttribute("name", name);
        GreetingBean ret = new GreetingBean("Test: " + name);
        return ret;
    }
    @RequestMapping(value = "/pricing", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public PricingBean pricing(@RequestParam(name="value", required=false, defaultValue="1") Integer value,
                               @RequestParam(name="method") String calculationMethod) {
        final PricingBean ret;
        if ("VANILLA".equalsIgnoreCase(calculationMethod)) {
            ret = new PricingBean(value / 2.0, LocalDate.now().plusDays(-2));
        }
        else {
            ret = new PricingBean(value + 2.4332, LocalDate.now());
        }
        return ret;
    }

}