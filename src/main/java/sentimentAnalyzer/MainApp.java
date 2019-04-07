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

        String text = "I am very happy with this service. I will absolutely recommend it!";
        String text1 = "Not exactly science fiction. ,,,, like the novel.\" Jafar sir does not look like a science fiction. The story is very common and small, but the main theme is good. If the interest is not lost then he can not be saved. The soul dies, the soul dies, Monika looks at the eyes of Nyanan, whose color is white like caucasian, and the golden hair on her head has come down to the neck. The skin of the animal is hanging from its waist, there is nothing on it, a smooth muscular body, high forehead and a stiff nose, a long face, a tough jaw, and a monkey who has found a baby in the 'nanadaradal' group going on hiking with the father of the priest, The human body was destroyed 40 thousand years ago by the people of the group. When Nyanadharal was attacked by black-and-white opponents before deciding whether or not the people of the 'NyanDataral' group would be there, Monika ran away with her to save her from the wild forest, known to her in the forest forest, when Nyan finds her nanny in the forest, and when she realizes that this world No, 40 thousand years ago, his family had been wiped out of the world, and he lost his desire to live. When she responded to the wishes of Nyan, when her body was on her way to death, the girl took her hand. She wants her to come back to Nyan and Nyan wants her parents to return to Mar. I finished reading the book. It is not like the book that I first thought was a science fiction. But the story of the story is good. I lost hope in reading the book. As it should have been, some of them are incomplete. not satisfied #sour_r_view_print_fariate- hello! -Hi! -Whats up? -Good! -what are you doing? -I am sitting. -Where did you go? - Hey! - What time? -4 times! Only? -Hoo! What's the book? -Not too much! I bought 2! The rest of the begging! -Man? I've been gifting forcefully! : p -Oh well! How many books have you bought? -17! -Baby! Big Yeah! Saying! : / -What is the book yet? -Hoo! I read Nyanan! -Nan? -Mohammad Jafar Iqbal Sir! Science Fiction! -Oh! Why? -Money! - Get it! -My Zafar Iqbal's science fiction does not fare well! -What? -Money! His writings are ridiculous! Nothing to write from somewhere or else! Yes! Before his writing was much better! Not good now! -What? What is the problem in the current? I did not like! I was reading sarin! Worthless! -Hoo! But Nyan is good! -H! I understand! Same pattern back in the pattern! -No! Listen to the story? -Super listening is not a mood. - I'm not giving the speller. -Tayel said! - One of the researchers at the beginning of the disc is called Riaz. He studied to take human species of primitive ages. Living in America! His wife is not. died. Have a girl. Monica! May be in the car 16 years old! But very brave and agile! -Oh ... yes ... yes ...! What happened to the lords? This is a very old formula of Jafar Iqbal sir! Rain address, Shanta family, even the same type of character in Sarin! Wife will not be! Dad will be bokasoka! Girl will be agile! Anyway, Continuum ... - Huh! Once again Monika and her father go to the mountain on vacation! Will trekking! At that time, Monica eventually found a man. The man looks like a primitive man. But he is stuck in an ice! He's lying in a big ice fragment! -Then? They did not rescue him! -Yahoo! -Man? I will not say anymore! You will read yourself! -Hoo! I understand! -Not understand. See, what you say, I know all of them are true! Science fiction of Jafar Iqbal Sir's last few bookmakers was not really good. But believe, this is really beautiful! Much different! -Hoo! That's true! See, I'm a master of sir writing, it's right! So everything is not his good! There are some problems in this book too! -What? -As you said that one, that's the type of character! It seems to me! There is also a light problem in his science fiction writing pattern. I read the translation while reading it. Even in his writings, when he speaks of his character with a foreigner, he addresses one another as you say! It's the age difference between them! -Hoo! -About one thing, the main reader of Jafar sir's writing but teenage boy's daughter. He writes for them, just like them! If you are now an old man and read his book that you are writing a childless, then do not agree! To read the books of the elders, at least Zafar did not read Sir's book! He did not write for you! -Buzzla! The book has come out of any publication? -Truthlip -Dam how much? After 25%, comes like 200! -Mela is the last! :( -The last day of the day - -What's the last day? -Online order, give 28% variety! The discount is more on the payment of development to him! -Is it? -Ha! I'm giving the link! Https: // www.rokomari.com/book/177052/boigganik-kolpokahini--niyan-thanku-weelcam! Muhammad Zafar Ikbal Sir wrote this book after coming out of the traditional science fiction books, which is the same style of his book who complains For them, the book seems to be a different example I have a wonderful talented single girl named Monika who is with her father, her father is a scientist, and a book about the surviving children of an extinct human race, hopefully it will be good to read the book. I do not want to feel like it was good to read, there was excitement, but there was a lot more exposition on the book ... Had high hopes for the na";

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
                SentimentResult sentimentResult = sentimentAnalyzer.getSentimentResult(line);

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