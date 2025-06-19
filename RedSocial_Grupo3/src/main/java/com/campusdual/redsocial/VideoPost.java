package com.campusdual.redsocial;

public class VideoPost extends Post {

    protected String videoPostTitle;

    protected int videoDurationInSeconds;

    protected int videoQuality;
    protected int[] availableVideoQualities = {144, 360, 720, 1080};

    //Constructor
    public VideoPost(User currentUser,String videoPostTitle, int videoDurationInSeconds, int videoQuality) {
        super(currentUser);
        this.videoPostTitle = videoPostTitle;
        this.videoDurationInSeconds = videoDurationInSeconds;


        //Queremos que solo se escoja entre las opciones del availableVideoQualities
        boolean isValidQuality = false;
        for (int i = 0; i < availableVideoQualities.length; i++) {
            if (availableVideoQualities[i] == videoQuality) {
                isValidQuality = true;
                break;
            }
        }

        //Se comprueba si se escoge opción válida y si NO es así, se da una por defecto (360)
        if (isValidQuality) {
            this.videoQuality = videoQuality;
        } else {
            this.videoQuality = 360;
            System.out.println("\n⚠\uFE0FCalidad no válida. Se ha asignado la calidad por defecto (360p).⚠\uFE0F");
        }
    }

    public String getVideoPostTitle() {
        return this.videoPostTitle;
    }

    public int getVideoDurationInSeconds() {
        return this.videoDurationInSeconds;
    }

    public int getVideoQuality() {
        return this.videoQuality;
    }

    public int[] getavailableVideoQualities() {
        return this.availableVideoQualities;
    }

    @Override
    public void displayPost() {
        System.out.println("\n\uD83C\uDFA5\n\uD83C\uDD94 Id: " + super.getPostId() + "\n\uD83D\uDCC5 Fecha del post: "
                + super.getPostDate() + "\n\uD83D\uDC64 Usuario: " + super.owner.getUserName() + "\n\uD83C\uDFF7\uFE0F Título del post: " + this.getVideoPostTitle()+
                "\n\uD83D\uDD52 Duración del video: " + this.getVideoDurationInSeconds() + " segundos" +
                "\n⚙\uFE0F Calidad del video: " + this.getVideoQuality() + " px");
    }

}
