package org.alext.learning.controller;

import org.alext.learning.repository.AssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    private AssetRepository assetRepository;

    @RequestMapping("/")
    public String index(Model model) {
        return "does index";
    }
}