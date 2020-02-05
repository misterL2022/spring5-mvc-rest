package guru.springfamework.api.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Entity;

@Data
public class CustomerDTO {

    @ApiModelProperty(value = "this is the first name")
    private String firstName;
    private String lastName;

    @JsonProperty("customer_url")
    private String customerUrl;
}
