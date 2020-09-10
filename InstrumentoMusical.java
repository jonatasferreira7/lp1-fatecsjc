package alunoFatec;

public class InstrumentoMusical {
    public String nome;
    public String tipo;
    private String material;
    private String tom;
    private String fabricante;
    private float valor;
    
    public void ficha(){
        System.out.println("________________________________________");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Material: " + this.getMaterial());
        System.out.println("Tom do instrumento: " + this.getTom());
        System.out.println("Valor: R$ " + this.getValor());
    }
    
    public void afinar(String afinar){
       this.tom = afinar;
       System.out.println("Fácil afinação: "+afinar);
    }
    
    public void conserto(String manut){
       this.tipo = manut;
       System.out.println("Fácil Manutenção: "+ manut);  
    }
    public void venda(String p){
        this.material = p;
        System.out.println("Fácil de vender: "+ p); 
        System.out.println("________________________________________");
    }

    public InstrumentoMusical(String genero) {
       this.fabricante = genero;
       System.out.println("Genero Musical: "+genero);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTom() {
        return tom;
    }

    public void setTom(String tom) {
        this.tom = tom;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
}


