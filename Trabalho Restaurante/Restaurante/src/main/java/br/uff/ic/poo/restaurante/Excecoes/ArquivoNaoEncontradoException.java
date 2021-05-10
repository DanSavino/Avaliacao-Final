package br.uff.ic.poo.restaurante.Excecoes;

import java.io.FileNotFoundException;

public class ArquivoNaoEncontradoException extends FileNotFoundException{
    
    public ArquivoNaoEncontradoException(){
        super("Arquivo não encontrado");
    }
 
}