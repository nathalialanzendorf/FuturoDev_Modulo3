import PropTypes from 'prop-types';
import { useState } from 'react';

function Message({ messagesProp }) {
  const [messages, setMessages] = useState(messagesProp);
  const [message, setMessage] = useState('');

  const handleMessage = () => {
    setMessages([...messages, message]);
    setMessage('');
  };

  return (
    <div id="messages">
      <input type="text" value={message} onChange={(e) => setMessage(e.target.value)} />
      <button onClick={handleMessage}>Add message</button>

      {messages.map((msg, index) => (
        <p key={index}>{msg}</p>
      ))}
    </div>
  );
}

Message.propTypes = {
  messagesProp: PropTypes.array.isRequired,
};


export default Message;