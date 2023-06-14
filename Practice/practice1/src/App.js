/**
 * @ Author: Abdou Lahi DIOP
 * @ Create Time: 2023-06-13 22:27:15
 * @ Modified by: Abdou Lahi DIOP
 * @ Modified time: 2023-06-14 00:03:54
 * @ Description:
 */

// import MyButton from './components/MyButton';
import './App.css';

// function App() {
//   return (
//     <div className="App">
//           <MyButton />
//           <MyButton/>
//     </div>
//   );
// }

// export default App;

export default function Board() {
    return (
        <>
            <div className="board-row">
                <button className="square">1</button>
                <button className="square">2</button>
                <button className="square">3</button>
            </div>
            <div className="board-row">
                <button className="square">4</button>
                <button className="square">5</button>
                <button className="square">6</button>
            </div>
            <div className="board-row">
                <button className="square">7</button>
                <button className="square">8</button>
                <button className="square">9</button>
            </div>
        </>
    )
}
