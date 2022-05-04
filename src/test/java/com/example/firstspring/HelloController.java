package com.example.firstspring;

    import org.springframework.web.bind.annotation.RestController;
    import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {

    private int count = 0;

    @RequestMapping("/count")
    public  String count()
    {
        count++;
        return "Count: " + count;
    }

    @RequestMapping(" /at")
    public  String hello()
    {
        return "Hello Welt!";
    }
}
