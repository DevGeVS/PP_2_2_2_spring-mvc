package web.config.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getCars(int count);
}

