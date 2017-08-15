package com.github.mazzeb.nanoservice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicInteger;

@Controller
public class NanoController {
    private AtomicInteger counter = new AtomicInteger();

    @RequestMapping("/{thePath}")
    @ResponseBody
    public String doNano(final @PathVariable String thePath) {
        return String.format("%s -> %d", thePath, counter.incrementAndGet());
    }
}
