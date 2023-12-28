import java.util.HashMap;
import java.util.Map;

public class AgendaDeContatos {
	HashMap<String, Contato> agenda = new HashMap<String, Contato>();

	public void adicionarContato(Contato contato) {
		agenda.put(contato.getNome(), contato);
	}

	public void excluirContato(String nome) {
		agenda.remove(nome);
	}

	public Contato pesquisarContato(String nome) {
		return agenda.get(nome);
	}

	public void exibirListaDeContatos() {
		System.out.println("Lista de Contatos:");
		for (Contato contato : agenda.values()) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Telefone: " + contato.getTelefone());
			System.out.println("Nascimento: " + contato.getNascimento());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Celular: " + contato.getCelular());
			System.out.println();
		}
	}
}