package service;

import model.Car;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CarService {
    public List<Car> getCarsList(int count);
}
