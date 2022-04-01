class Post{
    public String author;
    public String title;
    public String content;
    public String creationDate;

    public String getPost(){
        return "Title: " + title;
    }

    public String updatePost(String title, String author, String content, String creationDate){

        this.title = title;
        this.author = author;
        this.content = content;
        this.creationDate = creationDate;

        return this.getPost();
    }
}

public class OOPLecture {
    public static void main(String[] args) {
        Post firstPost = new Post();

        System.out.println("firstPost = " + firstPost.getPost());

        String updatedPost = firstPost.updatePost(
                "This is a title",
                "Shaz is the author",
                "This is the content",
                "Today");

        System.out.println("updatedPost is : " + updatedPost);


        Post secondPost = new Post();


    }


}
