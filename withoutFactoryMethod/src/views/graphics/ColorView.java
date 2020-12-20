package views.graphics;

import java.util.LinkedHashMap;
import java.util.Map;

import models.Color;
import utils.Console;

public class ColorView {

    private static final Map<Character, Color> colorByCharacter = new LinkedHashMap<Character, Color>();
    static {
        colorByCharacter.put('r', Color.RED);
        colorByCharacter.put('b', Color.BLUE);
        colorByCharacter.put('y', Color.YELLOW);
        colorByCharacter.put('g', Color.GREEN);
        colorByCharacter.put('o', Color.ORANGE);
        colorByCharacter.put('p', Color.PINK);
    }
    private static Color color;

    public ColorView(Color color) {
        this.color = color;
    }

    public void write() {
    }

    public static Color getColor(char character) {
		return color;
    }

    private char getCharacter() {
		return 0;
    }

    public static String getValidCharacteres() {
		return null;
        
    }
}