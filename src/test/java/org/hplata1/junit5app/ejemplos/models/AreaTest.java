package org.hplata1.junit5app.ejemplos.models;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

class AreaTest {

    @Test
    void testArea() {
        Area area = new Area(4, 5);
        Integer resultado = 22;

        Integer real = area.getArea();

        assertEquals(resultado,real);
    }
}
