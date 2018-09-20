package br.com.cristian.recomendador;

import java.io.File;
import java.io.IOException;

import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.model.DataModel;

public class Recomendador {

	public DataModel getModelo(String name) throws IOException {
		File file = new File("src/main/resources/" + name);
		return new FileDataModel(file);
		
	}

}
