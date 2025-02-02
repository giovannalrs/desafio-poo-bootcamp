package br.com.desafio.dio.br.com.desafio.dio.dominio;
import java.time.LocalDate;

public class Mentoria extends Conteudo{
    private LocalDate data;

    public double calcularXp() {
        return XP_PADRAO + 20;
    }

    public Mentoria() {

    }

    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    
    }
}
