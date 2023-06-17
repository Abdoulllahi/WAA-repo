/**
 * @ Author: Abdou Lahi DIOP
 * @ Create Time: 2023-06-16 14:09:08
 * @ Modified by: Abdou Lahi DIOP
 * @ Modified time: 2023-06-16 14:20:08
 * @ Description:
 */

import React from "react";
import Posts from "../components/Posts";
import PostDetails from "../components/PostDetails";
import AddPost from "../components/AddPost";
import { PostProvider } from "../PostContext";

const Dashboard = () => {
    return (
        <div>
            <h1>Dashboard</h1>
            <PostProvider>
                <Posts />
                <AddPost />
                <PostDetails />
            </PostProvider>
        </div>
    );
};

export default Dashboard;
