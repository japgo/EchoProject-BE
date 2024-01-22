package com.sportsecho.game.service;

import com.sportsecho.game.dto.GameResponseDto;
import java.util.List;

public interface GameService {
    List<GameResponseDto> getGamesByDateAndLeague(String date);

    /**
     * Game 정보 단일 조회
     * @param gameId 조회할 게임 ID
     * */
    GameResponseDto getGameDetails(Long gameId);
}