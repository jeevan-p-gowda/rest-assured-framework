package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import request.CreatePostRequestBody;
import response.CreatePostResponse;
import response.GetPostResponse;
import response.UsersService;

import static org.testng.Assert.assertEquals;

public class GetPost {
    //1.Arrange
    private UsersService usersService;
    @BeforeClass
    public void beforeClass() {
        usersService=new UsersService();
    }

    @Test
    public void shouldGetPost(){
        //1.Arrange
        CreatePostRequestBody requestBody = new CreatePostRequestBody.Builder().build();

        //2.Act
        CreatePostResponse createPostResponse = usersService.createPost(requestBody);
        String postID = createPostResponse.getId();
        GetPostResponse getPostResponse = usersService.getPost(postID);

        //3.Assert
        assertEquals(getPostResponse.getStatusCode(),200);
        getPostResponse.assertPostId(postID);
    }
}
