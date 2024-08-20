package br.com.dio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{

    private LocalDate data;

    public Mentoria() {
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData() {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getDescricao() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
