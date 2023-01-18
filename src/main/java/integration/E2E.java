package integration;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import request.CreatePostRequestBody;
import response.CreatePostResponse;
import response.DeletePostResponse;
import response.GetPostNegativeResponse;
import response.Client.UsersService;

public class E2E {
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
    @Test
    public void shouldDeletePost() {
        //1.Arrange
        CreatePostRequestBody requestBody = new CreatePostRequestBody.Builder().build();

        //2.Act
        String id = usersService.createPost(requestBody).getId();
        DeletePostResponse deletePostResponse = usersService.deletePost(id);

        //3.Assert
        Assert.assertEquals(deletePostResponse.getStatusCode(),200);
        deletePostResponse.assertDelete(id);
    }
    @Test
    public void shouldGetDeletedPost() {
        //1.Arrange
        CreatePostRequestBody requestBody = new CreatePostRequestBody.Builder().build();

        //2.Act
        String id = usersService.createPost(requestBody).getId();
        String deletedPostId = usersService.deletePost(id).getId();
        GetPostNegativeResponse getPostNegativeResponse = usersService.getDeletedPost(deletedPostId);

        //3.Assert
        Assert.assertEquals(getPostNegativeResponse.getStatusCode(),404);
        getPostNegativeResponse.assertError("RESOURCE_NOT_FOUND");
    }
}
