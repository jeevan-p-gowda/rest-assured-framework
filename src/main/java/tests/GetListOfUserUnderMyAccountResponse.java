package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import response.UsersService;

import static org.testng.AssertJUnit.assertEquals;

public class GetListOfUserUnderMyAccountResponse {
    //1.Arrange
    private UsersService usersService;
    @BeforeClass
    public void beforeClass() {
        usersService=new UsersService();
    }

    @Test
    public void shouldGetListOfUsersUnderMyAccount(){
    //2.Act
        response.GetListOfUserUnderMyAccountResponse getListOfUserUnderMyAccountResponse = usersService.getListOfUserUnderMyAccount();

        //3.Assert
        assertEquals(getListOfUserUnderMyAccountResponse.getStatusCode(),200);
        assertEquals(getListOfUserUnderMyAccountResponse.getLimit(),20);
    }
}

