import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {
        Curso curso = new Curso("Dominando coleções em java", "Paulo Silveira");

        List<Aula> aulas = curso.getAulas();
        System.out.println(aulas);

        curso.adiciona(new Aula("Trabalhando com arraylist", 20));
        curso.adiciona(new Aula("Criando uma Aula", 19));
        curso.adiciona(new Aula("Relacionamento com coleções", 23));

        System.out.println(curso.getAulas());

    }
}
