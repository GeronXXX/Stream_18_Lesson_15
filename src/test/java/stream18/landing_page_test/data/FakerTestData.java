package stream18.landing_page_test.data;

import com.github.javafaker.Faker;

public class FakerTestData {
    public Faker faker = new Faker();
    public String firstName = faker.name().firstName();
    public String email = faker.internet().emailAddress();
    public String phoneNumber = faker.phoneNumber().subscriberNumber(10);
}
