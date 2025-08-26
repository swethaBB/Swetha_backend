import { useState } from "react";
import PlayerService from "./PlayerService";

function ViewAll() {
  const [players, setPlayers] = useState([]);

  const loadPlayersHandler = () => {
    PlayerService.getAllPlayers()
      .then((res) => setPlayers(res.data))
      .catch((err) => console.log(err));
  };

  return (
    <div className="container my-5">
      <h1 className="text-center mb-4">List of All Players</h1>

      <div className="text-center mb-4">
        <button onClick={loadPlayersHandler} className="btn btn-success btn-lg">
          Get All Players
        </button>
      </div>

      {players.length > 0 && (
        <div className="table-responsive">
          <table className="table table-bordered table-striped table-hover">
            <thead className="table-dark text-center">
              <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Jersey Number</th>
                <th>Role</th>
                <th>Total Matches</th>
                <th>Team Name</th>
                <th>Country</th>
                <th>Description</th>
              </tr>
            </thead>
            <tbody>
              {players.map((p) => (
                <tr key={p.id} className="text-center">
                  <td>{p.id}</td>
                  <td>{p.name}</td>
                  <td>{p.jerseyNumber}</td>
                  <td>{p.role}</td>
                  <td>{p.totalMatches}</td>
                  <td>{p.teamName}</td>
                  <td>{p.country}</td>
                  <td>{p.description}</td>
                </tr>
              ))}
            </tbody>
          </table>
        </div>
      )}
    </div>
  );
}

export default ViewAll;
