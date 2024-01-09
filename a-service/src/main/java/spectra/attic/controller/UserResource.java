package spectra.attic.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequiredArgsConstructor
@RequestMapping("users")
public class UserResource {

    private final RestTemplate restTemplate;

    @GetMapping
    public String findAll() {
        return restTemplate.getForObject("http://localhost:8081/users", String.class);
    }
}
