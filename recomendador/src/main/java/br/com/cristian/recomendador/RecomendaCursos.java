package br.com.cristian.recomendador;

import java.io.IOException;
import java.util.List;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;

public class RecomendaCursos {
	public static void main(String[] args) throws IOException, TasteException {
		DataModel cursos = new Recomendador().getModelo("cursos.csv");
		
		Recommender recommender = new RecomendadorBuilder().buildRecommender(cursos);
		
		List<RecommendedItem> recommendations = recommender.recommend(1, 6);
		
		for (RecommendedItem recommendation : recommendations) {
			System.out.println(recommendation);
		}
	}
}
