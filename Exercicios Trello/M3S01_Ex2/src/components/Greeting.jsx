import { useState } from 'react'
import PropTypes from 'prop-types'

function Greeting({ prop }) {
  const [name, setName] = useState(prop)

  const handleNameChange = () => {
    const newName = prompt('Enter a new name:')
    setName(newName)
  }

  return (
    <div id="greeting">
      <button onClick={handleNameChange}>Update name</button>
      <p>Greetings student {name}!</p>
    </div>
  )
}

Greeting.propTypes = {
  prop: PropTypes.string.isRequired
}

export default Greeting
