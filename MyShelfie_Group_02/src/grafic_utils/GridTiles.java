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

public class GridTiles extends JPanel{
	
	private int rows;
    private int cols;
    private JLabel[][] labels;
    private List<Coord> selectedCells;

    public GridTiles() {
        this.rows = 9;
        this.cols = 9;
        this.labels = new JLabel[rows][cols];
        this.selectedCells = new ArrayList<>();

        setLayout(new GridLayout(rows, cols));
        setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                JLabel label = new JLabel();
                label.setOpaque(true);
                label.setBackground(Color.WHITE);
                label.addMouseListener(new CellMouseListener(i, j));
                add(label);
                labels[i][j] = label;
            }
        }
    }

    public void setCellColor(int row, int column, Color color) {
        if (isValidCell(row, column)) {
            labels[row][column].setBackground(color);
        }
    }

    public void clearSelection() {
        for (Coord cell : selectedCells) {
            int row = cell.getRow();
            int column = cell.getCol();
            labels[row][column].setBorder(null);
        }
        selectedCells.clear();
    }

    public List<Coord> getSelectedCells() {
        return new ArrayList<>(selectedCells);
    }

    private boolean isValidCell(int row, int column) {
        return row >= 0 && row < rows && column >= 0 && column < cols;
    }

    private class CellMouseListener extends MouseAdapter {
        private int row;
        private int column;

        public CellMouseListener(int row, int column) {
            this.row = row;
            this.column = column;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            JLabel label = (JLabel) e.getSource();
           
            Coord cell = new Coord(row, column);
           
            if (selectedCells.contains(cell)) {
                selectedCells.remove(cell);
                label.setBorder(null);
                revalidate();
                repaint(); 
            } else {
                if (selectedCells.size() < 3) {
                    selectedCells.add(cell);
                    label.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
                    revalidate();
                    repaint();
                }
            }
        }
    }

}
