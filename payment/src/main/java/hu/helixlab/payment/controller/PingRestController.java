package hu.helixlab.payment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingRestController {

    @GetMapping("ping")
    public String ping(){
        return "Sikerült elküldeni egy szöveget";
    }
}
