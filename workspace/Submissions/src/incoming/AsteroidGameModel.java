package incoming;

import java.util.ArrayList;
import java.util.Random;

import incoming.SnakeGameModel.Coordinate;
import incoming.SnakeGameModel.Direction;

public class AsteroidGameModel {
	public static class Coordinate {
		final int x;
		final int y;
		public Coordinate(int x, int y) {
			this.x = x; this.y = y;
		}
	}
	private boolean gameOver = false;
	// snake     an array of coordinates (a pair of integers)
	private ArrayList<Coordinate> ship;
	// Source -> Generate Getters and Setters
	public Coordinate getArena() {
		return arena;
	}
	public void setArena(Coordinate arena) {
		this.arena = arena;
	}
	public ArrayList<Coordinate> getShip() {
		return ship;
	}
	public Coordinate getAsteroid() {
		return asteroid;
	}
	public Direction getDirection() {
		return direction;
	}
	private Coordinate asteroid;
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
	AsteroidGameModel(int arenaWidth, int arenaHeight) {
		ship = new ArrayList<Coordinate>();
		// where to put the snake on the screen
		ship.add(new Coordinate(0,0));
		arena = new Coordinate(arenaWidth, arenaHeight);
		placeAsteroid();
		direction = Direction.STOPPED;
	}
	private void placeAsteroid() {
		Random random = new Random();
		asteroid = new Coordinate(
				random.nextInt(arena.x),
				random.nextInt(arena.y+5));
	}
	public void move() {
		// grab the head
		Coordinate head = ship.get(0);
		Coordinate newShip;
		switch (direction) {
		case LEFT:
			newShip = new Coordinate(head.x-1, head.y);
			break;
		case RIGHT:
			newShip = new Coordinate(head.x+1, head.y);
			break;
		case STOPPED:
			return;
		default:
			newShip = head;
			break;
		}
		for (int i = 1; i < ship.size(); i++) {
			if (snakeCollidesWith(ship.get(i))) {
				turn(Direction.STOPPED);
//				gameOver = true;
				break;
			}
		    }
		}

		private boolean snakeCollidesWith(Coordinate other) {
	
			Coordinate head = ship.get(0);
			return head.x == other.x && head.y == other.y;
	}
		public boolean gameIsOver() {
			return gameOver;
		}
		public void turn(Direction to) {
			direction = to;
		}
	}