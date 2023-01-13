package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import request.CreateUserRequestBody;
import response.CreateUserResponse;
import response.UsersService;

public class CreateUser {
    private UsersService usersService;

    @BeforeClass
    public void beforeClass() {
        usersService = new UsersService();
    }

    @Test
    public void shouldCreateUser() {
        //1.Arrange
        CreateUserRequestBody requestBody = new CreateUserRequestBody.Builder().build();

        //2.Act
        CreateUserResponse createUserResponse = usersService.createUser(requestBody);

        //3.Assert
        createUserResponse.assertUser(requestBody);
    }
}
