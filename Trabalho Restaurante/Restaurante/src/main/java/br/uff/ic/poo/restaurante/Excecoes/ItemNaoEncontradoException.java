package br.uff.ic.poo.restaurante.Excecoes;

import java.io.IOException;

public class ItemNaoEncontradoException extends IOException{
    
    public ItemNaoEncontradoException(){
        super("Item não se encontra no cardapio");
    }    
    
}