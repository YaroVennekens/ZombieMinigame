package dev.yave;

public class Game {
	
	public static boolean debug;
	public static boolean power;
	public static int maxPerks = 3;
	public boolean isDebug() {
		return debug;
	}
	public void setDebug(boolean debug) {
		Game.debug = debug;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		Game.power = power;
	}
	public int getMaxPerks() {
		return maxPerks;
	}
	public static void setMaxPerks(int maxPerks) {
		Game.maxPerks = maxPerks;
	}
	
	
}
