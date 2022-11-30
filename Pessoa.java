package exercicio1;

import java.util.ArrayList;

public class Pessoa {
   private String nome;
    private String cpf;
    private int idade;
    private float energia;
    private Carro ocarro;
    private ArrayList<Carro> carros;
    
    Pessoa(){
        nome = "nome";
        cpf = "cpf";
        idade = 0;
        energia = 0;
        this.carros = new ArrayList<Carro>();
    }
    
    Pessoa(String nome){
        this.nome = nome;
        this.cpf = "cpf";
        this.idade = 0;
        this.energia = 0;
        this.ocarro = null;
        this.carros = new ArrayList<Carro>();

    }  
    
    Pessoa(String nome, Carro c){
        this.nome = nome;
        this.cpf = "cpf";
        this.idade = 0;
        this.energia = 0;
        this.ocarro = c;
        this.carros = new ArrayList<Carro>();

    } 
    
    public void addCarro(Carro c){
        this.carros.add(c);
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public void setEnergia(float energia){
        this.energia = energia;
    }
    
    public void SetOcarro(Carro c){
        this.ocarro = c;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public float getEnergia(){
        return this.energia;
    }
    
    public Carro getOcarro(){
        return this.ocarro;
    }
    
}

