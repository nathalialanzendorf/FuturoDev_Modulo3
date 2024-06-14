import PropTypes from 'prop-types';
import { useState } from 'react';

function Theme() {
  const [favoriteColor, setFavoriteColor] = useState('');

  const handleColorChange = (e) => {
    setFavoriteColor(e.target.value);
    document.documentElement.style.backgroundColor = e.target.value;
    document.body.style.color = 'lightblue';
  };

  return (
    <div id="theme">
      <select value={favoriteColor} onChange={handleColorChange}>
        <option value="">Select a color</option>
        <option value="black">Black</option>
        <option value="white">White</option>
        <option value="gray">Gray</option>
      </select>
    </div>
  );
}

Theme.propTypes = {
  messagesProp: PropTypes.array.isRequired,
};

export default Theme;