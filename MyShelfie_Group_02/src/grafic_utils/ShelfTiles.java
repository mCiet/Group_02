package grafic_utils;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import grafic_utils.Coord;

public class ShelfTiles extends JPanel{
	private int rows;
    private int cols;
    private JLabel[][] labels;
    private List<Coord> selected;
	
    public ShelfTiles() {
    	this.rows=6;
    	this.cols=5;
    	this.labels = new JLabel[rows][cols];
    	this.selected = new ArrayList<>();
    	
    	setLayout(new GridLayout(rows,cols));
    	setBorder(BorderFactory.createEmptyBorder(5,5, 5, 5));
    	
    	for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                JLabel label = new JLabel();
                label.setOpaque(true);
                label.setBackground(Color.WHITE);
                add(label);
                labels[i][j] = label;
            }
        }
    	
    }
    
    private boolean isValidCell(int row, int col) {
		return row >= 0 && row< rows && col>=0 && col < cols;			

	}
    
    public void setCellColor(int row, int col, Color colour) {
    	if(isValidCell(row, col)) {
    		labels[row][col].setBackground(colour);
    	}
    }

	
}
