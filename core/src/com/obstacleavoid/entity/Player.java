package com.obstacleavoid.entity;

import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Circle;

public class Player {

    private static final float BOUNDS_RADIUS = 0.4f; // world units
    private static final float SIZE = 2 * BOUNDS_RADIUS;

    private float x;
    private float y;

    private Circle bounds;

    public Player() {
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

    private void updateBounds() {
        bounds.setPosition(x, y);
    }
}
