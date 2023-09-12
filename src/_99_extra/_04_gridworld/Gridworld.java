package _99_extra._04_gridworld;


import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {
	public void run() {
		int c = 0;
		int r = 0;
World world = new World();
world.show();
Bug bug = new Bug();
Flower one = new Flower();
Flower two = new Flower();
Location a = new Location(r+3,c+3);
Location b = new Location(r+3,c+4);
Location cc = new Location(r+3,c+2);
world.add(a, bug);
world.add(b, one);
world.add(cc, two);
for(int y = 0; y<10; y++) {
for(int x = 0; x<10; x++) {
	world.add(new Location(r+x, c+y), new Flower());
}
}
bug.setColor(Color.BLUE);
bug.turn();
bug.turn();
	}
}
