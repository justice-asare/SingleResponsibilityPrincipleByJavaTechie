package lsp;

public abstract class SocialMedia {

    //@Support WhatsApp, Facebook, Instagram
    public abstract void chatWithFriend();

    //@Support WhatsApp, Facebook, Instagram
    public abstract void publishPost(Object post);

    //@Support WhatsApp, Facebook, Instagram
    public abstract void sendPhotosAndVideos();

    //@Support WhatsApp, Facebook
    public abstract void groupVideoCall(String... users);
}
