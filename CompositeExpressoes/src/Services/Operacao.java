package Services;

import Abstrato.ExpressaoAritmetica;

public class Operacao extends ExpressaoAritmetica {
    	
	private ExpressaoAritmetica op1; 
	private ExpressaoAritmetica op2; 
	private String _expressao;
	public Operacao(String expressao) {
		_expressao = expressao;
	}
	@Override
	public int getResultado() {
		// TODO Auto-generated method stub
		return 0;
	}

}
