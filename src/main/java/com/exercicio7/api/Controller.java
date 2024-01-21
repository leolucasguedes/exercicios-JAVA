package com.exercicio7.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;

@RestController
public class Controller {
    private final Service feriadoService;

    public Controller(Service feriadoService) {
        this.feriadoService = feriadoService;
    }

    @GetMapping("/holidays")
    public List<Feriado> getHolidays() {
        return feriadoService.getFeriados();
    }

    @GetMapping("/holidays/{date}")
    public String checkHoliday(@PathVariable String date) {
        try {
            return feriadoService.verificaFeriado(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return "Erro ao processar a data.";
        }
    }
}

