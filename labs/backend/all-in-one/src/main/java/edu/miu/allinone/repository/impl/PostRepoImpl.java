package edu.miu.allinone.repository.impl;

import edu.miu.allinone.entity.Post;
import edu.miu.allinone.repository.PostRepo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PostRepoImpl implements PostRepo {

    private static List<Post> posts = new ArrayList<>();
    private static int postId = 100;

    static {

        String[] titles = {
                "Exciting Adventure",
                "Delicious Recipes",
                "The Art of Photography",
                "Gardening Tips and Tricks",
                "Fitness Journey",
                "Exploring New Horizons",
                "Life Lessons",
                "Creative Writing",
                "Healthy Living",
                "Tech Innovations"
        };

        String[] contents = {
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
                "Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.",
                "In tincidunt quam vitae ligula viverra feugiat.",
                "Sed malesuada libero in tincidunt auctor.",
                "Curabitur blandit felis eget eros cursus, nec sagittis urna faucibus.",
                "Fusce tincidunt turpis ac dolor blandit, in feugiat ligula faucibus.",
                "Vestibulum vestibulum dolor eget eros tincidunt, sed pharetra lectus lacinia.",
                "Nullam scelerisque eros vitae dapibus condimentum.",
                "Suspendisse suscipit metus sit amet varius sollicitudin.",
                "Mauris scelerisque neque in est tincidunt, sit amet consequat elit convallis."
        };

        String[] authors = {
                "John Smith",
                "Emma Johnson",
                "Michael Brown",
                "Olivia Davis",
                "William Wilson",
                "Sophia Martinez",
                "James Taylor",
                "Isabella Anderson",
                "Daniel Lee",
                "Mia Thomas"
        };

        for (int i = 0; i < 10; i++) {
            Post post = new Post(i + 1, titles[i], contents[i], authors[i]);
            posts.add(post);
        }
    }

    @Override
    public void save(Post post) {

        post.setId(postId++);
        posts.add(post);
    }

    @Override
    public List<Post> findAll() {
        return posts;
    }

    @Override
    public Post getById(long id) {

        return posts
                .stream()
                .filter(post -> post.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Post deleteById(long id) {

       Post deletedPost = posts
               .stream()
               .filter(post -> post.getId() == id)
               .findFirst()
               .orElse(null);
       posts.remove(deletedPost);
       return deletedPost;
    }

    @Override
    public Post update(Post updatedPost) {

        long postId = updatedPost.getId();
        Post existingPost = getById(postId);
        if (existingPost != null) {
            int index = posts.indexOf(existingPost);
            posts.set(index, updatedPost);
            return updatedPost;
        }
        return null;
    }

    @Override
    public List<Post> findByAuthor(String author) {
        return posts.stream()
                .filter(post -> post.getAuthor().equalsIgnoreCase(author))
                .toList();
    }
}
