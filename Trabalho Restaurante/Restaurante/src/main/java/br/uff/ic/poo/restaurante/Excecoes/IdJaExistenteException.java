package br.uff.ic.poo.restaurante.Excecoes;

public class IdJaExistenteException extends IllegalArgumentException{
    
    public IdJaExistenteException(){
        super("Entrada de ID inválida\nID já existente no cardapio\nOperação Interrompida\n");
    }
    
}