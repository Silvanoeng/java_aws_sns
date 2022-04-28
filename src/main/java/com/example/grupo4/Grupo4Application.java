package com.example.grupo4;

import com.example.grupo4.services.SNSService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
@SpringBootApplication
public class Grupo4Application {


	public static void main(String[] args) {
		SNSService.sendMessage("Grupo 4 - testando App Java " + LocalDate.now());
	}

}
