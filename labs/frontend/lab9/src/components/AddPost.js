/**
 * @ Author: Abdou Lahi DIOP
 * @ Create Time: 2023-06-15 03:40:44
 * @ Modified by: Abdou Lahi DIOP
 * @ Modified time: 2023-06-15 03:55:50
 * @ Description:
 */

import React, { useState } from "react";
import axios from "axios";

const AddPost = ({ onAddPost }) => {
    const [title, setTitle] = useState("");
    const [author, setAuthor] = useState("");
    const [content, setContent] = useState("");

    const handleTitleChange = (event) => {
        setTitle(event.target.value);
    };

    const handleAuthorChange = (event) => {
        setAuthor(event.target.value);
    };

    const handleContentChange = (event) => {
        setContent(event.target.value);
    };

    const handleSubmit = async (event) => {
        event.preventDefault();
        try {
            const response = await axios.post("http://localhost:8080/api/v1/posts", {
                title,
                author,
                content,
            });
            onAddPost(response.data);
            setTitle("");
            setAuthor("");
            setContent("");
        } catch (error) {
            console.error("Error adding post:", error);
        }
    };

    return (
        <div>
            <h2>Add Post</h2>
            <form onSubmit={handleSubmit}>
                <label>
                    Title:
                    <input
                        type="text"
                        value={title}
                        onChange={handleTitleChange}
                    />
                </label>
                <br />
                <label>
                    Author:
                    <input
                        type="text"
                        value={author}
                        onChange={handleAuthorChange}
                    />
                </label>
                <br />
                <label>
                    Content:
                    <textarea
                        value={content}
                        onChange={handleContentChange}
                    />
                </label>
                <br />
                <button type="submit">Add Post</button>
            </form>
        </div>
    );
};

export default AddPost;
