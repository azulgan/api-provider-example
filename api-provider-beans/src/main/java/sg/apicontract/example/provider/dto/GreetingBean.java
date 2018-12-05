package sg.apicontract.example.provider.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
public class GreetingBean {
    @JsonProperty("message")
    private String message;
}
