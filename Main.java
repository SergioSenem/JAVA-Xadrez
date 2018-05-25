package xadrez;

public class Main{
	public static void main(String[] args){
		Tabuleiro tabuleiro = new Tabuleiro(8,8);
		DesenharTabuleiro desenharTabuleiro = new DesenharTabuleiro(tabuleiro);
                //DesenharReimplementando desenharTabuleiro = new DesenharReimplementando(tabuleiro);

		Torre tb1 = new Torre(Peca.BRANCA);
                Cavalo cb1 = new Cavalo(Peca.BRANCA);
                Bispo bb1 = new Bispo(Peca.BRANCA);
                Rainha db = new Rainha(Peca.BRANCA);
                Rei rb = new Rei(Peca.BRANCA);
                Bispo bb2 = new Bispo(Peca.BRANCA);
                Cavalo cb2 = new Cavalo(Peca.BRANCA);
                Torre tb2 = new Torre(Peca.BRANCA);
                
                Peao pb1 = new Peao(Peca.BRANCA);
                Peao pb2 = new Peao(Peca.BRANCA);
                Peao pb3 = new Peao(Peca.BRANCA);
                Peao pb4 = new Peao(Peca.BRANCA);
                Peao pb5 = new Peao(Peca.BRANCA);
                Peao pb6 = new Peao(Peca.BRANCA);
                Peao pb7 = new Peao(Peca.BRANCA);
                Peao pb8 = new Peao(Peca.BRANCA);
                
                Torre tp1 = new Torre(Peca.PRETA);
                Cavalo cp1 = new Cavalo(Peca.PRETA);
                Bispo bp1 = new Bispo(Peca.PRETA);
                Rainha dp = new Rainha(Peca.PRETA);
                Rei rp = new Rei(Peca.PRETA);
                Bispo bp2 = new Bispo(Peca.PRETA);
                Cavalo cp2 = new Cavalo(Peca.PRETA);
                Torre tp2 = new Torre(Peca.PRETA);
                
                Peao pp1 = new Peao(Peca.PRETA);
                Peao pp2 = new Peao(Peca.PRETA);
                Peao pp3 = new Peao(Peca.PRETA);
                Peao pp4 = new Peao(Peca.PRETA);
                Peao pp5 = new Peao(Peca.PRETA);
                Peao pp6 = new Peao(Peca.PRETA);
                Peao pp7 = new Peao(Peca.PRETA);
                Peao pp8 = new Peao(Peca.PRETA);
                
                tabuleiro.addPeca(tb1, 7, 0);
                tabuleiro.addPeca(cb1, 7, 1);
                tabuleiro.addPeca(bb1, 7, 2);
                tabuleiro.addPeca(db, 7, 3);
                tabuleiro.addPeca(rb, 7, 4);
                tabuleiro.addPeca(bb2, 7, 5);
                tabuleiro.addPeca(cb2, 7, 6);
                tabuleiro.addPeca(tb2, 7, 7);
                
                tabuleiro.addPeca(pb1, 6, 0);
                tabuleiro.addPeca(pb2, 6, 1);
                tabuleiro.addPeca(pb3, 6, 2);
                tabuleiro.addPeca(pb4, 6, 3);
                tabuleiro.addPeca(pb5, 6, 4);
                tabuleiro.addPeca(pb6, 6, 5);
                tabuleiro.addPeca(pb7, 6, 6);
                tabuleiro.addPeca(pb8, 6, 7);
                
                tabuleiro.addPeca(tp1, 0, 0);
                tabuleiro.addPeca(cp1, 0, 1);
                tabuleiro.addPeca(bp1, 0, 2);
                tabuleiro.addPeca(dp, 0, 3);
                tabuleiro.addPeca(rp, 0, 4);
                tabuleiro.addPeca(bp2, 0, 5);
                tabuleiro.addPeca(cp2, 0, 6);
                tabuleiro.addPeca(tp2, 0, 7);
                
                tabuleiro.addPeca(pp1, 1, 0);
                tabuleiro.addPeca(pp2, 1, 1);
                tabuleiro.addPeca(pp3, 1, 2);
                tabuleiro.addPeca(pp4, 1, 3);
                tabuleiro.addPeca(pp5, 1, 4);
                tabuleiro.addPeca(pp6, 1, 5);
                tabuleiro.addPeca(pp7, 1, 6);
                tabuleiro.addPeca(pp8, 1, 7);
                
		pb3.selecionar();
		
		tabuleiro.atualizar();
		
		String s = desenharTabuleiro.desenhar();
		//String s = DesenharSemReimplementar.desenhar(tabuleiro);
                System.out.println(s);
	}
}