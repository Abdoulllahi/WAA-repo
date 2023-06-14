/**
 * @ Author: Abdou Lahi DIOP
 * @ Create Time: 2023-06-12 13:57:44
 * @ Modified by: Abdou Lahi DIOP
 * @ Modified time: 2023-06-13 09:13:51
 * @ Description:
 */

import React from 'react';

const Post = (props) => {

    return (
        <div className="Content">
            <h2>Id: {props.id}</h2>
            <h2>Title: {props.title}</h2>
            <h2>Author: {props.author}</h2>
        </div>
    )
}

export default Post;