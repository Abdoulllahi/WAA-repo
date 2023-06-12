/**
 * @ Author: Abdou Lahi DIOP
 * @ Create Time: 2023-06-12 03:13:25
 * @ Modified by: Abdou Lahi DIOP
 * @ Modified time: 2023-06-12 09:02:59
 * @ Description:
 */

// import logo from './logo.svg';
import './App.css';
import Product from './components/Product';
import Dashboard from './pages/Dashboard';

function App() {
    return (
        <div className="App">
            <Dashboard />
            <Product/>
        </div>
    );
}

export default App;
