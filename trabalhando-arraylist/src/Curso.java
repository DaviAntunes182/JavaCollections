import java.util.*;

public class Curso {
    private String titulo;
    private String professor;
    private int tempoTotal;
    private int totalAlunos;
    private List<Aula> aulas = new ArrayList<Aula>();
//  Diferença arraylist e list -> List é mais genérico e abraça mais classes(ArrayList, LinkedList)
//  Encapsulamento, escondendo quem está em aulas e deixando mais abrangente, menos comprometido
//  LinkedList é mais rapido para remoção e adicionar elementos no meio da lista ou no começo, mas lenta para consultar elementos
    private Set<Aluno> alunos = new LinkedHashSet<>();
//  HashSet -> LinkedHashSet mantém a ordem de inclusão dos valores
//  TreeSet -> Funciona só para comparables, onde guarda valores ordenados na ordem natural(comparable)
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();
//  LinkedHashMap guarda a ordem dos elementos inseridos no Map

    public Curso(String titulo, String professor) {
        this.titulo = titulo;
        this.professor = professor;
    }

    public void adiciona(Aula aula){
        this.aulas.add(aula);
        this.tempoTotal += aula.getTempo();
    }

    public void matricula(Aluno aluno) {
        if (alunoExiste(aluno.getMatricula())) {
            System.out.println("Está matricula já pertence a um aluno");
        } else {
            this.alunos.add(aluno);
            this.totalAlunos++;
            this.matriculaParaAluno.put(aluno.getMatricula(), aluno);

        }
    }
    public boolean estaMatriculado(Aluno aluno){
        return this.alunos.contains(aluno);
        // Contains faz um equals
    }

    public String getTitulo() {
        return titulo;
    }

    public String getProfessor() {
        return professor;
    }

    public List<Aula> getAulas() {
//      Apenas leitura, imodificável pelo método add
        return Collections.unmodifiableList(aulas);
    }
    public Set<Aluno> getAlunos() {
//      Apenas leitura, imodificável pelo metodo add
        return Collections.unmodifiableSet(alunos);
    }

    public int getTempoTotal(){
//        int tempoTotal = 0;
//        for(Aula aula: this.aulas){
//            tempoTotal += aula.getTempo();
//        }
//        return tempoTotal;
//      Para cada aula some o valor de getTempo;
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
//        return tempoTotal;
    }

    @Override
    public String toString() {
        return String.format("""
                (Curso: %s,
                 Instrutor: %s,
                 Carga horária: %d,
                 Aulas: %s)\n
                """, titulo, professor, getTempoTotal(), this.aulas);
    }

    public boolean alunoExiste(int matricula){
        if(matriculaParaAluno.get(matricula) != null){
            return true;
        }else{
            return false;
        }
    }

    public Aluno buscaAluno(int matricula) {
        //Como fazer uma busca sem estar utilizando Maps
//        for(Aluno aluno : alunos){
//            if (aluno.getMatricula() == matricula){
//                return aluno;
//            }
//        }
        //Map é muito mais eficiente que um For
        if (matriculaParaAluno.get(matricula) == null) {
            throw new NoSuchElementException("Este aluno não está na base de dados");
        } else {
            return matriculaParaAluno.get(matricula);
        }
    }
}
