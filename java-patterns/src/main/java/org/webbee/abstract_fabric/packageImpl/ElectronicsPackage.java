package org.webbee.abstract_fabric.packageImpl;

import org.webbee.abstract_fabric.interfaces.Package;

/**
 * Реализация упаковки для электроники.
 * @author Evseeva Tsvetolina
 */
public class ElectronicsPackage implements Package {

    public String pack() {
        return "Упаковываем в коробку для электроники";
    }

}
