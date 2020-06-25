package com.csc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.csc.services.CityService;
import com.csc.services.CountryService;
import com.csc.services.PincodeService;
import com.csc.services.StateService;
import com.google.gson.Gson;

@Controller
@RequestMapping(value = { "", "demo" })
public class ApiController {

    @Autowired
    private CountryService countryService;

    @Autowired
    private StateService stateService;

    @Autowired
    private CityService cityService;
    
    @Autowired
    private PincodeService pincodeService;
    
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap modelMap) {
        modelMap.put("countries", countryService.findAll());
        Gson gson = new Gson();
        return gson.toJson( countryService.findAll());
    }

    @ResponseBody
    @RequestMapping(value = "statebycountry/{id}", method = RequestMethod.GET)
    public String statesByCountry(@PathVariable("id") int id) {
        Gson gson = new Gson();
        return gson.toJson(stateService.findByCountry(id));
    }

    @ResponseBody
    @RequestMapping(value = "citybystate/{id}", method = RequestMethod.GET)
    public String citiesByState(@PathVariable("id") int id) {
        Gson gson = new Gson();
        return gson.toJson(cityService.findByState(id));
    }
    
    @ResponseBody
    @RequestMapping(value = "pincodebycity/{id}", method = RequestMethod.GET)
    public String pincodeBycity(@PathVariable("id") int id) {
        Gson gson = new Gson();
        return gson.toJson(pincodeService.findByCityy(id));
    }

}