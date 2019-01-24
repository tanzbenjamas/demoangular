package com.example.demo.controller;
import com.example.demo.entity.*;
import com.example.demo.repository.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.stream.Collectors;


import java.text.ParseException;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CarInformationController{
    @Autowired
    private CarInformationRepository carInformationRepository;
    @Autowired
    private CarRepository carRepository;
    @Autowired
    private GenderRepository genderRepository;
    @Autowired
    private ProvinceRepository provinceRepository;

    public CarInformationController(CarInformationRepository carInformationRepository,
    CarRepository carRepository,
    GenderRepository genderRepository,
    ProvinceRepository provinceRepository){
        this.carInformationRepository = carInformationRepository;
        this.carRepository = carRepository;
        this.genderRepository = genderRepository;
        this.provinceRepository = provinceRepository;
    }

    //carinformation
    @GetMapping(path = "/CarInformation",produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<CarInformation> getCarInformation(){
        return carInformationRepository.findAll().stream().collect(Collectors.toList());
    }
        @GetMapping(path = "/CarInformation/{carInformationId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public CarInformation getOneCarInformation(@PathVariable Long carInformationId){
        return carInformationRepository.findById(carInformationId).get();
    }
   //car
   @GetMapping(path = "/Car",produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Car> getCar(){
        return carRepository.findAll().stream().collect(Collectors.toList());
    }
    @GetMapping(path = "/Car/{carId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Car getOneCar(@PathVariable Long carId){
        return carRepository.findById(carId).get();
    }
    //gender
    @GetMapping(path = "/Gender", produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Gender> getGender() {
        return genderRepository.findAll().stream().collect(Collectors.toList());
    }
    @GetMapping(path = "/Gender/{genderId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Gender getOneGender(@PathVariable long genderId){
        return genderRepository.findById(genderId).get();
    }
    //province
    
    @GetMapping(path = "/Province", produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Province> getProvince() {
        return provinceRepository.findAll().stream().collect(Collectors.toList());
    }
    @GetMapping(path = "/Province/{proviceId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Province getOneProvince(@PathVariable long proviceId){
        return provinceRepository.findById(proviceId).get();
    }

    @PostMapping(path ="/CarInformation/{name}/{address}/{telephone}/{age}/{gender}/{carbrand}/{province}/{licenseplate}")
    public CarInformation newcarInformation(@PathVariable String name,
                                            @PathVariable String address,
                                            @PathVariable String telephone,
                                            @PathVariable Integer age,
                                            @PathVariable String gender,
                                            @PathVariable String carbrand,
                                            @PathVariable String province,
                                            @PathVariable String licenseplate)
                                            throws ParseException {
                                                

         
            CarInformation c = new CarInformation();
            Gender g = genderRepository.findBygenderId(gender);
            Province p = provinceRepository.findByprovinceId(province);
            Car cc = carRepository.findByCarId(carbrand);

            c.setName(name);
            c.setAddress(address);
            c.setTelephone(telephone);
            c.setAge(age);
            c.setGender(g);
            c.setProvice(p);
            Car cc2 = cc;
            c.setCarbrand(cc2);
            carInformationRepository.save(c);
            return c;
         }
    @DeleteMapping(path =" CarInformation/{CarInformationId}")
            void deleteCarInformationId(@PathVariable Long CarInformationId){
                carInformationRepository.deleteById(CarInformationId);
}
}

