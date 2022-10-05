package bg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Auther: Chujian
 * @Date: 2022/10/5
 */
@RestController
public class TestController {

    @GetMapping("ccc")
    public String test(){
        return "gateway";
    }
}
