package com.campusdual.redsocial;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class Comment {

    //Comment Properties
    private static int nextCommentId= 1;
    private final int commentId;
    protected String commentText;
    protected String commentDate;
    protected User commentOwner;

    Date now = Calendar.getInstance().getTime();
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

    //Constructor
    public Comment(String commentText, User commentOwner) {
        this.commentId = nextCommentId++;
        this.commentText = commentText;
        this.commentDate = sdf.format(now);
        this.commentOwner = commentOwner;
    }

    //Getters
    public String getCommentText() {
        return this.commentText;
    }

    public int getCommentId() { return commentId; }

    //devolve o texto do comentario almacenado en commentText

    public String getCommentDate() {
        return this.commentDate;
    }//devolve a data do comentario almacenado en commentDate

    public User getCommentOwner() {
        return this.commentOwner;
    }
    //accede a propiedad commentowner que é un objeto tipo User
    //devolve o nombre de usuario propietario do comentario.

    //GetDetails
    public void displayComments() {
        System.out.println("\n\uD83C\uDD94Id:" + getCommentId() + "\n\uD83D\uDC64 Usuario: " + this.commentOwner.getUserName() + "\n\uD83D\uDCC5 Fecha del comentario: "
                + this.commentDate + "\n\uD83D\uDCC4 Comentario: " + this.commentText);
    }
}
