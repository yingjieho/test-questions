import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
public class Drawing {
    public String[] colours;
    public String[] shapes;
    public static class Art {
        public String colour;
        public String shape;
        public Art(String colour, String shape) {
            this.colour = colour;
            this.shape = shape;
        }
    }
    public Drawing(String[] colours, String[] shapes) {
        this.colours = colours;
        this.shapes = shapes;
    }
    public List<Art > mix() {
        List<String> colours = Arrays.asList(colours);
        List<String> shapes = Arrays.asList(shapes);
        return Collections.emptyList();
    }
    public static void main(String[] args) {
        Drawing draw = new Drawing (new String[]{
                "red", "blue"
        }, new String[]{
                "circle"
        });
        List<Art> mixes= draw.mix();
        /*
         * Should print:
         * red, circle
         * blue, circle
         */
        for (Art art: mixes) {
            System.out.println(art.colour + ", " + art.shape);
        }
    }
}