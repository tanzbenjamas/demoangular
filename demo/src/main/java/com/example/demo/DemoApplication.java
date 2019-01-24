package com.example.demo;
//import java.util.stream.Stream;

import com.example.demo.entity.*;
import com.example.demo.repository.*;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.ParseException;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Bean
	ApplicationRunner init(CarInformationRepository carInformationRepository,
						   CarRepository carRepository,
						   GenderRepository genderRepository,
						   ProvinceRepository provinceRepository)throws ParseException{
	return args -> {
		
		Car c1 = new Car();
		c1.setCarbrand("จักราน");
		c1.setlicenseplate("กก-99");
		Car c2 = new Car();
		c2.setCarbrand("สิบล้อบ้านพ่อง");
		c2.setlicenseplate("กก-999");
		Car c3 = new Car();
		c3.setCarbrand("รถพ่วงก็ได้มะ");
		c3.setlicenseplate("กก-9999");

		carRepository.save(c1);
		carRepository.save(c2);
		carRepository.save(c3);

		Gender g = new Gender();
		g.setGender("Male");
		Gender g1 = new Gender();
		g1.setGender("Female");
		genderRepository.save(g);
		genderRepository.save(g1);
		
		Province p1 = new Province();
		p1.setProvince("มาทำงานที่กทม");
		Province p2 = new Province();
		p2.setProvince("มาทำงานที่ตจว");
		Province p3 = new Province();
		p3.setProvince("มาทำงานที่ โคราช");
		Province p4 = new Province();
		p4.setProvince("มาทำงานที่ ไหนสักที่");
		provinceRepository.save(p1);
		provinceRepository.save(p2);
		provinceRepository.save(p3);
		provinceRepository.save(p4);

		CarInformation c = new CarInformation();
		c.setName("nongtarn soooov");
		c.setAddress("suranree 30000");
		c.setTelephone("0988313467");
		c.setAge(22);
		c.setGender(g1);
		c.setProvice(p1);
		c.setCarbrand(c3);
		
		carInformationRepository.save(c);
		

	 };

	}
}

