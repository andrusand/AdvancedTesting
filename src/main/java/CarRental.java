import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class CarRental {
    private final Agency[] agencies;
    public CarRental(Agency[] agencies) {
        this.agencies = agencies;
    }
    public Car findLowestPriceCar(final int numOfSeats, final String type){
        Optional<Car> lowestPriceCar = Arrays.stream(agencies)
                .map(agency -> {
                    return agency.findCar(numOfSeats, type);
                })
                .flatMap(List::stream)
                .min(Comparator.comparing(Car::getCostPerDay));
        return lowestPriceCar.orElse(null);
    }
}
