package br.uff.ic.poo.restaurante.Excecoes;

import java.io.IOException;

public class ItemJaExistenteException extends IOException{
    
    public ItemJaExistenteException(){
        super("Item já se encontra no cardapio");
    }
    
}