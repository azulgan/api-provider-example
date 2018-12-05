package sg.apicontract.example.provider.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * (c) aguegan, 2018
 * User: aguegan
 * Date: 12/5/18
 * Time: 12:06 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PricingBean {
    private Double value;
    private LocalDate refDate;
}
