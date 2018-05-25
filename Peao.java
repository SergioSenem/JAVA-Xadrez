package xadrez;

import java.util.ArrayList;

public class Peao extends Peca{

	public Peao(int cor){
		super(cor);
	}

	@Override
	public String getPecaIcone(){
		if(this.cor == Peca.BRANCA){
			return "p";
		}else{
			return "P";
		}
	}
        
        @Override
	public ArrayList<Casa> movimentosPossiveis(Tabuleiro tabuleiro){
            ArrayList<Casa> casas = new ArrayList();
            
            Casa frente;
            Casa diagonalEsquerda;
            Casa diagonalDireita;
            
            
            if(this.cor == Peca.BRANCA){
                frente = tabuleiro.getCasaNaPosicao(this.getAltura() - 1, this.getLargura());
                diagonalEsquerda = tabuleiro.getCasaNaPosicao(this.getAltura() - 1, this.getLargura() - 1);
                diagonalDireita = tabuleiro.getCasaNaPosicao(this.getAltura() - 1, this.getLargura() + 1);
            }
            else{
                frente = tabuleiro.getCasaNaPosicao(this.getAltura() + 1, this.getLargura());
                diagonalEsquerda = tabuleiro.getCasaNaPosicao(this.getAltura() + 1, this.getLargura() - 1);
                diagonalDireita = tabuleiro.getCasaNaPosicao(this.getAltura() + 1, this.getLargura() + 1);
            }
            
            if(!frente.temPeca()){
                
                casas.add(frente);
                
                if(this.cor == Peca.BRANCA){
                    if(this.getAltura() == 6){
                        if(!tabuleiro.getCasaNaPosicao(4, this.getLargura()).temPeca()){
                            casas.add(tabuleiro.getCasaNaPosicao(4, this.getLargura()));
                        }
                    }
                }
                else{
                    if(this.getAltura() == 1){
                        if(!tabuleiro.getCasaNaPosicao(3, this.getLargura()).temPeca()){
                            casas.add(tabuleiro.getCasaNaPosicao(3, this.getLargura()));
                        }
                    }
                }
                
            }
            
            if(diagonalEsquerda.temPeca()){
                if(diagonalEsquerda.getPeca().cor != this.cor){
                    casas.add(diagonalEsquerda);
                }
            }
            
            if(diagonalDireita.temPeca()){
                if(diagonalDireita.getPeca().cor != this.cor){
                    casas.add(diagonalDireita);
                }
            }
            
            return casas;
            
        }
}