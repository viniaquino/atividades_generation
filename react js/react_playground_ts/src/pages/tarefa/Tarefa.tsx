import { useEffect, useState } from "react"

function Tarefa() {

  const [completed, setCompleted] = useState(false);
  const [tarefa, setTarefa] = useState("");

  useEffect(() => {
    if(completed) {
      setTarefa("Parabéns! Você concluiu a tarefa.")
    } else {
      setTarefa("Opa! Você não concluiu a tarefa.")
    }

  }, [completed]);

  return (
    <>
      <h1>Componente Tarefa</h1>
      <h2>{tarefa}</h2>
      <p>Conclua a tarefa</p>
      <button onClick={() => setCompleted(v => !v)}>
        {completed ? "Revisar tarefa" : "Concluir tarefa"}
      </button>
    </>
  )
}

export default Tarefa