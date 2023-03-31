public class Coche {
    public int velocidad;

    public void acelerar(int aceleracion) {
        velocidad += aceleracion;
    }

    public void decelerar(int deceleracion) {
        velocidad -= deceleracion;
        //controlamos la velocidad si llega a un valor negativo
        if(velocidad < 0){
            velocidad = 0;
        }
    }
}
