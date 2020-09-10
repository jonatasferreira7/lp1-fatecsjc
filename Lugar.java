package alunoFatec;

public class Lugar {
    private String pais;
    private String cidade;
    private String clima;
    private String povo;
    public boolean seguro;
    
    public void cadastro(){
        System.out.println("___________________________");
        System.out.println("Cidade: " + this.getCidade());
        System.out.println("País: " + this.getPais());
        System.out.println("Clima: " + this.getClima());
        System.out.println("Segurança: " + this.isSeguro());
    }
    
     public String getPovo() {
        return povo;
    }

    public void povo(String povo) {
        this.povo = povo;
        System.out.println("População: " + povo);
    }

    public boolean isSeguro() {
        return true;
        
    }
    public void setSeguro(boolean seguro) {
        this.seguro = seguro; 
    }
    
    public void frase(String texto){
        System.out.println(texto);
    }
    
    //Metodos especiais
    public Lugar(String l) {
        cidade = l;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String local) {
        this.cidade = local;
    }
    public String getClima() {
        return clima;
    }

    public void setClima(String climate) {
        this.clima = climate;
    }
}
