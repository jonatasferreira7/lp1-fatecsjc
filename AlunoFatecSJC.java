package alunoFatec;

public class AlunoFatecSJC {
    private String matricula;
    public String nome;
    public String curso;
    private String cpf;
    private String nascimento;
    
    public void ficha(){
        System.out.println("_________________________________");
        System.out.println("Nome do Aluno: " + this.getNome());
        System.out.println("Curso: " + this.getCurso());
        System.out.println("CPF: " + this.getCpf());
        
    }
     
    public void distrito(String cidade) {
        this.nascimento = cidade;
        System.out.println("Distrito: " + cidade);
        System.out.println("_________________________________");
    }

    public AlunoFatecSJC(String m) {
       this.matricula = m;
       System.out.println("Atualmente matriculado: "+m);
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String data) {
        this.nascimento = data;
    }
    
}
