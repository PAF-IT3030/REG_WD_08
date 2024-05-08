import React from 'react';
import './App.css';
import MealPlanCard from './components/MealPlanCard/MealPlanCard';
import DailyPlanCard from './components/DailyPlanCard/DailyPlanCard';

const App = () => {
  // Sample data
  const mealPlanInfo = {
    name: "April Healthy Eating",
    duration: "1 week",
    startDate: "April 1, 2024",
    endDate: "April 7, 2024"
  };

  const dailyMeals = [
    { day: "Monday", meals: [{ id: 1, name: "Oatmeal", prepTime: "10 mins", cookTime: "5 mins", image: "path/to/image" }] },
    { day: "Tuesday", meals: [{ id: 2, name: "Salad", prepTime: "15 mins", cookTime: "0 mins", image: "path/to/image" }] },
    { day: "Wednesday", meals: [{ id: 3, name: "Pasta", prepTime: "10 mins", cookTime: "20 mins", image: "path/to/image" }] },
    { day: "Thursday", meals: [{ id: 4, name: "Chicken", prepTime: "10 mins", cookTime: "20 mins", image: "path/to/image" }]},
    { day: "Friday", meals: [{ id: 5, name: "Rice", prepTime: "10 mins", cookTime: "20 mins", image: "path/to/image" }] },
    { day: "Saturday", meals: [{ id: 6, name: "Soup", prepTime: "10 mins", cookTime: "20 mins", image: "path/to/image" }] },
    { day: "Sunday", meals: [{ id: 7, name: "Sandwich", prepTime: "10 mins", cookTime: "0 mins", image: "path/to/image" }] }
  ];

  return (
    <div className="app">
      <MealPlanCard {...mealPlanInfo} />
      {dailyMeals.map((dayPlan, index) => (
        <DailyPlanCard key={index} day={dayPlan.day} meals={dayPlan.meals} />
      ))}
    </div>
  );
};

export default App;

