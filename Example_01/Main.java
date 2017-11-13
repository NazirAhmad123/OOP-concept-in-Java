package com.company.Basics.Example_01;

class Movie {
	private String name;

	public Movie(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	// One method.

	public String plot() {
		// plot: a short description for the movie
		return "No plot here.";
	}
}
// 5 more sub-classes
class Jaws extends Movie{
	Jaws(){
		super("Jaws");
	}
	// the plot method here


	@Override
	public String plot() {
		return "A shark eats lots of people.";
	}
}

// second class
class IndependenceDay extends Movie {
	IndependenceDay(){
		super("Independence Day");
	}
	// plot method

	@Override
	public String plot() {
		return "Aliens try to take over the planet earth.";
	}
}
// third class
class Mazerunner extends Movie{
	Mazerunner(){
		super("Maze Runner");
	}

	@Override
	public String plot() {
		return "Kids try to escape a maze";
	}
}

// fouth class
class StarWars extends Movie {
	StarWars(){
		super("Star wars");
	}

	@Override
	public String plot() {
		return "Imperial forces try to take over the univers";
	}
}
// fifth class
class MrNobody extends Movie {
	MrNobody(){
		super("Mr nobody");
	}
	// no plot method here
}

public class Main {
	public static void main(String args[]){
		// Main method

		for (int i = 1; i < 11; i++){
			Movie movie = randomMovie();

			System.out.println("Movie # " + i +
			                   movie.getName() + "\n" +
			                   "plot: " + movie.plot());
		}
	}
	public static Movie randomMovie() {
		int randNumber = (int)(Math.random()*5)+1;

		System.out.println("Random number generated was: " + randNumber);

		switch (randNumber){
			case 1:
				return new Jaws();
			case 2:
				return new IndependenceDay();
			case 3:
				return new Mazerunner();
			case 4:
				return new StarWars();
			case 5:
				return new MrNobody();
		}
		return null;
	}
}
