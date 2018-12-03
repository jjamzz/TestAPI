import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class SampleAPITests {



    @Test(groups={"API}"})
    public void firstTest() {

        given()
                .when()
                .get("https://jsonplaceholder.typicode.com/todos/1")
                .then()
                .assertThat()
                .statusCode(200);

    }

}
