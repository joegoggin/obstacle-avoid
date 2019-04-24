package com.obstacleavoid.entity;

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
}
