package com.example.myFirstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Car {

    //This is called as Dependency Injection.
    //Now the car is depending on the Dog class.
    @Autowired //Asking spring to give the object of the dog.
    private Dog dog;

//    private Dog dog = new Dog();

    @GetMapping("hi")
    public String ok(){
        return dog.fun();
    }
}
