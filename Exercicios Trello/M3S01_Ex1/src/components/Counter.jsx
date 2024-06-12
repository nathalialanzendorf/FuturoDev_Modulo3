import { useState } from 'react'

function Counter() {
  const [count, setCount] = useState(0)

  function handleClick() {
    setCount(count + 1)
  }

  return (
    <div id="counter">
      <button onClick={handleClick}>
        Click me
      </button>
      <p>Clicks: {count}</p>
    </div>
  )
}

export default Counter
