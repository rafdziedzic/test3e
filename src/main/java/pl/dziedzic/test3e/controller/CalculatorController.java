package pl.dziedzic.test3e.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.dziedzic.test3e.dto.NumberDto;
import pl.dziedzic.test3e.dto.ResponseDto;
import pl.dziedzic.test3e.service.CalculatorService;

@RestController
@RequestMapping("/api")
public class CalculatorController {

	private final CalculatorService calculatorService;

	public CalculatorController(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}

	@PostMapping("/add")
	ResponseDto add(@RequestBody NumberDto numberDto) {
		return calculatorService.addNumber(numberDto);
	}

	@GetMapping("/div")
	ResponseDto div(@RequestParam(name = "value1") Double value1, @RequestParam(name = "value2") Double value2) {
		return calculatorService.div(value1, value2);
	}

}
