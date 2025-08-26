
import http from "./http-common";

class PlayerService {
    getAllPlayers() {
        return http.get("/circket/getallplayers");
    }

    postPlayer(data) {
        return http.post("/circket/addplayers", data);
    }

    putPlayer(data){
        return http.put("/circket/update", data);
    }

    getTeamMatches() {
        return http.get("/circket/teammatches");
    }


}
export default new PlayerService();