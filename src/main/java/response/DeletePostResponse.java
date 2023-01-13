package response;

import lombok.Getter;
import lombok.Setter;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

@Getter
public class DeletePostResponse {
    @Setter
    private int statusCode;
    private String id;

    public void assertDelete(String id){
        assertEquals(this.getId(),id);
    }
}
