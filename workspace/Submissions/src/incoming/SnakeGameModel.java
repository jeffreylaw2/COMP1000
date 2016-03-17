package incoming;

import java.util.ArrayList;
import java.util.Random;

public class SnakeGameModel {
	public static class Coordinate {
		final int x;
		final int y;
		public Coordinate(int x, int y) {
			this.x = x; this.y = y;
		}
	}
	// snake     an array of coordinates (a pair of integers)
	private ArrayList<Coordinate> snake;
	// Source -> Generate Getters and Setters
	public Coordinate getArena() {
		return arena;
	}
	public void setArena(Coordinate arena) {
		this.arena = arena;
	}
	public ArrayList<Coordinate> getSnake() {
		return snake;
	}
	public Coordinate getFood() {
		return food;
	}
	public Direction getDirection() {
		return direction;
	}
	// food 	     a coordinate (a pair of integers)
	private Coordinate food;
	// Type
	// variable or constant
	// OPTION
	// direction up, down, left, right, or none
	static enum Direction {
		UP, DOWN, LEFT, RIGHT, STOPPED
	}
	private Direction direction;
	// arena     the rectangle (represented as a coordinate) in which the snake can move.
	private Coordinate arena;
	SnakeGameModel(int arenaWidth, int arenaHeight) {
		snake = new ArrayList<Coordinate>();
		// where to put the snake on the screen
		snake.add(new Coordinate(1,1));
		Random random = new Random();
		food = new Coordinate(
				random.nextInt(arenaWidth),
				random.nextInt(arenaHeight));
		arena = new Coordinate(arenaWidth, arenaHeight);
		direction = Direction.STOPPED;
	}
	// move       update snake based on direction and if the snake collides with something.
	// turn       change direction
	public void turn(Direction to) {
		direction = to;
	}
	// resize 	  change arena size
	// grow 	      the snake elongates when exposed to food
	// eat        if the snake collided with food, move the food
	// die        if the snake collided with itself or the arena, the snake stops.
}
