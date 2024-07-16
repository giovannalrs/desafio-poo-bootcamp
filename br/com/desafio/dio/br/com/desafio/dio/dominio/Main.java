package br.com.desafio.dio.br.com.desafio.dio.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        Conteudo conteudo = new Curso();

        List<String> palavras = new ArrayList<>();

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devG = new Dev();
        devG.setNome("Giovanna");
        devG.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Giovanna: " + devG.getConteudosInscritos());
        devG.progredir();
        devG.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Giovanna: " + devG.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Giovanna: " + devG.getConteudosConcluidos());
        System.out.println("XP: " + devG.calcularTotalXp());

        System.out.println("---------");

        Dev devC = new Dev();
        devC.setNome("Clara");
        devC.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Clara: " + devC.getConteudosInscritos());
        devC.progredir();
        devC.progredir();
        devC.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Clara: " + devC.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Clara: " + devC.getConteudosConcluidos());
        System.out.println("XP: " + devC.calcularTotalXp());

    }
}
