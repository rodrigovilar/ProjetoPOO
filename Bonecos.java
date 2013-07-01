package meujogo;


public class Bonecos {
    private String nome;
    private int idade;
    private int posicaoX;
    private int posicaoY;
    private String cor;
    
    public int getPosicaoX() {
        return this.posicaoX;
    }
    
    public int getPosicaoY() {
        return this.posicaoY;
    }
    public void setPosicao(int novoX, int novoY) {
        this.posicaoX = novoX;
        this.posicaoY = novoY;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getIdade(){
        return this.idade;
        
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
}

    



