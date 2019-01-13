package repository;



import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import model.Caminhao;
import model.Motorista;
import model.Seguro;

public class Motoristas {

	private Map<String, Optional<Motorista>> motoristas = new HashMap<>();

	public Motoristas() {
		Motorista motorista = null;
		Seguro seguro = new Seguro(null, new BigDecimal("5000"));
		//Seguro seguro = new Seguro("Parcial - n�o cobre roubo", new BigDecimal("5000"));
		//objeto que possa ocorrer null pointer uso  Optional.ofNullable(meu_objeto)
		Caminhao caminhao = new Caminhao("Mercedes Atron", Optional.ofNullable(seguro));
		
		Optional<Motorista> motoristaJoao = Optional.of(new Motorista("Jo�o", 40, Optional.ofNullable(caminhao)));
		Optional<Motorista> motoristaJose = Optional.of(new Motorista("Jose", 25, Optional.ofNullable(null)));
		Optional<Motorista> motoristaPedro = Optional.ofNullable(motorista);
		Optional<Motorista> motoristaPaulo = Optional.ofNullable(new Motorista("Paulo", null, Optional.ofNullable(caminhao)));

		motoristas.put("Jo�o", motoristaJoao);
		motoristas.put("Jose", motoristaJose);
		motoristas.put("Pedro", motoristaPedro);
		motoristas.put("Paulo", motoristaPaulo);
	}

	public Optional<Motorista> porNome(String nome) {
		return motoristas.get(nome);
	}

}
