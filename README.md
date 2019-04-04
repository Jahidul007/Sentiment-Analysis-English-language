# Sentiment Analysis English Language using Stanford CoreNLP

This is a Java project for Sentiment Analysis using Stanford CoreNLP.

The [Stanford CoreNLP](https://nlp.stanford.edu/) provides statistical NLP, deep learning NLP, 
and rule-based NLP tools for major computational linguistics problems, 
which can be incorporated into applications with human language technology needs..

 
### Sentiment Analysis

The underlying technology of this is based on a new type of Recursive Neural Network that builds on top of grammatical structures.

The Java documentation for stanford nlp can be found [here](https://nlp.stanford.edu/nlp/javadoc/javanlp/).

The [live](http://nlp.stanford.edu:8080/sentiment/rntnDemo.html) Demo of Stanfod sentiment analysis.


## How to build this project

1. Download the project and import into Intellij

2. Set the build path which must have the following libraries 

 * stanford-corenlp-3.9.2
 * ejml-0.23
 * stanford-corenlp-3.9.2-models
 ## For Maven User
 ```xml
        <dependency>
            <groupId>edu.stanford.nlp</groupId>
            <artifactId>stanford-corenlp</artifactId>
            <version>3.9.2</version>
            <classifier>models</classifier>
        </dependency>

        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-api</artifactId>
            <version>1.7.2</version>
        </dependency>
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-log4j12</artifactId>
            <version>1.7.2</version>
        </dependency>
 ```

```
Note: The stanford-corenlp-3.9.2-models has all the trained models. It is not set in the build path of this project due to size constraint. 
Download the jar file from Stanford NLP site
```
3. Run the main file

All the dependencies can be downloaded from Stanford NLP [site](https://stanfordnlp.github.io/CoreNLP/) .


### Output

This project has the following output
```
Sentiment Score: 4.0
Sentiment Type: Very positive
Very positive: 80.0%
Positive: 17.0%
Neutral: 2.0%
Negative: 0.0%
Very negative: 0.0%
```

