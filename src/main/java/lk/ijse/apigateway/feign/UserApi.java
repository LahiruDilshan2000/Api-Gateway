package lk.ijse.apigateway.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Lahiru Dilshan
 * @created Sat 5:22 PM on 10/21/2023
 * @project api-gateway
 **/
@FeignClient("IDENTITY-SERVICE")
public interface UserApi {

    @GetMapping(value = "/nexttravel/api/v1/validate", params = {"token"}, produces = {MediaType.APPLICATION_JSON_VALUE})
    String validateToken(@RequestParam String token);
}
