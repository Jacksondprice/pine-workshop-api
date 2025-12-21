package com.pineworkshopapi;

import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
  @GetMapping
  public List<String> list() {
    return List.of("sample");
  }
}
