/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import patterns.DefenceObserverable;
import gui.Helicopter;
import gui.MainController;
import gui.Submarine;
import gui.Tank;
import java.util.ArrayList;

/**
 *
 * @author Geeth Kalhara
 */
public class Defence {

    public static void main(String[] args) {

        try {
            FlatMacDarkLaf.setup();
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        DefenceObserverable defenceObserverable = new DefenceObserverable();
        MainController mainController = new MainController(defenceObserverable);

        defenceObserverable.addDefenceObserver(new Helicopter(mainController));
        defenceObserverable.addDefenceObserver(new Tank(mainController));
        defenceObserverable.addDefenceObserver(new Submarine(mainController));
        mainController.setVisible(true);
    }

}
