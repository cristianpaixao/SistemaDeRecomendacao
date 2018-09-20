package br.com.cristian.recomendador;

import java.io.IOException;
import java.util.List;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;

public class RecomendaProdutos {
	public static void main(String[] args) throws IOException, TasteException {
		DataModel produtos = new Recomendador().getModelo("dados.csv");
		
		Recommender recommender = new RecomendadorBuilder().buildRecommender(produtos);
		
		List<RecommendedItem> recommendations = recommender.recommend(3, 3);
		
		for (RecommendedItem recommendation : recommendations) {
			System.out.println(recommendation);
		}
	}
}
