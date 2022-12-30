import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();

        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição do curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição do curso js");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devValdir = new Dev();
        devValdir.setNome("Valdir");
        devValdir.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devValdir.getNome() + ": " + devValdir.getConteudosInscritos());

        System.out.println("-------------------");

        devValdir.progredir();
        devValdir.progredir();
        System.out.println("Conteúdos Inscritos " + devValdir.getNome() + ": " + devValdir.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devValdir.getNome() + ": " + devValdir.getConteudosConcluidos());
        System.out.println("XP: " + devValdir.calcularTotalXp());

        System.out.println("-------------------");

        Dev devCarlos = new Dev();
        devCarlos.setNome("Carlos");
        devCarlos.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devCarlos.getNome() + ": " + devCarlos.getConteudosInscritos());

        System.out.println("-------------------");
        devCarlos.progredir();
        devCarlos.progredir();
        devCarlos.progredir();
        System.out.println("Conteúdos Inscritos " + devCarlos.getNome() + ": " + devCarlos.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devCarlos.getNome() + ": " + devCarlos.getConteudosConcluidos());
        System.out.println("XP: " + devValdir.calcularTotalXp());

    }

}