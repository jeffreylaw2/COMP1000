package incoming;

import java.awt.Rectangle;
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
	private boolean gameOver = false;
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
		arena = new Coordinate(arenaWidth, arenaHeight);
		placeFood();
		direction = Direction.STOPPED;
	}
	private void placeFood() {
		Random random = new Random();
		food = new Coordinate(
				random.nextInt(arena.x),
				random.nextInt(arena.y));
	}
	// move       update snake based on direction and if the snake collides with something.
	public void move() {
		// grab the head
		Coordinate head = snake.get(0);
		Coordinate newHead;
		switch (direction) {
		case DOWN:
			newHead = new Coordinate(head.x, head.y+1);
			break;
		case UP:
			newHead = new Coordinate(head.x, head.y-1);
			break;
		case LEFT:
			newHead = new Coordinate(head.x-1, head.y);
			break;
		case RIGHT:
			newHead = new Coordinate(head.x+1, head.y);
			break;
		case STOPPED:
			return;
		default:
			newHead = head;
			break;
		}
		// remove the tail end of the snake
		snake.remove(snake.size()-1);
		snake.add(0, newHead);
		
		if (snakeCollidesWith(food)) {
			grow();
			placeFood();
		}
		// check if the snake's head collides with the rest of the body
		for (int i = 1; i < snake.size(); i++) {
			if (snakeCollidesWith(snake.get(i))) {
				turn(Direction.STOPPED);
//				gameOver = true;
				break;
			}
		}
	}
	public boolean gameIsOver() {
		return gameOver;
	}
	// grow attaches the end of the snake (possibly the front) to the end
	private void grow() {
		snake.add(snake.get(snake.size() -1));
	}
	// turn       change direction
	public void turn(Direction to) {
		direction = to;
	}
	// did the head of the snake just bump into something?
	private boolean snakeCollidesWith(Coordinate other) {
		// grab the head
		Coordinate head = snake.get(0);
		return head.x == other.x && head.y == other.y;
	}
	// If you use the Rectangle class in Java
	// 		Rectangle rekt, rekt2;
	//      rekt.intersects(rekt2);
	// resize 	  change arena size
	// grow 	      the snake elongates when exposed to food
	// eat        if the snake collided with food, move the food
	// die        if the snake collided with itself or the arena, the snake stops.
}
