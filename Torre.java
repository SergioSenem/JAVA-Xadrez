package xadrez;

import java.util.ArrayList;

public class Torre extends Peca{

	public Torre(int cor){
		super(cor);
	}

	@Override
	public ArrayList<Casa> movimentosPossiveis(Tabuleiro tabuleiro){

		ArrayList<Casa> casas = new ArrayList<Casa>();

		int largura = this.getLargura();
		int altura = this.getAltura();
		
		int cima = altura-1;
                boolean passouPeca = false;
		while(cima > -1 && !passouPeca){
                    Casa c = tabuleiro.getCasaNaPosicao(cima,largura);

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
		}
                
                passouPeca = false;
                int baixo = altura + 1;
                while(baixo < 8 && !passouPeca){
                    Casa c = tabuleiro.getCasaNaPosicao(baixo, largura);
                    
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
                }
                
                passouPeca = false;
                int esquerda = largura - 1;
                while(esquerda > -1 && !passouPeca){
                    Casa c = tabuleiro.getCasaNaPosicao(altura, esquerda);
                    
                    if(c.temPeca()){
                        if(c.getPeca().cor != this.cor){
                            casas.add(c);
                        }
                        passouPeca = true;
                    }
                    else{
                        casas.add(c);
                    }
                    
                    esquerda--;
                }
                
                passouPeca = false;
                int direita = largura + 1;
                while(direita < 8 && !passouPeca){
                    Casa c = tabuleiro.getCasaNaPosicao(altura, direita);
                    
                    if(c.temPeca()){
                        if(c.getPeca().cor != this.cor){
                            casas.add(c);
                        }
                        passouPeca = true;
                    }
                    else{
                        casas.add(c);
                    }
                    
                    direita++;
                }

		//casas.add(this.casa);

		return casas;
	}

	@Override
	public String getPecaIcone(){
		if(this.cor == Peca.BRANCA){
			return "t";
		}else{
			return "T";
		}
	}
}