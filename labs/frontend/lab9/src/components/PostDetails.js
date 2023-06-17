/**
 * @ Author: Abdou Lahi DIOP
 * @ Create Time: 2023-06-14 11:16:31
 * @ Modified by: Abdou Lahi DIOP
 * @ Modified time: 2023-06-16 14:17:11
 * @ Description:
 */

import React, { useState, useEffect, useContext } from "react";
import axios from "axios";
import { PostContext } from "../PostContext";

const PostDetails = ({ postId, onDeletePost }) => {
    const [post, setPost] = useState(null);
    const { selectedPostId } = useContext(PostContext);

    useEffect(() => {
        if (selectedPostId) {
            fetchPost(selectedPostId);
        }
    }, [selectedPostId]);

    const fetchPost = async (postId) => {
        try {
            const response = await axios.get(`http://localhost:8080/api/v1/posts/posts/${postId}`);
            setPost(response.data);
        } catch (error) {
            console.error("Error fetching post:", error);
        }
    };

    const handleDeletePost = async () => {
        try {
            await axios.delete(`http://localhost:8080/api/v1/posts/${postId}`);
            onDeletePost();
        } catch (error) {
            console.error("Error deleting post:", error);
        }
    };

    if (!post) {
        return <div>Loading post details...</div>;
    }

    return (
        <div>
            <h2>Post Details</h2>
            <h2>Id: {post.id}</h2>
            <h2>Title: {post.title}</h2>
            <h2>Author: {post.author}</h2>
            <button onClick={handleDeletePost}>Delete Post</button>
        </div>
    );
};

export default PostDetails;

