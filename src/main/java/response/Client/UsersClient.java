package response.Client;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import request.CreatePostRequestBody;
import request.CreateUserRequestBody;

import static io.restassured.RestAssured.given;

public class UsersClient {
    private static RequestSpecification metaData() {
        return given()
                .accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .header("app-id", "63be5a15c4919718ed0d9973");
    }
    public static Response getListOfUser() {
        Response response =
         metaData()
                 .queryParam("limit",10)

        .when()
                .get(new RequestUrl().getUserUrl());

        response
                .then()
                    .log().body();
        return response;
    }
    public static Response getPost(String id) {
        Response response =
         metaData()
                 .pathParam("id",id)

        .when()
                .get(new RequestUrl().getPostByIdUrl());

        response
                .then()
                    .log().body();
        return response;
    }
    public static Response deletePost(String id) {
        Response response =
         metaData()
                 .pathParam("id",id)

        .when()
                .delete(new RequestUrl().getPostByIdUrl());

        response
                .then()
                    .log().body();
        return response;
    }
    public static Response getListOfUserUnderMyAccount() {
        Response response =
         metaData()
                 .queryParam("created",1)

        .when()
                .get(new RequestUrl().getUserUrl());

        response
                .then()
                    .log().body();
        return response;
    }
    public static Response createUser(CreateUserRequestBody requestBody) {
        Response response =
                metaData()
                    .body(requestBody)

                .when()
                    .post(new RequestUrl().getCreateUserUrl());

        response
                .then()
                    .log().body();
        return response;
    }
    public static Response createPost(CreatePostRequestBody requestBody) {
        Response response =
                metaData()
                    .body(requestBody)

                .when()
                    .post(new RequestUrl().getCreatePostUrl());

        response
                .then()
                    .log().body();
        return response;
    }
}