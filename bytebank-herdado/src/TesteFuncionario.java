import java.util.Scanner;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class TesteFuncionario {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		// TODO Auto-generated method stub
		Funcionario f1 = new Funcionario();
//		f1.setSalario(3000.0);
			
		
		System.out.println("Informe Salario");
//		double recebe = ler.nextDouble();
		f1.setSalario(ler.nextDouble());
//		System.out.println("VARIAVEL"+recebe);
		System.out.println(f1.getSalario());
	
	}

}
