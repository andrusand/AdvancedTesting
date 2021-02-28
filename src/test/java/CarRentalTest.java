import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class) //Something in Mockito we want.
public class CarRentalTest {

    @Mock //Mocking is a process, where I want to determine the behaviour of this class during the testing process. Also - best practice is not testing third party code.
    private Agency agencyMock; //This is a mock version of the agency class/interface. All of the methods inside the class will be available.

    @Test //This is a test, we want to test something here.Test should be most times void, because they don't return anything - either pass or fail.
    void verifyTestExample(){

        agencyMock.findCar(10,"Bus"); //Calling to this method, where we want to find a car.

        verify(agencyMock).findCar(10,"Bus"); //We also need to verify that this method also arrived at the right place with right data. We want to check that exact information what we previously asked actually made it.

        verifyNoInteractions(agencyMock); //We can also verify that method was NOT called during executing.

        verify(agencyMock).findCar(any(),any()); //We can also verify that ANYTHING was passed with 'any'. Useful if we have a user save repository method - whenever user creates/updates account it calls save repository.
    }

    @Test
    void verifyExampleAtMost(){
        agencyMock.findCar(4,"sedan");
        agencyMock.findCar(2,"convertible");
        agencyMock.findCar(1,"mini");
        //We want to check that there are 'at most' X times invocations with any Integer and any String.
        verify(agencyMock, atMost(3)).findCar(any(Integer.class), anyString());
    }

    @Test
    void verifyExampleAtLeastOnce() {
        agencyMock.findCar(2,"truck");
        //We want to test that it must be called AT LEAST 1 time OR atLeast('number') of times.
        verify(agencyMock, atLeastOnce()).findCar(eq(2), startsWith("t")); //Can use eq as equal and startsWith() and if it matches.
    }


}
