package org.hplata1.junit5app.ejemplos.models;


public class Area {

    private Integer base;
    private Integer altura;
    private Integer area;

    public Area(Integer base, Integer altura) {
        this.base = base;
        this.altura = altura;
        area = base*altura;
    }

    public Integer getArea() {
        return area;
    }
}
