package TareasEntregables_single;

public class Main {
    public static void main(String[] args) {
        //obtengo la instancia unica de appconfig
        AppConfig config = AppConfig.getInstance();
        //aqui solo establesco sus valores
        config.setPaginaName("papulandia.com");
        config.setAnioDecreacion(2000);
        config.setServerUrl("https://giphy.com/gifs/cat-gato-tRoH9EYLs3lok");
        config.setPort(8080);

        //utilizamo la propiedades

        System.out.println("Nombre de la pagina: "+config.getPaginaName());
        System.out.println("Año de creacion: "+config.getAnioDecreacion());
        System.out.println("URL de la pagina: " + config.getServerUrl());
        System.out.println("Numero del Puerto: " + config.getPort());
    }
}

