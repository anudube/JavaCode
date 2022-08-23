package com.training.accenture;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Birthdate:");
		String input = sc.next();
		sc.close();
		try {
			DateTimeFormatter format = DateTimeFormatter.ofPattern("d/M/uuuu");
			LocalDate userdate = LocalDate.parse(input, format.withResolverStyle(ResolverStyle.STRICT));
			int userday = userdate.getDayOfMonth();
			int usermonth = userdate.getMonthValue();
			LocalDate currentdate = LocalDate.now();
			int currentday = currentdate.getDayOfMonth();
			int currentmonth = currentdate.getMonthValue();
			if (userday == currentday && usermonth == currentmonth) {
				System.out.println("Happy Birthdate To You!!");
			} else {
				System.out.println("Today is not your Birthdate");
			}
		} catch (DateTimeParseException e) {

			System.out.println("Please use valid Date Format (dd/MM/uuuu)");

		}

	}

}
