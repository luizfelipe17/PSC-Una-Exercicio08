package com.mycompany.empregado;

public enum E_TipoDemissao {
    
    JUSTA_CAUSA (1),
    DECISAO_DO_EMPREGADOR(2),
    APOSENTADORIA(3);
    
    private final int valor;
    
    E_TipoDemissao (int valor){
        
        this.valor = valor;
        
    }
    
    public int getValor(){
        
        return valor;
        
    }
    
}
