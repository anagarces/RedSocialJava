package com.campusdual.redsocial;

public class TextPost extends Post {

    protected String textPostTitle;

    protected String postText;

    //Constructor
    public TextPost(User currentUser, String textPostTitle, String postText) {
        super(currentUser);
        this.textPostTitle = textPostTitle;
        this.postText = postText;
    }

    public String getTextPostTitle() {
        return this.textPostTitle;
    }

    public String getPostText() {
        return this.postText;
    }

    @Override
    public void displayPost() {
        System.out.println("\n\uD83D\uDCDD\n\uD83C\uDD94 Id: " + super.getPostId() + "\n\uD83D\uDCC5 Fecha del post: "
                + super.getPostDate() + "\n\uD83D\uDC64 Usuario: " + super.owner.getUserName() + "\n\uD83C\uDFF7\uFE0F Título del post: "
                + this.getTextPostTitle() + "\n\uD83D\uDCC4 Contenido: " + this.getPostText());
    }


}
