package br.com.dantas.teste;

import java.util.Arrays;
import java.util.List;

import br.com.dantas.adriano.model.Pessoa;
import br.com.dantas.adriano.response.Response;

public class PessoaTeste {
	
	static Response<Pessoa> resp = new Response<Pessoa>();
	
	public static void main(String[] args) {
		
		Response<Pessoa> retorno = consultarCadastroPessoa();
		System.out.println(retorno.getDados().getNome());
	}

	private static Response<Pessoa> consultarCadastroPessoa() {
		Pessoa p = new Pessoa();
		p.setNome("Rodrido");
		p.setSobreNome("Peixoto");
		p.setIdade("25");
		p.setCpf("22222222222");
		p.setRg("111111111");
		
		List<Pessoa> listaP = Arrays.asList(p);
		
		if(listaP.size() > 0) {
			listaP.forEach(pessoa -> {
				resp.setDados(pessoa);
			});
		} else {
			resp.setMsgError("Pessoa não cadastrada");
		}
		return resp;
	}

}
