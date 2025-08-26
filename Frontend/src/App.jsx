import './App.css';
import ViewAll from './ViewAll';
import AddPlayer from './AddPlayer';
import TeamMatches from './TeamMatches';
import { BrowserRouter, Routes, Route, Link } from "react-router-dom";

function App() {
  return (
    <BrowserRouter>
      <div className="app-wrapper">
        
        {/* Full-width Header */}
        <header className="app-header d-flex justify-content-between align-items-center px-5 py-3">
          <h1 className="app-title">Cricket Team Management</h1>
          <div className="d-flex gap-3">
            <Link to="/viewall" className="btn btn-primary btn-lg">View Players</Link>
            <Link to="/addplayers" className="btn btn-success btn-lg">Add Player</Link>
            <Link to="/teammatches" className="btn btn-warning btn-lg">Total Matches</Link>
          </div>
        </header>

        {/* Routes Content */}
        <main className="app-main px-5 py-4">
          <Routes>
            <Route path="/viewall" element={<ViewAll />} />
            <Route path="/addplayers" element={<AddPlayer />} />
            <Route path="/teammatches" element={<TeamMatches />} />
          </Routes>
        </main>
      </div>
    </BrowserRouter>
  );
}

export default App;
