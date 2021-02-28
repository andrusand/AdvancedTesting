import java.util.List;

public interface Agency {

    List<Car> findCar(int numOfSeats, String type);
    List<Car> findCarByBrand(String brand);

}
