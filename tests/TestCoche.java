import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCoche {
    @Test
    public void test_al_crear_un_coche_su_velocidad_es_cero(){
        Coche nuevoCoche = new Coche();
        Assertions.assertEquals(0,nuevoCoche.velocidad);

    }
    @Test
    public void test_al_acelerar_un_coche_su_velocidad_es_aumenta(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.acelerar(30);
        Assertions.assertEquals(30,nuevoCoche.velocidad);

    }
    @Test
    public void test_al_decelerar_un_coche_su_velocidad_es_disminuye(){
        Coche nuevoCoche = new Coche();
        //añadimos velocidad inicial ya que si un coche está en velocidad
        //cero, no debería ni podría bajar a una velocidad negativa.
        nuevoCoche.velocidad = 50;

        //depués de asiganarle una velocidad, la disminuye
        nuevoCoche.decelerar(20);
        Assertions.assertEquals(30,nuevoCoche.velocidad);

    }

    @Test
    public void test_al_decelerar_un_coche_su_velocidad_no_puede_ser_menor_que_cero(){
        Coche nuevoCoche = new Coche();
        nuevoCoche.velocidad = 50;
        nuevoCoche.decelerar(80);
        Assertions.assertEquals(0,nuevoCoche.velocidad);

    }
}
