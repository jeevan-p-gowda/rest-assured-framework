package response.Client;

import lombok.Getter;

@Getter
public class RequestUrl {
    //URl's
    private String userUrl;
    private String postUrl;
    private String createUserUrl;
    private String createPostUrl;
    private String postByIdUrl;

    public RequestUrl() {
        this.userUrl = "https://dummyapi.io/data/v1/user";
        this.postUrl = "https://dummyapi.io/data/v1/post";
        this.createUserUrl = "https://dummyapi.io/data/v1/user/create";
        this.createPostUrl = "https://dummyapi.io/data/v1/post/create";
        this.postByIdUrl = "https://dummyapi.io/data/v1/post/{id}";
    }
}