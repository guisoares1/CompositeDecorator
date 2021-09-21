package Domain;

public class MensagemFeita implements ModeloMensagem{
    protected String msg="";
    
    public void add( ModeloMensagem Msg ) {
    	this.msg +=  Msg.getMensagem();
    }
	public String getMensagem() {
		return this.msg;
	}
}
