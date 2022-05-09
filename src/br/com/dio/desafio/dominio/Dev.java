package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudoIncritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudoConteudos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){

    }
    public void progredir(){

    }
    public void calcularTotalXp(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoIncritos() {
        return conteudoIncritos;
    }

    public void setConteudoIncritos(Set<Conteudo> conteudoIncritos) {
        this.conteudoIncritos = conteudoIncritos;
    }

    public Set<Conteudo> getConteudoConteudos() {
        return conteudoConteudos;
    }

    public void setConteudoConteudos(Set<Conteudo> conteudoConteudos) {
        this.conteudoConteudos = conteudoConteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudoIncritos, dev.conteudoIncritos) && Objects.equals(conteudoConteudos, dev.conteudoConteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudoIncritos, conteudoConteudos);
    }
}
