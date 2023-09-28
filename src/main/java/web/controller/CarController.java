package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import service.CarService;
import service.CarServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import model.Car;

import java.util.List;

@Controller
@ComponentScan("service")
public class CarController {

    private CarService cs;

    @Autowired
    public void setService(CarService cs) {
        this.cs = cs;
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int count,
                            Model model) {
        List<Car> cars = cs.getCarsList(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
