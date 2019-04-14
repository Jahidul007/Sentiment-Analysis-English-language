package sentimentAnalyzer;

import model.SentimentResult;

import java.io.*;

public class MainApp {
    // The name of the file to open.
    static String fileName = "Book.txt";
    static String fileName1 = "NewBook.txt";

    // This will reference one line at a time
    static String line = null;

    public static void main(String[] args) throws IOException {

        String text = "It is not so good";

        // FileReader reads text files in the default encoding.
        FileReader fileReader = new FileReader(fileName);
        FileWriter fileWriter = new FileWriter(fileName1);

        // Always wrap FileReader in BufferedReader.
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        // Always wrap FileWriter in BufferedWriter.
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        try {
            int i = 1;
            while ((line = bufferedReader.readLine()) != null && i <= 65) {
                SentimentAnalyzer sentimentAnalyzer = new SentimentAnalyzer();
                sentimentAnalyzer.initialize();
                SentimentResult sentimentResult = sentimentAnalyzer.getSentimentResult(text);

                System.out.println("Sentiment Score: " + i + " " + sentimentResult.getSentimentScore());
                System.out.println("Sentiment Type: " + sentimentResult.getSentimentType());
                System.out.println("Very positive: " + sentimentResult.getSentimentClass().getVeryPositive() + "%");
                System.out.println("Positive: " + sentimentResult.getSentimentClass().getPositive() + "%");
                System.out.println("Neutral: " + sentimentResult.getSentimentClass().getNeutral() + "%");
                System.out.println("Negative: " + sentimentResult.getSentimentClass().getNegative() + "%");
                System.out.println("Very negative: " + sentimentResult.getSentimentClass().getVeryNegative() + "%");

                bufferedWriter.write(String.valueOf(sentimentResult.getSentimentScore())+"\n");
                i++;

            }
            System.out.println("Read and write successful!!!!!!!!!");
            // Always close files.
            bufferedReader.close();
            bufferedWriter.close();

        }catch (IOException e){
            e.printStackTrace();
        }


    }

}