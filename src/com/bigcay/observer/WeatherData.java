package com.bigcay.observer;

public class WeatherData {

	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		super();
	}
	
	public WeatherData(float temperature, float humidity, float pressure){
		super();
		
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
	}
	
	public void measurementsChanged() {
		float temp = getTemperature();
		float humidity = getHumidity();
		float pressure = getPressure();
		
		//currentConditionsDisplay.update(temp, humidity, pressure);
		//statisticsDisplay.update(temp, humidity, pressure);
		//forecastDisplay.update(temp, humidity, pressure);
	}
	
	private float getTemperature(){
		return this.temperature; 
	}
	
	private float getHumidity(){
		return this.humidity; 
	}
	
	private float getPressure(){
		return this.pressure; 
	}
	
	public static void main(String[] args) {
		WeatherData WeatherData = new WeatherData();
		
	}

}
