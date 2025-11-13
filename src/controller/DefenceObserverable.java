/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;

/**
 *
 * @author Geeth Kalhara
 */
public class DefenceObserverable implements DefenceObserverableInterface {

    int position;

    private final ArrayList<DefenceObserver> observerList = new ArrayList<>();

    public void addDefenceObserver(DefenceObserver ob) {
        observerList.add(ob);
    }

    @Override
    public void updateButtons() {

    }

    @Override
    public void getMessageMain(String message) {
        for (DefenceObserver ob : observerList) {
            ob.getMessageMain(message);
        }
    }

    @Override
    public void areaClear(boolean clear) {

        for (DefenceObserver ob : observerList) {
            ob.areaClearLabel(clear);
        }

    }

    @Override
    public void setPosition(int position) {
        if (this.position != position) {
            this.position = position;
            notifyDefence();
        }
    }

    public void notifyDefence() {
        for (DefenceObserver ob : observerList) {
            ob.update(position);
            updateButtons();
        }
    }

}
