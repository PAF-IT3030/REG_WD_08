import React from 'react';
import './DailyPlanCard.css';
import MealPreview from '../MealPreview/MealPreview'; // Import the MealPreview component

const DailyPlanCard = ({ day, meals }) => {
  return (
    <div className="daily-plan-card">
      <h2>{day}</h2>
      {meals.map(meal => (
        <MealPreview key={meal.id} meal={meal} />
      ))}
    </div>
  );
};

export default DailyPlanCard;

