/**
 * @ Author: Abdou Lahi DIOP
 * @ Create Time: 2023-06-12 13:54:28
 * @ Modified by: Abdou Lahi DIOP
 * @ Modified time: 2023-06-15 03:45:45
 * @ Description:
 */
import React, { useState } from "react";
import Posts from "../components/Posts"
import PostDetails from "../components/PostDetails";
// import AddPost from "../components/AddPost";


const Dashboard = () => {

    const [title, setTitle] = useState('');
    const [updatedTitle, setUpdatedTitle] = useState('');

    const handleTitleChange = (event) => {
        setTitle(event.target.value);
    };

    const handleUpdateTitle = () => {
        const firstPost = document.getElementsByClassName("Content")[0];
        const updatedPost = firstPost.cloneNode(true);
        const titleElement = updatedPost.querySelectorAll("h2")[1];
        titleElement.textContent = `Title: ${title}`;

        firstPost.parentNode.replaceChild(updatedPost, firstPost);

        setUpdatedTitle(title);
        setTitle("");
    };

    return (
        <div>
            <h1>Dashboard</h1>
            <Posts />
            <input type="text" value={title} onChange={handleTitleChange} />
            <button onClick={handleUpdateTitle}>Update Title</button>
            <p>Updated Title: {updatedTitle}</p>
            <PostDetails />
        </div>
    )
}

export default Dashboard;