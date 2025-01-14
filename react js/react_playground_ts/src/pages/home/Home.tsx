interface propsHome {
  titulo: string;
  texto: string;
}

function Home(props: propsHome) {
  return (
      <div>
        <h1>{props.titulo}</h1>
        <p>{props.texto}</p>
    </div>
  )
}

export default Home