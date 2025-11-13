package controller;

/**
 *
 * @author Geeth Kalhara
 */
public interface DefenceObserver {

    public void getMessageMain(String message);

    public void update(int position);

    public void areaClearLabel(boolean clear);

    public void updateButtons();

}
