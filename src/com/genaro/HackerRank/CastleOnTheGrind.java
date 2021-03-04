package com.genaro.HackerRank;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.IntStream;

public class CastleOnTheGrind {
    static final int[] X_OFFSETS = { -1, 0, 1, 0 }; //move back or forward
    static final int[] Y_OFFSETS = { 0, 1, 0, -1 }; //move up or down

    //Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[][] grid = new char[n][n];
        for (int x = 0; x < n; x++) {
            String line = sc.next();
            for (int y = 0; y < n; y++) {
                grid[x][y] = line.charAt(y);
            }
        }
        int startX = sc.nextInt();
        int startY = sc.nextInt();
        int goalX = sc.nextInt();
        int goalY = sc.nextInt();
        //print the result!
        System.out.println(solve(grid, startX, startY, goalX, goalY));

        sc.close();
    }

    /**
     * Solve()
     * returns the minimum number of steps required to reach the goal
     * Note: you can only move up down left right
     * you cant move on a blocked point [X]
     * moving multiple spaces across the same row/column at once counts as one step?
     * @param grid
     * @param startX
     * @param startY
     * @param goalX
     * @param goalY
     * @return
     */
    static int solve(char[][] grid, int startX, int startY, int goalX, int goalY) {
        if (startX == goalX && startY == goalY) { //base case: if start and goal are the same
            return 0;
        }

        int size = grid.length; //this is the same as n

        int[][] moves = new int[size][size]; //create a new 2d array
        IntStream.range(0, size).forEach(x -> Arrays.fill(moves[x], -1)); //fills the 2d array with -1 (flags?)
        //TODO
        //System.out.println("what is moves? " + Arrays.deepToString(moves)); //(is just a grid filled with -1)?

        moves[startX][startY] = 0; //set the starting position to 0
        //Queue represents a data structure designed to have elements inserted at the end of the queue, and elements removed from the beginning of the queue.
        Queue<Point> queue = new LinkedList<>(); //create a ll based Queue
        queue.offer(new Point(startX, startY)); //inserts a new point into the queue (boolean returns false if unable to insert)

        while (true) { //loop until we meet our goal
            Point head = queue.poll(); //The poll() returns and removes the element at the front the container.
            System.out.println("print the head: "+head.toString()); //should be 0 or the starting position at this point (0,0)?

            for (int i = 0; i < X_OFFSETS.length; i++) { //iterate over X_Offsets? 4 iterations?
                int nextX = head.x; //set nextX to the current headX point in the queue
                int nextY = head.y; //do the same for y

                //while method isOpen() returns true (meaning the space is not blocked)
                while (isOpen(grid, nextX + X_OFFSETS[i], nextY + Y_OFFSETS[i])) {
                    nextX += X_OFFSETS[i];
                    nextY += Y_OFFSETS[i];
                    System.out.println("next? "+ nextX + " " + nextY);

                    //if we find our goal
                    if (nextX == goalX && nextY == goalY) {
                        //TODO
                        //System.out.println("what does moves print?"+moves[head.x][head.y]);
                        //System.out.println("Print the queue? " + queue.toString()); //hmm what can I make of this?
                        return moves[head.x][head.y] + 1; //this prints the minimum number of steps required (how? By adding the total movements on the x and y coordinate?)
                    }

                    //if the position (nextX,nextY) is less than 0 (i.e. -1)
                    if (moves[nextX][nextY] < 0) {
                        moves[nextX][nextY] = moves[head.x][head.y] + 1; //mark the space with a 1 (i.e. visited?)
                        queue.offer(new Point(nextX, nextY)); //inserts a new point into the queue (boolean returns false if unable to insert)
                    }
                }
            }
        }
    }

    //boolean method to determine if a coordinate is an open space ('.')
    static boolean isOpen(char[][] grid, int x, int y) {
        //make sure that (x,y) is a coordinate found within the gird and
        return x >= 0 && x < grid.length && y >= 0 && y < grid.length && grid[x][y] == '.';
    }
}

//this simple object represents a point or coordinate on the grid composed of an x and y value
class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
