package com.weaverprojects.openinstagram.Controller.Temp;

import com.weaverprojects.openinstagram.Model.Comment;
import com.weaverprojects.openinstagram.Model.Post;
import com.weaverprojects.openinstagram.Model.PostBasics;
import com.weaverprojects.openinstagram.Model.UsersProfile;

import java.util.ArrayList;

/**
 * Created by kweaver on 18/12/15.
 */
public class Fake {
    public static ArrayList<Post> getFakePosts(){
        ArrayList<Post> posts = new ArrayList<>();

        String profileImg1 = "https://scontent-yyz1-1.cdninstagram.com/hphotos-xpf1/t51.2885-19/s150x150/12277443_980828698650722_652972973_a.jpg";
        String postImg1 = "https://scontent-yyz1-1.cdninstagram.com/hphotos-xpt1/t51.2885-15/e35/10005461_1678992595672706_948783676_n.jpg";
        String userName1 = "gopro";
        String caption1 = "my first post";
        ArrayList<Comment> mComments1 = new ArrayList<>();
        for(int i = 0;i < 12;i++){
            mComments1.add(new Comment("p1_" + String.valueOf(i), "User " + String.valueOf(i), "Comment " + String.valueOf(i)));
        }

        posts.add(new Post("p1",userName1,profileImg1,postImg1,100, mComments1, caption1, true, false));
        posts.add(new Post("p2",userName1,profileImg1,postImg1,100, mComments1, caption1, true, false));
        posts.add(new Post("p3",userName1,profileImg1,postImg1,100, mComments1, caption1, true, false));
        posts.add(new Post("p4",userName1,profileImg1,postImg1,100, mComments1, caption1, true, false));



        return posts;
    }
    public static String getTestProfileImage(){
        return "https://scontent-yyz1-1.cdninstagram.com/hphotos-xfa1/t51.2885-19/10616436_505564372908202_2136544002_a.jpg";
    }
    public static UsersProfile getUserProfile(){
        return new UsersProfile("u1",getTestProfileImage(),"kweaver0","Keith Weaver","builds things",123,456,getFakeBasicPosts());
    }
    public static ArrayList<PostBasics> getFakeBasicPosts(){
        ArrayList<PostBasics> b = new ArrayList<>();

        ArrayList<Post> fullPosts = getFakePosts();
        for(Post p : fullPosts){
            b.add(new PostBasics(p.getPostId(), p.getImgUrl()));
        }

        return b;
    }
}
