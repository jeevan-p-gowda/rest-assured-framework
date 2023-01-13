package response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import request.CreatePostRequestBody;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

@Getter
public class CreatePostResponse {
    @Setter
    private int statusCode;

//    @JsonProperty("data")
    private Owner owner;
    private String image;
    private String link;
    private String publishDate;
    private String id;
    private String text;
    private String updatedDate;
    private int likes;
    private List<String> tags;

    @Getter
    public static class Owner{
        private String firstName;
        private String lastName;
        private String id;
        private String title;
        private String picture;
    }


    public void assertPost(CreatePostRequestBody requestBody) {
        assertEquals(this.getStatusCode(),200);
        assertNotNull(this.getId());
        assertEquals(this.getImage(),requestBody.getImage());
        assertEquals(this.getTags(),requestBody.getTags());
        assertEquals(this.getText(),requestBody.getText());
//        assertEquals(this.getId(),requestBody.getOwner().get);
    }
}
