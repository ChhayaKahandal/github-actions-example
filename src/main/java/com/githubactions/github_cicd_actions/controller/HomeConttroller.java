package com.githubactions.github_cicd_actions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeConttroller
{

    @GetMapping("/home")
    public String welcome()
    {
        return "Welcome to home..!!";
    }
}
/*
git add README.md
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/ChhayaKahandal/github-actions-example.git
git push -u origin main
 */


