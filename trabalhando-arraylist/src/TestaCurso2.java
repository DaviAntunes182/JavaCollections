import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
    public static void main(String[] args) {
        Curso curso = new Curso("Dominando coleções em java", "Paulo Silveira");

        curso.adiciona(new Aula("Trabalhando com arraylist", 20));
        curso.adiciona(new Aula("Criando uma Aula", 19));
        curso.adiciona(new Aula("Relacionamento com coleções", 23));

        List<Aula> aulasImutaveis = curso.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulasMutaveis = new ArrayList<>(aulasImutaveis);


//        Collections.sort(aulasImutaveis);// Dá erro, poís a lista é imutável
        Collections.sort(aulasMutaveis);
        System.out.println(aulasMutaveis);

        System.out.println(curso.getTempoTotal());

        System.out.println(curso);
    }
}