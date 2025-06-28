package org.webbee.abstract_fabric.packageImpl;

import org.webbee.abstract_fabric.interfaces.Package;

/**
 * Реализация упаковки для одежды.
 * @author Evseeva Tsvetolina
 */
public class ClothesPackage implements Package {

    public String pack() {
        return "Упаковываем в пакет для одежды";
    }

}
