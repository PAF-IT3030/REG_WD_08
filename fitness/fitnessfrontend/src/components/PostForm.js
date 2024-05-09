import React, { useState } from 'react';

function PostForm() {
  const [title, setTitle] = useState('');
  const [description, setDescription] = useState('');
  const [fileUrl, setFileUrl] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    // Here you will handle the API call to submit the form data
    console.log(title, description, fileUrl);
  };

return (
    <form onSubmit={handleSubmit} className="post-form">
        <h2>New Post</h2>
      <input
        type="text"
        placeholder="Title"
        value={title}
        onChange={(e) => setTitle(e.target.value)}
      />
      <textarea
        placeholder="Description"
        value={description}
        onChange={(e) => setDescription(e.target.value)}
      />
      <input
        type="url"
        placeholder="File Url"
        value={fileUrl}
        onChange={(e) => setFileUrl(e.target.value)}
      />
      <button type="submit">Add New</button>
    </form>
  );
}

export default PostForm;
