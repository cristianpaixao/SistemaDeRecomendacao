package br.com.cristian.recomendador;

import java.io.IOException;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.eval.RecommenderBuilder;
import org.apache.mahout.cf.taste.eval.RecommenderEvaluator;
import org.apache.mahout.cf.taste.impl.eval.AverageAbsoluteDifferenceRecommenderEvaluator;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.common.RandomUtils;

/**
 * This class tests the model in the algorithm, returning the margin of error of the algorithm
 * 
 * @author Cristian Paixão
 */
public class Appraiser {

	public static void main(String[] args) throws TasteException, IOException {
		RandomUtils.useTestSeed();
		DataModel modelToTest = new Adviser().getModel("cursos.csv");
			
		RecommenderBuilder builder = new AdviserBuilder();
		RecommenderEvaluator evaluator = new AverageAbsoluteDifferenceRecommenderEvaluator();
		double marginError = evaluator.evaluate(builder, null, modelToTest, 0.9, 1.0);
		
		System.out.println(marginError);
	}
}
