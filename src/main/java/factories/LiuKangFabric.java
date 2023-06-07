/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factories;

import characters.LiuKang;
import characters.Player;

/**
 * Класс для создания вражеского персонажа
 * @author Мария
 */
public class LiuKangFabric implements EnemyFabricInterface {
    /**
     * Создание вражеского персонажа 
     */
    @Override
    public Player create() {
        Player enemy;
        enemy = new LiuKang(1, 70, 20, 1);
        return enemy;
    }
}