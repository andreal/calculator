package calc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @RequestMapping("/calculator")
    public NumberResult calculator(@RequestParam(value="firstNumber", defaultValue="1") int firstNumber,
		@RequestParam(value="secondNumber", defaultValue="2") int secondNumber,
		@RequestParam(value="operationName", defaultValue="ADD") String operationName) {
			
		final Operation operation =	Operation.valueOf(operationName);
								
		final double result;
		if (operation.equals(Operation.ADD)) {
			result = firstNumber + secondNumber;
		} else if (operation.equals(Operation.SUBTRACT)) {
			result = firstNumber - secondNumber;
		} else if (operation.equals(Operation.MULTIPLY)) {
			result = firstNumber * secondNumber;
		} else {
			result = firstNumber/secondNumber;
		}
									
        return new NumberResult(result);
    }
}