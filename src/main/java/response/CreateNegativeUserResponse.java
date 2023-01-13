package response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.testng.Assert;

import java.util.List;

@Getter
public class CreateNegativeUserResponse {
    @Setter
    private int statusCode;

    private Data data;
    private String error;

    @Getter
    public static class Data {
        private String email;
    }

    public void assertHasError(String emailWarning, String errorMessage){
        Assert.assertEquals(this.getError(),errorMessage);
        Assert.assertEquals(this.data.getEmail(),emailWarning);
    }
}
