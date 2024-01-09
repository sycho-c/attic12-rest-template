package spectra.attic.controller;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("users")
public class UserResource {

    @GetMapping
    public String findAll() throws InterruptedException {
        TimeUnit.SECONDS.sleep(60);
        return "users-" + UUID.randomUUID();
    }
}
