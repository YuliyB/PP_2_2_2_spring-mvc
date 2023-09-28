package service;

import model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars = createList();

    private List<Car> createList() {
        List<Car> tmp = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            tmp.add(new Car("model" + i, 30 * i, "SN000" + i));
        }
        return tmp;
    }

    @Override
    public List<Car> getCarsList(int count) {
        if (count > 5) {
            count = 5;
        }
        return cars.subList(0, count);
    }
}
