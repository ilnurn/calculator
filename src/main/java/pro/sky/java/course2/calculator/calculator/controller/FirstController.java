package pro.sky.java.course2.calculator.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator.calculator.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class FirstController {

    CalculatorService calculatorService;

    FirstController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String welcome() {
        return calculatorService.getWelcome();
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        return num1 + "+" + num2 + "=" + calculatorService.getSum(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        return num1 + "-" + num2 + "=" + calculatorService.getMinus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        return num1 + "*" + num2 + "=" + calculatorService.getMultiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        return num1 + "/" + num2 + "=" + calculatorService.getDivide(num1, num2);
    }
}
