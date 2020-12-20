package views.graphics;

import models.Color;
import models.Combination;
import models.ProposedCombination;
import utils.Console;

public class ProposedCombinationView {

	private ProposedCombination proposedCombination;

	public ProposedCombinationView(ProposedCombination proposedCombination) {
		this.proposedCombination = proposedCombination;
	}

	public ProposedCombinationView() {
	}

	public void readInput() {
	}

	private boolean isValidLength(String combination) {
		return combination.length() == Combination.SIZE;
	}

	private boolean isValidChars(String combination) {
		for (Color color : getColors(combination)) {
			if (color == Color.NULL) {
				return false;
			}
		}
		return true;
	}

	private boolean isUniqueChars(String combination) {
		for (int i = 0; i < combination.length(); i++) {
			for (int j = i + 1; j < combination.length(); j++) {
				if (combination.charAt(i) == combination.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}

	private boolean isValid(String combination) {
		return isValidLength(combination) && isValidChars(combination) && isUniqueChars(combination);
	}

	private Color[] getColors(String combination) {
		assert combination != null;
		return null;
	}

	public ProposedCombination getProposedCombination() {
		return proposedCombination;
	}

	public void showProposedCombination() {

	}
}
