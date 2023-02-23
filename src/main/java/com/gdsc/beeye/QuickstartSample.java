package com.gdsc.beeye;// Imports the Google Cloud client library
import com.google.cloud.translate.Translate;
import com.google.cloud.translate.Translate.TranslateOption;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;

// 번역

public class QuickstartSample {
    public static void main(String... args) throws Exception {
        // Instantiates a client
        Translate translate = TranslateOptions.getDefaultInstance().getService();

        // The text to translate
        String text = "hola amigo";
//        String text = "hello, nice to meet you";

        // Translates some text into Korean
        Translation translation =
                translate.translate(
                        text,
// https://cloud.google.com/java/docs/reference/google-cloud-translate/latest/com.google.cloud.translate
//                        TranslateOption.sourceLanguage("en"), // can be optional. 안쓰면 자동 detect
                        TranslateOption.targetLanguage("ko"));

        System.out.printf("Text: %s%n", text);
        System.out.printf("Translation: %s%n", translation.getTranslatedText());
    }
}