import { useState } from "react";
import PlayerService from "./PlayerService";

function TeamMatches() {
  const [teamMatches, setTeamMatches] = useState([]);

  const loadTeamMatchesHandler = () => {
    PlayerService.getTeamMatches()
      .then((res) => setTeamMatches(res.data))
      .catch((err) => console.error(err));
  };

  return (
    <div className="container my-5">
      <h2 className="text-center mb-4">Total Matches Summary</h2>

      <div className="text-center mb-3">
        <button className="btn btn-primary btn-lg" onClick={loadTeamMatchesHandler}>
          Get Team Matches
        </button>
      </div>

      <div className="table-responsive">
        <table className="table table-bordered table-striped text-center">
          <thead className="table-dark">
            <tr>
              <th>Team Name</th>
              <th>Total Matches</th>
            </tr>
          </thead>
          <tbody>
            {teamMatches.length > 0 ? (
              teamMatches.map((tm, index) => (
                <tr key={index}>
                  <td>{tm.teamName}</td>
                  <td>{tm.totalMatches}</td>
                </tr>
              ))
            ) : (
              <tr>
                <td colSpan="2">No data available</td>
              </tr>
            )}
          </tbody>
        </table>
      </div>
    </div>
  );
}

export default TeamMatches;
