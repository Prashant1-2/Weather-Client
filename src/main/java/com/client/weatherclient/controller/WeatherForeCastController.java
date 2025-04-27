package com.client.weatherclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.client.weatherclient.pojo.Root;

@Controller
public class WeatherForeCastController {

	@Autowired
	private RestTemplate restTemplate;

	private String url = "https://api.openweathermap.org/data/2.5/weather?APPID=d49b2f0a0fe3422b8297f99fe44fc9f6&q=";

	
	 /* @GetMapping("/weather/{cityName}") public String
	  getWeatherDetails(@PathVariable String cityName, Model model) { Root
	  weatherPojo = restTemplate.getForObject(url + "" + cityName, Root.class);
	  WeatherReportParameters report = new
	  WeatherReportParameters(weatherPojo.toString()); model.addAttribute("city",
	  report.getCity()); model.addAttribute("country", report.getCountry());
	  model.addAttribute("currentTemperature", report.getCurrentTemp());
	  model.addAttribute("minimumTemperature", report.getMinimumTemp());
	  model.addAttribute("maximumTemperature", report.getMaximumTemp());
	  model.addAttribute("feelsLike", report.getFeelsLike());
	  model.addAttribute("humidity", report.getHumidityLevel());
	  
	  return "weather"; }
	  */
	 	
	@GetMapping("/weather")
	public String getWeatherDetailsCitySearch(@RequestParam(required = false) String cityName, Model model) {
		if(null !=cityName) {
		Root weatherPojo = restTemplate.getForObject(url + "" + cityName, Root.class);
		WeatherReportParameters report = new WeatherReportParameters(weatherPojo.toString());
		model.addAttribute("city", report.getCity());
		model.addAttribute("country", report.getCountry());
		model.addAttribute("currentTemperature", report.getCurrentTemp());
		model.addAttribute("minimumTemperature", report.getMinimumTemp());
		model.addAttribute("maximumTemperature", report.getMaximumTemp());
		model.addAttribute("feelsLike", report.getFeelsLike());
		model.addAttribute("humidity", report.getHumidityLevel());
		return "weather";
		}
		
		return "searchWeather";
	}

}
