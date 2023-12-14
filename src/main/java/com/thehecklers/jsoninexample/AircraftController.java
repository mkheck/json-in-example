package com.thehecklers.jsoninexample;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class AircraftController {
    @GetMapping
    public String greeting() {
        return "This is a test of the Aircraft Controller. It is only a test.";
    }

    @PostMapping("/aircraft")
    public Aircraft echoAircraft(@RequestBody Aircraft aircraft) {
        return aircraft;
    }
}
