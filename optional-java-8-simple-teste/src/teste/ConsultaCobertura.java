package teste;

import java.math.BigDecimal;
import java.util.Optional;

import model.Caminhao;
import model.Motorista;
import model.Seguro;
import repository.Motoristas;

public class ConsultaCobertura {

	public static void main(String[] args) {
		Motoristas motoristas = new Motoristas();
		Motorista motorista = new Motorista();

		// String cobertura =
		// motorista.getCaminhao().getSeguro().getCobertura();
		/*
		 * String cobertura = "Sem seguro"; if (motorista != null) { Caminhao
		 * caminhao = motorista.getCaminhao(); if (caminhao != null) { Seguro
		 * seguro = caminhao.getSeguro(); if (seguro != null) { cobertura =
		 * seguro.getCobertura(); } } }
		 */

		/*
		 * Optional<Motorista> m = motoristas.porNome("João"); if
		 * (m.isPresent()) { //pega o objeto Motorista no Optional Motorista m2
		 * = m.get(); String nome = m2.getNome(); Optional<String> name =
		 * m.map(Motorista::getNome); String name2 = name.get();
		 * System.out.println("nome: " + nome); System.out.println("name2: " +
		 * name2); }
		 */

		// Optional<Motorista> driver = motoristas.porNome("Jose");
		//Optional<Motorista> driver = motoristas.porNome("Pedro");
		Optional<Motorista> driver = motoristas.porNome("Paulo");

		if (validarObjetoMotorista(driver)) {
			/*validarObjetoCaminhao(driver);
			if (validarObjetoCaminhao(driver)) {
				validarObjetoSeguro(driver);
			}*/
		}

	}

	private static void validarObjetoSeguro(Optional<Motorista> driver) {
		if (driver.flatMap(Motorista::getCaminhao).flatMap(Caminhao::getSeguro).isPresent()) {
			String cobertura = driver.flatMap(Motorista::getCaminhao).flatMap(Caminhao::getSeguro)
					.map(Seguro::getCobertura).orElse("Sem cobertua");
			System.out.println("Cobertura custa :" + cobertura);
		} else {
			System.out.println("Caminhão não tem seguro");
		}

	}

	private static boolean validarObjetoCaminhao(Optional<Motorista> driver) {
		boolean flag = false;
		if (driver.flatMap(Motorista::getCaminhao).isPresent()) {
			flag = true;
			String modelo = driver.flatMap(Motorista::getCaminhao).map(Caminhao::getModelo)
					.orElse("Modelo não informado");
			System.out.println("Modelo do caminhão " + modelo);
			return flag;
		} else {
			flag  = false;
			System.out.println("Motorista não tem caminhão");
		}
		return flag;
	}

	private static boolean validarObjetoMotorista(Optional<Motorista> driver) {
		boolean flag = false;
		if (driver.isPresent()) {
			flag = true;
			String nome = driver.map(Motorista::getNome).orElse("Nome não informado");
			System.out.println("Nome do motorista " + nome);
			if (driver.map(Motorista::getIdade).isPresent()) {
				System.out.println("Idade do motorista: " + driver.get().getIdade());
			} else {
				flag = false;
				System.out.println("Motorista não teve idade informada");
			}
			return flag;
		} else {
			System.out.println("Motorista não informado");
		}
		return flag;
	}

}
