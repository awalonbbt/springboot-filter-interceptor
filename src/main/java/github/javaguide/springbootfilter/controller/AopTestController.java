package github.javaguide.springbootfilter.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.testng.TestException;

@RestController
@RequestMapping(value = "/aop" )
public class AopTestController {
    @RequestMapping("/test" )
    public Result test( @RequestParam boolean throwException) {
// case 1
        if (throwException) {
            System.out.println("throw an exception");
            return  new Result() {{
                this.setId(000);
                this.setName("GG");
            }};
        }
// case 2
            System.out.println("test 0K");
            return new Result() {{
                this.setId(111);
                this.setName("mock a Result");
            }};
        }
    }



