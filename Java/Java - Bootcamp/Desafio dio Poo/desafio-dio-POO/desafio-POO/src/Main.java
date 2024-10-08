import java.time.LocalDate;

import dominio.BootCamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);




        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" +  devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.err.println("-------");
        System.out.println("Conteúdos Inscritos" +  devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos" +  devCamila.getConteudosConcluidos());
        System.err.println("XP"+ devCamila.calcularTotalXp());

        System.err.println("-------");



        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" +  devJoao.getConteudosInscritos());
        devJoao.progredir();

        System.err.println("-------");

        System.out.println("Conteúdos Inscritos" +  devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos" +  devJoao.getConteudosConcluidos());
        System.err.println("XP"+ devJoao.calcularTotalXp());


    }
}
