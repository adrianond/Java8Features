package br.com.dantas.adriano.io;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class BackupAPP {

	public static void main(String[] args) throws IOException {

		// realizar backup das classes java do pacote abaixo
		Path home = Paths.get("C:/desenv/workspace/CursoJava8/entrada-saida-dados/src/br/com/dantas/adriano/io");
		String filtro = "*.java";
		DirectoryStream<Path> stream = Files.newDirectoryStream(home, filtro);

		for (Path p : stream) {
			Path txt = home.resolve(p);
			Path backup = home.resolve(p + ".back");
			Files.copy(txt, backup, StandardCopyOption.REPLACE_EXISTING);
		}
	}

}
