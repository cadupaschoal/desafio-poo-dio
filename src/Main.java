import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso C");
        curso2.setDescricao("Descrição curso C");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos " + devCamila.getConteudosInscritos());
        System.out.println("Conteudos concluidos" + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularXp());
        System.out.println("-----------------");

        Dev devCarlos = new Dev("Carlos");
        devCarlos.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + devCarlos.getConteudosInscritos());
        devCarlos.progredir();
        devCarlos.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos " + devCarlos.getConteudosInscritos());
        System.out.println("Conteudos concluidos" + devCarlos.getConteudosConcluidos());
        System.out.println("XP: " + devCarlos.calcularXp());

    }

}