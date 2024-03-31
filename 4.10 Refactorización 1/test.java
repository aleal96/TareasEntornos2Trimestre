import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CostPersonalTest {

    @Test
    public void testCalcularCostePersonal() {
        Trabajador director = new Trabajador("Director", Trabajador.DIRECTOR, 3000, 0);
        Trabajador subdirector = new Trabajador("Subdirector", Trabajador.SUBDIRECTOR, 2000, 0);
        Trabajador empleado = new Trabajador("Empleado", Trabajador.EMPLEADO, 1500, 5);

        Trabajador[] trabajadores = {director, subdirector, empleado};

        assertEquals(7500, CostPersonal.calcularCostePersonal(trabajadores));
    }
}
