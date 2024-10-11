package web.config.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars = new ArrayList<>();

    public CarServiceImpl() {
        cars.add(new Car("Murano", "Nissan", 2020));
        cars.add(new Car("Mustang", "Ford", 2022));
        cars.add(new Car("Model S", "Tesla", 2019));
        cars.add(new Car("Camry", "Toyota", 2021));
        cars.add(new Car("K5", "KIA", 2018));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
