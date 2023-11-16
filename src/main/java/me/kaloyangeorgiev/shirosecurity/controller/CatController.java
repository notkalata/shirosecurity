package me.kaloyangeorgiev.shirosecurity.controller;

import me.kaloyangeorgiev.shirosecurity.model.animal.Cat;
import me.kaloyangeorgiev.shirosecurity.service.CatService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cats")
public class CatController {
    @Autowired
    private CatService catService;

    @GetMapping("/all")
    @RequiresPermissions("canSeeAllCats")
    public List<Cat> getAllCats() {
        return catService.findAllCats();
    }

    @GetMapping("/color/{color}")
    @RequiresPermissions("canSeeAllCatsByColor")
    public List<Cat> getAllCatsByColor(@PathVariable("color") String color) {
        return catService.findCatsByColor(color);
    }

    @GetMapping("/{name}")
    @RequiresPermissions("canSeeCatByName")
    public Cat getCatByName(@PathVariable("name") String name) {
        return catService.findCatByName(name);
    }
}
