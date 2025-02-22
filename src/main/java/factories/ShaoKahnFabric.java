/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factories;

import characters.Player;
import characters.ShaoKahn;

/**
 * Класс для создания вражеского персонажа
 * @author Мария
 */
public class ShaoKahnFabric implements EnemyFabricInterface{
    /**
     * Создание босса 
     */
    @Override
    public Player create() {
        return new ShaoKahn(3, 100, 30, 1);
    }
    /**
     * Создание босса 
     */
    public Player create(int i) {
        return new ShaoKahn(3, 145, 44, 1);
    }
}