package teste;



import java.math.BigDecimal;
import java.util.Optional;

import model.Caminhao;
import model.Motorista;
import model.Seguro;

public class TesteOptional {

	public static void main(String[] args) {
		Seguro seguro = new Seguro("Total com franquia reduzida", new BigDecimal("600"));
		//Seguro seguro = new Seguro("Total com franquia reduzida",  null);
		//Seguro seguro =  null;
		
		//Se existir a possibilidade de não haver o objeto Seguro  use 'Optional.ofNullable(seguro)' para criar o Optional senão ocorrerar nullPointerException
		//Optional<Seguro> seguroOptional = Optional.of(seguro);
		
		Optional<Seguro> seguroOptional = Optional.ofNullable(seguro);

		//imprimeValorFranquia(seguroOptional);
		
		//verificarValorFranquiaSeguro(seguroOptional);
		
		verificarSeguro(seguroOptional);
	}

	private static void imprimeValorFranquia(Optional<Seguro> seguroOptional) {
		seguroOptional.map(Seguro::getValorFranquia).ifPresent(System.out::println);
	}

	private static void verificarSeguro(Optional<Seguro> seguroOptional) {
		if (seguroOptional.isPresent()){
			 BigDecimal teste = seguroOptional.map(Seguro::getValorFranquia).get();
			 System.out.println(teste);
		} else {
			System.out.println("Não há seguro");
		}
	}

	private static void verificarValorFranquiaSeguro(Optional<Seguro> seguroOptional) {
		if (seguroOptional.isPresent()) {
			if (seguroOptional.map(Seguro::getValorFranquia).isPresent()) {
				BigDecimal teste = seguroOptional.map(Seguro::getValorFranquia).get();
				System.out.println(teste);
			} else {
				System.out.println("Não há valor de franquia de seguro");
			}
		} else {
			System.out.println("Não há seguro");
		}
	}
}
