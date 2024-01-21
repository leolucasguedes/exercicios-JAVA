package com.exercicio7.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Feriado {
    private Date data;
    private String nome;

    public Feriado(String dataString, String nome) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        this.data = dateFormat.parse(dataString);
        this.nome = nome;
    }

    public Date getData() {
        return data;
    }

    public String getNome() {
        return nome;
    }
}
