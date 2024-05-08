import React from 'react';
import './MealPreview.css';

const MealPreview = ({ meal }) => {
  return (
    <div className="meal-preview">
      <img src={meal.image} alt={meal.name} />
      <div>
        <h3>{meal.name}</h3>
        <p>Prep Time: {meal.prepTime}</p>
        <p>Cook Time: {meal.cookTime}</p>
      </div>
    </div>
  );
};

export default MealPreview;
