package br.unigran.emprestimodelivros;

public class Pessoa {
    public String nome;
    public String cidade;

    @Override
    public String toString() {
        return  nome +" - "+cidade;
    }
}
