package com.spring.letsplan.controller.PlanController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlanController {
    @GetMapping("/manage-plan")
    public String managePlan() {
        return "/plans/manage-plan";
    }
}
