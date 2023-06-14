import React from "react";
import Post from "./Post";

const Posts = () => {

    const data = [
        {
            id: 111,
            title: 'Happiness',
            author: 'John'
        },
        {
            id: 112,
            title: 'MIU',
            author: 'Dean'
        },
        {
            id: 113,
            title: 'Enjoy Life',
            author: 'Jasmine'
        }
    ]

    const posts = data.map(post => {
        return <Post id={post.id} key={post.id} title={post.title} author= {post.author} />
    })
    return <div className="Product">{posts}</div>;
}

export default Posts