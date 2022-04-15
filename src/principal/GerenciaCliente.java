package principal;

import java.util.ArrayList;

public class GerenciaCliente {
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	public void menu() {
		int resp = 1;
		while(resp != 0 ){
			System.out.println("----> Gerenciamento de clientes <---- ");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Alterar");
			System.out.println("3 - Excluir");
			System.out.println("4 - Consultar");
			System.out.println("5 - Relatório");
			System.out.println("0 - Voltar ao menu principal ");
			System.out.print("Digite uma opção: ");
			resp = Main.sc.nextInt();
			Main.sc.nextLine();
			
			switch(resp) {
			case 1: 
				cadastrar();
				break;
			case 2:
				alterar();
				break;
			case 3:
				excluir();
				break;
			case 4:
				consultar();
				break;
				
			}
		}
	}
	
	
	public void cadastrar() {
		Cliente dados = new Cliente();
		System.out.println("---> Cadastro de cliente <---");
		System.out.print("Nome: ");
		dados.setNome(Main.sc.nextLine());
		System.out.print("CPF: ");
		dados.setCpf(Main.sc.nextLine());
		System.out.print("CNPJ: ");
		dados.setCnpj(Main.sc.nextLine());
		System.out.println("Endereço: ");
		Endereco end = new Endereco();
		System.out.print("Logradouro: ");
		end.setLogradouro(Main.sc.nextLine());
		System.out.print("Número: ");
		end.setNumero(Main.sc.nextInt());
		Main.sc.nextLine();
		System.out.print("Complemento: ");
		end.setComplemento(Main.sc.nextLine());
		System.out.print("Bairro: ");
		end.setBairro(Main.sc.nextLine());
		System.out.print("Município: ");
		end.setMunicipio(Main.sc.nextLine());
		System.out.print("Estado: ");
		end.setEstado(Main.sc.nextLine());
		System.out.print("CEP: ");
		end.setCep(Main.sc.nextLine());
		dados.setEndereco(end);
		System.out.print("Limite de crédito: ");
		dados.setLimiteDeCredito(Main.sc.nextDouble());
		clientes.add(dados);
		System.out.println("-> Cliente cadastrado com sucesso! <-");
	}
	
	public void listar() {
		//Para cada cliente da lista, é obtido uma instância
		for (Cliente cliente : clientes) {
			//Retorna o endereço(posição do vetor) do cliente atual
			int pos = clientes.indexOf(cliente);
			System.out.println(pos+"- "+cliente.getNome());
		}
	}
	
	public void alterar() {
		System.out.println("---> Alteração de cliente <---");
		listar();
		System.out.println("--> Escolha o cliente <--");
		int resp = Main.sc.nextInt();
		Main.sc.nextLine();
		//Verificar se possição escolhida existe
		if(clientes.get(resp) != null) {
			Cliente dados = new Cliente();
			System.out.print("Nome: ");
			dados.setNome(Main.sc.nextLine());
			System.out.print("CPF: ");
			dados.setCpf(Main.sc.nextLine());
			System.out.print("CNPJ: ");
			dados.setCnpj(Main.sc.nextLine());
			System.out.println("Endereço: ");
			Endereco end = new Endereco();
			System.out.print("Logradouro: ");
			end.setLogradouro(Main.sc.nextLine());
			System.out.print("Número: ");
			end.setNumero(Main.sc.nextInt());
			Main.sc.nextLine();
			System.out.print("Complemento: ");
			end.setComplemento(Main.sc.nextLine());
			System.out.print("Bairro: ");
			end.setBairro(Main.sc.nextLine());
			System.out.print("Município: ");
			end.setMunicipio(Main.sc.nextLine());
			System.out.print("Estado: ");
			end.setEstado(Main.sc.nextLine());
			System.out.print("CEP: ");
			end.setCep(Main.sc.nextLine());
			dados.setEndereco(end);
			System.out.print("Limite de crédito: ");
			dados.setLimiteDeCredito(Main.sc.nextDouble());
			//Substituir o cliente do array list pelo cliente adcionado no momento da alteração
			clientes.set(resp, dados);
			System.out.println("-> Cliente alterado com sucesso! <- ");
		} else {
			System.out.println("-> Cliente escolhido não existe. <- ");
		}
	}
	
	public void excluir() {
		System.out.println("---> Exclusão de cliente <---");
		listar();
		System.out.println("--> Escolha o cliente <--");
		int resp = Main.sc.nextInt();
		//Verificar se possição escolhida existe
		if(clientes.get(resp) != null) {
			clientes.remove(resp);
			System.out.println("-> Cliente excluído com sucesso! <- ");
		} else {
			System.out.println("-> Cliente escolhido não existe. <-");
		}
	}
	
	public void consultar() {
		System.out.println("---> Consulta de cliente <---");
		listar();
		System.out.println("--> Escolha o cliente <-- ");
		int resp = Main.sc.nextInt();
		if(clientes.size() > resp) {
			Cliente cli = clientes.get(resp);
			Endereco end = cli.getEndereco();
			System.out.println("Nome: " + cli.getNome());
			System.out.println("CPF: " + cli.getCpf());
			System.out.println("CNPJ: " + cli.getCnpj());
			System.out.println("Endereço: " + end.getLogradouro() + "," + end.getNumero() + "," + end.getBairro() + "," + end.getCep() + "," + end.getComplemento() + "," + end.getMunicipio() + "," + end.getEstado());
			System.out.println("Limite de crédito: " + cli.getLimiteDeCredito());
		} else {
			System.out.println("-> Cliente escolhido não existe. <- ");
		}
	}
	
	public void relatorio() {
		for (Cliente cli : clientes) {
			Endereco end = cli.getEndereco();
			System.out.println("========================================================================.");
			System.out.println("Nome: " + cli.getNome());
			System.out.println("CPF: " + cli.getCpf());
			System.out.println("CNPJ: " + cli.getCnpj());
			System.out.println("Endereço: " + end.getLogradouro() + "," + end.getNumero() + "," + end.getBairro() + "," + end.getCep() + "," + end.getComplemento() + "," + end.getMunicipio() + "," + end.getEstado());
			System.out.println("Limite de crédito: " + cli.getLimiteDeCredito());
		}
	}
}
