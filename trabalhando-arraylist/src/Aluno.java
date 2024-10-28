public class Aluno {
    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula) {
        if(nome == null){
            throw new NullPointerException("Nome não pode ser nulo");
        }
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return String.format("""
                Matrícula: %d -> Nome: %s""",matricula, nome);
    }

    @Override
    public boolean equals(Object obj) {
        Aluno a = (Aluno) obj;
        return this.nome.equals(a.nome) && this.matricula == a.matricula;
    }

    @Override
    public int hashCode() {
//        int hash = 0;
//        for (int i = 0; i < this.nome.length(); i++) {
//            hash += i + this.nome.charAt(i);
//        }
//        hash += this.matricula;
//        return hash;
        return this.nome.hashCode();
    }
}
