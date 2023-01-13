package response;

import lombok.Getter;
import lombok.Setter;
import org.testng.Assert;
import request.CreatePostRequestBody;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

@Getter
public class GetPostResponse {

@Setter
    private int statusCode;

//    @JsonProperty("owner")
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

    public void assertPostId(String id) {
        assertEquals(this.getId(),id);

    }
    }


