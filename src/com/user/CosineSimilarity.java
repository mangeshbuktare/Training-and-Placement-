package com.user;




import java.util.HashMap;
import java.util.Map;

public class CosineSimilarity {
    Map<String, Integer> wordMap = new HashMap<String, Integer>();

    public void incCount(String word) {
        Integer oldCount = wordMap.get(word);
        wordMap.put(word, oldCount == null ? 1 : oldCount + 1);
    }

    double getCosineSimilarityWith(CosineSimilarity otherVector) {
        double innerProduct = 0;
        for(String w: this.wordMap.keySet()) {
            innerProduct += this.getCount(w) * otherVector.getCount(w);
        }
        return innerProduct / (this.getNorm() * otherVector.getNorm());
    }

    double getNorm() {
        double sum = 0;
        for (Integer count : wordMap.values()) {
            sum += count * count;
        }
        return Math.sqrt(sum);
    }

    int getCount(String word) {
        return wordMap.containsKey(word) ? wordMap.get(word) : 0;
    }

    public double GetSimilarity(String vector1, String vector2) {
        String doc1 = vector1;
        String doc2 = vector2;

        CosineSimilarity v1 = new CosineSimilarity();
        for(String w:doc1.split("[^a-zA-Z]+")) {
            v1.incCount(w);
        }

        CosineSimilarity v2 = new CosineSimilarity();
        for(String w:doc2.split("[^a-zA-Z]+")) {
            v2.incCount(w);
        }

      //  System.out.println("Similarity = " + v1.getCosineSimilarityWith(v2));
        return v1.getCosineSimilarityWith(v2);
    }
public static void main(String args[])
{
           CosineSimilarity cs=new CosineSimilarity();
           /*cs.GetSimilarity("java", "sql,php")*/
           System.out.println(cs.GetSimilarity("java", "sql,php,java"));
}
}