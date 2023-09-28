package web.controller;

import service.CarService;
import service.CarServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import model.Car;

import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int count,
                            Model model) {
        CarService cs = new CarServiceImpl();
        List<Car> cars = cs.getCarsList(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
