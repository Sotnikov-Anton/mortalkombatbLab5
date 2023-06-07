/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mephi.lab_5;

import characters.Player;
import characters.Human;
import javax.swing.*;

/**
 * Класс для изменения текста в окне игры JFrame
 * @author Мария
 */
public class ChangeTexts {
    /**
     * Метод обновления текста для нового раунда
     * @param human Игрок
     * @param enemy Противник
     * @param pr1 Полоска здоровья игрока
     * @param pr2 Полоска здоровья противника@param label4 Надпись о победе с попаданием в топ-10
     * @param label Надпись с количеством очков
     * @param label2 Надпись с количеством опыта
     * @param label3 Надпись с уровнем игрока
     * @param label4 Надпись с уровнем противника
     * @param label5 Надпись с количеством здоровья игрока
     * @param label6 Надпись с количеством здоровья противника
     * @param label7 Надпись с велчиной урона от удара игрока
     * @param label8 Надпись о том, чей сейчас ход
     * @param label9 Надпись о том, что произошло в бою
     * @param items Предметы в мешке
     * @param rb1 Кнопка, соответствующая малому зелью из мешка
     * @param rb2 Кнопка, соответствующая большому зелью из мешка
     * @param rb3 Кнопка, соответствующая кресту возрождения из мешка
     */
    public void newRoundTexts(Player human, Player enemy, JProgressBar pr1, JProgressBar pr2, JLabel label, JLabel label2, JLabel label3, JLabel label4,
            JLabel label5, JLabel label6, JLabel label7, JLabel label8, JLabel label9, int i, Item[] items, JRadioButton rb1, JRadioButton rb2, JRadioButton rb3) {
        label.setText(Integer.toString(((Human) human).getPoints()));
        label2.setText(Integer.toString(((Human) human).getExperience()) + "/" + ((Human) human).getNextExperience());
        label3.setText(Integer.toString(human.getLevel()) + " level");
        label4.setText(Integer.toString(enemy.getLevel()) + " level");
        label5.setText(Integer.toString(human.getMaxHealth()) + "/" + Integer.toString(human.getMaxHealth()));
        label6.setText(Integer.toString(enemy.getMaxHealth()) + "/" + Integer.toString(enemy.getMaxHealth()));
        label7.setText(Integer.toString(human.getDamage()));
        if (i % 2 == 1) {
            label8.setText("Your turn");
        }
        else{
            label8.setText(enemy.getName()+"'s turn");
        }
        bagText(items, rb1, rb2, rb3);
        label9.setText("");
    }
    /**
     * Метод обновления текста после хода игрока
     * @param human Игрок
     * @param enemy Противник
     * @param label Количество здоровья противника
     * @param label2 Количество здоровья игрока
     * @param label3 Надпись о том, чей сейчас ход
     */
    public void roundTexts(Player human, Player enemy, JLabel label, JLabel label2, int i, JLabel label3) {
        if (enemy.getHealth() >= 0) {
            label.setText(Integer.toString(enemy.getHealth()) + "/" + Integer.toString(enemy.getMaxHealth()));
        } else {
            label.setText("0/" + Integer.toString(enemy.getMaxHealth()));
        }
        if (human.getHealth() >= 0) {
            label2.setText(Integer.toString(human.getHealth()) + "/" + Integer.toString(human.getMaxHealth()));
        } else {
            label2.setText("0/" + Integer.toString(human.getMaxHealth()));
        }
        if (i % 2 == 1) {
            label3.setText("Your turn");
        }
        else{
            label3.setText(enemy.getName()+"'s turn");
        }
    }
    /**
     * Метод появления текста о чьей-либо победе в игре
     */
    public void endGameText(Human human, JLabel label){
        if(human.getWin()==12){
            label.setText("Победа на вашей стороне");
        }
        else {
            label.setText("Победа не на вашей стороне");
        }
    }
    /**
     * Метод обновления текста мешка с предметами
     * @param items Предметы в мешке
     * @param rb1 Кнопка, соответствующая малому зелью из мешка
     * @param rb2 Кнопка, соответствующая большому зелью из мешка
     * @param rb3 Кнопка, соответствующая кресту возрождения из мешка
     */
    public void bagText(Item[] items, JRadioButton rb1, JRadioButton rb2, JRadioButton rb3){
        rb1.setText(items[0].getName() + ", " + items[0].getAmount() + " шт");
        rb2.setText(items[1].getName() + ", " + items[1].getAmount() + " шт");
        rb3.setText(items[2].getName() + ", " + items[2].getAmount() + " шт");
    }
}