package xadrez;

import java.util.ArrayList;

public class Cavalo extends Peca{

	public Cavalo(int cor){
		super(cor);
	}

	@Override
	public String getPecaIcone(){
		if(this.cor == Peca.BRANCA){
			return "c";
		}else{
			return "C";
		}
	}
}