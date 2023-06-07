/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factories;

import characters.Player;
import characters.SonyaBlade;

/**
 * Класс для создания вражеского персонажа
 * @author Мария
 */
public class SonyaBladeFabric implements EnemyFabricInterface {
    /**
     * Создание вражеского персонажа 
     */
    @Override
    public Player create() {
        Player enemy;
        enemy = new SonyaBlade(1, 80, 16, 1);
        return enemy;
    }
}