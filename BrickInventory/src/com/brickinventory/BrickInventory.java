package com.brickinventory;

public class BrickInventory extends InventoryItem{
    private int totalBricks;

    BrickInventory(String name, int initialCount) {
        super(name);
        this.totalBricks = initialCount;
    }

    public int getTotalBricks() {
        return totalBricks;
    }

    public void setTotalBricks(int totalBricks) {
        this.totalBricks = totalBricks;
    }
    void  sellBricks(int count) {
        try {
            if (count <= getTotalBricks()) {
                setTotalBricks(getTotalBricks() - count);
                System.out.println(count + " bricks sold successfully.");
            } else {
                throw new IllegalArgumentException("Not enough bricks in inventory.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    void stockBricks(int count) {
        try {
            if (count >= 0) {
                setTotalBricks(getTotalBricks() + count);
                System.out.println(count + " bricks added to inventory.");
            } else {
                throw new IllegalArgumentException("Invalid brick count for stocking.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    void displayInventory() {
        System.out.println("Current Bricks Inventory for " + getName() + ": " + getTotalBricks() + " bricks");
    }
}
