import React from 'react';

function PostList() {
  // This could be dynamic based on data fetched from your API
  const posts = [
    { id: 1, title: 'Post 1', description: 'Description 1', fileUrl: 'URL 1' }
  ];

  return (
    <div className="post-list">
      {posts.map((post) => (
        <div key={post.id}>
          <h3>{post.title}</h3>
          <p>{post.description}</p>
          <a href={post.fileUrl}>View File</a>
        </div>
      ))}
    </div>
  );
}

export default PostList;
