package pl.dziedzic.test3e.service;

import org.springframework.stereotype.Service;
import pl.dziedzic.test3e.dto.NumberDto;
import pl.dziedzic.test3e.dto.ResponseDto;
import pl.dziedzic.test3e.error.ConflictException;

@Service
public class CalculatorService {

	public ResponseDto addNumber(NumberDto numberDto) {
		ResponseDto responseDto = new ResponseDto();
		Double add = numberDto.getValue1() + numberDto.getValue2();

		responseDto.setValue(add);
		return responseDto;
	}

	public ResponseDto div(double val1, double val2) {
		checkDivByZero(val2);
		ResponseDto responseDto = new ResponseDto();

		Double div = val1 / val2;

		responseDto.setValue(div);
		return responseDto;
	}

	private void checkDivByZero(double val2) {
		if (val2 == 0)
			throw new ConflictException();
	}

}
