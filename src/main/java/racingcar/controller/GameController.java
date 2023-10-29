package racingcar.controller;

import racingcar.model.Car;
import racingcar.model.GameModel;
import racingcar.validate.CarNamesValidation;
import racingcar.validate.RoundNumberValidation;
import racingcar.view.GameView;

import java.util.List;

public class GameController {
    private final GameModel gameModel;
    private final GameView gameView;

    public GameController(final GameModel gameModel, final GameView gameView) {
        this.gameModel = gameModel;
        this.gameView = gameView;
    }

    public void startGame() {
        List<String> carNames = gameView.getCarNames(new CarNamesValidation());
        gameModel.setCars(carNames);
    }

}
