# RedSocial_Grupo3

## Descripción
**RedSocial_Grupo3** es una red social manejada completamente por consola. La aplicación incluye un menú interactivo que permite a los usuarios realizar diferentes acciones como crear publicaciones, interactuar con otros usuarios y gestionar comentarios. 

### Características principales
- **Menú interactivo**: Navega por las funcionalidades disponibles.
- **Gestión de usuarios**:
  - Crear usuario.
  - Iniciar sesión.
  - Modificar usuario.
  - Cerrar sesión.
  - Eliminar cuenta.
- **Interacciones entre usuarios**:
  - Seguir a otros usuarios.
  - Dejar de seguir usuarios.
- **Gestión de contenido**:
  - Crear publicaciones de tipo texto, imagen y video.
  - Comentar publicaciones de otros usuarios.
  - Eliminar comentarios propios.
- **Interfaz con colores y emojis**
- **Efectos de sonido**:
  - Notificación.
  - Inicio de la aplicación.
  - Cierre de sesión.
  - Advertencia (*warning*).
  - Sonido de clic.
- La aplicación incluye usuarios, publicaciones y comentarios predefinidos para facilitar las pruebas.


---

## Instrucciones de instalación
## Requisitos del sistema
- **Java**: Versión 8 o superior.
- **Maven**: Para la gestión de dependencias y compilación del proyecto.
- Asegúrate de que el archivo pom.xml contenga las siguientes dependencias:
  
  ```
  <dependencies>
    <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>3.8.1</version>
        <scope>test</scope>
    </dependency>
    <dependency>
        <groupId>com.campusdual</groupId>
        <artifactId>utils</artifactId>
        <version>1.1.0</version>
    </dependency>
      <dependency>
        <groupId>javazoom</groupId>
        <artifactId>jlayer</artifactId>
        <version>1.0.1</version>
    </dependency>
</dependencies>
```


### Pasos para instalar:
1. Clona este repositorio en tu máquina local.
   ```bash
   git clone https://github.com/tu-usuario/RedSocial_Grupo3.git

2. Navega al directorio del proyecto:
   ```bash
   cd RedSocial_Grupo3
   
3. Compila el proyecto con Maven
   ```bash
   mvn clean install

4. Ejecuta la aplicación:
   ```bash
   java -jar target/RedSocial-1.0-SNAPSHOT.jar

 USO
 
La aplicación se maneja completamente desde la consola. Al ejecutarla, se mostrará un menú de bienvenida con las siguientes opciones:

Crear usuario: Permite registrar un nuevo usuario.

Iniciar sesión: Accede con un usuario existente.

Salir: Cierra la aplicación.

Una vez se accede al usuario, se muestra el menú principal y te permite navegar a las diferentes opciones:

 Acceder al menú de usuario: Seguir/Dejar de seguir, cambiar nombre de usuario, eliminar cuenta de usuario, volver al menú principal.
 
 Acceder al menú de contenido: te permite publicar contenido (crea posts de texto, imagen o video), añadir comentarios a las publicaciones, eliminar comentarios propios, volver al menú principal.

Cerrar sesión.

Sigue las instrucciones en pantalla para interactuar con cada funcionalidad.


ESTRUCTURA DEL PROYECTO

El proyecto esta organizado de la siguiente manera:
```
RedSocial_Grupo3/
├── src/
│   ├── main/
│   │   ├── java/com/campusdual/redsocial/
│   │   │   ├── User.java            # Clase para gestionar usuarios.
│   │   │   ├── Post.java            # Clase abstracta para publicaciones.
│   │   │   ├── TextPost.java        # Clase para posts de texto.
│   │   │   ├── ImagePost.java       # Clase para posts de imágenes.
│   │   │   ├── VideoPost.java       # Clase para posts de video.
│   │   │   ├── Comment.java         # Clase para gestionar comentarios.
│   │   │   ├── Menu.java            # Clase que maneja el menú y la lógica principal.
│   │   │   ├── MP3Player.java       # Clase para gestionar la reproducción de sonidos.
│   │   │   └── RedSocialApp.java    # Clase principal que inicia la aplicación.
│   ├── resources/                   # Carpeta con archivos de sonido.
│   │   ├── click.mp3                # Sonido de clic.
│   │   ├── error.mp3                # Sonido de advertencia.
│   │   ├── shutdown.mp3             # Sonido de cierre de sesión.
│   │   ├── startup.mp3              # Sonido de inicio de la aplicación.
│   │   ├── success.mp3              # Sonido de notificación exitosa.
│   └── test/                        # Pruebas unitarias (si las hay).
├── pom.xml                          # Archivo de configuración de Maven.
├── README.md                        # Este archivo.
└── LICENSE                          # Licencia del proyecto.

```

Contribución
¡Las contribuciones son bienvenidas! Si deseas contribuir, sigue estos pasos:

Haz un fork del proyecto.

Crea una rama para tu feature (git checkout -b feature/NuevaFuncionalidad).

Haz commit de tus cambios (git commit -m 'Añade nueva funcionalidad').

Haz push a la rama (git push origin feature/NuevaFuncionalidad).

Abre un Pull Request.


Créditos

Este proyecto fue desarrollado por:

David, Lorena, Ana y Eduardo

¡Gracias por usar RedSocial_Grupo3! 😊
