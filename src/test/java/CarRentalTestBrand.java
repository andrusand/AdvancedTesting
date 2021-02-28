
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CarRentalTestBrand {

    @Mock
    private Agency agencyMock;

    @Test
    void verifyTestExampleBrand(){
        agencyMock.findCarByBrand("Ford");
        verify(agencyMock).findCarByBrand("Ford");
    }

    @Test
    void verifyTestExampleTwoBrand(){
        agencyMock.findCarByBrand("Opel");
        verify(agencyMock).findCarByBrand(anyString());
    }

    @Test
    void verifyExampleAtMostBrand(){
        agencyMock.findCarByBrand("Opel");
        agencyMock.findCarByBrand("Volvo");
        agencyMock.findCarByBrand("Bmw");
        verify(agencyMock, atMost(3)).findCarByBrand(anyString());

    }

    @Test
    void assertionExampleBrand(){
        List<Car> cars = agencyMock.findCarByBrand("Subaru");

        assertTrue(cars.isEmpty());
    }

    @Test
    void usingWhenTestExampleBrand(){
        Car subaru = new Car("suv","Subaru",6,4.0,"Forrester","petrol",58.5);
        when(agencyMock.findCarByBrand("Subaru"))
                .thenReturn(Collections.singletonList(subaru));

        List<Car> carList = agencyMock.findCarByBrand("Subaru");

        assertEquals(1,carList.size());

        assertEquals(subaru, carList.get(0));

        carList = agencyMock.findCar(1,"tractor");

        assertTrue(carList.isEmpty());
    }
}
