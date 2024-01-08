package com.sportsecho.game.exception;

import com.sportsecho.global.exception.GlobalException;

public class GameException extends GlobalException {
    public GameException(GameErrorCode errorCode) {
        super(errorCode);
    }
}