package org.example;

public class phone {
    private String mob;

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    @Override
    public String toString() {
        return "phone{" +
                "mob='" + mob + '\'' +
                '}';
    }
}
