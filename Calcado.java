
package alunoFatec;

public class Calcado {
    private boolean comprar;
    public String tipo;
    private String material;
    private String cor;
    private String ocasiao;
    private float custo;
    
    public void ficha(){
        System.out.println("_____________________________");
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Material: " + this.getMaterial());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ocasi�o: " + this.getOcasiao());
        System.out.println("Custo: R$ " + this.getCusto());
    }
    public void Calcar(String ca){
       System.out.println("Calçado colocado: " + ca);
        
    }
    public void Engraxar(String ex){
        System.out.println("Precisa engraxar?: " + ex);
        
    }
    public void Amarrar(String am){
       System.out.println("Se possuir cadarço: " + am);
       System.out.println("_____________________________");
    }
    
    //Métodos especiais
    public Calcado(boolean cm) {
        this.comprar = cm;
         System.out.println("Comprar: " + cm);
    }

    public boolean isComprar() {
        return comprar;
    }

    public void setComprar(boolean comprar) {
        this.comprar = comprar;
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

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getOcasiao() {
        return ocasiao;
    }

    public void setOcasiao(String ocasiao) {
        this.ocasiao = ocasiao;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }
    
}
