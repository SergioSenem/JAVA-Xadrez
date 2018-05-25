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
public abstract class DesenharSemReimplementar {
    
    public static String desenhar(Tabuleiro tabuleiro){
        
        String desenho = "";
        
        for(int i = 0; i < tabuleiro.getAltura(); i++ ){
        
            for(int j = 0; j <tabuleiro.getLargura(); j++){
                
                if(tabuleiro.getCasaNaPosicao(i, j).temPeca()){
                    desenho += tabuleiro.getCasaNaPosicao(i, j).getPeca().getPecaIcone();
                }
                else{
                    desenho += "-";
                }
                
                desenho += " ";
            
            }
            
            desenho += "\n";
            
        }
        
        return desenho;
    }
    
}
