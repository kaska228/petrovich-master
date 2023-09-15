package org.example;


import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

import java.sql.*;

public class Results {



    public static String resulttest(String chatId) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/telegram-bot", "root", "yiPDmV6d75");

            String query = "SELECT test1, test2, test3, test4, test5, test6, test7, test8, test9 FROM user WHERE idtg = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, chatId);
            ResultSet resultSet = stmt.executeQuery();

            String messageText = "";

            if (resultSet.next()) {

                String[] testTitles = {
                        "Работа на складе",
                        "Внешний вид",
                        "Взаимодействие с ТМЦ",
                        "Водитель на смене",
                        "Подъём",
                        "Доставка",
                        "Взаимодействие с клиентом",
                        "Взаимодействие с СТЦ",
                        "Возврат товара"
                };

                String[] testResults = new String[9];
                testResults[0] = resultSet.getString("test1");
                testResults[1] = resultSet.getString("test2");
                testResults[2] = resultSet.getString("test3");
                testResults[3] = resultSet.getString("test4");
                testResults[4] = resultSet.getString("test5");
                testResults[5] = resultSet.getString("test6");
                testResults[6] = resultSet.getString("test7");
                testResults[7] = resultSet.getString("test8");
                testResults[8] = resultSet.getString("test9");

                // ... (по аналогии для остальных тестов)

                // Формирование сообщения для отправки в телеграм
                StringBuilder messageTextBuilder = new StringBuilder("Результаты тестов:\n\n");

                for (int i = 0; i < testResults.length; i++) {
                    String testValue = formatTestResult(testResults[i]);
                    messageTextBuilder.append("Тест \"").append(testTitles[i]).append("\": ").append(testValue).append("\n");
                }

                messageText = messageTextBuilder.toString();

                SendMessage message = new SendMessage();
                message.setChatId(chatId);
                message.setText(messageText);

                // Отправка сообщения в телеграм
                // здесь нужно использовать экземпляр TelegramBot или TelegramBotAPI для отправки сообщения
                // например: bot.execute(message);


            }

            return messageText;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
// ...

    private static String formatTestResult(String testValue) {
        if (testValue != null && !testValue.isEmpty()) {
            try {
                int value = Integer.parseInt(testValue.replaceAll("[^0-9]", ""));
                return value + "%" + (value >= 80 ? "✅" : "❌");
            } catch (NumberFormatException e) {
                // Обработка ошибок парсинга числа, например, если строка содержит символы.
            }
        }
        return "❌";
    }
        
    }





