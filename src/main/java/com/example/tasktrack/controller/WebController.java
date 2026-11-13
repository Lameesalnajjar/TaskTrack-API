package com.example.tasktrack.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    // توجيه المستخدم تلقائياً عند فتح الرابط الرئيسي إلى صفحة تسجيل الدخول
    @GetMapping("/")
    public String redirectToLogin() {
        return "redirect:/login.html";
    }
}