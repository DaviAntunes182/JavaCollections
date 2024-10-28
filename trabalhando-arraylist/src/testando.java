import java.util.ArrayList;
import java.util.Collections;

public class testando {
    public static void main(String[] args) {
        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe Aula";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        aulas.remove(aula3);
        aulas.remove(0);
        System.out.println(aulas);

        System.out.println();

        aulas.add(aula3);
        aulas.forEach(a -> {
            System.out.println("Percorrendo com lambda:" + a);
        });
        aulas.forEach(System.out::println);

        System.out.println();
        for(String aula: aulas){
            System.out.println(aula);
        }

        aulas.add("Aumentando o conhecimento");
        Collections.sort(aulas);
        System.out.println(aulas);

    }
}
