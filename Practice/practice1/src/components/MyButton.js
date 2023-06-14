/**
 * @ Author: Abdou Lahi DIOP
 * @ Create Time: 2023-06-13 22:41:45
 * @ Modified by: Abdou Lahi DIOP
 * @ Modified time: 2023-06-13 23:10:02
 * @ Description:
 */

import { useState } from 'react';

function MyButton() {

    function handleClick() {
        setCount(count + 1);
    }

    const [count, setCount] = useState(0);
    return (
        <button onClick={handleClick}>I'm a button clicked {count} times</button>
    )
}

export default MyButton;