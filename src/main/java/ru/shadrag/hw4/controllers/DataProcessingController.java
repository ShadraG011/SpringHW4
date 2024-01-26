package ru.shadrag.hw4.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.shadrag.hw4.models.User;
import ru.shadrag.hw4.services.DataProcessingService;
import ru.shadrag.hw4.services.NotificationService;

@Controller
@RequestMapping("/hw4")
public class DataProcessingController {

    private final DataProcessingService service;
    private final NotificationService notificationService;

    @Autowired
    public DataProcessingController(DataProcessingService service, NotificationService notificationService) {
        this.service = service;
        this.notificationService = notificationService;
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "/index.html";
    }

    @RequestMapping(value = "/user-page/{id}", method = RequestMethod.GET)
    public String userProfile(Model model, @PathVariable("id") int id) {
        User findedUser = service.getUserById(id);
        if (findedUser == null)
            return null;
        model.addAttribute("user", findedUser);
        return "user-page.html";
    }

    @RequestMapping(value = "/all-users", method = RequestMethod.GET)
    public String getUsers(Model model) {
        model.addAttribute("notification", notificationService.getUsers());
        model.addAttribute("users", service.getUsers());
        return "all-users.html";
    }

    @RequestMapping(value = "/filter", method = RequestMethod.GET)
    public String filterUsersByAge(Model model, @RequestParam(value = "age", defaultValue = "0") int age) {
        model.addAttribute("notification", notificationService.filteredUsersByAge(age));
        model.addAttribute("filteredUsers", service.filterUsersByAge(age));
        return "filter-by-age.html";
    }

    @RequestMapping(value = "/sorted", method = RequestMethod.GET)
    public String sortByAge(Model model, @RequestParam(value = "sortParam", defaultValue = "ASC") String sortParam) {
        if (sortParam.equals("ASC")) {
            model.addAttribute("notification", notificationService.sortedUsersByAgeASC());
            model.addAttribute("sortedUsers", service.sortUserByAgeASC());
        } else {
            model.addAttribute("notification", notificationService.sortedUsersByAgeDESC());
            model.addAttribute("sortedUsers", service.sortUserByAgeDESC());
        }
        return "sorted-users-by-age.html";
    }

    @RequestMapping(value = "/avg", method = RequestMethod.GET)
    public String getAVGAge(Model model) {
        model.addAttribute("notification", notificationService.getAvgAge());
        model.addAttribute("avg", service.getAverageAge());
        model.addAttribute("users", service.getUsers());
        return "average-age.html";
    }
}
