package response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
public class GetListOfUserResponse {
    @Setter
    private int statusCode;

    @JsonProperty("data")
    private List<Data> dataList;
    private String total;
    private String limit;
    private String page;

    public boolean hasMaleUser() {
        return dataList.stream()
                .filter(data -> data.getTitle().equals("mr"))
                .findFirst()
                .isPresent();
    }

    @Getter
    public static class Data {
        private String firstName;
        private String lastName;
        private String id;
        private String title;
        private String picture;
}
}