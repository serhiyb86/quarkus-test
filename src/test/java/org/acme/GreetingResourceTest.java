package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;


class GreetingResourceTest {
    @Test
    void testHelloEndpoint() {
        System.out.println("Hello world");
    }

}