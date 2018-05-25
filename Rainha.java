package xadrez;

import java.util.ArrayList;

public class Rainha extends Peca{

	public Rainha(int cor){
		super(cor);
	}

	@Override
	public String getPecaIcone(){
		if(this.cor == Peca.BRANCA){
			return "d";
		}else{
			return "D";
		}
	}
}