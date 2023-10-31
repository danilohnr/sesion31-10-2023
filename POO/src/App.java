public class App {
    public static void main(String[] args) throws Exception {
        Pelicula endgame = new Pelicula();
        //System.out.println("Nombre: " + endgame.mostrarNombre());
        endgame.establecerNombre("Avengers: Endgame");
        endgame.establecerDuracion(125);        
        endgame.establecerCalidad("4K");
        endgame.establecerClasificacion("PG-13");
        endgame.establecerGenero("Ciencia ficcion");
        System.out.println("Nombre: " + endgame.mostrarNombre());
        System.out.println("Duracion: " + endgame.mostrarDuracion() + " minutos.");
        System.out.println("Calidad: " + endgame.mostrarCalidad());
        System.out.println("Clasificacion: " + endgame.mostrarClasificacion());
        System.out.println("Genero: " + endgame.mostrarGenero());
    }
}
