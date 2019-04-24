package com.obstacleavoid.entity;

import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.Intersector;

public class Obstacle extends GameObjectBase {

    private static final float BOUNDS_RADIUS = 0.3f; // world units
    private static final float SIZE = 2 * BOUNDS_RADIUS;

    private float ySpeed = 0.1f;

    public Obstacle() {
        super(BOUNDS_RADIUS);
    }

    public void update() {
        setPosition(x, y - ySpeed);
    }

    public float getWidth() {
        return SIZE;
    }

    public boolean isPlayerColliding(Player player) {
        Circle playerBounds = player.getBounds();
        // check if playerBounds overlap obstacle bounds
        return Intersector.overlaps(playerBounds, getBounds());
    }
}
