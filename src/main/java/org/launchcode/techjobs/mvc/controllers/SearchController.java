package org.launchcode.techjobs.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.launchcode.techjobs.mvc.controllers.ListController.columnChoices;


/**
 * Created by LaunchCode
 */
@Controller
@RequestMapping("search")
public class SearchController {

    @GetMapping(value = "")
    public String search(Model model) {
        model.addAttribute("columns", columnChoices);
        return "search";
    }

    // TODO #3 - Create a handler to process a search request and render the updated search view.
/* what kind of request is this handler method going to be mapped to?
what path do we need to map this method to?
since we are handling a request that's coming from a form, there is some data attached to our request. What is that
data called? (searchTerm / searchType)
no need to use annotation as indicated by #4 in the instruction, but need appropriate labels. No model binding needed.
 what html view should this method render?

 model.addAttribute("columns", columnChoices); this needs to be in the method if we are going to render it to /search

 */



    // @RequestMapping("path??")




}
