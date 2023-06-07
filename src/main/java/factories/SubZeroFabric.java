/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factories;

import characters.Player;
import characters.SubZero;

/**
 * Класс для создания вражеского персонажа
 * @author Мария
 */
public class SubZeroFabric implements EnemyFabricInterface {
    /**
     * Создание вражеского персонажа 
     */
    @Override
    public Player create() {
        Player enemy;
        enemy = new SubZero(1, 60, 16, 1);
        return enemy;
    }
}