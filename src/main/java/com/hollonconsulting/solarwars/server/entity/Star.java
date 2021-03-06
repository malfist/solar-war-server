package com.hollonconsulting.solarwars.server.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table
public class Star extends BaseEntity {

    @Id
    @GeneratedValue
    private Integer id;

    //values on generation
    private int x;
    private int y;
    private StarType starType;
    private String name;

    public enum StarType {
        NORMAL,
        HEAVEY,
        WEAK;
    }

    public Star(){

    }

    public Star(int x, int y, StarType starType, String name) {
        this.x = x;
        this.y = y;
        this.starType = starType;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public StarType getStarType() {
        return starType;
    }

    public void setStarType(StarType starType) {
        this.starType = starType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Star)) return false;

        Star star = (Star) o;

        if (getX() != star.getX()) return false;
        if (getY() != star.getY()) return false;
        if (getId() != null ? !getId().equals(star.getId()) : star.getId() != null) return false;
        return getStarType() == star.getStarType();

    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + getX();
        result = 31 * result + getY();
        result = 31 * result + (getStarType() != null ? getStarType().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Star{" +
                "id=" + id +
                ", x=" + x +
                ", y=" + y +
                ", starType=" + starType +
                '}';
    }
}
