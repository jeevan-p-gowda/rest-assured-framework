package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import request.CreateUserRequestBody;
import response.CreateNegativeUserResponse;
import response.UsersService;

import static org.testng.Assert.assertEquals;

public class CreateNegativeUser {
    private UsersService usersService;

    @BeforeClass
    public void beforeClass() {
        usersService = new UsersService();
    }

    @Test
    public void shouldCreateNegativeUser() {
        //1.Arrange
        CreateUserRequestBody requestBody = new CreateUserRequestBody.Builder().firstname("Ten").build();

        //2.Act
        CreateNegativeUserResponse createNegativeUserResponse = usersService.createNegativeUser(requestBody);

        //3.Assert
        assertEquals(createNegativeUserResponse.getStatusCode(),400);
        createNegativeUserResponse.assertHasError("Email already used","BODY_NOT_VALID");
    }
}