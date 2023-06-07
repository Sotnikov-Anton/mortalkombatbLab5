/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package factories;

import characters.Player;

/**
 * Интерфейс для создания персонажей противника
 * @author Мария
 */
public interface EnemyFabricInterface {
    public Player create();
}
