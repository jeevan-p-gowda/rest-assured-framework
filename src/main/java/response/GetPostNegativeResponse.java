package response;

import lombok.Getter;
import lombok.Setter;
import org.testng.Assert;

@Getter
public class GetPostNegativeResponse {
    @Setter
    private int statusCode;
    private String error;

    public void assertError(String error){
        Assert.assertEquals(this.getError(),error);
    }
}
