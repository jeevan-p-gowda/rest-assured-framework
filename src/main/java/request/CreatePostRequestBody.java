package request;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;
@Getter
public class CreatePostRequestBody {
    private String image;
    private int likes;
    private List<String> tags;
    private String text;
    private String owner;

    public CreatePostRequestBody(Builder builder) {
        this.image = builder.image;
        this.likes = builder.likes;
        this.tags = builder.tags;
        this.text = builder.text;
        this.owner = builder.owner;
    }

    public static class Builder{
        private String image;
        private int likes;
        private List<String> tags;
        private String text;
        private String owner;

        public Builder() {
            this.image = "https://img.dummyapi.io/photo-1510414696678-2415ad8474aa.jpg";
            this.likes = 1;
            this.tags = Arrays.asList("Track", "Trail", "Turf");
            this.text="rolling on track, trail and turf";
            this.owner ="63be9a39cff40200ace328b2" ;
        }

        public CreatePostRequestBody build(){
            CreatePostRequestBody createPostRequestBody=new CreatePostRequestBody(this);
            return createPostRequestBody;
        }
    }
}
