package com.campusdual.redsocial;


import java.util.ArrayList;
import java.util.List;

public class User {

    protected String userName;
    protected List<User> followingUsers = new ArrayList<>();
    protected List<Post> postsList = new ArrayList<>();

    //Metodo Constructor
    public User(String userName) {
        this.userName = userName;
    }


    //GETTER Y SETTER del nombre de usuario
    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    //GETTERS por si las otras clases deben acceder a dichas listas,
    // que tiene pinta que van a ahcer falta
    public List<User> getFollowingUsers() {
        return this.followingUsers;
    }

    public List<Post> getPostsList() {
        return this.postsList;
    }

    //Metodo para mostrar los contenidos de la lista de Follows
    public void showFollowingUsers(String userName) {
        if (this.getFollowingUsers().isEmpty()) {
            System.out.println("⚠\uFE0F" + userName + " no sigue a nadie todavía. ⚠\uFE0F");
        } else {
            System.out.println("✔\uFE0F" + userName + " está siguiendo a: ");
            for (User user : this.getFollowingUsers()) {
                System.out.println(user.getUserName());
            }
        }
    }
    //Metodo para mostrar los contenidos de la lista de Posts
    public void showUserPosts(String userName) {
        if (this.postsList.isEmpty()) {
            System.out.println(userName + " no ha posteado nada todavía.");
        } else {
            for (Post post : this.getPostsList()) {
               post.displayPost();
            }
        }
    }

    //Añadir follows
    public void addFollowingUser(User newFollowingUser) {
        //if(this == newFollowingUser){}
        if (this.getFollowingUsers().contains(newFollowingUser)) {
            System.out.println("⚠\uFE0F Ya estás siguiendo a " + newFollowingUser.getUserName() + "⚠\uFE0F");
        }else{
        this.getFollowingUsers().add(newFollowingUser);}
        //System.out.println(this.getUserName() + " está siguiendo ahora a " + newFollowingUser.getUserName());}
    }
    //Eliminar follows
    public void removeFollowingUser(User newUnfollowingUser) {
        if (!this.getFollowingUsers().contains(newUnfollowingUser)) {
            System.out.println("⚠\uFE0F Ya no estabas siguiendo a " + newUnfollowingUser.getUserName() + "⚠\uFE0F");
        }else{
        System.out.println("❌" + this.getUserName()+ " ha dejado de seguir a " + newUnfollowingUser.getUserName());
        this.getFollowingUsers().remove(newUnfollowingUser);}
    }


    //Añadir Post
    public void addPost(Post newPost) {
        this.getPostsList().add(newPost);
    }
    //Eliminar Post
    public void removePost(Post newPost) {
        this.getPostsList().remove(newPost);
        System.out.println("\n❌ Publicación eliminada");
    }

}
