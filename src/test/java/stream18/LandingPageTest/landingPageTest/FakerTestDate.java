package stream18.LandingPageTest.landingPageTest;

import com.github.javafaker.Faker;

public class FakerTestDate {
    public static Faker faker = new Faker();

    public static String firstName = faker.name().firstName();
    public static String email = faker.internet().emailAddress();
    public static String phoneNumber = faker.phoneNumber().subscriberNumber(10);
}