package atividadepoo;

public class Pressoa {

    private String nome;
    private double altura;
    private double peso;
    private String voz;
    private int anoSc;
    private int idade;
    

    /**
     * Contrutor Vazio
     */
    Pressoa() {

    }

    /**
     * Construtor com parâmetro nome
     * @param String nome
     */
    Pressoa(String nome) {
        this.nome = nome;
    }

    /**
     * pega o nome
     * @return 
     */
    public String getNome() {
        return "Meninu " + this.nome;
    }

    /**
     * seta o nome da pessoa
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * pega a altura
     * @return
     */
    public double getAltura() {
        return this.altura;
    }

    /**
     * seta a altura
     * @param altura
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * pega o peso
     * @return
     */
    public double getPeso() {
        return this.peso;
    }

    /**
     * seta o peso
     * @param peso 
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * pega a voz
     * @return 
     */
    public String getVoz() {
        return this.voz;
    }

    /**
     * seta a vozF
     * @param voz 
     */
    public void setVoz(String voz) {
        this.voz = voz;
    }

    public String falar(){
        return "bla´bla´blá";
    }
    
    
    public void setAnoNasc(int ano){
        this.anoSc = ano;
        calcularIdade();
    }
    
    public int getAnoNasc(){
        return this.anoSc;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void calcularIdade (){
        if (this.anoSc != 0){
            this.idade = 2020 - getAnoNasc();
        }
    }
}
