import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCursoComAluno {
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
            System.out.printf("""
                              HashSet -> Aluno: [%s]
                              """,aluno);
        });

        List<Aula> aulasImutaveis = curso.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulasMutaveis = new ArrayList<>(aulasImutaveis);


//        Collections.sort(aulasImutaveis);// Dá erro, poís a lista é imutável
        Collections.sort(aulasMutaveis);
        System.out.println(aulasMutaveis);

        System.out.println(curso.getTempoTotal());

        System.out.println(curso);

        System.out.println("Matriculado?");
        System.out.println(curso.estaMatriculado(a1));
        // ----------------------------------------------- \\

        String nome = "Rodrigo Turini";
        Aluno turini = new Aluno(nome, 34672);

        //Com set não funciona por causa do hashcode -> Funciona se mudarmos o hascode
        System.out.println("Turini está matriculado?");
        System.out.println(curso.estaMatriculado(turini));



    }
}
