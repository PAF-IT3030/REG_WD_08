import React from 'react';
import './MealPlanCard.css'; 

const MealPlanCard = ({ name, duration, startDate, endDate }) => {
  return (
    <div className="meal-plan-card">
      <h1>{name}</h1>
      <p>Duration: {duration}</p>
      <p>Start Date: {startDate}</p>
      <p>End Date: {endDate}</p>
    </div>
  );
};

export default MealPlanCard;
