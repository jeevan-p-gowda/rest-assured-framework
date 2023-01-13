package response;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import request.CreatePostRequestBody;
import request.CreateUserRequestBody;

import static io.restassured.RestAssured.given;

public class UsersClient {
    public static Response getListOfUser() {
        Response response =
         given()
                 .accept(ContentType.JSON)
                 .contentType(ContentType.JSON)
                 .header("app-id", "63be5a15c4919718ed0d9973")
                 .queryParam("limit",10)

        .when()
                .get("https://dummyapi.io/data/v1/user");

        response
                .then()
                    .log().body();
        return response;
    }
    public static Response getPost(String id) {
        Response response =
         given()
                 .accept(ContentType.JSON)
                 .contentType(ContentType.JSON)
                 .header("app-id", "63be5a15c4919718ed0d9973")
                 .pathParam("id",id)

        .when()
                .get("https://dummyapi.io/data/v1/post/{id}");

        response
                .then()
                    .log().body();
        return response;
    }
    public static Response deletePost(String id) {
        Response response =
         given()
                 .accept(ContentType.JSON)
                 .contentType(ContentType.JSON)
                 .header("app-id", "63be5a15c4919718ed0d9973")
                 .pathParam("id",id)

        .when()
                .delete("https://dummyapi.io/data/v1/post/{id}");

        response
                .then()
                    .log().body();
        return response;
    }
    public static Response getListOfUserUnderMyAccount() {
        Response response =
         given()
                 .accept(ContentType.JSON)
                 .contentType(ContentType.JSON)
                 .header("app-id", "63be5a15c4919718ed0d9973")
                 .queryParam("created",1)

        .when()
                .get("https://dummyapi.io/data/v1/user");

        response
                .then()
                    .log().body();
        return response;
    }
    public static Response createUser(CreateUserRequestBody requestBody) {
        Response response =
                given()
                    .accept(ContentType.JSON)
                    .contentType(ContentType.JSON)
                    .header("app-id", "63be5a15c4919718ed0d9973")
                    .body(requestBody)

                .when()
                    .post("https://dummyapi.io/data/v1/user/create");

        response
                .then()
                    .log().body();
        return response;
    }
    public static Response createPost(CreatePostRequestBody requestBody) {
        Response response =
                given()
                    .accept(ContentType.JSON)
                    .contentType(ContentType.JSON)
                    .header("app-id", "63be5a15c4919718ed0d9973")
                    .body(requestBody)

                .when()
                    .post("https://dummyapi.io/data/v1/post/create");

        response
                .then()
                    .log().body();
        return response;
    }
}