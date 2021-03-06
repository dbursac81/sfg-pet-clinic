package guru.springframework.controllers;

import guru.springframework.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/owners/index", "owners/index.html"})
    public String listOwners(Model model){

        model.addAttribute("owners", ownerService.findAll());

        return "owners/index";
    }

    @RequestMapping("/find")
    public String findOwners(){
        return "notimplemented";
    }

    @GetMapping("{ownerId}")
    public ModelAndView showOwner(@PathVariable("ownerId") Long ownerId){

        ModelAndView mav = new ModelAndView("owners/ownerDetails");

        mav.addObject(ownerService.findById(ownerId));

        return  mav;
    }
/*
    @GetMapping("/owners/{ownerId}")
    public String ownerDetails(Model model, Long id){
        model.addAttribute("owner", ownerService.findById(id));

        return "owners/ownerDetails";
    }*/



}
