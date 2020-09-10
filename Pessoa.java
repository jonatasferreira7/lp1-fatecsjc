package alunoFatec;

public class Pessoa {
	private String nome;
	public String nacionalidade;
    private float altura;
    private float peso;
    private char sexo;
    
    public void ficha() {
        System.out.println("___________________________");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Nacionalidade: " + this.getNacionalidade());
        System.out.println("Altura: " + this.getAltura() + "cm");
        System.out.println("Peso: " + this.getPeso() + "kg");
    }
    
    public void time(String time){
        System.out.println("Torcedor do:  " + time);
    }
    
    public void goat(String jogador){
        System.out.println("Greatest Of All Time:  " + jogador);
    }

    public Pessoa(String n,char sexo)//Constructor
    {
    	nome=n;
    	this.sexo=sexo;
    }
    
    public char getSexo() {
	return sexo;
    }
    
    public void setSexo(char sexo) {
	this.sexo = sexo;
    }
    
    public float getAltura() {
	return altura;
    }
    
    public void setAltura(float altura) {
	this.altura = altura;
    }
    
    public float getPeso() {
	return peso;
    }
    
    public void setPeso(float massa) {
	this.peso = massa;
    }
    
    public String getNome() {
	return nome;
    }
    
    public void setNome(String nome) {
	this.nome = nome;
    }
    
    public String getNacionalidade() {
	return nacionalidade;
    }
    
    public void setNacionalidade(String pais) {
	this.nacionalidade = pais;
    }
}