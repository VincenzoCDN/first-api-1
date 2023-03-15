package co.develhope.firstapi1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

@GetMapping("/name")
    public String getName(){
    return "Vincenzo Costanzo Detto Nobile";
}


@PostMapping("/reversed_name")
    public String reversedName(@RequestParam String name) {
    StringBuilder a = new StringBuilder(name).reverse();
    return a.toString();
}


}
