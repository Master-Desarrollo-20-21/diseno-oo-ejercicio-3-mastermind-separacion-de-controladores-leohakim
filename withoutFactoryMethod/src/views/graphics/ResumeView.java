package views.graphics;

import models.Game;
import utils.YesNoDialog;

public class ResumeView {

    private Game game;
    private boolean resume;

    public ResumeView(Game game) {
        this.game = game;
    }

    public void interact() {
        
    }

    public boolean isResumed() {
        return this.resume;
    }
}
