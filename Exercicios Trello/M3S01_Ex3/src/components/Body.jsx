import Message from './Message'

function Body() {

  return (
    <div>
      <h1>Messages</h1>
        <Message messagesProp={["Mensagem 1", "Mensagem 2", "Mensagem 3"]} />
    </div>
  )
}

export default Body
