package br.com.cristian.recomendador;

import java.io.File;
import java.io.IOException;

import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.model.DataModel;

/**
 * This class implements a data model generator
 * 
 * @author Cristian Paixão
 */
public class Adviser {

	public DataModel getModel(String name) throws IOException {
		File file = new File("src/main/resources/" + name);
		return new FileDataModel(file);
		
	}

}
