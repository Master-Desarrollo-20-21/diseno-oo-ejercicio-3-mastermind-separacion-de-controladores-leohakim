package views.graphics;

import models.Attempt;
import models.Game;
import utils.Console;

public class GameView {
    private Game game;

    public GameView(Game game) {
        this.game = game;
    }

    public void interact() {

    }

    private void proposeCombinations() {
        do {
            ProposedCombinationView proposedCombinationView = new ProposedCombinationView();
            proposedCombinationView.readInput();
            Attempt attempt = new Attempt(this.game.getSecretCombination(),
                    proposedCombinationView.getProposedCombination());
            this.game.addAttempt(attempt);
            writeStatus();
        } while (!this.game.isFinished());
    }

    private void writeStatus() {
        Console.getInstance().writeln();
        AttemptView attemptView = new AttemptView(this.game.getAttempts());
        attemptView.writeAttemptsNumber();
        new SecretCombinationView(this.game.getSecretCombination()).show();
        attemptView.writeAttempts();
    }

    private void writeResult() {
        
    }
}
