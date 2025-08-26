import { useState } from "react";
import PlayerService from "./PlayerService";

function AddPlayer() {
  const [player, setPlayer] = useState({
    id: "",
    name: "",
    jerseyNumber: "",
    role: "",
    totalMatches: "",
    teamName: "",
    country: "",
    description: ""
  });
  const [message, setMessage] = useState("");

  const handleChange = (e) => {
    setPlayer({ ...player, [e.target.name]: e.target.value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    PlayerService.postPlayer(player)
      .then(() => {
        setMessage("Player added successfully!");
        setPlayer({
          id: "",
          name: "",
          jerseyNumber: "",
          role: "",
          totalMatches: "",
          teamName: "",
          country: "",
          description: ""
        });
      })
      .catch(() => setMessage("Error while adding player"));
  };

  const handleUpdate = () => {
    PlayerService.putPlayer(player)
      .then(() => setMessage("Player updated successfully!"))
      .catch(() => setMessage("Failed to update player"));
  };

  return (
    <div className="container my-5">
      <h1 className="text-center mb-4">Add / Update Player</h1>

      {message && <div className="alert alert-info text-center">{message}</div>}

      <form onSubmit={handleSubmit} className="row g-3">
        <div className="col-md-3">
          <label className="form-label">ID</label>
          <input type="text" name="id" value={player.id} onChange={handleChange} className="form-control" required />
        </div>
        <div className="col-md-3">
          <label className="form-label">Name</label>
          <input type="text" name="name" value={player.name} onChange={handleChange} className="form-control" required />
        </div>
        <div className="col-md-3">
          <label className="form-label">Jersey Number</label>
          <input type="number" name="jerseyNumber" value={player.jerseyNumber} onChange={handleChange} className="form-control" required />
        </div>
        <div className="col-md-3">
          <label className="form-label">Role</label>
          <input type="text" name="role" value={player.role} onChange={handleChange} className="form-control" required />
        </div>
        <div className="col-md-3">
          <label className="form-label">Total Matches</label>
          <input type="number" name="totalMatches" value={player.totalMatches} onChange={handleChange} className="form-control" required />
        </div>
        <div className="col-md-3">
          <label className="form-label">Team Name</label>
          <input type="text" name="teamName" value={player.teamName} onChange={handleChange} className="form-control" required />
        </div>
        <div className="col-md-3">
          <label className="form-label">Country</label>
          <input type="text" name="country" value={player.country} onChange={handleChange} className="form-control" required />
        </div>
        <div className="col-md-6">
          <label className="form-label">Description</label>
          <input type="text" name="description" value={player.description} onChange={handleChange} className="form-control" />
        </div>

        <div className="col-12 d-flex gap-3 justify-content-center mt-3">
          <button type="submit" className="btn btn-success btn-lg">Add Player</button>
          <button type="button" className="btn btn-warning btn-lg" onClick={handleUpdate}>Update Player</button>
        </div>
      </form>
    </div>
  );
}

export default AddPlayer;
