import java.util.NoSuchElementException;

public class TestaBuscaAlunosNoCurso {
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

        System.out.println("Quem é o aluno com matrícula 5618?");
        try {
            Aluno aluno = curso.buscaAluno(5618);
            System.out.println(aluno);
        }catch (NoSuchElementException ex){
            System.out.println(ex.getMessage());
        }
    }
}
