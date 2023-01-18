package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import request.CreatePostRequestBody;
import response.CreatePostResponse;
import response.DeletePostResponse;
import response.Client.UsersService;

import static org.testng.Assert.assertEquals;

public class DeletePost {
    //1.Arrange
    private UsersService usersService;
    @BeforeClass
    public void beforeClass() {
        usersService=new UsersService();
    }

    @Test
    public void shouldDeletePost(){
        //1.Arrange
        CreatePostRequestBody requestBody = new CreatePostRequestBody.Builder().build();

        //2.Act
        CreatePostResponse createPostResponse = usersService.createPost(requestBody);
        String postID = createPostResponse.getId();
        DeletePostResponse deletePostResponse = usersService.deletePost(postID);

        //3.Assert
        assertEquals(deletePostResponse.getStatusCode(),200);
        deletePostResponse.assertDelete(postID);
    }
}