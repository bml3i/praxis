package com.bigcay.observer;

import java.util.ArrayList;

public class WeatherData implements Subject {

	private float temperature;
	private float humidity;
	private float pressure;

	private ArrayList<Observer> observers;

	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	public void measurementsChanged() {
		notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;

		measurementsChanged();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int idx = observers.indexOf(o);

		if (idx >= 0) {
			observers.remove(idx);
		}
	}

	@Override
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}

}
