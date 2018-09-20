package br.com.cristian.recomendador;

import java.io.IOException;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.eval.RecommenderBuilder;
import org.apache.mahout.cf.taste.eval.RecommenderEvaluator;
import org.apache.mahout.cf.taste.impl.eval.AverageAbsoluteDifferenceRecommenderEvaluator;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.common.RandomUtils;

public class Avaliador {

	public static void main(String[] args) throws TasteException, IOException {
		RandomUtils.useTestSeed();
		DataModel produtos = new Recomendador().getModelo("cursos.csv");
			
		RecommenderBuilder builder = new RecomendadorBuilder();
		RecommenderEvaluator evaluator = new AverageAbsoluteDifferenceRecommenderEvaluator();
		double erro = evaluator.evaluate(builder, null, produtos, 0.9, 1.0);
		
		System.out.println(erro);
	}
}
