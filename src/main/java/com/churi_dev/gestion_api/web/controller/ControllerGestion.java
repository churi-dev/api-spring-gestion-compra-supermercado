package com.churi_dev.gestion_api.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerGestion {

    @GetMapping("/data")
    public String data() {
        return "Hola bienvenido";
    }

}
