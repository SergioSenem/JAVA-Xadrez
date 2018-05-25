/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xadrez;

/**
 *
 * @author Sergio
 */
public class DesenharReimplementando extends DesenharTabuleiro{
    
    public DesenharReimplementando(Tabuleiro tabuleiro){
        super(tabuleiro);
    }
    
    @Override
    protected void criarJuncao(){
        this.juncao = "x";
    }
    
    @Override
    protected void criarAntesCasaSelecionada(){
        this.antesCasaSelecionada = "I";
    }

    @Override
    protected void criarDepoisCasaSelecionada(){
            this.depoisCasaSelecionada = "I";
    }
    
    @Override
    protected void criarEntrelinha(){
        this.entrelinha = "";
        for(int i =0;i<this.tabuleiro.getLargura();i++){
                this.entrelinha+= this.juncao+"---";
        }
        this.entrelinha += "x\n";
    }
    
}
