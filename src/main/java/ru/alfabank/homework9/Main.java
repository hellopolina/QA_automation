package ru.alfabank.homework9;

import com.github.lalyos.jfiglet.FigletFont;
import net.datafaker.Faker;

import java.io.IOException;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;


public class Main {
    static void main(String[] args) throws IOException {
        final String and = "&";
        int index = new Random().nextInt(0, 4);

        String[] arraySurname = {
                RandomStringUtils.randomAlphabetic(10),
                RandomStringUtils.randomAlphabetic(10),
                RandomStringUtils.randomAlphabetic(10),
                RandomStringUtils.randomAlphabetic(10)
        };

        String surname1 = getSurname(arraySurname, index);

        Faker faker = new Faker();
        String surname2 = faker.name().lastName();

        System.out.println(FigletFont.convertOneLine(surname1));
        System.out.println(FigletFont.convertOneLine(and));
        System.out.println(FigletFont.convertOneLine(surname2));


        System.out.println(faker.name().fullName());
        System.out.println(faker.phoneNumber().phoneNumber());
        System.out.println(faker.address().fullAddress());
    }

    public static String getSurname(String[] arraySurname, int index) {
        return arraySurname[index];
    }
}