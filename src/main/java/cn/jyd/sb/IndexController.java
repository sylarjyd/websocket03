package cn.jyd.sb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/9/5.
 */
@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index(){
        return "index.html";
    }
}
