package org.example;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import static spark.Spark.get;
import static spark.Spark.post;

public class Main {
    public static void main(String[] args) {
        get("/", (req, res) -> {

//                if (req.cookie("username") == null)
                    return new ModelAndView(null, "index.hbs");
//                else {
//                    Map<String, String> model = new HashMap<>();
//                    model.put("username", req.cookie("username"));
//                    return new ModelAndView(model, "index.hbs");
//                }
             }, new HandlebarsTemplateEngine());
        post("/sign-in", (req, res) -> {
//                HashMap<String, String> model = new HashMap<>();
//                String username = req.queryParams("username");
//                res.cookie("username", username);
//                model.put("username", username);
                return new ModelAndView(null, "sign-in.hbs");
            }, new HandlebarsTemplateEngine());
    }
}