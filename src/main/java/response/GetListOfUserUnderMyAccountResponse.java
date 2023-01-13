package response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
public class GetListOfUserUnderMyAccountResponse {
    @Setter
    private int statusCode;

    @JsonProperty("data")
    private List<Data> data;
    private int total;
    private int limit;
    private int page;

    @Getter
    public static class Data{
        private String firstName;
        private String lastName;
        private String id;
        private String title;
        private String picture;
    }
}