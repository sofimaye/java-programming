// 0111
// Задано текст та масив слів підрахувати у скількох реченнях зустрічається кожне слово масиву
// створити клас, який складається з виконавчого методу, що виконує дію текстовим рядком (п.3),
// тип якого визначено варіантом (п.2). Необхідно обробити всі виключні ситуації, що можуть виникнути
// під час виконання програмного коду. Всі змінні повинні бути описані та значення їх задані у виконавчому методі.

import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Lab3 {

    public static void main(String[] args) {
        var text = """
                Good health is not just the absence of disease or illness, it is a state of complete physical, mental and social well-being.
                This means eating a balanced diet, getting regular exercise, avoiding tobacco and drugs and getting plenty of rest.
                Our bodies are like machines that require a balance of protein, carbohydrates, fat, vitamins, minerals and water to stay in good working order.
                Get the balance wrong and your health will suffer. A balanced diet means eating only as many calories as you use during the day. 
                Any excess will be stored as fat if you eat more than you burn off.
                            """;
        var words = new String[]{"Are", "means", "fat", "carbohydrates", "health"};

        System.out.println(findTheWordInSentence(text, words));
    }

    public static HashMap findTheWordInSentence(String text, String[] words) {
        //шукає всі переноси, пробіли (\s*) після .
        var arrayOfSentences = Arrays.stream(text.split("\\.\\s*")).filter(el -> el != "").collect(Collectors.toList());
        var wordInSentencesQuantity = new HashMap<>();

        for (var word : words) {
            var sumOfWordMeetInEverySentence = 0;
            for (var sentence : arrayOfSentences) {
                if (sentence.toLowerCase().contains(word.toLowerCase())) {
                    sumOfWordMeetInEverySentence += 1;
                }
            }
            wordInSentencesQuantity.put(word, sumOfWordMeetInEverySentence);
        }

        return wordInSentencesQuantity;
    }


}
