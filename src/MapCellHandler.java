import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


class MapCellHandler implements MouseListener {

    private boolean modifying;


    private boolean makePassable;


    public void mousePressed(MouseEvent e) {
        modifying = true;

        JMapCell cell = (JMapCell) e.getSource();


        makePassable = !cell.isPassable();

        cell.setPassable(makePassable);
    }


    public void mouseReleased(MouseEvent e) {
        modifying = false;
    }


    public void mouseEntered(MouseEvent e) {
        if (modifying) {
            JMapCell cell = (JMapCell) e.getSource();
            cell.setPassable(makePassable);
        }
    }


    public void mouseExited(MouseEvent e) {

    }

    public void mouseClicked(MouseEvent e) {

    }
}
