package xadrez;

import java.util.ArrayList;

public class Rei extends Peca{

	public Rei(int cor){
		super(cor);
	}

	@Override
	public String getPecaIcone(){
		if(this.cor == Peca.BRANCA){
			return "r";
		}else{
			return "R";
		}
	}
}