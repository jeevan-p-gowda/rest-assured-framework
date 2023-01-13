package response;

import io.restassured.response.Response;
import request.CreatePostRequestBody;
import request.CreateUserRequestBody;
import tests.DeletePost;

public class UsersService {
    public GetListOfUserResponse getListOfUser(){
        Response response = new UsersClient().getListOfUser();

        int statusCode=response.statusCode();

        GetListOfUserResponse getListOfUserResponse =response.as(GetListOfUserResponse.class);
        getListOfUserResponse.setStatusCode(statusCode);
        return getListOfUserResponse;
    }
    public GetPostResponse getPost(String id){
        Response response = new UsersClient().getPost(id);

        int statusCode=response.statusCode();

        GetPostResponse getPostResponse =response.as(GetPostResponse.class);
        getPostResponse.setStatusCode(statusCode);
        return getPostResponse;
    }
    public GetPostNegativeResponse getDeletedPost(String id){
        Response response = new UsersClient().getPost(id);

        int statusCode=response.statusCode();

        GetPostNegativeResponse getPostNegativeResponse =response.as(GetPostNegativeResponse.class);
        getPostNegativeResponse.setStatusCode(statusCode);
        return getPostNegativeResponse;
    }
    public DeletePostResponse deletePost(String id){
        Response response = new UsersClient().deletePost(id);

        int statusCode=response.statusCode();

        DeletePostResponse deletePostResponse =response.as(DeletePostResponse.class);
        deletePostResponse.setStatusCode(statusCode);
        return deletePostResponse;
    }
    public GetListOfUserUnderMyAccountResponse getListOfUserUnderMyAccount(){
        Response response = new UsersClient().getListOfUserUnderMyAccount();

        int statusCode=response.statusCode();

        GetListOfUserUnderMyAccountResponse getListOfUserUnderMyAccountResponse =
                response.as(GetListOfUserUnderMyAccountResponse.class);
        getListOfUserUnderMyAccountResponse.setStatusCode(statusCode);
        return getListOfUserUnderMyAccountResponse;
    }
    public CreateUserResponse createUser(CreateUserRequestBody requestBody){
        Response response = new UsersClient().createUser(requestBody);

        int statusCode=response.statusCode();

        CreateUserResponse createUserResponse =response.as(CreateUserResponse.class);
        createUserResponse.setStatusCode(statusCode);
        return createUserResponse;
    }
    public CreateNegativeUserResponse createNegativeUser(CreateUserRequestBody requestBody){
        Response response = new UsersClient().createUser(requestBody);

        int statusCode=response.statusCode();

        CreateNegativeUserResponse createNegativeUserResponse =response.as(CreateNegativeUserResponse.class);
        createNegativeUserResponse.setStatusCode(statusCode);
        return createNegativeUserResponse;
    }
    public CreatePostResponse createPost(CreatePostRequestBody requestBody){
        Response response = new UsersClient().createPost(requestBody);

        int statusCode=response.statusCode();

        CreatePostResponse createPostResponse =response.as(CreatePostResponse.class);
        createPostResponse.setStatusCode(statusCode);
        return createPostResponse;
    }
}
