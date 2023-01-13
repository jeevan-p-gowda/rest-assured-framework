package response;

import lombok.Getter;
import lombok.Setter;
import request.CreateUserRequestBody;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

@Getter
public class CreateUserResponse {
    @Setter
    private int statusCode;
    private String firstName;
    private String lastName;
    private String id;
    private String updatedDate;
    private String title;
    private String picture;
    private String email;
    private String registerDate;

    public void assertUser(CreateUserRequestBody requestBody) {
        assertEquals(this.getStatusCode(),200);
        assertNotNull(this.getId());
        assertEquals(this.getTitle(),requestBody.getTitle());
        assertEquals(this.getFirstName(),requestBody.getFirstName());
        assertEquals(this.getLastName(),requestBody.getLastName());
        assertEquals(this.getPicture(),requestBody.getPicture());
        assertEquals(this.getEmail(),requestBody.getEmail());
    }

}
