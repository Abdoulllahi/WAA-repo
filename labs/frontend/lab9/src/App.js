/**
 * @ Author: Abdou Lahi DIOP
 * @ Create Time: 2023-06-12 13:45:52
 * @ Modified by: Abdou Lahi DIOP
 * @ Modified time: 2023-06-16 14:14:37
 * @ Description:
 */


import './App.css';
import Dashboard from './pages/Dashboard';
import { PostProvider } from "./PostContext";

function App() {
    return (
        <div className="App">
            <PostProvider>
                <Dashboard />
            </PostProvider>
        </div>
    );
}

export default App;
