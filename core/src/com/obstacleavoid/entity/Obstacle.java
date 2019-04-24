package com.obstacleavoid.entity;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Circle;

public class Obstacle {

    private static final float BOUNDS_RADIUS = 0.3f; // world units
    private static final float SIZE = 2 * BOUNDS_RADIUS;

    private float x;
    private float y;

    private float ySpeed = 0.1f;

    private Circle bounds;

    public Obstacle() {
        bounds = new Circle(x, y, BOUNDS_RADIUS);
    }

    public void drawDebug(ShapeRenderer renderer) {
        renderer.circle(bounds.x, bounds.y, bounds.radius, 30);
    }

    public void setPosition(float x, float y) {
        this.x = x;
        this.y = y;
        updateBounds();
    }

    public void update() {
        setPosition(x, y - ySpeed);
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    private void updateBounds() {
        bounds.setPosition(x, y);
    }

    public float getWidth() {
        return SIZE;
    }
}
