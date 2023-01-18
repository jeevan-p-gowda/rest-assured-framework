package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import request.CreatePostRequestBody;
import response.CreatePostResponse;
import response.Client.UsersService;

public class CreatePost {
    private UsersService usersService;

    @BeforeClass
    public void beforeClass() {
        usersService = new UsersService();
    }

    @Test
    public void shouldCreatePost() {
        //1.Arrange
        CreatePostRequestBody requestBody = new CreatePostRequestBody.Builder().build();

        //2.Act
        CreatePostResponse createPostResponse = usersService.createPost(requestBody);

        //3.Assert
        createPostResponse.assertPost(requestBody);
    }
}
