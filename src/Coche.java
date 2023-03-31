public class Coche {
    public int velocidad;

    public void acelerar_Victoria_Ramirez_Garcia(int aceleracion) {
        velocidad += aceleracion;
    }

    public void decelerar_Victoria_Ramirez_Garcia(int deceleracion) {
        velocidad -= deceleracion;
        //controlamos la velocidad si llega a un valor negativo
        if(velocidad < 0){
            velocidad = 0;
        }
    }
}
