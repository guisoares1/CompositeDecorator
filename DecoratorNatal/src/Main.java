import Domain.Mensagem1;
import Domain.Mensagem2;
import Domain.Mensagem3;
import Domain.MensagemFeita;

public class Main {


  public static void main(String[] args) {
	  var Msg1 = new MensagemFeita();
	  Msg1.add(new Mensagem1());
	  Msg1.add(new Mensagem2());
	  Msg1.add(new Mensagem3());
	  System.out.println(Msg1.getMensagem());
	  
	  var Msg2 = new MensagemFeita();
	  Msg2.add(new Mensagem2());
	  Msg2.add(new Mensagem1());
	  Msg2.add(new Mensagem3());
	  System.out.println(Msg2.getMensagem());
	  
	  var Msg3 = new MensagemFeita();
	  Msg3.add(new Mensagem3());
	  Msg3.add(new Mensagem2());
	  Msg3.add(new Mensagem1());
	  System.out.println(Msg3.getMensagem());
	  
	  var Msg4 = new MensagemFeita();
	  Msg4.add(new Mensagem1());
	  Msg4.add(new Mensagem3());
	  Msg4.add(new Mensagem2());
	  System.out.println(Msg4.getMensagem());
	  
	  var Msg5 = new MensagemFeita();
	  Msg5.add(new Mensagem3());
	  Msg5.add(new Mensagem1());
	  Msg5.add(new Mensagem2());
	  System.out.println(Msg5.getMensagem());
  }
}