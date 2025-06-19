package com.campusdual.redsocial;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public abstract class Post {
    private static int nextPostId = 1;
    private final int postId;
    protected String postDate;
    protected SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    protected Date now = Calendar.getInstance().getTime();
    protected List<Comment> postComments = new ArrayList<>(); //almacena objetos de tipo comment
    protected User owner;

    //constructor
    public Post(User currentUser) {
        this.postId = nextPostId++;
        this.postDate = sdf.format(now); //inicializamos postDate con la fecha formateada
        this.owner = currentUser;

    }
    public int getPostId() {
        return postId;
    }

    public String getPostDate() {
        return this.postDate;
    }

    //accedemos a la lista completa de comentarios
    public List<Comment> getPostComments() {

        return this.postComments;
    }


    //agrega un comentario en el post
    public void addComment(Comment newComment) {

        this.getPostComments().add(newComment);
    }

    //mostrar cuántos comentarios tiene un post
    public void showCommentCount(){

        System.out.println("Este post tiene : " + this.getPostComments().size() + " comentario/s") ;
    }

    //eliminar un comentario
    public void removeComment(Comment comment){
        this.getPostComments().remove(comment);
    }


    //Metodo abstracto
    // en las clases hijas se implementará una funcionalidad mas específica para mostrar una imagen, un texto o un video
    public abstract void displayPost();

    }
