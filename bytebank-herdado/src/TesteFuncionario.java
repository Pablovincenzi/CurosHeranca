
public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Funcionario2 f1 = new Funcionario2();
		f1.setSalario(3000.0);
		System.out.println(f1.getBonificacao());
		
		
		System.out.println(f1.getSalario());
		
		Gerente g1 = new Gerente();
		g1.setNome("Pablo Vincenzi");
		g1.setCpf("00000001");
		g1.setSalario(3000);
		
		System.out.println(g1.getSalario());
		g1.setSenha(2323);
		boolean senha = g1.autenticasenha(2323);
		System.out.println(senha);
		
		
	}

}
