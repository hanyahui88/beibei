package com.example.beibei.log;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("log")
public class LogWeb {
    @GetMapping("test")
    public String test() {
        for (int i = 0; i < 20; i++) {
            int a = i / 4;
            switch (a) {
                case 0:
                    log.info(i + "");
                    break;
                case 1:
                    log.debug(i + "");
                    break;
                case 2:
                    log.warn(i + "");
                    break;
                case 3:
                    log.error(i + "");
                    break;
                default:
                    log.trace("trace");
            }
        }


        return "hello word";
    }
}
