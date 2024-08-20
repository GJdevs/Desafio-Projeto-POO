import br.com.dio.dominio.BootCamp;
import br.com.dio.dominio.Curso;
import br.com.dio.dominio.Dev;
import br.com.dio.dominio.Mentoria;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("java");
        curso1.setDescricao("java descrição");
        curso1.setCargaHoraria(30);

        Curso curso2 = new Curso();
        curso2.setTitulo("phyton");
        curso2.setDescricao("phyton descricao");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setData();
        mentoria.setDescricao("Mentoria descricao");
        mentoria.setTitulo("Mentoria titulo");

  /*      System.out.println(curso1.toString());
        System.out.println(curso2.toString());
        System.out.println(mentoria.toString());
*/
        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("Bootcamp Java Dev");
        bootcamp.setDescricao("descrição bootcamp java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Guilherme de Jesus Santos");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos incritos: "+ dev.getConteudoInscritos());
        dev.progredir();
        System.out.println("Conteudos Concluidos: "+ dev.getConteudoConcluidos());

        Dev dev2 = new Dev();
        dev2.setNome("Joao da silva");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos incritos: "+ dev.getConteudoInscritos());
        dev2.progredir();
        System.out.println("Conteudos Concluidos: "+ dev.getConteudoConcluidos());


    }
}