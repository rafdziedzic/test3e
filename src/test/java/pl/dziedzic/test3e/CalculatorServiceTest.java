package pl.dziedzic.test3e;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pl.dziedzic.test3e.dto.NumberDto;
import pl.dziedzic.test3e.dto.ResponseDto;
import pl.dziedzic.test3e.service.CalculatorService;

@SpringBootTest
class CalculatorServiceTest {

	@Autowired
	CalculatorService calculatorService;

	@Test
	void shouldReturnCorrectValueWhileDivideTwoNumber() {
		ResponseDto div = calculatorService.div(12.0, 6.0);
		assertThat(div.getValue()).isEqualTo(2.0);
	}

	@Test
	void shouldReturnCorrectValueWhileDivideTwoNegativeNumber() {
		ResponseDto div = calculatorService.div(-12.0, -6.0);
		assertThat(div.getValue()).isEqualTo(2.0);
	}

	@Test
	void shouldReturnCorrectValueWhileDivideOneNegativeAndOnePositiveNumber() {
		ResponseDto div = calculatorService.div(-12.0, 6.0);
		assertThat(div.getValue()).isEqualTo(-2.0);
	}

	@Test
	void shouldReturnCorrectValueWhileAddingTwoNumber() {
		NumberDto numberDto = new NumberDto(12.0, 6.0);
		ResponseDto div = calculatorService.addNumber(numberDto);
		assertThat(div.getValue()).isEqualTo(18.0);
	}

	@Test
	void shouldReturnCorrectValueWhileAddingTwoNegativeNumber() {
		NumberDto numberDto = new NumberDto(-12.0, -6.0);
		ResponseDto div = calculatorService.addNumber(numberDto);
		assertThat(div.getValue()).isEqualTo(-18.0);
	}

	@Test
	void shouldReturnCorrectValueWhileAddingTwoNumberNegativeAndPositive() {
		NumberDto numberDto = new NumberDto(-12.0, 6.0);
		ResponseDto div = calculatorService.addNumber(numberDto);
		assertThat(div.getValue()).isEqualTo(-6.0);
	}

	@Test
	void shouldReturnCorrectValueWhileAddingTwoNumberPositiveAndNegative() {
		NumberDto numberDto = new NumberDto(12.0, -6.0);
		ResponseDto div = calculatorService.addNumber(numberDto);
		assertThat(div.getValue()).isEqualTo(6.0);
	}

}
