import React, { useState } from 'react';

const PostDetails = ({ title, content }) => {
  const [showDetails, setShowDetails] = useState(false);

  const handleButtonClick = () => {
    setShowDetails(!showDetails);
  };

  return (
    <div>
      <div onClick={handleButtonClick}>
        <h3>{title}</h3>
        {showDetails && (
          <div>
            <p>{content}</p>
            <button>Edit</button>
            <button>Delete</button>
          </div>
        )}
      </div>
    </div>
  );
};

export default PostDetails;