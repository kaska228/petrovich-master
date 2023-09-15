package org.example;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Storage {


    public void sendMessageWithBoldText(long chatId, String text) {
        SendMessage message = new SendMessage();
        message.setChatId(Long.toString(chatId));
        message.setText("**" + text + "**");
        message.setParseMode("MarkdownV2");

        execute(message);
    }

    private void execute(SendMessage message) {
        // Ваша логика выполнения отправки сообщения
    }

    public String bl1() {
        String data = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            String query = "SELECT * FROM block WHERE id_block = ?";
            int id = 1;
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

            if (resultSet.next()) {
                String theory = resultSet.getString("theory");
                String formattedText = theory.replaceAll("(?i)Работа на складе", "*Работа на складе*")
                        .replaceAll("``не более 5 км/ч.", "*не более 5 км/ч.*")
                        .replaceAll("(?i)после погрузки несёт ответственность за качество загруженного товара!", "*после погрузки несёт ответственность за качество загруженного товара!*");
                data = formattedText;
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return data;
    }

    public String bl2() {
        String data = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            String query = "SELECT * FROM block WHERE id_block = ?";
            int id = 2;
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();


            if (resultSet.next()) {
                String theory = resultSet.getString("theory");
                String formattedText = theory.replaceAll("(?i)Внешний вид", "*Внешний вид*")
                        .replaceAll("(?i)обязательно ношение сигнального жилета с логотипом компании.", "*обязательно ношение сигнального жилета с логотипом компании.*");
                data = formattedText;
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //data = replaceEmojis(data);

        return data;

    }

    public String bl3() {
        String data = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            String query = "SELECT * FROM block WHERE id_block = ?";
            int id = 3;
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

            if (resultSet.next()) {
                String theory = resultSet.getString("theory");
                String formattedText = theory.replaceAll("(?i)Взаимодействие с ТМЦ", "*Взаимодействие с ТМЦ*")
                        .replaceAll("(?i)это запрещено", "*это запрещено*")
                        .replaceAll("(?i)Будьте ответственными!", "*Будьте ответственными!*")
                        .replaceAll("(?i)категорически запрещён.", "*категорически запрещён.*");
                data = formattedText;
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
      //  data = replaceEmojis(data);

        return data;

    }



    public String bl4() {
        String data = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            String query = "SELECT * FROM block WHERE id_block = ?";
            int id = 4;
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

            if (resultSet.next()) {
                String theory = resultSet.getString("theory");
                String formattedText = theory.replaceAll("(?i)Водитель на смене", "*Водитель на смене*")
                        .replaceAll("(?i)ношение бейджа водителем является обязательным.", "*ношение бейджа водителем является обязательным.*")
                        .replaceAll("(?i)после погрузки", "*после погрузки*")
                        .replaceAll("(?i)только на русском языке", "*только на русском языке*")
                        .replaceAll("(?i)Внимательно читайте комментарии к заказу!", "*Внимательно читайте комментарии к заказу!*")
                        .replaceAll("(?i)В вопросах касающихся денег необходимо быть особенно внимательным.", "*В вопросах касающихся денег необходимо быть особенно внимательным.*")
                        .replaceAll("(?i)обязательной к выполнению", "*обязательной к выполнению*")
                        .replaceAll("(?i)Категорически запрещено уезжать домой с выручкой!", "*Категорически запрещено уезжать домой с выручкой!*");
                data = formattedText;
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
     //   data = replaceEmojis(data);
        return data;

    }

    public String bl5() {
        String data = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            String query = "SELECT * FROM block WHERE id_block = ?";
            int id = 5;
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

            if (resultSet.next()) {
                String theory = resultSet.getString("theory");
                String formattedText = theory.replaceAll("(?i)Подъём", "*Подъём*")
                        .replaceAll("(?i)клиент не спускается к машине", "*клиент не спускается к машине*");
                data = formattedText;
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
      //  data = replaceEmojis(data);
        return data;

    }


    public String bl6() {
        String data = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            String query = "SELECT * FROM block WHERE id_block = ?";
            int id = 6;
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

            if (resultSet.next()) {
                String theory = resultSet.getString("theory");
                String formattedText = theory.replaceAll("(?i)Доставка", "*Доставка*")
                        .replaceAll("(?i)водитель принимает самостоятельное решение об изменении", "*водитель принимает самостоятельное решение об изменении*")
                        .replaceAll("(?i)30 минут", "_30 минут_")
                        .replaceAll("(?i)15 минут", "_15 минут_")
                        .replaceAll("(?i)5 минут", "_5 минут_")
                        .replaceAll("(?i)Не нарушайте принципы работы с кассовым оборудованием и денежными средствами.", "*Не нарушайте принципы работы с кассовым оборудованием и денежными средствами.*")
                        .replaceAll("(?i)сразу после выполнения рейса.", "*сразу после выполнения рейса.*");
                data = formattedText;
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
       // data = replaceEmojis(data);
        return data;
    }


    public String bl7() {
        String data = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            String query = "SELECT * FROM block WHERE id_block = ?";
            int id = 7;
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

            if (resultSet.next()) {
                String theory = resultSet.getString("theory");
                String formattedText = theory.replaceAll("(?i)Взаимодействие с клиентом", "*Взаимодействие с клиентом*")

                        .replaceAll("(?i)не нужно звонить клиенту и просить принять доставку раньше.", "*не нужно звонить клиенту и просить принять доставку раньше.*")
                        .replaceAll("(?i)«ПАСПОРТА+СЕРТИФИКАТЫ»", "_«ПАСПОРТА+СЕРТИФИКАТЫ»_")
                        .replaceAll("(?i)Не забывайте брать для клиента с базы рекламные листовок Петрович-Медиа.", "*Не забывайте брать для клиента с базы рекламные листовок Петрович-Медиа.*");

                data = formattedText;
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
       // data = replaceEmojis(data);
        return data;
    }

    public String bl8() {
        String data = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            String query = "SELECT * FROM block WHERE id_block = ?";
            int id = 8;
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

            if (resultSet.next()) {
                String theory = resultSet.getString("theory");
                String formattedText = theory.replaceAll("(?i)Взаимодействие с СТЦ", "*Взаимодействие с СТЦ*")
                        .replaceAll("(?i)в кассе СТЦ.", "*в кассе СТЦ.*")
                        .replaceAll("(?i)«Распечатать закрывающие документы по РТИУ №…»", "_«Распечатать закрывающие документы по РТИУ №…»_");


                data = formattedText;
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
      //  data = replaceEmojis(data);
        return data;
    }
    public String bl9() {
        String data = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            String query = "SELECT * FROM block WHERE id_block = ?";
            int id = 9;
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

            if (resultSet.next()) {
                String theory = resultSet.getString("theory");
                String formattedText = theory.replaceAll("(?i)Возврат товара", "*Возврат товара*")
                        .replaceAll("(?i) нужно отправить информацию в чат телеграмм-канала по взаимодействию при возврате", "* нужно отправить информацию в чат телеграмм-канала по взаимодействию при возврате*");


                data = formattedText;
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
      //  data = replaceEmojis(data);
        return data;
    }
}
