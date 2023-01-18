package request;

import lombok.Getter;

import java.util.UUID;

@Getter
public class CreateUserRequestBody {
    private String title;
    private String firstName;
    private String lastName;
    private String picture;
    private String email;

    public CreateUserRequestBody(Builder builder) {
        this.title = builder.title;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.picture=builder.picture;
        this.email= builder.email;
    }

    public static class Builder{
        private String title;
        private String firstName;
        private String lastName;
        private String picture;
        private String email;

        public Builder() {
            this.title = "mr";
            this.firstName = "Tenali";
            this.lastName = "Ramakrisha";
            this.picture="https://randomuser.me/api/portraits/med/men/89.jpg";
            this.email = "tenali.ramakrishna1@gmail.com";
        }

        public CreateUserRequestBody build(){
            CreateUserRequestBody createUserRequestBody=new CreateUserRequestBody(this);
            return createUserRequestBody;
        }

        public Builder firstname(String firstName) {
            this.firstName=firstName;
            return this;
        }

        public Builder getEmail(String email) {
            this.email=email;
            return this;
        }
    }
}


