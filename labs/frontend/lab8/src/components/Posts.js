/**
 * @ Author: Abdou Lahi DIOP
 * @ Create Time: 2023-06-14 11:16:31
 * @ Modified by: Abdou Lahi DIOP
 * @ Modified time: 2023-06-16 18:21:04
 * @ Description:
 */


import React, { useState, useEffect } from "react";
import axios from "axios";
import Post from "./Post";

const Posts = () => {
    const [posts, setPosts] = useState([]);

    useEffect(() => {
        fetchPosts();
    }, [])
    const fetchPosts = async () => {
        try {
            const response = await axios.get("http://localhost:8080/api/v1/posts");
            setPosts(response.data);
        } catch (error) {
            console.error("Error fetching posts:", error);
        }
    };

    return (
        <div className="Product">
            {posts.map((post) => (
                <Post
                    key={post.id}
                    id={post.id}
                    title={post.title}
                    author={post.author}
                />
            ))}
        </div>
    );
};

export default Posts;
