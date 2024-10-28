import java.util.*;

public class TestaAlunos {
    public static void main(String[] args) {
        //Um Set não possui ordem definida
        //Set não permite duplicatas
        Collection<String> alunos = new HashSet<>();
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");

        for(String aluno: alunos){
            System.out.println(aluno);
        }

        alunos.forEach(a -> {
            System.out.println("lambda -> " + a);
        });

        System.out.println(alunos);

        //Dá para criar uma arraylist baseada em um set
        List<String> alunosLista = new ArrayList<>(alunos);
        alunosLista.forEach(a->{
            System.out.println("ArrayList ->" + a);
        });
    }
}
