package com.campusdual.redsocial;

import com.campusdual.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

//propiedades

    protected List<User> redSocialUser = new ArrayList<>();
    protected List<Post> redSocialPost = new ArrayList<>();
    protected Scanner userChoice = new Scanner(System.in);
    protected User currentUser;

    //Menu methods
    protected void populateData() {
        //Creamos Usuarios x defecto
        User u1 = new User("Juan");
        User u2 = new User("Pedro");
        User u3 = new User("Adolfo88");
        User u4 = new User("Ricardo");
        User u5 = new User("Gerard");
        User u6 = new User("Maricarmen");
        User u7 = new User("Gema");
        User u8 = new User("Silvia");
        User u9 = new User("LaJenny");
        User u10 = new User("MariaJose");
        User u11 = new User("Josefina");
        User u12 = new User("Carmen");
        User u13 = new User("ErJonny");
        User u14 = new User("Paco");
        User u15 = new User("Moha");
        User u16 = new User("Juan1");
        User u17 = new User("Stewie");
        User u18 = new User("FranTheSniper2007");
        User u19 = new User("JavierSoteloGarcia");
        User u20 = new User("Kike");


        //Los añadimos a la red social
        redSocialUser.add(u1);
        redSocialUser.add(u2);
        redSocialUser.add(u3);
        redSocialUser.add(u4);
        redSocialUser.add(u5);
        redSocialUser.add(u6);
        redSocialUser.add(u7);
        redSocialUser.add(u8);
        redSocialUser.add(u9);
        redSocialUser.add(u10);
        redSocialUser.add(u11);
        redSocialUser.add(u12);
        redSocialUser.add(u13);
        redSocialUser.add(u14);
        redSocialUser.add(u15);
        redSocialUser.add(u16);
        redSocialUser.add(u17);
        redSocialUser.add(u18);
        redSocialUser.add(u19);
        redSocialUser.add(u20);


        //Creamos Post x defecto
        Post p1 = new TextPost(u1,"Rusia cabrones", "Rusia abia que bombardearos!!!!!!");
        Post p2 = new TextPost(u9,"Aitana <3", "Aitana eres la mejor");
        Post p3 = new TextPost(u2,"<3", "Te quiero mucho Silvi");
        Post p4 = new TextPost(u5,"Real Madrid ladrones", "habeis robat Florentino corrupciò. No puc més con el equip del estat opresor");
        Post p5 = new TextPost(u14,"Perrosanches dimision", "dimite ladron");
        Post p6 = new ImagePost(u10,"Juan y yo", 300, 400);
        Post p7 = new ImagePost(u9,"Yop", 580, 300);
        Post p8 = new ImagePost(u3, "El Goat", 420, 640);
        Post p9 = new ImagePost(u15, "Visca Barsa", 300, 560);
        Post p10 = new ImagePost(u13, "Honda Civic 1995", 200, 400);
        Post p11 = new VideoPost(u4,"Pontepedriña vs A Chantela 2-0", 48, 360);
        Post p12 = new VideoPost(u11, "Cumple Maricarmen", 45, 1080);
        Post p13 = new VideoPost(u16,"Sa matao Paco", 12, 360);
        Post p14 = new VideoPost(u2,"La DKV del Jose", 37, 360);
        Post p15 = new VideoPost(u6,"Crossfit PedraBox Campeón Regional 2024 ", 560, 1080);
        Post p16 = new TextPost(u17, "Hellooo Spain!!!", "Hola Espania me lliamo Stewie i am here to pasarlo bien!!!!");
        Post p17 = new TextPost(u18, "Sígueme en TitchTV!!!", "Únete a la comunidad de snipersitos!Cada dia somos más" +
                " en titch.tv/FranTheSniper2007 Todos los días en directo de 12h a 22h española! CLICKCLACKPIUUMM!!");
        Post p18 = new TextPost(u19,"Pepiño Burela Dimisión", "O Concello de Pontepedriña non pode seguir nas más do Partido Independiente" +
                " e o señor Burela. Este mércores acompañanos as 17:00 na Praza da Alameda para" +
                " exixir a súa renuncia e a convocatoria dos comicios á alcaldía. ");
        Post p19 = new VideoPost(u20,"CR7 *** BEST SKILLS AND GOALS *** REAL MADRID(2009-2018) |HD",260,360);

        //Añadimos los post a los usuarios
        u1.addPost(p1);
        u9.addPost(p2);
        u2.addPost(p3);
        u5.addPost(p4);
        u14.addPost(p5);
        u10.addPost(p6);
        u9.addPost(p7);
        u3.addPost(p8);
        u15.addPost(p9);
        u13.addPost(p10);
        u4.addPost(p11);
        u11.addPost(p12);
        u16.addPost(p13);
        u2.addPost(p14);
        u6.addPost(p15);
        u17.addPost(p16);
        u18.addPost(p17);
        u19.addPost(p18);

        u20.addPost(p19);

        //Añadimos los follows a los usuarios
        u1.addFollowingUser(u10);
        u10.addFollowingUser(u1);
        u1.addFollowingUser(u3);
        u3.addFollowingUser(u1);
        u2.addFollowingUser(u8);
        u8.addFollowingUser(u2);
        u4.addFollowingUser(u14);
        u14.addFollowingUser(u4);
        u5.addFollowingUser(u15);
        u15.addFollowingUser(u5);
        u5.addFollowingUser(u3);
        u3.addFollowingUser(u5);
        u6.addFollowingUser(u4);
        u4.addFollowingUser(u6);
        u6.addFollowingUser(u11);
        u11.addFollowingUser(u6);
        u16.addFollowingUser(u11);
        u16.addFollowingUser(u6);
        u7.addFollowingUser(u11);
        u7.addFollowingUser(u6);
        u7.addFollowingUser(u16);
        u9.addFollowingUser(u8);
        u8.addFollowingUser(u9);
        u9.addFollowingUser(u13);
        u13.addFollowingUser(u9);
        u10.addFollowingUser(u3);
        u3.addFollowingUser(u10);
        u11.addFollowingUser(u7);
        u12.addFollowingUser(u14);
        u14.addFollowingUser(u12);
        u12.addFollowingUser(u1);
        u1.addFollowingUser(u12);
        u12.addFollowingUser(u3);
        u3.addFollowingUser(u12);
        u13.addFollowingUser(u14);
        u14.addFollowingUser(u13);
        u13.addFollowingUser(u15);
        u15.addFollowingUser(u13);
        u14.addFollowingUser(u16);
        u16.addFollowingUser(u14);

        u17.addFollowingUser(u6);
        u17.addFollowingUser(u7);
        u17.addFollowingUser(u8);
        u17.addFollowingUser(u9);
        u17.addFollowingUser(u10);
        u17.addFollowingUser(u11);
        u17.addFollowingUser(u12);

        u4.addFollowingUser(u19);
        u6.addFollowingUser(u19);
        u11.addFollowingUser(u19);

        u20.addFollowingUser(u16);
        u16.addFollowingUser(u20);

        u20.addFollowingUser(u9);
        u9.addFollowingUser(u20);
        u20.addFollowingUser(u13);
        u13.addFollowingUser(u20);
        u20.addFollowingUser(u14);
        u14.addFollowingUser(u20);

        u19.addFollowingUser(u6);
        u19.addFollowingUser(u11);
        u19.addFollowingUser(u4);
        u15.addFollowingUser(u19);






        //Añadimos los post a la red social
        redSocialPost.add(p1);
        redSocialPost.add(p2);
        redSocialPost.add(p3);
        redSocialPost.add(p4);
        redSocialPost.add(p5);
        redSocialPost.add(p6);
        redSocialPost.add(p7);
        redSocialPost.add(p8);
        redSocialPost.add(p9);
        redSocialPost.add(p10);
        redSocialPost.add(p11);
        redSocialPost.add(p12);
        redSocialPost.add(p13);
        redSocialPost.add(p14);
        redSocialPost.add(p15);
        redSocialPost.add(p16);
        redSocialPost.add(p17);
        redSocialPost.add(p18);
        redSocialPost.add(p19);

        //Creamos y añadimos los comentarios a los Post
        Comment c1 = new Comment("Toda la razón, Juan!!!", u3);
        p1.addComment(c1);
        Comment c2 = new Comment("gUaPa!!!!", u13);
        p7.addComment(c2);
        Comment c3 = new Comment("Y Yo a ti, mi Amor!", u8);
        p3.addComment(c3);
        Comment c4 = new Comment("Toda la vida igual!!", u15);
        p4.addComment(c4);
        Comment c5 = new Comment("Tu calla mena!", u3);
        p4.addComment(c5);
        Comment c6 = new Comment("pfff está to flama bro", u14);
        p10.addComment(c6);
        Comment c7 = new Comment("jajajaja siempre tan gracioso", u1);
        p14.addComment(c7);
        Comment c8 = new Comment("todos esos animales encerrados y tu suelto!jajaja", u14);
        p11.addComment(c8);
        Comment c9 = new Comment("ivan a correr si volviera este!", u1);
        p8.addComment(c9);
        Comment c10 = new Comment("Tu y yo x siempre!", u1);
        p6.addComment(c10);
        Comment c11 = new Comment("Guapos los 2!", u2);
        p6.addComment(c11);
        Comment c12 = new Comment("Increíbles como siempre! A seguir!!", u4);
        p15.addComment(c12);
        Comment c13 = new Comment("Nos vamos de concierto en Julio?", u8);
        p2.addComment(c13);
        Comment c14 = new Comment("Mari xfavor vuelve, te hecho de menos!", u16);
        p12.addComment(c14);
        Comment c15 = new Comment("y Visca Catalunya!", u5);
        p9.addComment(c15);
        Comment c16 = new Comment("nos van a pesoizar otra vez Paco!", u12);
        p5.addComment(c16);
        Comment c17 = new Comment("Juan déjalo ya!Está muy feliz sin ti!", u11);
        p12.addComment(c17);
        Comment c18 = new Comment("Juan ten cuidao, que Putin te puede leer!", u10);
        p1.addComment(c18);
        Comment c19 = new Comment("cuando estubo zidan si que la rompio bro! el bicho suuu!!!", u14);
        p19.addComment(c19);
        Comment c20 = new Comment("Sígueme titch.tv/FranTheSniper2007 Todos los días en directo de 12h a 22h española!CLICKCLACKPIUUMM!!", u18);
        p5.addComment(c20);
        Comment c21 = new Comment("Sígueme titch.tv/FranTheSniper2007 Todos los días en directo de 12h a 22h española!CLICKCLACKPIUUMM!!", u18);
        p10.addComment(c21);
        Comment c22 = new Comment("Sígueme titch.tv/FranTheSniper2007 Todos los días en directo de 12h a 22h española!CLICKCLACKPIUUMM!!", u18);
        p18.addComment(c22);

    }

    //menu para logearse
    protected void loginMenu() {
            System.out.println("⭐⭐⭐ Bienvenido a RedSocial™ ⭐⭐⭐");
            System.out.println("\uD83D\uDCCC 1. Crear nuevo usuario");
            System.out.println("\uD83D\uDCCC 2. Seleccionar usuario");
            System.out.println("\uD83D\uDC4B 3. Salir");
            int choice = Utils.integer("\uD83D\uDC47 Escoja una opción\n");
            MP3Player.play("click.mp3");

            switch (choice) {
                case 1:
                    createNewUser();
                    break;
                case 2:
                    selectUser();
                    loginMenu();
                    break;
                case 3:
                    System.out.println("\n\uD83D\uDC4B ¡Hasta pronto! \n\n\n\n Al registrarte en nuestra RedSocial has aceptado todos los términos y condiciones." +
                            " Todos tus datos pertenecen ahora a Redsocialgrupo3Enterprises para su venta y usos perniciosos, según convenga.");
                    MP3Player.play("shutdown.mp3");
                    System.exit(0); // Detiene la ejecución del programa
                    break;
                default:
                    System.out.println("\n⚠\uFE0F Opción introducida no válida.  ⚠\uFE0F");
                    MP3Player.play("error.mp3");
            }
    }


    //menu principal
    protected void mainMenu() {
        int mainMenuChoice;
        do {
            System.out.println("\n⭐⭐⭐ Menú Principal. ¿Qué desea hacer?™ ⭐⭐⭐");
            System.out.println("\uD83C\uDF0D 1. Ver muro");
            System.out.println("\uD83D\uDCCC 2. Acceder al menú de usuario");
            System.out.println("\uD83D\uDCCC 3. Acceder al menú de contenidos");
            System.out.println("\uD83D\uDC4B 4. Cerrar sesión");
            mainMenuChoice = Utils.integer("\uD83D\uDC47Escoja una opción\n");
            MP3Player.play("click.mp3");

            switch (mainMenuChoice) {
                case 1:
                    showUserWall(); // Muestra los últimos 10 posts cronológicamente de los usuarios que sigue
                    break;
                case 2:
                    userMenu();
                    break;
                case 3:
                    contentMenu();
                    break;
                case 4:
                    System.out.println("\nCerrando sesión....\uD83D\uDC4B \uD83D\uDC4B \uD83D\uDC4B");
                    currentUser = new User("");
                    loginMenu();
                    break;
                default:
                    System.out.println("\n ⚠\uFE0F Opción introducida no válida. ⚠\uFE0F");
                    MP3Player.play("error.mp3");
            }
        } while (mainMenuChoice != 4);
    }


    //menu de usuario
    protected void userMenu() {
        int userMenuChoice;
        do {
            System.out.println("\n⭐⭐⭐ Menú de Usuario. ¿Qué desea hacer? ⭐⭐⭐");
            System.out.println("\uD83D\uDCCC 1. Seguir a un nuevo usuario");
            System.out.println("\uD83D\uDCCC 2. Dejar de seguir a un usuario");
            System.out.println("\uD83D\uDCCC 3. Ver usuarios que sigues");
            System.out.println("\uD83D\uDCCC 4. Cambiar nombre de usuario");
            System.out.println("❌ 5. Eliminar cuenta de usuario");
            System.out.println("↩\uFE0F 6. Volver al Menú Principal");
            userMenuChoice = Utils.integer("\uD83D\uDC47 Escoja una opción\n");
            MP3Player.play("click.mp3");

            switch (userMenuChoice) {
                case 1:
                    if (redSocialUser.isEmpty()) {
                        System.out.println("\n⚠\uFE0F No hay otros usuarios registrados en el sistema. ⚠\uFE0F");
                    } else {
                        List<User> usersToShow = new ArrayList<>();
                        usersToShow.addAll(redSocialUser);
                        usersToShow.remove(currentUser);
                        System.out.println("\nUsuarios disponibles:\n");
                        for (User user : usersToShow) {
                            System.out.println("- " + user.getUserName());
                        }

                        String userToFollow = Utils.string("\n\uD83D\uDC47 ¿A que usuario deseas seguir?\n");
                        boolean found = false;


                        for (User user : usersToShow) {
                            if (user.getUserName().equalsIgnoreCase(userToFollow) && !currentUser.getFollowingUsers().contains(user)) {
                                currentUser.addFollowingUser(user);
                                found = true;
                                System.out.println("✔\uFE0F" + currentUser.getUserName() + " está siguiendo ahora a " + userToFollow);
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("\n⚠\uFE0F El usuario no existe o ya lo estás siguiendo. ⚠\uFE0F");
                        }
                    }
                    break;

                case 2:
                    if (currentUser.getFollowingUsers().isEmpty()) {
                        System.out.println("\n⚠\uFE0F No estás siguiendo a nadie todavía. ⚠\uFE0F");
                    } else {
                        System.out.println("\nUsuarios a los que sigues:\n");
                        for (User followedUser : currentUser.getFollowingUsers()) {
                            System.out.println("- " + followedUser.getUserName());
                        }
                        String userToUnfollow = Utils.string("\n\uD83D\uDC47 ¿A qué usuario deseas dejar de seguir?\n");
                        boolean found = false;

                        for (User followedUser : currentUser.getFollowingUsers()) {
                            if (followedUser.getUserName().equalsIgnoreCase(userToUnfollow)) {
                                currentUser.removeFollowingUser(followedUser);
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println("\n⚠\uFE0F No estás siguiendo a ese usuario.⚠\uFE0F");
                        }
                    }

                    break;
                case 3: // Nueva opción
                  currentUser.showFollowingUsers(currentUser.getUserName());
                  break;

                case 4:
                    String newUserName = Utils.string("\n\uD83D\uDC47 Introduce el nuevo nombre de usuario:\n");

                    boolean userNameExists = false;
                    for (User user : redSocialUser) {
                        if (user.getUserName().equalsIgnoreCase(newUserName)) {
                            userNameExists = true;
                            break;
                        }
                    }

                    if (userNameExists) {
                        System.out.println("\n⚠\uFE0F El nombre de usuario \"" + newUserName + "\" ya está en uso. Elige otro nombre. ⚠\uFE0F");
                    } else {
                        currentUser.setUserName(newUserName);
                        System.out.println("\n✔\uFE0F Tu nombre de usuario ha sido actualizado a: \"" + newUserName + "\"");
                    }

                    break;

                case 5:
                    String confirmation;
                    do {
                        System.out.println("\n❌ ¿Estás seguro de que quieres eliminar tu cuenta? (S/N)");
                        confirmation = Utils.string("").toUpperCase();

                        if (!confirmation.equals("S") && !confirmation.equals("N")) {
                            System.out.println("\n⚠\uFE0F Opción inválida. Por favor, introduce 'S' o 'N'. ⚠\uFE0F\n");
                            MP3Player.play("error.mp3");
                        }
                    } while (!confirmation.equals("S") && !confirmation.equals("N"));

                    if (confirmation.equals("S")) {
                        redSocialUser.remove(currentUser);
                        System.out.println("\n❌Cuenta de usuario eliminada. Volviendo al menú de inicio de sesión...");
                        currentUser = null;
                        loginMenu();
                    } else {
                        System.out.println("\n↩\uFE0F Cancelando... Volviendo al menú de usuario...");
                        userMenu();
                    }
                    break;
                case 6:
                    System.out.println("\n↩\uFE0F Volviendo al Menú Principal...");
                    mainMenu();
                    break;
                default:
                    System.out.println("\n⚠\uFE0F Opción introducida no válida. ⚠\uFE0F");
                    MP3Player.play("error.mp3");

            }
        } while (userMenuChoice != 6);
    }

    //menu de contenido, alberga post sus clases hijas y comment
    protected void contentMenu() {
        int contentMenuChoice;
        do {
            System.out.println("\n⭐⭐⭐ Menú de Contenido. ¿Qué desea hacer? ⭐⭐⭐");
            System.out.println("\uD83D\uDCCC 1. Acceder al menú Post");
            System.out.println("\uD83D\uDCCC 2. Acceder al menú Comentarios");
            System.out.println("↩\uFE0F 3. Volver al Menú Principal");
            contentMenuChoice = Utils.integer("\uD83D\uDC47 Escoja una opción\n");
            MP3Player.play("click.mp3");

            switch (contentMenuChoice) {
                case 1:
                    postMenu();
                    break;
                case 2:
                    commentMenu();
                    break;
                case 3:
                    System.out.println("\n↩\uFE0F Volviendo al Menú Principal...");
                    mainMenu();
                    break;
                default:
                    System.out.println("\n⚠\uFE0F Opción introducida no válida. ⚠\uFE0F");
                    MP3Player.play("error.mp3");
            }
        } while (contentMenuChoice != 3);
    }


    //menu de post
    protected void postMenu() {
        int postMenuChoice;
        do {
            System.out.println("\n⭐⭐⭐ Menú Post.¿Qué desea hacer? ⭐⭐⭐");
            System.out.println("\uD83D\uDCCC 1. Crear nuevo post");
            System.out.println("\uD83D\uDCCC 2. Borrar un post");
            System.out.println("\uD83D\uDCCC 3. Ver lista de posts de un usuario");
            System.out.println("↩\uFE0F 4. Volver al Menú de contenido");
            postMenuChoice = Utils.integer("\uD83D\uDC47 Escoja una opción\n");
            MP3Player.play("click.mp3");

            switch (postMenuChoice) {
                case 1:
                    createPostMenu();
                    break;
                case 2:
                    removePost();
                    break;
                case 3:
                    showPostsFromSpecificUser();
                    break;
                case 4:
                    System.out.println("\n↩\uFE0F Volviendo al Menú de contenido...");
                    contentMenu();
                    break;
                default:
                    System.out.println("\n⚠\uFE0F Opción introducida no válida. ⚠\uFE0F");
                    MP3Player.play("error.mp3");
            }
        } while (postMenuChoice != 4);
    }


    //menu de crear post(image, text, video)
    protected void createPostMenu() {
        int createPostMenuChoice;
        do {
            System.out.println("\n⭐⭐⭐ ¿Qué tipo de Post desea crear? ⭐⭐⭐");
            System.out.println("\uD83D\uDCCC 1. Post de texto \uD83D\uDCDD");
            System.out.println("\uD83D\uDCCC 2. Post de imagen \uD83D\uDCF8");
            System.out.println("\uD83D\uDCCC 3. Post de vídeo \uD83C\uDFA5");
            System.out.println("↩\uFE0F 4. Volver al menú Post");
            createPostMenuChoice = Utils.integer("\uD83D\uDC47 Escoja una opción\n");
            MP3Player.play("click.mp3");

            switch (createPostMenuChoice) {
                case 1:
                    String textPostTitle = Utils.string("\n\uD83D\uDC47 Escriba el título de su post de texto:\n");
                    String postText = Utils.string("\n\uD83D\uDC47 Escriba el contenido de su post de texto:\n");

                    TextPost textPost = new TextPost(this.currentUser, textPostTitle, postText);

                    currentUser.addPost(textPost);
                    redSocialPost.add(textPost);
                    MP3Player.play("success.mp3");
                    System.out.println("\n✔\uFE0F Post de texto creado: ");
                    textPost.displayPost();
                    break;
                case 2:
                    String imageTitle = Utils.string("\n\uD83D\uDC47 Escriba el título de su post de imagen:\n");
                    int imageHeight = Utils.integer("\n\uD83D\uDC47 Escriba la altura de la imagen (en píxeles):\n");
                    int imageWidth = Utils.integer("\n\uD83D\uDC47 Escriba el ancho de la imagen (en píxeles):\n");

                    ImagePost imagePost = new ImagePost(this.currentUser, imageTitle, imageHeight, imageWidth);

                    currentUser.addPost(imagePost);
                    redSocialPost.add(imagePost);
                    MP3Player.play("success.mp3");
                    System.out.println("\n✔\uFE0F Post de imagen creado:");
                    imagePost.displayPost();
                    break;
                case 3:
                    String videoPostTitle = Utils.string("\n\uD83D\uDC47 Escriba el título de su post de video:\n");
                    int videoDurationInSeconds = Utils.integer("\n\uD83D\uDC47 Escriba la duración del video (en segundos):\n");
                    int videoQuality = Utils.integer("\n\uD83D\uDC47 Seleccione la calidad del video (144, 360, 720, 1080):\n");

                    VideoPost videoPost = new VideoPost(this.currentUser, videoPostTitle, videoDurationInSeconds, videoQuality);
                    currentUser.addPost(videoPost);
                    redSocialPost.add(videoPost);
                    MP3Player.play("success.mp3");
                    System.out.println("\n✔\uFE0F Post de video creado:");
                    videoPost.displayPost();
                    break;
                case 4:
                    System.out.println("\n↩\uFE0F Volviendo al Menú de post...");
                    postMenu();
                    break;
                default:
                    System.out.println("\n⚠\uFE0F Opción introducida no válida. ⚠\uFE0F");
                    MP3Player.play("error.mp3");

            }
        } while (createPostMenuChoice != 4);
    }

    //menu de comment
    protected void commentMenu() {
        int commentMenuChoice;
        do {
            System.out.println("\n⭐⭐⭐ Menú Comentarios.¿Qué desea hacer? ⭐⭐⭐");
            System.out.println("\uD83D\uDCCC 1. Crear nuevo comentario");
            System.out.println("❌ 2. Borrar un comentario");
            System.out.println("\uD83D\uDCCC 3. Ver lista de comentarios de un usuario");
            System.out.println("\uD83D\uDCCC 4. Ver numero de comentarios de un post");
            System.out.println("↩\uFE0F 5. Volver al menú contenido");
            commentMenuChoice = Utils.integer("\uD83D\uDC47 Escoja una opción\n");
            MP3Player.play("click.mp3");

            switch (commentMenuChoice) {
                case 1:
                    // Crear nuevo comentario
                    showAllUserPost();

                    int postId = Utils.integer("\n\uD83D\uDC47 Ingrese el ID del post al que desea agregar un comentario\n");
                    Post selectedPost = null;

                    // Buscar el post con el postId
                    for (Post post : redSocialPost) {
                        if (post.getPostId() == postId) {
                            selectedPost = post;
                            break;
                        }
                    }

                    if (selectedPost != null) {
                        String content = Utils.string("\n\uD83D\uDC47 Ingrese el contenido del comentario.\n");
                        Comment newComment = new Comment(content, currentUser);
                        selectedPost.addComment(newComment); // Agrega el comentario al post seleccionado
                        MP3Player.play("success.mp3");
                        System.out.println("\n✔\uFE0F Comentario creado con éxito.");
                    } else {
                        System.out.println("\n⚠\uFE0F Post con el ID proporcionado no encontrado. ⚠\uFE0F");
                    }
                    break;

                case 2:
                    // Borrar un comentario
                    // Mostrar los posts donde el currentUser haya comentado
                    List<Post> userPostsWithComments = new ArrayList<>();
                    for (Post post : redSocialPost) {
                        // Verificar si el post tiene comentarios del currentUser
                        for (Comment comment : post.getPostComments()) {
                            if (comment.getCommentOwner().equals(currentUser)) {
                                userPostsWithComments.add(post); // Añadir el post a la lista si el usuario ha comentado
                                break;
                            }
                        }
                    }

                    // Si la lista de posts donde el usuario ha comentado está vacía
                    if (userPostsWithComments.isEmpty()) {
                        System.out.println("\n⚠\uFE0F No hay posts donde hayas comentado. ⚠\uFE0F");
                    } else {
                        // Mostrar los posts donde el currentUser ha comentado
                        System.out.println("\nPosts donde has comentado:");
                        for (Post post : userPostsWithComments) {
                            System.out.println(post.getPostId() + " ");
                            post.displayPost();
                        }

                        // Ingresar el ID del post para borrar un comentario
                        int postIdToDelete = Utils.integer("\n\uD83D\uDC47 Ingrese el ID del post al que desea borrar un comentario\n");
                        Post selectedPostForDelete = null;

                        // Buscar el post con el postId desde los posts filtrados
                        for (Post post : userPostsWithComments) {
                            if (post.getPostId() == postIdToDelete) {
                                selectedPostForDelete = post;
                                break;
                            }
                        }

                        if (selectedPostForDelete != null) {
                            List<Comment> comments = selectedPostForDelete.getPostComments();

                            // Verificar si el post tiene comentarios
                            if (comments == null || comments.isEmpty()) {
                                System.out.println("\n⚠\uFE0F Este post no tiene comentarios. ⚠\uFE0F");
                            } else {
                                System.out.println("\nComentarios del post:");
                                boolean hasUserComments = false;

                                // Mostrar solo los comentarios hechos por currentUser
                                for (Comment comment : comments) {
                                    if (comment.getCommentOwner().equals(currentUser)) {
                                        System.out.println(comment.getCommentId() + ". " + comment.getCommentText());
                                        hasUserComments = true;
                                    }
                                }

                                if (!hasUserComments) {
                                    System.out.println("\n⚠\uFE0F No tiene comentarios de su propiedad para borrar. ⚠\uFE0F");
                                } else {
                                    int commentIdToDelete = Utils.integer("\n\uD83D\uDC47 Ingrese el ID del comentario que desea borrar\n");

                                    // Buscar el comentario por su ID
                                    Comment commentToDelete = null;
                                    for (Comment comment : comments) {
                                        if (comment.getCommentId() == commentIdToDelete && comment.getCommentOwner().equals(currentUser)) {
                                            commentToDelete = comment;
                                            break;
                                        }
                                    }

                                    if (commentToDelete != null) {
                                        selectedPostForDelete.removeComment(commentToDelete);
                                        System.out.println("\n❌ Comentario eliminado con éxito.");
                                        commentMenu();
                                    } else {
                                        System.out.println("\n⚠\uFE0F Comentario no encontrado o no es de su propiedad. ⚠\uFE0F");
                                        commentMenu();
                                    }
                                }
                            }
                        } else {
                            System.out.println("\n⚠\uFE0F Post con el ID proporcionado no encontrado. ⚠\uFE0F");
                            commentMenu();
                        }
                    }
                case 3:
                    // Ver lista de comentarios de un usuario
                    for (User user : redSocialUser) {
                        System.out.println("- " + user.getUserName());
                    }
                    String userForComments = Utils.string("\n\uD83D\uDC47 Ingrese el nombre del usuario:\n").toLowerCase();
                    boolean foundComments = false;
                    for (Post post : redSocialPost) {
                        List<Comment> comments = post.getPostComments();
                        for (Comment comment : comments) {
                            if (comment.getCommentOwner().getUserName().toLowerCase().equals(userForComments)) {
                                foundComments = true;
                                comment.displayComments();
                            }
                        }
                    }
                    if (!foundComments) {
                        System.out.println("\n⚠\uFE0F No se encontraron comentarios para el usuario ingresado. ⚠\uFE0F");
                    }
                    break;

                case 4:
                    // Ver número de comentarios de un post
                    showAllUserPost();
                    int postIdToView = Utils.integer("\n\uD83D\uDC47 Ingrese el ID del post:\n");
                    Post selectedPostForView = null;

                    // Buscar el post con el postId
                    for (Post post : redSocialPost) {
                        if (post.getPostId() == postIdToView) {
                            selectedPostForView = post;
                            break;
                        }
                    }

                    if (selectedPostForView != null) {
                        selectedPostForView.showCommentCount();
                    } else {
                        System.out.println("\n⚠\uFE0F Post con el ID proporcionado no encontrado. ⚠\uFE0F");
                    }
                    break;

                case 5:
                    // Volver al menú de contenido
                    System.out.println("\n↩\uFE0F Volviendo al menú de contenido.");
                    contentMenu();
                    break;

                default:
                    System.out.println("\n⚠\uFE0F Opción no válida. Intentelo de nuevo. ⚠\uFE0F");
                    MP3Player.play("error.mp3");
            }
        } while (commentMenuChoice != 5);
    }


    protected void createNewUser() {
        String userName = Utils.string("\nIngrese el nombre que desee utilizar:\n").trim();
        if (userName.isEmpty()) {
            System.out.println("⚠\uFE0F Nombre no válido. Volviendo al menú de inicio. ⚠\uFE0F\n");
            MP3Player.play("error.mp3");
            loginMenu();}
        else{

        for (User user : redSocialUser) {
            if (user.getUserName().equalsIgnoreCase(userName)) {
                System.out.println("\n⚠\uFE0F El nombre de usuario " + userName + " ya está en uso. Elija otro, por favor. ⚠\uFE0F");
                loginMenu();
            }
        }
        User newUser = new User(userName);
        redSocialUser.add(newUser);
        currentUser = newUser;
        MP3Player.play("success.mp3");
        System.out.println("\n✔\uFE0F Usuario " + currentUser.getUserName() + " ha sido creado.");
        mainMenu();}
    }


    protected void selectUser() {
        if (redSocialUser.isEmpty()) {
            System.out.println("\n⚠\uFE0F No hay usuarios disponibles todavía. ⚠\uFE0F");
            return;
        }

        String selectedUser = Utils.string("\n\uD83D\uDC47 Ingrese el nombre del usuario que desea seleccionar:\n");
        boolean userFound = false;

        for (User user : redSocialUser) {
            if (user.getUserName().equalsIgnoreCase(selectedUser)) {
                currentUser = user;
                MP3Player.play("success.mp3");
                System.out.println("\n✔\uFE0F Ha iniciado sesión como: " + currentUser.getUserName());
                userFound = true;
                mainMenu();
                break;
            }
        }
        if (!userFound) {
            System.out.println("\n⚠\uFE0F No se encontró ningún usuario con ese nombre. ⚠\uFE0F");
            loginMenu();
        }
    }

    //Elimina el post de un usuario
    protected void removePost() {
        // Verificar si la lista de posts está vacía
        if (currentUser.postsList.isEmpty()) {
            System.out.println("\n⚠\uFE0F No hay posts para eliminar. ⚠\uFE0F");
            return; // Volver al menú anterior
        }

        // Se muestran todos los posts del usuario
        System.out.println("\nPost publicados de " + currentUser.getUserName() + ":\n");
        for (Post post : currentUser.postsList) {
            post.displayPost();
            System.out.println("\n");
        }

        // Pedir el ID del post que desea eliminar
        int postIdToRemove = Utils.integer("\n\uD83D\uDC47 Introduce el ID del post que deseas eliminar:\n");

        // Buscar el post por ID en la lista de posts del usuario
        Post postToRemove = null;
        for (Post post : currentUser.postsList) {
            if (post.getPostId() == postIdToRemove) {
                postToRemove = post;
                break;
            }
        }

        // Si el post no fue encontrado
        if (postToRemove == null) {
            System.out.println("\n⚠\uFE0F No se encontró un post con ese ID. ⚠\uFE0F");
            return; // Salir del metodo si no se encuentra el post
        }

        // Eliminar el post de la lista de posts del usuario
        currentUser.postsList.remove(postToRemove);
        System.out.println("\n❌ Se ha eliminado el post: ");
        postToRemove.displayPost();

        // Eliminar el mismo post de la lista de la red social
        for (int i = 0; i < redSocialPost.size(); i++) {
            if (redSocialPost.get(i).getPostId() == postIdToRemove) {
                redSocialPost.remove(i);
                break;
            }
        }
    }


    //mostrar todos los post de un usuario
    protected void showAllUserPost() {
        if (redSocialPost.isEmpty()) {
            System.out.println("\n⚠\uFE0F No hay posts publicados. ⚠\uFE0F");

        } else {
            System.out.println("\nPosts publicados:\n");
            for (int i = 0; i < redSocialPost.size(); i++) {

                redSocialPost.get(i).displayPost();
                System.out.println("\n\n");
            }

        }

    }

    protected void showPostsFromSpecificUser() {
        if (redSocialUser.isEmpty()) {
            System.out.println("\n⚠\uFE0F No hay usuarios registrados en el sistema. ⚠\uFE0F");
            waitForEnter();
            return;
        }

        System.out.println("\n\uD83D\uDC47 Usuarios disponibles:");
        for (User user : redSocialUser) {
            System.out.println("- " + user.getUserName());
        }

        String userName = Utils.string("\n\uD83D\uDC47 Escribe el nombre del usuario cuyos posts deseas ver:\n");
        User selectedUser = null;

        // Buscar al usuario en la lista
        for (User user : redSocialUser) {
            if (user.getUserName().equalsIgnoreCase(userName)) {
                selectedUser = user;
                break;
            }
        }

        if (selectedUser == null) {
            System.out.println("\n⚠\uFE0F El usuario \"" + userName + "\" no existe. ⚠\uFE0F");
        } else {
            System.out.println("\nMostrando los posts de " + userName + ":" + "\n");
            selectedUser.showUserPosts(userName);
        }

       postMenu();
    }


    //el usuario puede volver al menú principal pulsando enter
    private void waitForEnter() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nPresiona Enter para volver al Menú Principal");
        scanner.nextLine();

        mainMenu();
    }

    public void showUserWall() {
        List<Post> followingUserPosts = new ArrayList<>();

        // Obtener los posts de los usuarios que sigue el currentUser
        for (User followedUser : currentUser.getFollowingUsers()) {
            followingUserPosts.addAll(followedUser.getPostsList());
        }

        // Ordenar los posts por fecha
        followingUserPosts.sort((p1, p2) -> p2.getPostDate().compareTo(p1.getPostDate()));

        // Mostrar los primeros 10 posts
        int count = 0;
        for (Post post : followingUserPosts) {
            if (count >= 10) break;
            post.displayPost();
            count++;
        }
        if (count == 0) {
            System.out.println("⚠\uFE0F No hay posts recientes de los usuarios que sigues. ⚠\uFE0F");
        }
    }


}


