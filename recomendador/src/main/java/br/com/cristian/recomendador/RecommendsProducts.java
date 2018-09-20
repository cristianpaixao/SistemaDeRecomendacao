package br.com.cristian.recomendador;

import java.io.IOException;
import java.util.List;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.Recommender;

public class RecommendsProducts {
	public static void main(String[] args) throws IOException, TasteException {
		DataModel products = new Adviser().getModel("dados.csv");
		
		Recommender recommender = new AdviserBuilder().buildRecommender(products);
		
		List<RecommendedItem> recommendations = recommender.recommend(3, 3);
		
		for (RecommendedItem recommendation : recommendations) {
			System.out.println(recommendation);
		}
	}
}
