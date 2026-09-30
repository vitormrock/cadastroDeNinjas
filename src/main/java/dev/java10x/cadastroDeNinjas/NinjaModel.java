package dev.java10x.cadastroDeNinjas;

import jakarta.persistence.*;

// (Entity) ele trasforma um classe em uma entidade do BD
// JPA = JAVA PERSISTENCE API
@Entity
@Table (name = "tb_cadastro") // (TB) e uma boa prática

public class NinjaModel {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY) // isso faz os ID ir por números sequenciais
    private long id;
    private String nome;
    private String email;
    private int idade;

    public NinjaModel(String nome) {
        this.nome = nome;
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}


