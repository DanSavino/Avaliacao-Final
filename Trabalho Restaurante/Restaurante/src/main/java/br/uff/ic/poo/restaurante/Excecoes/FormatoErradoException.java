package br.uff.ic.poo.restaurante.Excecoes;

public class FormatoErradoException extends IllegalArgumentException{
     
    public FormatoErradoException(){
        super("Entrada inválida\nOperação Interrompida");     
    }
       
}