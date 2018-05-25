package xadrez;

import java.util.ArrayList;

public class Bispo extends Peca{

	public Bispo(int cor){
		super(cor);
	}

	@Override
	public String getPecaIcone(){
		if(this.cor == Peca.BRANCA){
			return "b";
		}else{
			return "B";
		}
	}
        
        @Override
	public ArrayList<Casa> movimentosPossiveis(Tabuleiro tabuleiro){
            
            ArrayList<Casa> casas = new ArrayList();
            
            int altura = this.getAltura();
            int largura = this.getLargura();
            
            int cima = altura - 1;
            int direita = largura + 1;
            
            boolean passouPeca = false;
            
            while(cima > -1 && direita < 8 && !passouPeca){
                
                Casa c = tabuleiro.getCasaNaPosicao(cima, direita);
                
                if(c.temPeca()){
                
                    if(c.getPeca().cor != this.cor){
                        casas.add(c);
                    }
                
                    passouPeca = true;
                    
                }
                else{
                    casas.add(c);
                }
                
                cima--;
                direita++;
                
            }
            
            int baixo = altura + 1;
            direita = largura + 1;
            passouPeca = false;
            
            while(baixo < 8 && direita < 8 && !passouPeca){
                
                Casa c = tabuleiro.getCasaNaPosicao(baixo, direita);
                
                if(c.temPeca()){
                
                    if(c.getPeca().cor != this.cor){
                        casas.add(c);
                    }
                
                    passouPeca = true;
                    
                }
                else{
                    casas.add(c);
                }
                
                baixo++;
                direita++;
                
            }
            
            baixo = altura + 1;
            int esquerda = largura - 1;
            passouPeca = false;
            
            while(baixo < 8 && esquerda > -1 && !passouPeca){
                
                Casa c = tabuleiro.getCasaNaPosicao(baixo, esquerda);
                
                if(c.temPeca()){
                
                    if(c.getPeca().cor != this.cor){
                        casas.add(c);
                    }
                
                    passouPeca = true;
                    
                }
                else{
                    casas.add(c);
                }
                
                baixo++;
                esquerda--;
                
            }
            
            cima = altura - 1;
            esquerda = largura - 1;
            passouPeca = false;
            
            while(cima > -1 && esquerda > -1 && !passouPeca){
                
                Casa c = tabuleiro.getCasaNaPosicao(cima, esquerda);
                
                if(c.temPeca()){
                
                    if(c.getPeca().cor != this.cor){
                        casas.add(c);
                    }
                
                    passouPeca = true;
                    
                }
                else{
                    casas.add(c);
                }
                
                cima--;
                esquerda--;
                
            }
            
            return casas;
            
        }
}