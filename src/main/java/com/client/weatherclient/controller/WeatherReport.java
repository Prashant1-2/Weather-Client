package com.client.weatherclient.controller;

public interface WeatherReport {
	String getCurrentTemp();

	String getMinimumTemp();

	String getMaximumTemp();

	String getFeelsLike();

	String getHumidityLevel();

	String getCountry();

	String getCity();

}
