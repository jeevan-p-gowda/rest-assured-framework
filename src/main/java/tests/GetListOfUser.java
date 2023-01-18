package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import response.GetListOfUserResponse;
import response.Client.UsersService;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class GetListOfUser {
    //1.Arrange
    private UsersService usersService;
    @BeforeClass
    public void beforeClass() {
        usersService=new UsersService();
    }

    @Test
    public void shouldGetListOfUsers(){
        //2.Act
        GetListOfUserResponse getListOfUserResponse = usersService.getListOfUser();

        //3.Assert
        assertEquals(getListOfUserResponse.getStatusCode(),200);
        assertEquals(getListOfUserResponse.getDataList().size(),10);
        assertTrue(getListOfUserResponse.hasMaleUser());
    }
}
