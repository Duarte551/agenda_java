import java.util.Random;

public class Main {

	public static void main(String[] args) {
		AgendaDeContatos agenda = new AgendaDeContatos();
		
		Random r = new Random();
		
		int minId = 1;
		int maxId = 100;
		
		int id = r.nextInt(maxId - minId) + minId;

		Contato contato1 = new Contato(id, "João", "123456789", "01/01/1990", "joao@email.com", "987654321");
		Contato contato2 = new Contato(id ,"Maria", "987654321", "15/05/1985", "maria@email.com", "123456789");

		agenda.adicionarContato(contato1);
		agenda.adicionarContato(contato2);

		Contato resultado = agenda.pesquisarContato("João");
		if (resultado != null) {
			System.out.println("Contato encontrado:");
			System.out.println("Nome: " + resultado.getNome());
		} else {
			System.out.println("Contato não encontrado.");
		}

		// agenda.excluirContato("Maria");

		agenda.exibirListaDeContatos();
	}
}
