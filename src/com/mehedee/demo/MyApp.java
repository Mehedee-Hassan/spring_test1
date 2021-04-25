package com.mehedee.demo;

public class MyApp {

	public static void main(String[] args) {
		
		Coach baseBallCoach = new BaseballCoach();
		Coach cricketCoach = new CricketCoach();
				
				
		System.out.println(cricketCoach.getDailyWorkout());
	
	}
	
}
