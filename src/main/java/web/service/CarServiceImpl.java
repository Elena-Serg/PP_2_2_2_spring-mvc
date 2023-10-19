package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    @Override
    public List<Car> getCars(int count) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car(1, "model1", 11));
        cars.add(new Car(2, "model2", 22));
        cars.add(new Car(3, "model3", 33));
        cars.add(new Car(4, "model4", 44));
        cars.add(new Car(5, "model5", 55));

        return cars.stream().limit(count).toList();
    }

}
