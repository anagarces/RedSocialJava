package com.campusdual.redsocial;

public class ImagePost extends Post{

    protected String imagePostTitle;

    protected int imageHeight;

    protected int imageWidth;

    //Constructor
    public ImagePost(User currentUser,String imagePostTitle, int imageHeight, int imageWidth) {
        super(currentUser);
        this.imagePostTitle = imagePostTitle;
        this.imageHeight = imageHeight;
        this.imageWidth = imageWidth;
    }

    public String getImagePostTitle() {
        return this.imagePostTitle;
    }

    public int getImageHeight() {
        return this.imageHeight;
    }

    public int getImageWidth() {
        return this.imageWidth;
    }

    @Override
    public void displayPost() {
        System.out.println("\n\uD83D\uDCF8\n\uD83C\uDD94 Id: " + super.getPostId() + "\n\uD83D\uDCC5 Fecha del post: "
                + super.getPostDate() + "\n\uD83D\uDC64 Usuario: " + super.owner.getUserName() + "\n\uD83C\uDFF7\uFE0F Título del post: "+ this.getImagePostTitle() +
                "\n↔\uFE0F Dimensiones de la imagen: " + this.getImageHeight() + " x " + this.getImageWidth());
    }

}
