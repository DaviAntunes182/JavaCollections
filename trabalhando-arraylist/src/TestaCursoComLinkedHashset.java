import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCursoComLinkedHashset {
    public static void main(String[] args) {
        Curso curso = new Curso("Dominando coleções em java", "Paulo Silveira");

        curso.adiciona(new Aula("Trabalhando com arraylist", 20));
        curso.adiciona(new Aula("Criando uma Aula", 19));
        curso.adiciona(new Aula("Relacionamento com coleções", 23));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);

        curso.matricula(a1);
        curso.matricula(a2);
        curso.matricula(a3);

        curso.getAlunos().forEach(aluno -> {
            System.out.println("LinkedHashSet -> " + aluno);
        });
    }
}
