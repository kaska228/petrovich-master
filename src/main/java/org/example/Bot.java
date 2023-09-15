package org.example;

import Pac.ITOGOVIY.*;
import Rating.*;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.DeleteMessage;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import java.util.*;
import java.sql.*;


public class Bot extends TelegramLongPollingBot {
    final private Map<Long, Map<String, Object>> storeAnswer = new HashMap<>();

    final private String BOT_TOKEN = "5939732905:AAHoRyXwKl72QsLuNfbGkOsatGIldJwl3gQ";
    final private String BOT_NAME = "whyuscaredBot";

    private Set<String> allowedUserNumbers;
    Map<Long, Integer> userCurrentQuestions = new HashMap<>();
    Map<Long, Integer> correctitog = new HashMap<>();


    // Ваш существующий метод для получения случайного вопроса из базы данных

    TreeMap<String, String> questionAndAnswer = Itogoviy.getQuestionAndAnswer();
    TreeMap<String, String> questionAndAnswer2 = Itogoviy.getQuestionAndAnswer2();
    TreeMap<String, String> questionAndAnswer3 = Itogoviy.getQuestionAndAnswer3();
    TreeMap<String, String> questionAndAnswer4 = Itogoviy.getQuestionAndAnswer4();
    TreeMap<String, String> questionAndAnswer5 = Itogoviy.getQuestionAndAnswer5();
    TreeMap<String, String> questionAndAnswer6 = Itogoviy.getQuestionAndAnswer6();
    TreeMap<String, String> questionAndAnswer7 = Itogoviy.getQuestionAndAnswer7();
    TreeMap<String, String> questionAndAnswer8 = Itogoviy.getQuestionAndAnswer8();
    TreeMap<String, String> questionAndAnswer9 = Itogoviy.getQuestionAndAnswer9();
    TreeMap<String, String> questionAndAnswer10 = Itogoviy.getQuestionAndAnswer10();
    TreeMap<String, String> questionAndAnswer11 = Itogoviy.getQuestionAndAnswer11();
    TreeMap<String, String> questionAndAnswer12 = Itogoviy.getQuestionAndAnswer12();
    TreeMap<String, String> questionAndAnswer13 = Itogoviy.getQuestionAndAnswer13();
    TreeMap<String, String> questionAndAnswer14 = Itogoviy.getQuestionAndAnswer14();
    TreeMap<String, String> questionAndAnswer15 = Itogoviy.getQuestionAndAnswer15();
    TreeMap<String, String> questionAndAnswer16 = Itogoviy.getQuestionAndAnswer16();
    TreeMap<String, String> questionAndAnswer17 = Itogoviy.getQuestionAndAnswer17();
    TreeMap<String, String> questionAndAnswer18 = Itogoviy.getQuestionAndAnswer18();
    TreeMap<String, String> questionAndAnswer19 = Itogoviy.getQuestionAndAnswer19();
    TreeMap<String, String> questionAndAnswer20 = Itogoviy.getQuestionAndAnswer20();




    private String fdb1;
    private String scoreMessage;
    private String fdb2;
    private String fdb3;
    private String fdb4;
    private String fdb5;
    private String fdb6;
    private String fdb7;
    private String fdb8;
    private String fdb9;
    private String fdb10;

    QuestionData questionData = Itogoviy.getRandomQuestionFromDatabase();
    QuestionData2 questionData2 = Itogoviy.getRandomQuestionFromDatabase2();
    QuestionData3 questionData3 = Itogoviy.getRandomQuestionFromDatabase3();
    QuestionData4 questionData4 = Itogoviy.getRandomQuestionFromDatabase4();
    QuestionData5 questionData5 = Itogoviy.getRandomQuestionFromDatabase5();
    QuestionData6 questionData6 = Itogoviy.getRandomQuestionFromDatabase6();
    QuestionData7 questionData7 = Itogoviy.getRandomQuestionFromDatabase7();
    QuestionData8 questionData8 = Itogoviy.getRandomQuestionFromDatabase8();
    QuestionData9 questionData9 = Itogoviy.getRandomQuestionFromDatabase9();
    QuestionData10 questionData10 = Itogoviy.getRandomQuestionFromDatabase10();
    QuestionData11 questionData11 = Itogoviy.getRandomQuestionFromDatabase11();
    QuestionData12 questionData12 = Itogoviy.getRandomQuestionFromDatabase12();
    QuestionData13 questionData13 = Itogoviy.getRandomQuestionFromDatabase13();
    QuestionData14 questionData14 = Itogoviy.getRandomQuestionFromDatabase14();
    QuestionData15 questionData15 = Itogoviy.getRandomQuestionFromDatabase15();
    QuestionData16 questionData16 = Itogoviy.getRandomQuestionFromDatabase16();
    QuestionData17 questionData17 = Itogoviy.getRandomQuestionFromDatabase17();
    QuestionData18 questionData18 = Itogoviy.getRandomQuestionFromDatabase18();
    QuestionData19 questionData19 = Itogoviy.getRandomQuestionFromDatabase19();
    QuestionData20 questionData20 = Itogoviy.getRandomQuestionFromDatabase20();
    String result1001 = questionData.result1001;
    String result1002 = questionData2.result1002;
    String result1003 = questionData3.result1003;
    String result1004 = questionData4.result1004;
    String result1005 = questionData5.result1005;
    String result1006 = questionData6.result1006;
    String result1007 = questionData7.result1007;
    String result1008 = questionData8.result1008;
    String result1009 = questionData9.result1009;
    String result1010 = questionData10.result1010;
    String result1011 = questionData11.result1011;
    String result1012 = questionData12.result1012;
    String result1013 = questionData13.result1013;
    String result1014 = questionData14.result1014;
    String result1015 = questionData15.result1015;
    String result1016 = questionData16.result1016;
    String result1017 = questionData17.result1017;
    String result1018 = questionData18.result1018;
    String result1019 = questionData19.result1019;
    String result1020 = questionData20.result1020;




    Storage storage;
    Test1 readExcelFile1;
    Test2 readExcelFile2;
    Test3 readExcelFile3;
    Test4 readExcelFile4;
    Test5 readExcelFile5;
    Test6 readExcelFile6;
    Test7 readExcelFile7;
    Test8 readExcelFile8;
    Test9 readExcelFile9;
    Itogoviy readExcelFile10;

    Itog readExcelFile11;

    Results results;
    Test1 ts1 = new Test1();
    Test2 ts2 = new Test2();
    Test3 ts3 = new Test3();
    Test4 ts4 = new Test4();
    Test5 ts5 = new Test5();
    Test6 ts6 = new Test6();
    Test7 ts7 = new Test7();
    Test8 ts8 = new Test8();
    Test9 ts9 = new Test9();




    String result1 = ts1.b1q1();
    String result2 = ts1.b1q2();
    String result3 = ts1.b1q3();
    String result4 = ts1.b1q4();
    String result5 = ts1.b1q5();
    String result6 = ts1.b1q6();
    String result7 = ts1.b1q7();
    String result8 = ts1.b1q8();
    String result9 = ts1.b1q9();
    String result10 = ts1.b1q10();
    String result11 = ts1.b1q11();
    String result12 = ts1.b1q12();
    String result21 = ts2.b2q1();
    String result22 = ts2.b2q2();
    String result23 = ts2.b2q3();
    String result24 = ts2.b2q4();
    String result25 = ts2.b2q5();
    String result26 = ts2.b2q6();

    String result31 = ts3.b3q1();
    String result32 = ts3.b3q2();
    String result33 = ts3.b3q3();
    String result34 = ts3.b3q4();
    String result35 = ts3.b3q5();

    String result401 = ts4.b4q1();
    String result402 = ts4.b4q2();
    String result403 = ts4.b4q3();
    String result404 = ts4.b4q4();
    String result405 = ts4.b4q5();
    String result406 = ts4.b4q6();
    String result407 = ts4.b4q7();
    String result408 = ts4.b4q8();
    String result409 = ts4.b4q9();
    String result410 = ts4.b4q10();
    String result411 = ts4.b4q11();
    String result412 = ts4.b4q12();
    String result413 = ts4.b4q13();
    String result414 = ts4.b4q14();
    String result415 = ts4.b4q15();
    String result416 = ts4.b4q16();


    String result501 = ts5.b5q1();
    String result502 = ts5.b5q2();
    String result503 = ts5.b5q3();
    String result504 = ts5.b5q4();
    String result505 = ts5.b5q5();
    String result506 = ts5.b5q6();
    String result507 = ts5.b5q7();
    String result508 = ts5.b5q8();
    String result509 = ts5.b5q9();


    String result601 = ts6.b6q1();
    String result602 = ts6.b6q2();
    String result603 = ts6.b6q3();
    String result604 = ts6.b6q4();
    String result605 = ts6.b6q5();
    String result606 = ts6.b6q6();
    String result607 = ts6.b6q7();
    String result608 = ts6.b6q8();
    String result609 = ts6.b6q9();
    String result610 = ts6.b6q10();
    String result611 = ts6.b6q11();
    String result612 = ts6.b6q12();
    String result613 = ts6.b6q13();
    //String result614 = ts6.b6q14();
    String result701 = ts7.b7q1();
    String result702 = ts7.b7q2();
    String result703 = ts7.b7q3();
    String result704 = ts7.b7q4();
    String result705 = ts7.b7q5();
    String result706 = ts7.b7q6();
    String result707 = ts7.b7q7();
    String result708 = ts7.b7q8();
    String result709 = ts7.b7q9();
    String result710 = ts7.b7q10();
    String result711 = ts7.b7q11();
    String result712 = ts7.b7q12();
    String result713 = ts7.b7q13();
    String result714 = ts7.b7q14();
    String result715 = ts7.b7q15();
    String result716 = ts7.b7q16();
    String result717 = ts7.b7q17();
    String result718 = ts7.b7q18();
    String result719 = ts7.b7q19();
    String result720 = ts7.b7q20();


    String result802 = ts8.b8q2();
    String result803 = ts8.b8q3();
    String result804 = ts8.b8q4();
    String result805 = ts8.b8q5();
    String result806 = ts8.b8q6();
    String result807 = ts8.b8q7();
    String result808 = ts8.b8q8();
    String result809 = ts8.b8q9();

    String result901 = ts9.b9q1();
    String result902 = ts9.b9q2();
    String result903 = ts9.b9q3();
    String result904 = ts9.b9q4();
    String result905 = ts9.b9q5();
    String result906 = ts9.b9q6();





    Bot() {


        storage = new Storage();


        readExcelFile1 = new Test1();

        readExcelFile2 = new Test2();
        readExcelFile3 = new Test3();
        readExcelFile4 = new Test4();
        readExcelFile5 = new Test5();
        readExcelFile6 = new Test6();
        readExcelFile7 = new Test7();
        readExcelFile8 = new Test8();
        readExcelFile9 = new Test9();
        readExcelFile10 = new Itogoviy();
        readExcelFile11 = new Itog();
        results = new Results();


    }


    @Override
    public String getBotToken() {
        return BOT_TOKEN;
    }

    @Override
    public String getBotUsername() {
        return BOT_NAME;
    }


    private static final String TEORY_TEXT = "\uD83E\uDDD1\u200D\uD83C\uDF93Теория";
    private static final String TEST_TEXT = "✏\uFE0FТесты";
    private static final String REZZZ = "\uD83C\uDF1FМои успехи";
    private static final String ITOG = "\uD83D\uDCDDИтоговый тест";


    private void deleteMessage(long chatId, long messageId) {


        DeleteMessage deleteMessage = new DeleteMessage(String.valueOf(chatId), (int) messageId);
        try {
            execute(deleteMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }







    public Message sendMessage(long chatId, String text) {

        SendMessage message = new SendMessage(Long.toString(chatId), text);
        message.setParseMode("Markdown");
        try {

            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
        return null;
    }


    private boolean isValidPhoneNumber(String phoneNumber) {
        // Удаление всех символов, кроме цифр, из номера телефона
        String cleanedNumber = phoneNumber.replaceAll("[^\\d]", "");

        // Проверка наличия обязательных элементов номера телефона
        if (cleanedNumber.length() >= 10) {
            // Номер имеет достаточную длину для определенного формата
            return true;
        }

        return false;
    }

    public boolean isPhoneNumberAllowed(String phoneNumber) {
        boolean allowed = false;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/telegram-bot", "root", "yiPDmV6d75");

            if (isValidPhoneNumber(phoneNumber)) {
                String cleanedNumber = phoneNumber.replaceAll("[^\\d]", "");

                String query = "SELECT COUNT(*) AS count FROM user WHERE number = ?";
                PreparedStatement stmt = con.prepareStatement(query);
                stmt.setString(1, cleanedNumber);
                ResultSet resultSet = stmt.executeQuery();

                if (resultSet.next()) {
                    int count = resultSet.getInt("count");
                    allowed = (count > 0);
                }
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return allowed;
    }

    public boolean validatePhoneNumber(String phoneNumber) {
        // Удалите все символы, кроме цифр, из номера телефона
        String digitsOnly = phoneNumber.replaceAll("\\D", "");

        // Проверяем, соответствует ли номер формату 7...
        return digitsOnly.matches("^7\\d{10}$");
    }

    private void checkPhoneNumberInDatabase(String phoneNumber, String idtg) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://37.143.15.239:3306/telegram-bot", "root", "yiPDmV6d75");

            // Проверяем, существует ли уже запись с указанным номером телефона
            String checkQuery = "SELECT * FROM user WHERE number = ?";
            PreparedStatement checkStmt = con.prepareStatement(checkQuery);
            checkStmt.setString(1, phoneNumber);
            ResultSet resultSet = checkStmt.executeQuery();

            if (resultSet.next()) {
                // Запись с указанным номером телефона уже существует, выполняем обновление данных
                String updateQuery = "UPDATE user SET idtg = ? WHERE number = ?";
                PreparedStatement updateStmt = con.prepareStatement(updateQuery);

                updateStmt.setString(1, String.valueOf(idtg));
                updateStmt.setString(2, phoneNumber);
                int rowsAffected = updateStmt.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Данные успешно обновлены");
                } else {
                    System.out.println("Не удалось обновить данные");
                }
            } else {
                // Запись с указанным номером телефона не существует, выполняем вставку новой записи
                String insertQuery = "INSERT INTO user (number, idtg) VALUES (?, ?)";
                PreparedStatement insertStmt = con.prepareStatement(insertQuery);
                insertStmt.setString(1, phoneNumber);
                insertStmt.setString(2, String.valueOf(idtg));
                int rowsAffected = insertStmt.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Данные успешно записаны в таблицу");
                } else {
                    System.out.println("Не удалось записать данные в таблицу");
                }
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }


    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && (update.getMessage().hasText() || update.getMessage().hasContact())) {
            String messageText = update.getMessage().getText();
            String messageId = String.valueOf(update.getMessage().getMessageId());
            long chatId = update.getMessage().getChatId();

            // Проверяем, отправлен ли контакт
            if (update.getMessage().hasContact()) {
                String phoneNumber = update.getMessage().getContact().getPhoneNumber();
                String idtg = String.valueOf(update.getMessage().getContact().getUserId());

                // Удаляем символы "+" и пробелы из номера телефона
                phoneNumber = phoneNumber.replace("+", "").replaceAll("\\s+", "");

                // Если номер телефона начинается с "7" и имеет 11 цифр, считаем его валидным
                if (phoneNumber.matches("^7\\d{10}$")) {
                    // Удаляем первую цифру "7" из номера телефона
                    String phoneNumberWithoutPlus = phoneNumber.substring(1);

                    // Выводим полученное сообщение в консоль
                    System.out.println("Получено сообщение с номером телефона: " + phoneNumber);

                    // Проверяем валидность номера телефона
                    boolean isValidPhoneNumber = validatePhoneNumber(phoneNumber);

                    if (isValidPhoneNumber) {
                        // Проверяем, разрешен ли номер телефона
                        boolean isPhoneNumberAllowed = isPhoneNumberAllowed(phoneNumber);

                        if (isPhoneNumberAllowed) {
                            // Записываем номер телефона и idtg в базу данных
                            try {
                                Class.forName("com.mysql.cj.jdbc.Driver");
                                Connection con = DriverManager.getConnection("jdbc:mysql://37.143.15.239:3306/telegram-bot", "root", "yiPDmV6d75");

                                // Проверяем, существует ли уже запись с указанным номером телефона
                                String checkQuery = "SELECT * FROM user WHERE number = ?";
                                PreparedStatement checkStmt = con.prepareStatement(checkQuery);
                                checkStmt.setString(1, phoneNumber);
                                ResultSet resultSet = checkStmt.executeQuery();

                                if (resultSet.next()) {
                                    // Запись с указанным номером телефона уже существует, выполняем обновление данных
                                    String updateQuery = "UPDATE user SET idtg = ? WHERE number = ?";
                                    PreparedStatement updateStmt = con.prepareStatement(updateQuery);

                                    updateStmt.setString(1, String.valueOf(idtg));
                                    updateStmt.setString(2, phoneNumber);
                                    int rowsAffected = updateStmt.executeUpdate();

                                    if (rowsAffected > 0) {
                                        System.out.println("Данные успешно обновлены");
                                    } else {
                                        System.out.println("Не удалось обновить данные");
                                    }
                                } else {
                                    // Запись с указанным номером телефона не существует, выполняем вставку новой записи
                                    String updateQuery = "UPDATE user SET idtg = ? WHERE number = ?";
                                    PreparedStatement updateStmt = con.prepareStatement(updateQuery);
                                    updateStmt.setString(1, String.valueOf(idtg));
                                    updateStmt.setString(2, phoneNumber);
                                    int rowsAffected = updateStmt.executeUpdate();

                                    if (rowsAffected > 0) {
                                        System.out.println("Данные успешно обновлены");
                                    } else {
                                        System.out.println("Не удалось обновить данные");
                                    }
                                }

                                con.close();
                            } catch (Exception e) {
                                System.out.println(e);
                            }

                            // Обработка разрешенного случая
                            String startMessage = "Готово!\n";
                            try {
                                Class.forName("com.mysql.cj.jdbc.Driver");
                                Connection con = DriverManager.getConnection(
                                        "jdbc:mysql://37.143.15.239:3306/telegram-bot", "root", "yiPDmV6d75");

                                String query = "SELECT FIO FROM user WHERE idtg = ?";
                                PreparedStatement stmt = con.prepareStatement(query);
                                stmt.setString(1, String.valueOf(chatId));
                                ResultSet resultSet = stmt.executeQuery();

                                if (resultSet.next()) {
                                    String fio = resultSet.getString("FIO");
                                    startMessage += "Здравствуйте, " + fio + " Давайте начнем";
                                }

                                con.close();
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            sendMessage(chatId, startMessage);
                            sendMainMenu(chatId);

                        } else {
                            // Номер телефона не разрешен
                            sendMessage(chatId, "Доступ запрещен.\nПожалуйста, проверьте что ввели номер телефона правильно или обратитесь к старшему логисту Вашей базы.");
                        }
                    } else {
                        // Некорректный номер телефона
                        SendMessage message = new SendMessage();
                        message.setChatId(update.getMessage().getChatId());
                        message.setText("Некорректный номер телефона. Пожалуйста, отправьте правильный номер.");
                        try {
                            execute(message);
                        } catch (TelegramApiException e) {
                            e.printStackTrace();
                        }
                    }
                }

            } else if (messageText.equals("/start")) {
                // Обработка команды "/start"
                String userName = update.getMessage().getChat().getFirstName();
                String startMessage = "Добрый день!\n" +
                        "Это сервис по обучению водителей, здесь Вы можете изучить теорию для подготовки к тестированию и сразу же проверить себя.\nРезультаты также можно увидеть в этом сервисе.";

                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection(
                            "jdbc:mysql://37.143.15.239:3306/telegram-bot", "root", "yiPDmV6d75");

                    String query = "SELECT FIO FROM user WHERE idtg = ?";
                    PreparedStatement stmt = con.prepareStatement(query);
                    stmt.setString(1, String.valueOf(chatId));
                    ResultSet resultSet = stmt.executeQuery();

                    if (resultSet.next()) {
                        String fio = resultSet.getString("FIO");
                        startMessage += " ";
                    }

                    con.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                sendMessage(chatId, startMessage);
                deleteMessage(chatId, Long.parseLong(messageId));
                phone(chatId);


            }
            if (messageText.equals(TEORY_TEXT)) {
                deleteMessage(chatId, Long.parseLong(messageId));
                sendTopHeroesMessage(chatId);

            } else if (messageText.equals(TEST_TEXT)) {
                deleteMessage(chatId, Long.parseLong(messageId));
                sendTopPlayersMessage(chatId);

            } else if (messageText.equals(ITOG)) {
                deleteMessage(chatId, Long.parseLong(messageId));
                next10(chatId);

            } else if (messageText.equals(REZZZ)) {
                deleteMessage(chatId, Long.parseLong(messageId));
                rezzz(chatId);
            }


        } else if (update.hasCallbackQuery()) {
            List<String> userAnswers = null;
            if (storeAnswer.containsKey(update.getCallbackQuery().getFrom().getId())) {
                Map<String, Object> userInfo = storeAnswer.get(update.getCallbackQuery().getFrom().getId());
                userAnswers = (List<String>) userInfo.get("answers");
            } else {
                userAnswers = new ArrayList<>();
                Map<String, Object> userInfo = new HashMap<>();
                userInfo.put("answers", userAnswers);
                userInfo.put("test", update.getCallbackQuery().getData());
                storeAnswer.put(update.getCallbackQuery().getFrom().getId(), userInfo);
            }

            CallbackQuery callbackQuery = update.getCallbackQuery();
            String callbackData = callbackQuery.getData();
            long chatId = callbackQuery.getMessage().getChatId();
            long messageId = callbackQuery.getMessage().getMessageId();


            if (callbackData.equals("bl1")) {//прожатие кнопки
                String result = storage.bl1();//вызов информации
                sendMessage(chatId, result);//отправка сообщения в телеграм
                deleteMessage(chatId, messageId);//удаление ранее вызванной клавиатуры
                aftb1(chatId);

            } else if (callbackData.equals("bl2")) {

                String result = storage.bl2();
                sendMessage(chatId, result);
                deleteMessage(chatId, messageId);//удаление ранее вызванной клавиатуры
                aftb2(chatId);

            } else if (callbackData.equals("bl3")) {
                String result = storage.bl3();
                sendMessage(chatId, result);
                deleteMessage(chatId, messageId);
                aftb3(chatId);
            } else if (callbackData.equals("bl4")) {
                String result = storage.bl4();
                sendMessage(chatId, result);
                deleteMessage(chatId, messageId);
                aftb4(chatId);
            } else if (callbackData.equals("bl5")) {
                String result = storage.bl5();
                sendMessage(chatId, result);
                deleteMessage(chatId, messageId);
                aftb5(chatId);
            } else if (callbackData.equals("bl6")) {
                String result = storage.bl6();
                sendMessage(chatId, result);
                deleteMessage(chatId, messageId);
                aftb6(chatId);
            } else if (callbackData.equals("bl7")) {
                String result = storage.bl7();
                sendMessage(chatId, result);
                deleteMessage(chatId, messageId);
                aftb7(chatId);
            } else if (callbackData.equals("bl8")) {
                String result = storage.bl8();
                sendMessage(chatId, result);
                deleteMessage(chatId, messageId);
                aftb8(chatId);
            } else if (callbackData.equals("bl9")) {
                String result = storage.bl9();
                sendMessage(chatId, result);
                deleteMessage(chatId, messageId);
                aftb9(chatId);
            } else if (callbackData.equals("testrez")) {

                String result = Results.resulttest(String.valueOf(chatId));
                sendMessage(chatId, result);

                deleteMessage(chatId, messageId);

            } else if (callbackData.equals("rating")) {

                String result = String.valueOf(UserRating.getTopUsersText2(String.valueOf(chatId)));
                sendMessage(chatId, result);
                deleteMessage(chatId, messageId);
                //zatichka(chatId);

            } else if (callbackData.equals("teory")) {
                sendTopHeroesMessage(chatId);
                deleteMessage(chatId, messageId);

            } else if (callbackData.equals("test")) {
                sendTopPlayersMessage(chatId);
                deleteMessage(chatId, messageId);

            } else if (callbackData.equals("test1")) {

                next(chatId);
                deleteMessage(chatId, messageId);
            } else if (callbackData.equals("next")) {


                sendttt(chatId, result1);

                //currentQuestion = 1;
                deleteMessage(chatId, messageId);


            } else if (callbackData.equals("A") || callbackData.equals("B") || callbackData.equals("C") || callbackData.equals("D")) {
                int currentQuestion = userCurrentQuestions.getOrDefault(chatId, 1); // Получение текущего вопроса для пользователя
                switch (currentQuestion) {
                    case 1:


                        deleteMessage(chatId, messageId);

                        String userAnswer = callbackData;
                        userAnswers.add(userAnswer);

                        sendttt(chatId, result2);
                        String correctAnswer2 = readExcelFile1.getAnswerForQuestion1();
                        String response2 = "";
                        if (userAnswer.equals(correctAnswer2)) {
                            response2 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response2 = "Неправильно. Ответ на вопрос \"";
                        }
                        //sendMessage(chatId, response2);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу
                        break;

                    case 2:

                        deleteMessage(chatId, messageId);

                        String userAnswer2 = callbackData;
                        userAnswers.add(userAnswer2);
                        sendttt(chatId, result3);
                        String correctAnswer3 = readExcelFile1.getAnswerForQuestion2();
                        String response3 = "";

                        if (userAnswer2.equals(correctAnswer3)) {
                            response3 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response3 = "Неправильно. Ответ на вопрос \"";
                        }

                        //sendMessage(chatId, response3);

                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу
                        break;
                    case 3:

                        deleteMessage(chatId, messageId);
                        String userAnswer3 = callbackData;
                        userAnswers.add(userAnswer3);
                        // String question4 = readExcelFile.b1q4();
                        sendttt(chatId, result4);
                        String correctAnswer4 = readExcelFile1.getAnswerForQuestion3();
                        String response4 = "";
                        if (userAnswer3.equals(correctAnswer4)) {
                            response4 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response4 = "Неправильно. Ответ на вопрос \"";
                        }
                        //sendMessage(chatId, response4);
                        //sendMessage(chatId, question4);

                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу
                        break;

                    case 4:

                        deleteMessage(chatId, messageId);
                        String userAnswer4 = callbackData;
                        userAnswers.add(userAnswer4);
                        //String question5 = readExcelFile.b1q5();
                        sendttt(chatId, result5);
                        String correctAnswer5 = readExcelFile1.getAnswerForQuestion4();
                        String response5 = "";
                        if (userAnswer4.equals(correctAnswer5)) {
                            response5 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response5 = "Неправильно. Ответ на вопрос \"";
                        }
                        //sendMessage(chatId, response5);
                        //sendMessage(chatId, question5);

                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу
                        break;

                    case 5:

                        deleteMessage(chatId, messageId);
                        String userAnswer5 = callbackData;
                        userAnswers.add(userAnswer5);
                        // String question6 = readExcelFile.b1q6();
                        sendttt(chatId, result6);
                        String correctAnswer6 = readExcelFile1.getAnswerForQuestion5();
                        String response6 = "";
                        if (userAnswer5.equals(correctAnswer6)) {
                            response6 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response6 = "Неправильно. Ответ на вопрос \"";
                        }
                        //sendMessage(chatId, response6);
                        //sendMessage(chatId, question6);

                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу
                        break;
                    case 6:

                        deleteMessage(chatId, messageId);
                        String userAnswer6 = callbackData;
                        userAnswers.add(userAnswer6);
                        // String question7 = readExcelFile.b1q7();
                        for1(chatId, result7);
                        String correctAnswer7 = readExcelFile1.getAnswerForQuestion6();
                        String response7 = "";
                        if (userAnswer6.equals(correctAnswer7)) {
                            response7 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response7 = "Неправильно. Ответ на вопрос \"";
                        }
                        //sendMessage(chatId, response7);
                        //sendMessage(chatId, question7);

                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу
                        break;

                    case 7:

                        deleteMessage(chatId, messageId);
                        String userAnswer7 = callbackData;
                        userAnswers.add(userAnswer7);
                        //String question8 = readExcelFile.b1q8();
                        sendttt(chatId, result8);
                        String correctAnswer8 = readExcelFile1.getAnswerForQuestion7();
                        String response8 = "";
                        if (userAnswer7.equals(correctAnswer8)) {
                            response8 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response8 = "Неправильно. Ответ на вопрос \"";
                        }
                        //sendMessage(chatId, response8);
                        //sendMessage(chatId, question8);

                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу
                        break;

                    case 8:

                        deleteMessage(chatId, messageId);
                        String userAnswer8 = callbackData;
                        userAnswers.add(userAnswer8);
                        //String question9 = readExcelFile.b1q9();
                        sendttt(chatId, result9);
                        String correctAnswer9 = readExcelFile1.getAnswerForQuestion8();
                        String response9 = "";
                        if (userAnswer8.equals(correctAnswer9)) {
                            response9 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response9 = "Неправильно. Ответ на вопрос \"";
                        }
                        //sendMessage(chatId, response9);
                        //sendMessage(chatId, question9);

                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу
                        break;

                    case 9:

                        deleteMessage(chatId, messageId);
                        String userAnswer9 = callbackData;
                        userAnswers.add(userAnswer9);
                        // String question10 = readExcelFile.b1q10();
                        sendttt(chatId, result10);
                        String correctAnswer10 = readExcelFile1.getAnswerForQuestion9();
                        String response10 = "";
                        if (userAnswer9.equals(correctAnswer10)) {
                            response10 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response10 = "Неправильно. Ответ на вопрос \"";
                        }
                        //sendMessage(chatId, response10);
                        //sendMessage(chatId, question10);

                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу
                        break;

                    case 10:

                        deleteMessage(chatId, messageId);
                        String userAnswer10 = callbackData;
                        userAnswers.add(userAnswer10);
                        //String question11 = readExcelFile.b1q11();
                        sendttt(chatId, result11);
                        String correctAnswer11 = readExcelFile1.getAnswerForQuestion10();
                        String response11 = "";
                        if (userAnswer10.equals(correctAnswer11)) {
                            response11 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response11 = "Неправильно. Ответ на вопрос \"";
                        }
                        //sendMessage(chatId, response11);
                        //sendMessage(chatId, question11);

                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу
                        break;

                    case 11:

                        deleteMessage(chatId, messageId);
                        String userAnswer11 = callbackData;
                        userAnswers.add(userAnswer11);
                        //String question12 = readExcelFile.b1q12();
                        for1(chatId, result12);
                        String correctAnswer12 = readExcelFile1.getAnswerForQuestion11();

                        String response12 = "";

                        if (userAnswer11.equals(correctAnswer12)) {
                            response12 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response12 = "Неправильно. Ответ на вопрос \"";
                        }
                        //sendMessage(chatId, response12);
                        //sendMessage(chatId, question12);

                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу
                        break;

                    case 12:
                        deleteMessage(chatId, messageId);
                        String userAnswer12 = callbackData;
                        userAnswers.add(userAnswer12);
                        String correctAnswer13 = readExcelFile1.getAnswerForQuestion12();

                        String response13 = "";

                        if (userAnswer12.equals(correctAnswer13)) {
                            response13 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response13 = "Неправильно. Ответ на вопрос \"";
                        }
                        //sendMessage(chatId, response13);
                        userCurrentQuestions.remove(chatId); // Удаление состояния пользователя после завершения теста


                    default:
                        String test = (String) storeAnswer.get(update.getCallbackQuery().getFrom().getId()).get("test1");


                        String scoreMessage = calculateScore(chatId, readExcelFile1, userAnswers, test);
                        String fdb = fdb1;
                        storeAnswer.remove(update.getCallbackQuery().getFrom().getId());

                        sendMessage(chatId, scoreMessage);

                        //double percentage = 80.0;
                        //sendcreateButtonsByPercentage(chatId, percentage);


                        try {
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            Connection con = DriverManager.getConnection(
                                    "jdbc:mysql://37.143.15.239:3306/telegram-bot", "root", "yiPDmV6d75");

                            String idtg = String.valueOf(chatId);

                            System.out.println("idtg: " + idtg);
                            // Проверяем, существует ли уже запись с указанным idtg
                            String checkQuery = "SELECT * FROM user WHERE idtg = ?";
                            PreparedStatement checkStmt = con.prepareStatement(checkQuery);
                            checkStmt.setString(1, String.valueOf(idtg));
                            ResultSet resultSet = checkStmt.executeQuery();

                            if (resultSet.next()) {
                                // Запись с указанным idtg уже существует, выполняем обновление данных
                                String updateQuery = "UPDATE user SET test1 = ? WHERE idtg = ?";
                                PreparedStatement updateStmt = con.prepareStatement(updateQuery);
                                updateStmt.setString(1, fdb1);
                                updateStmt.setString(2, String.valueOf(idtg));
                                int rowsAffected = updateStmt.executeUpdate();

                                if (rowsAffected > 0) {
                                    System.out.println("Данные успешно обновлены");
                                    aftt1(chatId); // Вызываем метод после успешного обновления данных
                                } else {
                                    System.out.println("Не удалось обновить данные");
                                }
                            } else {
                                // Запись с указанным idtg не существует, ничего не делаем
                                System.out.println("Нет записи с указанным idtg");
                            }

                            con.close();
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                        //results.test1(filePath, scoreMessage,  );

                        // Запись значения fdb1 в базу данных


                        userCurrentQuestions.remove(chatId); // Удаление состояния пользователя после завершения теста

                        break;
                }
            }
            if (callbackData.equals("test2")) {// TEST2 22222222222222222222222222222222222222222222222222222222222222222222222222222222222222222222
                next2(chatId);
                deleteMessage(chatId, messageId);
            } else if (callbackData.equals("next2")) {


                for2(chatId, result21);

                //currentQuestion = 1;
                deleteMessage(chatId, messageId);


            } else if (callbackData.equals("A2") || callbackData.equals("B2") || callbackData.equals("C2") || callbackData.equals("D2")) {
                int currentQuestion = userCurrentQuestions.getOrDefault(chatId, 1);

                switch (currentQuestion) {
                    case 1:


                        deleteMessage(chatId, messageId);

                        String userAnswer21 = callbackData;
                        userAnswers.add(userAnswer21);

                        for2(chatId, result22);
                        String correctAnswer2 = ts2.t2a1();
                        String response2 = "";
                        if (userAnswer21.equals(correctAnswer2)) {
                            response2 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response2 = "Неправильно. Ответ на вопрос \"";
                        }
                        // sendMessage(chatId, response2);


                        userCurrentQuestions.put(chatId, currentQuestion + 1);

                        break;

                    case 2:

                        deleteMessage(chatId, messageId);

                        String userAnswer22 = callbackData;
                        userAnswers.add(userAnswer22);
                        //String question3 = readExcelFile.b1q3();
                        ttt2(chatId, result23);
                        String correctAnswer3 = ts2.t2a2();
                        String response3 = "";

                        if (userAnswer22.equals(correctAnswer3)) {
                            response3 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response3 = "Неправильно. Ответ на вопрос \"";
                        }

                        // sendMessage(chatId, response3);
                        //sendMessage(chatId, question3);

                        userCurrentQuestions.put(chatId, currentQuestion + 1);

                        break;
                    case 3:

                        deleteMessage(chatId, messageId);
                        String userAnswer23 = callbackData;
                        userAnswers.add(userAnswer23);
                        ttt2(chatId, result24);
                        String correctAnswer4 = ts2.t2a3();
                        String response4 = "";
                        if (userAnswer23.equals(correctAnswer4)) {
                            response4 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response4 = "Неправильно. Ответ на вопрос \"";
                        }
                        // sendMessage(chatId, response4);
                        //sendMessage(chatId, question4);

                        userCurrentQuestions.put(chatId, currentQuestion + 1);

                        break;

                    case 4:

                        deleteMessage(chatId, messageId);
                        String userAnswer24 = callbackData;
                        userAnswers.add(userAnswer24);
                        //String question5 = readExcelFile.b1q5();
                        ttt2(chatId, result25);
                        String correctAnswer5 = ts2.t2a4();
                        String response5 = "";
                        if (userAnswer24.equals(correctAnswer5)) {
                            response5 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response5 = "Неправильно. Ответ на вопрос \"";
                        }
                        // sendMessage(chatId, response5);
                        //sendMessage(chatId, question5);

                        userCurrentQuestions.put(chatId, currentQuestion + 1);

                        break;

                    case 5:

                        deleteMessage(chatId, messageId);
                        String userAnswer25 = callbackData;
                        userAnswers.add(userAnswer25);
                        // String question6 = readExcelFile.b1q6();
                        ttt2(chatId, result26);
                        String correctAnswer6 = ts2.t2a5();
                        String response6 = "";
                        if (userAnswer25.equals(correctAnswer6)) {
                            response6 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response6 = "Неправильно. Ответ на вопрос \"";
                        }
                        //sendMessage(chatId, response6);
                        //sendMessage(chatId, question6);

                        userCurrentQuestions.put(chatId, currentQuestion + 1);

                        break;

                    case 6:

                        deleteMessage(chatId, messageId);
                        String userAnswer26 = callbackData;
                        userAnswers.add(userAnswer26);
                        String correctAnswer13 = ts2.t2a6();

                        String response13 = "";

                        if (userAnswer26.equals(correctAnswer13)) {
                            response13 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response13 = "Неправильно. Ответ на вопрос \"";
                        }
                        // sendMessage(chatId, response13);
                        userCurrentQuestions.remove(chatId);


                    default:
                        String test = (String) storeAnswer.get(update.getCallbackQuery().getFrom().getId()).get("test");

                        String scoreMessage = calculateScore2(chatId, readExcelFile2, userAnswers, test);

                        storeAnswer.remove(update.getCallbackQuery().getFrom().getId());
                        sendMessage(chatId, scoreMessage);


                        //////СЮЮЮЮЮДААААААААААААААААА


                        try {
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            Connection con = DriverManager.getConnection(
                                    "jdbc:mysql://37.143.15.239:3306/telegram-bot", "root", "yiPDmV6d75");

                            String idtg = String.valueOf(chatId);

                            System.out.println("idtg: " + idtg);
                            // Проверяем, существует ли уже запись с указанным idtg
                            String checkQuery = "SELECT * FROM user WHERE idtg = ?";
                            PreparedStatement checkStmt = con.prepareStatement(checkQuery);
                            checkStmt.setString(1, String.valueOf(idtg));
                            ResultSet resultSet = checkStmt.executeQuery();

                            if (resultSet.next()) {
                                // Запись с указанным idtg уже существует, выполняем обновление данных
                                String updateQuery = "UPDATE user SET test2 = ? WHERE idtg = ?";
                                PreparedStatement updateStmt = con.prepareStatement(updateQuery);
                                updateStmt.setString(1, String.valueOf(fdb2));
                                updateStmt.setString(2, String.valueOf(idtg));
                                int rowsAffected = updateStmt.executeUpdate();

                                if (rowsAffected > 0) {
                                    System.out.println("Данные успешно обновлены");
                                    aftt2(chatId); // Вызываем метод после успешного обновления данных
                                } else {
                                    System.out.println("Не удалось обновить данные");
                                }
                            } else {
                                // Запись с указанным idtg не существует, ничего не делаем
                                System.out.println("Нет записи с указанным idtg");
                            }

                            con.close();
                        } catch (Exception e) {
                            System.out.println(e);
                        }

                        userCurrentQuestions.remove(chatId);


                        break;

                }

            }


            if (callbackData.equals("test3")) { // TEST333333333333333333333333333333333333333333333333333

                next3(chatId);
                deleteMessage(chatId, messageId);
            } else if (callbackData.equals("next3")) {


                ttt3(chatId, result31);

                //currentQuestion = 1;
                deleteMessage(chatId, messageId);


            } else if (callbackData.equals("A3") || callbackData.equals("B3") || callbackData.equals("C3") || callbackData.equals("D3")) {
                int currentQuestion = userCurrentQuestions.getOrDefault(chatId, 1); // Получение текущего вопроса для пользователя

                switch (currentQuestion) {
                    case 1:


                        deleteMessage(chatId, messageId);

                        String userAnswer31 = callbackData;
                        userAnswers.add(userAnswer31);

                        String correctAnswer31 = ts3.t3a1();

                        for3(chatId, result32);

                        String response2 = "";
                        if (userAnswer31.equals(correctAnswer31)) {
                            response2 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response2 = "Неправильно. Ответ на вопрос \"";
                        }
                        //sendMessage(chatId, response2 + correctAnswer31 + "\"");


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу
                        break;

                    case 2:

                        deleteMessage(chatId, messageId);

                        String userAnswer32 = callbackData;
                        userAnswers.add(userAnswer32);
                        //String question3 = readExcelFile.b1q3();
                        ttt3(chatId, result33);
                        String correctAnswer3 = ts3.t3a2();
                        String response3 = "";

                        if (userAnswer32.equals(correctAnswer3)) {
                            response3 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response3 = "Неправильно. Ответ на вопрос \"";
                        }

                        //sendMessage(chatId, response3);
                        //sendMessage(chatId, question3);

                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу
                        break;
                    case 3:

                        deleteMessage(chatId, messageId);
                        String userAnswer33 = callbackData;
                        userAnswers.add(userAnswer33);
                        ttt3(chatId, result34);
                        String correctAnswer4 = ts3.t3a3();
                        String response4 = "";
                        if (userAnswer33.equals(correctAnswer4)) {
                            response4 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response4 = "Неправильно. Ответ на вопрос \"";
                        }
                        //sendMessage(chatId, response4);

                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу
                        break;

                    case 4:

                        deleteMessage(chatId, messageId);
                        String userAnswer34 = callbackData;
                        userAnswers.add(userAnswer34);
                        //String question5 = readExcelFile.b1q5();
                        ttt3(chatId, result35);
                        String correctAnswer5 = ts3.t3a4();
                        String response5 = "";
                        if (userAnswer34.equals(correctAnswer5)) {
                            response5 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response5 = "Неправильно. Ответ на вопрос \"";
                        }
                        // sendMessage(chatId, response5);
                        //sendMessage(chatId, question5);

                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу
                        break;

                    case 5:

                        deleteMessage(chatId, messageId);
                        String userAnswer35 = callbackData;
                        userAnswers.add(userAnswer35);
                        String correctAnswer13 = ts3.t3a5();

                        String response13 = "";

                        if (userAnswer35.equals(correctAnswer13)) {
                            response13 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response13 = "Неправильно. Ответ на вопрос \"";
                        }
                        // sendMessage(chatId, response13);
                        userCurrentQuestions.remove(chatId);


                    default:
                        String test = (String) storeAnswer.get(update.getCallbackQuery().getFrom().getId()).get("test");
                        String scoreMessage = calculateScore3(chatId, readExcelFile3, userAnswers, test);
                        storeAnswer.remove(update.getCallbackQuery().getFrom().getId());
                        sendMessage(chatId, scoreMessage);

                        try {
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            Connection con = DriverManager.getConnection(
                                    "jdbc:mysql://37.143.15.239:3306/telegram-bot", "root", "yiPDmV6d75");

                            String idtg = String.valueOf(chatId);

                            System.out.println("idtg: " + idtg);
                            // Проверяем, существует ли уже запись с указанным idtg
                            String checkQuery = "SELECT * FROM user WHERE idtg = ?";
                            PreparedStatement checkStmt = con.prepareStatement(checkQuery);
                            checkStmt.setString(1, String.valueOf(idtg));
                            ResultSet resultSet = checkStmt.executeQuery();

                            if (resultSet.next()) {
                                // Запись с указанным idtg уже существует, выполняем обновление данных
                                String updateQuery = "UPDATE user SET test3 = ? WHERE idtg = ?";
                                PreparedStatement updateStmt = con.prepareStatement(updateQuery);
                                updateStmt.setString(1, fdb3);
                                updateStmt.setString(2, String.valueOf(idtg));
                                int rowsAffected = updateStmt.executeUpdate();

                                if (rowsAffected > 0) {
                                    System.out.println("Данные успешно обновлены");
                                    aftt3(chatId); // Вызываем метод после успешного обновления данных
                                } else {
                                    System.out.println("Не удалось обновить данные");
                                }
                            } else {
                                // Запись с указанным idtg не существует, ничего не делаем
                                System.out.println("Нет записи с указанным idtg");
                            }

                            con.close();
                        } catch (Exception e) {
                            System.out.println(e);
                        }

                        userCurrentQuestions.remove(chatId);

                        break;


                }
            }
            if (callbackData.equals("test4")) { // TEST444444444444444444444444444444444444444444

                next4(chatId);
                deleteMessage(chatId, messageId);
            } else if (callbackData.equals("next4")) {


                ttt4(chatId, result401);

                //currentQuestion = 1;
                deleteMessage(chatId, messageId);


            } else if (callbackData.equals("A4") || callbackData.equals("B4") || callbackData.equals("C4") || callbackData.equals("D4")) {
                int currentQuestion = userCurrentQuestions.getOrDefault(chatId, 1);

                switch (currentQuestion) {
                    case 1:


                        deleteMessage(chatId, messageId);

                        String userAnswer401 = callbackData;
                        userAnswers.add(userAnswer401);

                        String correctAnswer401 = ts4.t4a1();

                        for4(chatId, result402);

                        String response2 = "";
                        if (userAnswer401.equals(correctAnswer401)) {
                            response2 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response2 = "Неправильно. Ответ на вопрос \"";
                        }
                        // sendMessage(chatId, response2);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу
                        break;

                    case 2:
                        deleteMessage(chatId, messageId);

                        String userAnswer402 = callbackData;
                        userAnswers.add(userAnswer402);

                        String correctAnswer402 = ts4.t4a2();

                        ttt4(chatId, result403);

                        String response3 = "";
                        if (userAnswer402.equals(correctAnswer402)) {
                            response3 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response3 = "Неправильно. Ответ на вопрос \"";
                        }
                        // sendMessage(chatId, response3);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу
                        break;
                    case 3:
                        deleteMessage(chatId, messageId);

                        String userAnswer403 = callbackData;
                        userAnswers.add(userAnswer403);

                        String correctAnswer403 = ts4.t4a3();

                        ttt4(chatId, result404);

                        String response4 = "";
                        if (userAnswer403.equals(correctAnswer403)) {
                            response4 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response4 = "Неправильно. Ответ на вопрос \"";
                        }
                        // sendMessage(chatId, response4);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу
                        break;
                    case 4:
                        deleteMessage(chatId, messageId);

                        String userAnswer404 = callbackData;
                        userAnswers.add(userAnswer404);

                        String correctAnswer404 = ts4.t4a4();

                        ttt4(chatId, result405);

                        String response5 = "";
                        if (userAnswer404.equals(correctAnswer404)) {
                            response5 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response5 = "Неправильно. Ответ на вопрос \"";
                        }
                        //sendMessage(chatId, response5);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу
                        break;

                    case 5:
                        deleteMessage(chatId, messageId);

                        String userAnswer405 = callbackData;
                        userAnswers.add(userAnswer405);

                        String correctAnswer405 = ts4.t4a5();

                        ttt4(chatId, result406);

                        String response6 = "";
                        if (userAnswer405.equals(correctAnswer405)) {
                            response6 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response6 = "Неправильно. Ответ на вопрос \"";
                        }
                        // sendMessage(chatId, response6);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу
                        break;

                    case 6:
                        deleteMessage(chatId, messageId);

                        String userAnswer406 = callbackData;
                        userAnswers.add(userAnswer406);

                        String correctAnswer406 = ts4.t4a6();

                        ttt4(chatId, result407);

                        String response7 = "";
                        if (userAnswer406.equals(correctAnswer406)) {
                            response7 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response7 = "Неправильно. Ответ на вопрос \"";
                        }
                        //sendMessage(chatId, response7);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу
                        break;

                    case 7:
                        deleteMessage(chatId, messageId);

                        String userAnswer407 = callbackData;
                        userAnswers.add(userAnswer407);

                        String correctAnswer407 = ts4.t4a7();

                        for4(chatId, result408);

                        String response8 = "";
                        if (userAnswer407.equals(correctAnswer407)) {
                            response8 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response8 = "Неправильно. Ответ на вопрос \"";
                        }
                        //sendMessage(chatId, response8);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу
                        break;

                    case 8:
                        deleteMessage(chatId, messageId);

                        String userAnswer408 = callbackData;
                        userAnswers.add(userAnswer408);

                        String correctAnswer408 = ts4.t4a8();

                        for4(chatId, result409);

                        String response9 = "";
                        if (userAnswer408.equals(correctAnswer408)) {
                            response9 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response9 = "Неправильно. Ответ на вопрос \"";
                        }
                        //sendMessage(chatId, response9);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу
                        break;

                    case 9:
                        deleteMessage(chatId, messageId);

                        String userAnswer409 = callbackData;
                        userAnswers.add(userAnswer409);

                        String correctAnswer409 = ts4.t4a9();

                        ttt4(chatId, result410);

                        String response10 = "";
                        if (userAnswer409.equals(correctAnswer409)) {
                            response10 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response10 = "Неправильно. Ответ на вопрос \"";
                        }
                        // sendMessage(chatId, response10);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу
                        break;

                    case 10:
                        deleteMessage(chatId, messageId);

                        String userAnswer410 = callbackData;
                        userAnswers.add(userAnswer410);

                        String correctAnswer410 = ts4.t4a10();

                        ttt4(chatId, result411);

                        String response11 = "";
                        if (userAnswer410.equals(correctAnswer410)) {
                            response11 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response11 = "Неправильно. Ответ на вопрос \"";
                        }
                        //sendMessage(chatId, response11);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу
                        break;

                    case 11:
                        deleteMessage(chatId, messageId);

                        String userAnswer411 = callbackData;
                        userAnswers.add(userAnswer411);

                        String correctAnswer411 = ts4.t4a11();

                        for4(chatId, result412);

                        String response12 = "";
                        if (userAnswer411.equals(correctAnswer411)) {
                            response12 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response12 = "Неправильно. Ответ на вопрос \"";
                        }
                        //sendMessage(chatId, response12);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу
                        break;

                    case 12:
                        deleteMessage(chatId, messageId);

                        String userAnswer412 = callbackData;
                        userAnswers.add(userAnswer412);

                        String correctAnswer412 = ts4.t4a12();

                        for4(chatId, result413);

                        String response13 = "";
                        if (userAnswer412.equals(correctAnswer412)) {
                            response13 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response13 = "Неправильно. Ответ на вопрос \"";
                        }
                        //sendMessage(chatId, response13);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу
                        break;

                    case 13:
                        deleteMessage(chatId, messageId);

                        String userAnswer413 = callbackData;
                        userAnswers.add(userAnswer413);

                        String correctAnswer413 = ts4.t4a13();

                        ttt4(chatId, result414);

                        String response14 = "";
                        if (userAnswer413.equals(correctAnswer413)) {
                            response14 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response14 = "Неправильно. Ответ на вопрос \"";
                        }
                        //sendMessage(chatId, response14);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу
                        break;
                    case 14:
                        deleteMessage(chatId, messageId);

                        String userAnswer414 = callbackData;
                        userAnswers.add(userAnswer414);

                        String correctAnswer414 = ts4.t4a14();

                        for4(chatId, result415);

                        String response15 = "";
                        if (userAnswer414.equals(correctAnswer414)) {
                            response15 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response15 = "Неправильно. Ответ на вопрос \"";
                        }
                        //sendMessage(chatId, response15);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу
                        break;
                    case 15:
                        deleteMessage(chatId, messageId);

                        String userAnswer415 = callbackData;
                        userAnswers.add(userAnswer415);

                        String correctAnswer415 = ts4.t4a15();

                        ttt4(chatId, result416);

                        String response16 = "";
                        if (userAnswer415.equals(correctAnswer415)) {
                            response16 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response16 = "Неправильно. Ответ на вопрос \"";
                        }
                        //sendMessage(chatId, response16);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу
                        break;
                    case 16:
                        deleteMessage(chatId, messageId);
                        String userAnswer35 = callbackData;
                        userAnswers.add(userAnswer35);
                        String correctAnswer13 = ts4.t4a16();

                        String response17 = "";

                        if (userAnswer35.equals(correctAnswer13)) {
                            response17 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response17 = "Неправильно. Ответ на вопрос \"";
                        }
                        //sendMessage(chatId, response17);
                        userCurrentQuestions.remove(chatId); // Удаление состояния пользователя после завершения теста


                    default:
                        String test = (String) storeAnswer.get(update.getCallbackQuery().getFrom().getId()).get("test");
                        String scoreMessage = calculateScore4(chatId, readExcelFile4, userAnswers, test);
                        storeAnswer.remove(update.getCallbackQuery().getFrom().getId());
                        sendMessage(chatId, scoreMessage);

                        try {
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            Connection con = DriverManager.getConnection(
                                    "jdbc:mysql://37.143.15.239:3306/telegram-bot", "root", "yiPDmV6d75");

                            String idtg = String.valueOf(chatId);

                            System.out.println("idtg: " + idtg);
                            // Проверяем, существует ли уже запись с указанным idtg
                            String checkQuery = "SELECT * FROM user WHERE idtg = ?";
                            PreparedStatement checkStmt = con.prepareStatement(checkQuery);
                            checkStmt.setString(1, String.valueOf(idtg));
                            ResultSet resultSet = checkStmt.executeQuery();

                            if (resultSet.next()) {
                                // Запись с указанным idtg уже существует, выполняем обновление данных
                                String updateQuery = "UPDATE user SET test4 = ? WHERE idtg = ?";
                                PreparedStatement updateStmt = con.prepareStatement(updateQuery);
                                updateStmt.setString(1, fdb4);
                                updateStmt.setString(2, String.valueOf(idtg));
                                int rowsAffected = updateStmt.executeUpdate();

                                if (rowsAffected > 0) {
                                    System.out.println("Данные успешно обновлены");
                                    aftt4(chatId); // Вызываем метод после успешного обновления данных
                                } else {
                                    System.out.println("Не удалось обновить данные");
                                }
                            } else {
                                // Запись с указанным idtg не существует, ничего не делаем
                                System.out.println("Нет записи с указанным idtg");
                            }

                            con.close();
                        } catch (Exception e) {
                            System.out.println(e);
                        }

                        userCurrentQuestions.remove(chatId); // Удаление состояния пользователя после завершения теста


                        break;


                }
            }
            if (callbackData.equals("test5")) { // TEST55555555555555555555555555555555555555555555

                next5(chatId);
                deleteMessage(chatId, messageId);
            } else if (callbackData.equals("next5")) {


                ttt5(chatId, result501);

                //currentQuestion = 1;
                deleteMessage(chatId, messageId);


            } else if (callbackData.equals("A5") || callbackData.equals("B5") || callbackData.equals("C5") || callbackData.equals("D5")) {
                int currentQuestion = userCurrentQuestions.getOrDefault(chatId, 1); // Получение текущего вопроса для пользователя

                switch (currentQuestion) {
                    case 1:


                        deleteMessage(chatId, messageId);

                        String userAnswer501 = callbackData;
                        userAnswers.add(userAnswer501);

                        String correctAnswer401 = ts5.t5a1();

                        for5(chatId, result502);

                        String response2 = "";
                        if (userAnswer501.equals(correctAnswer401)) {
                            response2 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response2 = "Неправильно. Ответ на вопрос \"";
                        }
                        // sendMessage(chatId, response2);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу
                        break;

                    case 2:
                        deleteMessage(chatId, messageId);

                        String userAnswer502 = callbackData;
                        userAnswers.add(userAnswer502);

                        String correctAnswer402 = ts5.t5a2();

                        ttt5(chatId, result503);

                        String response3 = "";
                        if (userAnswer502.equals(correctAnswer402)) {
                            response3 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response3 = "Неправильно. Ответ на вопрос \"";
                        }
                        //sendMessage(chatId, response3);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу
                        break;
                    case 3:
                        deleteMessage(chatId, messageId);

                        String userAnswer503 = callbackData;
                        userAnswers.add(userAnswer503);

                        String correctAnswer503 = ts5.t5a3();

                        ttt5(chatId, result504);

                        String response4 = "";
                        if (userAnswer503.equals(correctAnswer503)) {
                            response4 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response4 = "Неправильно. Ответ на вопрос \"";
                        }
                        // sendMessage(chatId, response4);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу
                        break;
                    case 4:
                        deleteMessage(chatId, messageId);

                        String userAnswer504 = callbackData;
                        userAnswers.add(userAnswer504);

                        String correctAnswer504 = ts5.t5a4();

                        ttt5(chatId, result505);

                        String response5 = "";
                        if (userAnswer504.equals(correctAnswer504)) {
                            response5 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response5 = "Неправильно. Ответ на вопрос \"";
                        }
                        // sendMessage(chatId, response5);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу
                        break;

                    case 5:
                        deleteMessage(chatId, messageId);

                        String userAnswer505 = callbackData;
                        userAnswers.add(userAnswer505);

                        String correctAnswer505 = ts5.t5a5();

                        ttt5(chatId, result506);

                        String response6 = "";
                        if (userAnswer505.equals(correctAnswer505)) {
                            response6 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response6 = "Неправильно. Ответ на вопрос \"";
                        }
                        // sendMessage(chatId, response6);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу
                        break;

                    case 6:
                        deleteMessage(chatId, messageId);

                        String userAnswer506 = callbackData;
                        userAnswers.add(userAnswer506);

                        String correctAnswer506 = ts5.t5a6();

                        ttt5(chatId, result507);

                        String response7 = "";
                        if (userAnswer506.equals(correctAnswer506)) {
                            response7 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response7 = "Неправильно. Ответ на вопрос \"";
                        }
                        //sendMessage(chatId, response7);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу
                        break;

                    case 7:
                        deleteMessage(chatId, messageId);

                        String userAnswer507 = callbackData;
                        userAnswers.add(userAnswer507);

                        String correctAnswer507 = ts5.t5a7();

                        for5(chatId, result508);

                        String response8 = "";
                        if (userAnswer507.equals(correctAnswer507)) {
                            response8 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response8 = "Неправильно. Ответ на вопрос \"";
                        }
                        // sendMessage(chatId, response8);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу
                        break;

                    case 8:
                        deleteMessage(chatId, messageId);

                        String userAnswer508 = callbackData;
                        userAnswers.add(userAnswer508);

                        String correctAnswer508 = ts5.t5a8();

                        for5(chatId, result509);

                        String response9 = "";
                        if (userAnswer508.equals(correctAnswer508)) {
                            response9 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response9 = "Неправильно. Ответ на вопрос \"";
                        }
                        // sendMessage(chatId, response9);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу
                        break;

                    case 9:
                        deleteMessage(chatId, messageId);
                        String userAnswer35 = callbackData;
                        userAnswers.add(userAnswer35);
                        String correctAnswer509 = ts5.t5a9();

                        String response17 = "";

                        if (userAnswer35.equals(correctAnswer509)) {
                            response17 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response17 = "Неправильно. Ответ на вопрос \"";
                        }
                        // sendMessage(chatId, response17);
                        userCurrentQuestions.remove(chatId); // Удаление состояния пользователя после завершения теста

                    default:
                        String test = (String) storeAnswer.get(update.getCallbackQuery().getFrom().getId()).get("test");
                        String scoreMessage = calculateScore5(chatId, readExcelFile5, userAnswers, test);
                        storeAnswer.remove(update.getCallbackQuery().getFrom().getId());
                        sendMessage(chatId, scoreMessage);

                        try {
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            Connection con = DriverManager.getConnection(
                                    "jdbc:mysql://37.143.15.239:3306/telegram-bot", "root", "yiPDmV6d75");

                            String idtg = String.valueOf(chatId);

                            System.out.println("idtg: " + idtg);
                            // Проверяем, существует ли уже запись с указанным idtg
                            String checkQuery = "SELECT * FROM user WHERE idtg = ?";
                            PreparedStatement checkStmt = con.prepareStatement(checkQuery);
                            checkStmt.setString(1, String.valueOf(idtg));
                            ResultSet resultSet = checkStmt.executeQuery();

                            if (resultSet.next()) {
                                // Запись с указанным idtg уже существует, выполняем обновление данных
                                String updateQuery = "UPDATE user SET test5 = ? WHERE idtg = ?";
                                PreparedStatement updateStmt = con.prepareStatement(updateQuery);
                                updateStmt.setString(1, fdb5);
                                updateStmt.setString(2, String.valueOf(idtg));
                                int rowsAffected = updateStmt.executeUpdate();

                                if (rowsAffected > 0) {
                                    System.out.println("Данные успешно обновлены");
                                    aftt5(chatId); // Вызываем метод после успешного обновления данных
                                } else {
                                    System.out.println("Не удалось обновить данные");
                                }
                            } else {
                                // Запись с указанным idtg не существует, ничего не делаем
                                System.out.println("Нет записи с указанным idtg");
                            }

                            con.close();
                        } catch (Exception e) {
                            System.out.println(e);
                        }

                        userCurrentQuestions.remove(chatId); // Удаление состояния пользователя после завершения теста

                        break;
                }
            }
            if (callbackData.equals("test6")) { // TEST666666666666666666666666666666666666
                next6(chatId);
                deleteMessage(chatId, messageId);
            } else if (callbackData.equals("next6")) {


                for6(chatId, result601);

                //currentQuestion = 1;
                deleteMessage(chatId, messageId);


            } else if (callbackData.equals("A6") || callbackData.equals("B6") || callbackData.equals("C6") || callbackData.equals("D6")) {
                int currentQuestion = userCurrentQuestions.getOrDefault(chatId, 1); // Получение текущего вопроса для пользователя

                switch (currentQuestion) {
                    case 1:


                        deleteMessage(chatId, messageId);

                        String userAnswer601 = callbackData;
                        userAnswers.add(userAnswer601);

                        String correctAnswer601 = ts6.t6a1();

                        for6(chatId, result602);

                        String response2 = "";
                        if (userAnswer601.equals(correctAnswer601)) {
                            response2 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response2 = "Неправильно. Ответ на вопрос \"";
                        }
                        //  sendMessage(chatId, response2);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;

                    case 2:
                        deleteMessage(chatId, messageId);

                        String userAnswer602 = callbackData;
                        userAnswers.add(userAnswer602);

                        String correctAnswer602 = ts6.t6a2();

                        for6(chatId, result603);

                        String response3 = "";
                        if (userAnswer602.equals(correctAnswer602)) {
                            response3 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response3 = "Неправильно. Ответ на вопрос \"";
                        }
                        // sendMessage(chatId, response3);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;
                    case 3:
                        deleteMessage(chatId, messageId);

                        String userAnswer603 = callbackData;
                        userAnswers.add(userAnswer603);

                        String correctAnswer603 = ts6.t6a3();

                        for62(chatId, result604);

                        String response4 = "";
                        if (userAnswer603.equals(correctAnswer603)) {
                            response4 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response4 = "Неправильно. Ответ на вопрос \"";
                        }
                        //  sendMessage(chatId, response4);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;
                    case 4:
                        deleteMessage(chatId, messageId);

                        String userAnswer604 = callbackData;
                        userAnswers.add(userAnswer604);

                        String correctAnswer604 = ts6.t6a4();

                        ttt6(chatId, result605);

                        String response5 = "";
                        if (userAnswer604.equals(correctAnswer604)) {
                            response5 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response5 = "Неправильно. Ответ на вопрос \"";
                        }
                        //   sendMessage(chatId, response5);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;

                    case 5:
                        deleteMessage(chatId, messageId);

                        String userAnswer605 = callbackData;
                        userAnswers.add(userAnswer605);

                        String correctAnswer605 = ts6.t6a5();

                        for6(chatId, result606);

                        String response6 = "";
                        if (userAnswer605.equals(correctAnswer605)) {
                            response6 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response6 = "Неправильно. Ответ на вопрос \"";
                        }
                        //   sendMessage(chatId, response6);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;

                    case 6:
                        deleteMessage(chatId, messageId);

                        String userAnswer606 = callbackData;
                        userAnswers.add(userAnswer606);

                        String correctAnswer606 = ts6.t6a6();

                        for6(chatId, result607);

                        String response7 = "";
                        if (userAnswer606.equals(correctAnswer606)) {
                            response7 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response7 = "Неправильно. Ответ на вопрос \"";
                        }
                        //  sendMessage(chatId, response7);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;

                    case 7:
                        deleteMessage(chatId, messageId);

                        String userAnswer607 = callbackData;
                        userAnswers.add(userAnswer607);

                        String correctAnswer607 = ts6.t6a7();

                        for6(chatId, result608);

                        String response8 = "";
                        if (userAnswer607.equals(correctAnswer607)) {
                            response8 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response8 = "Неправильно. Ответ на вопрос \"";
                        }
                        //  sendMessage(chatId, response8);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;

                    case 8:
                        deleteMessage(chatId, messageId);

                        String userAnswer608 = callbackData;
                        userAnswers.add(userAnswer608);

                        String correctAnswer608 = ts6.t6a8();

                        ttt6(chatId, result609);

                        String response9 = "";
                        if (userAnswer608.equals(correctAnswer608)) {
                            response9 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response9 = "Неправильно. Ответ на вопрос \"";
                        }
                        //  sendMessage(chatId, response9);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;

                    case 9:
                        deleteMessage(chatId, messageId);

                        String userAnswer609 = callbackData;
                        userAnswers.add(userAnswer609);

                        String correctAnswer609 = ts6.t6a9();

                        ttt6(chatId, result610);

                        String response10 = "";
                        if (userAnswer609.equals(correctAnswer609)) {
                            response10 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response10 = "Неправильно. Ответ на вопрос \"";
                        }
                        // sendMessage(chatId, response10);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;

                    case 10:
                        deleteMessage(chatId, messageId);

                        String userAnswer610 = callbackData;
                        userAnswers.add(userAnswer610);

                        String correctAnswer610 = ts6.t6a10();

                        ttt6(chatId, result611);

                        String response11 = "";
                        if (userAnswer610.equals(correctAnswer610)) {
                            response11 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response11 = "Неправильно. Ответ на вопрос \"";
                        }
                        //  sendMessage(chatId, response11);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;


                    case 11:
                        deleteMessage(chatId, messageId);

                        String userAnswer612 = callbackData;
                        userAnswers.add(userAnswer612);

                        String correctAnswer612 = ts6.t6a11();

                        ttt6(chatId, result612);

                        String response13 = "";
                        if (userAnswer612.equals(correctAnswer612)) {
                            response13 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response13 = "Неправильно. Ответ на вопрос \"";
                        }
                        //  sendMessage(chatId, response13);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;

                    case 12:

                        deleteMessage(chatId, messageId);

                        String userAnswer613 = callbackData;
                        userAnswers.add(userAnswer613);

                        String correctAnswer613 = ts6.t6a12();

                        ttt6(chatId, result613);

                        String response14 = "";
                        if (userAnswer613.equals(correctAnswer613)) {
                            response14 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response14 = "Неправильно. Ответ на вопрос \"";
                        }
                        // sendMessage(chatId, response14);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;
                    case 13:
                        deleteMessage(chatId, messageId);
                        String userAnswer35 = callbackData;
                        userAnswers.add(userAnswer35);
                        String correctAnswer614 = ts6.t6a13();

                        String response17 = "";

                        if (userAnswer35.equals(correctAnswer614)) {
                            response17 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response17 = "Неправильно. Ответ на вопрос \"";
                        }
                        // sendMessage(chatId, response17);
                        userCurrentQuestions.remove(chatId); // Удаление состояния пользователя после завершения теста


                    default:
                        String test = (String) storeAnswer.get(update.getCallbackQuery().getFrom().getId()).get("test");
                        String scoreMessage = calculateScore6(chatId, readExcelFile6, userAnswers, test);
                        storeAnswer.remove(update.getCallbackQuery().getFrom().getId());
                        sendMessage(chatId, scoreMessage);

                        try {
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            Connection con = DriverManager.getConnection(
                                    "jdbc:mysql://37.143.15.239:3306/telegram-bot", "root", "yiPDmV6d75");

                            String idtg = String.valueOf(chatId);

                            System.out.println("idtg: " + idtg);
                            // Проверяем, существует ли уже запись с указанным idtg
                            String checkQuery = "SELECT * FROM user WHERE idtg = ?";
                            PreparedStatement checkStmt = con.prepareStatement(checkQuery);
                            checkStmt.setString(1, String.valueOf(idtg));
                            ResultSet resultSet = checkStmt.executeQuery();

                            if (resultSet.next()) {
                                // Запись с указанным idtg уже существует, выполняем обновление данных
                                String updateQuery = "UPDATE user SET test6 = ? WHERE idtg = ?";
                                PreparedStatement updateStmt = con.prepareStatement(updateQuery);
                                updateStmt.setString(1, fdb6);
                                updateStmt.setString(2, String.valueOf(idtg));
                                int rowsAffected = updateStmt.executeUpdate();

                                if (rowsAffected > 0) {
                                    System.out.println("Данные успешно обновлены");
                                    aftt6(chatId); // Вызываем метод после успешного обновления данных
                                } else {
                                    System.out.println("Не удалось обновить данные");
                                }
                            } else {
                                // Запись с указанным idtg не существует, ничего не делаем
                                System.out.println("Нет записи с указанным idtg");
                            }

                            con.close();
                        } catch (Exception e) {
                            System.out.println(e);
                        }

                        userCurrentQuestions.remove(chatId); // Удаление состояния пользователя после завершения теста


                        break;
                }
            }
            if (callbackData.equals("test7")) { // TEST77777777777777777777

                next7(chatId);
                deleteMessage(chatId, messageId);
            } else if (callbackData.equals("next7")) {

                ttt7(chatId, result701);

                //currentQuestion = 1;
                deleteMessage(chatId, messageId);


            } else if (callbackData.equals("A7") || callbackData.equals("B7") || callbackData.equals("C7") || callbackData.equals("D7")) {
                int currentQuestion = userCurrentQuestions.getOrDefault(chatId, 1); // Получение текущего вопроса для пользователя

                switch (currentQuestion) {
                    case 1:


                        deleteMessage(chatId, messageId);

                        String userAnswer701 = callbackData;
                        userAnswers.add(userAnswer701);

                        String correctAnswer701 = ts7.t7a1();

                        ttt7(chatId, result702);

                        String response2 = "";
                        if (userAnswer701.equals(correctAnswer701)) {
                            response2 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response2 = "Неправильно. Ответ на вопрос \"";
                        }
                        //  sendMessage(chatId, response2);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;

                    case 2:
                        deleteMessage(chatId, messageId);

                        String userAnswer702 = callbackData;
                        userAnswers.add(userAnswer702);

                        String correctAnswer702 = ts7.t7a2();

                        for7(chatId, result703);

                        String response3 = "";
                        if (userAnswer702.equals(correctAnswer702)) {
                            response3 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response3 = "Неправильно. Ответ на вопрос \"";
                        }
                        // sendMessage(chatId, response3);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;
                    case 3:
                        deleteMessage(chatId, messageId);

                        String userAnswer703 = callbackData;
                        userAnswers.add(userAnswer703);

                        String correctAnswer703 = ts7.t7a3();

                        for7(chatId, result704);

                        String response4 = "";
                        if (userAnswer703.equals(correctAnswer703)) {
                            response4 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response4 = "Неправильно. Ответ на вопрос \"";
                        }
                        //  sendMessage(chatId, response4);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;
                    case 4:
                        deleteMessage(chatId, messageId);

                        String userAnswer704 = callbackData;
                        userAnswers.add(userAnswer704);

                        String correctAnswer704 = ts7.t7a4();

                        for7(chatId, result705);

                        String response5 = "";
                        if (userAnswer704.equals(correctAnswer704)) {
                            response5 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response5 = "Неправильно. Ответ на вопрос \"";
                        }
                        //  sendMessage(chatId, response5);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;

                    case 5:
                        deleteMessage(chatId, messageId);

                        String userAnswer705 = callbackData;
                        userAnswers.add(userAnswer705);

                        String correctAnswer705 = ts7.t7a5();

                        for7(chatId, result706);

                        String response6 = "";
                        if (userAnswer705.equals(correctAnswer705)) {
                            response6 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response6 = "Неправильно. Ответ на вопрос \"";
                        }
                        //  sendMessage(chatId, response6);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;

                    case 6:
                        deleteMessage(chatId, messageId);

                        String userAnswer706 = callbackData;
                        userAnswers.add(userAnswer706);

                        String correctAnswer706 = ts7.t7a6();

                        for7(chatId, result707);

                        String response7 = "";
                        if (userAnswer706.equals(correctAnswer706)) {
                            response7 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response7 = "Неправильно. Ответ на вопрос \"";
                        }
                        //  sendMessage(chatId, response7);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;

                    case 7:
                        deleteMessage(chatId, messageId);

                        String userAnswer707 = callbackData;
                        userAnswers.add(userAnswer707);

                        String correctAnswer707 = ts7.t7a7();

                        for7(chatId, result708);

                        String response8 = "";
                        if (userAnswer707.equals(correctAnswer707)) {
                            response8 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response8 = "Неправильно. Ответ на вопрос \"";
                        }
                        //  sendMessage(chatId, response8);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;

                    case 8:
                        deleteMessage(chatId, messageId);

                        String userAnswer708 = callbackData;
                        userAnswers.add(userAnswer708);

                        String correctAnswer708 = ts7.t7a8();

                        for7(chatId, result709);

                        String response9 = "";
                        if (userAnswer708.equals(correctAnswer708)) {
                            response9 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response9 = "Неправильно. Ответ на вопрос \"";
                        }
                        //  sendMessage(chatId, response9);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;

                    case 9:
                        deleteMessage(chatId, messageId);

                        String userAnswer709 = callbackData;
                        userAnswers.add(userAnswer709);

                        String correctAnswer709 = ts7.t7a9();

                        for7(chatId, result710);

                        String response10 = "";
                        if (userAnswer709.equals(correctAnswer709)) {
                            response10 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response10 = "Неправильно. Ответ на вопрос \"";
                        }
                        //  sendMessage(chatId, response10);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;

                    case 10:
                        deleteMessage(chatId, messageId);

                        String userAnswer710 = callbackData;
                        userAnswers.add(userAnswer710);

                        String correctAnswer710 = ts7.t7a10();

                        ttt7(chatId, result711);

                        String response11 = "";
                        if (userAnswer710.equals(correctAnswer710)) {
                            response11 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response11 = "Неправильно. Ответ на вопрос \"";
                        }
                        //  sendMessage(chatId, response11);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;

                    case 11:
                        deleteMessage(chatId, messageId);

                        String userAnswer711 = callbackData;
                        userAnswers.add(userAnswer711);

                        String correctAnswer711 = ts7.t7a11();

                        ttt7(chatId, result712);

                        String response12 = "";
                        if (userAnswer711.equals(correctAnswer711)) {
                            response12 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response12 = "Неправильно. Ответ на вопрос \"";
                        }
                        //  sendMessage(chatId, response12);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;

                    case 12:
                        deleteMessage(chatId, messageId);

                        String userAnswer712 = callbackData;
                        userAnswers.add(userAnswer712);

                        String correctAnswer712 = ts7.t7a12();

                        ttt7(chatId, result713);

                        String response13 = "";
                        if (userAnswer712.equals(correctAnswer712)) {
                            response13 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response13 = "Неправильно. Ответ на вопрос \"";
                        }
                        //  sendMessage(chatId, response13);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;

                    case 13:

                        deleteMessage(chatId, messageId);

                        String userAnswer713 = callbackData;
                        userAnswers.add(userAnswer713);

                        String correctAnswer713 = ts7.t7a13();

                        ttt7(chatId, result714);

                        String response14 = "";
                        if (userAnswer713.equals(correctAnswer713)) {
                            response14 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response14 = "Неправильно. Ответ на вопрос \"";
                        }
                        //  sendMessage(chatId, response14);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;

                    case 14:
                        deleteMessage(chatId, messageId);

                        String userAnswer714 = callbackData;
                        userAnswers.add(userAnswer714);

                        String correctAnswer714 = ts7.t7a14();

                        for7(chatId, result715);

                        String response15 = "";
                        if (userAnswer714.equals(correctAnswer714)) {
                            response15 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response15 = "Неправильно. Ответ на вопрос \"";
                        }
                        //  sendMessage(chatId, response15);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу


                        break;
                    case 15:
                        deleteMessage(chatId, messageId);

                        String userAnswer715 = callbackData;
                        userAnswers.add(userAnswer715);

                        String correctAnswer715 = ts7.t7a15();

                        ttt7(chatId, result716);

                        String response16 = "";
                        if (userAnswer715.equals(correctAnswer715)) {
                            response16 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response16 = "Неправильно. Ответ на вопрос \"";
                        }
                        //  sendMessage(chatId, response16);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу


                        break;
                    case 16:
                        deleteMessage(chatId, messageId);

                        String userAnswer716 = callbackData;
                        userAnswers.add(userAnswer716);

                        String correctAnswer716 = ts7.t7a16();

                        ttt7(chatId, result717);

                        String response17 = "";
                        if (userAnswer716.equals(correctAnswer716)) {
                            response17 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response17 = "Неправильно. Ответ на вопрос \"";
                        }
                        //   sendMessage(chatId, response17);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу


                        break;
                    case 17:
                        deleteMessage(chatId, messageId);

                        String userAnswer717 = callbackData;
                        userAnswers.add(userAnswer717);

                        String correctAnswer717 = ts7.t7a17();

                        ttt7(chatId, result718);

                        String response18 = "";
                        if (userAnswer717.equals(correctAnswer717)) {
                            response18 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response18 = "Неправильно. Ответ на вопрос \"";
                        }
                        //   sendMessage(chatId, response18);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу


                        break;
                    case 18:
                        deleteMessage(chatId, messageId);

                        String userAnswer718 = callbackData;
                        userAnswers.add(userAnswer718);

                        String correctAnswer718 = ts7.t7a18();

                        for7(chatId, result719);

                        String response19 = "";
                        if (userAnswer718.equals(correctAnswer718)) {
                            response19 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response19 = "Неправильно. Ответ на вопрос \"";
                        }
                        //   sendMessage(chatId, response19);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу


                        break;
                    case 19:
                        deleteMessage(chatId, messageId);

                        String userAnswer719 = callbackData;
                        userAnswers.add(userAnswer719);

                        String correctAnswer719 = ts7.t7a19();

                        for7(chatId, result720);

                        String response20 = "";
                        if (userAnswer719.equals(correctAnswer719)) {
                            response20 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response20 = "Неправильно. Ответ на вопрос \"";
                        }
                        //   sendMessage(chatId, response20);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу


                        break;
                    case 20:
                        deleteMessage(chatId, messageId);
                        String userAnswer720 = callbackData;
                        userAnswers.add(userAnswer720);
                        String correctAnswer720 = ts7.t7a20();

                        String response21 = "";

                        if (userAnswer720.equals(correctAnswer720)) {
                            response21 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response21 = "Неправильно. Ответ на вопрос \"";
                        }
                        //  sendMessage(chatId, response21);
                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                    default:
                        String test = (String) storeAnswer.get(update.getCallbackQuery().getFrom().getId()).get("test");
                        String scoreMessage = calculateScore7(chatId, readExcelFile7, userAnswers, test);
                        storeAnswer.remove(update.getCallbackQuery().getFrom().getId());
                        sendMessage(chatId, scoreMessage);


                        try {
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            Connection con = DriverManager.getConnection(
                                    "jdbc:mysql://37.143.15.239:3306/telegram-bot", "root", "yiPDmV6d75");

                            String idtg = String.valueOf(chatId);

                            System.out.println("idtg: " + idtg);
                            // Проверяем, существует ли уже запись с указанным idtg
                            String checkQuery = "SELECT * FROM user WHERE idtg = ?";
                            PreparedStatement checkStmt = con.prepareStatement(checkQuery);
                            checkStmt.setString(1, String.valueOf(idtg));
                            ResultSet resultSet = checkStmt.executeQuery();

                            if (resultSet.next()) {
                                // Запись с указанным idtg уже существует, выполняем обновление данных
                                String updateQuery = "UPDATE user SET test7 = ? WHERE idtg = ?";
                                PreparedStatement updateStmt = con.prepareStatement(updateQuery);
                                updateStmt.setString(1, fdb7);
                                updateStmt.setString(2, String.valueOf(idtg));
                                int rowsAffected = updateStmt.executeUpdate();

                                if (rowsAffected > 0) {
                                    System.out.println("Данные успешно обновлены");
                                    aftt7(chatId); // Вызываем метод после успешного обновления данных
                                } else {
                                    System.out.println("Не удалось обновить данные");
                                }
                            } else {
                                // Запись с указанным idtg не существует, ничего не делаем
                                System.out.println("Нет записи с указанным idtg");
                            }

                            con.close();
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                        userCurrentQuestions.remove(chatId); // Переход к следующему вопросу

                        break;
                }
            }

            if (callbackData.equals("test8")) { // TEST8888888888888888888888888888
                next8(chatId);
                deleteMessage(chatId, messageId);
            } else if (callbackData.equals("next8")) {

                ttt8(chatId, result802);

                //currentQuestion = 1;
                deleteMessage(chatId, messageId);


            } else if (callbackData.equals("A8") || callbackData.equals("B8") || callbackData.equals("C8") || callbackData.equals("D8")) {
                int currentQuestion = userCurrentQuestions.getOrDefault(chatId, 1); // Получение текущего вопроса для пользователя

                switch (currentQuestion) {
                    case 1:


                        deleteMessage(chatId, messageId);

                        String userAnswer801 = callbackData;
                        userAnswers.add(userAnswer801);

                        String correctAnswer801 = ts8.t8a2();

                        ttt8(chatId, result803);

                        String response2 = "";
                        if (userAnswer801.equals(correctAnswer801)) {
                            response2 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response2 = "Неправильно. Ответ на вопрос \"";
                        }
                        //  sendMessage(chatId, response2);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;
                    case 2:
                        deleteMessage(chatId, messageId);

                        String userAnswer802 = callbackData;
                        userAnswers.add(userAnswer802);

                        String correctAnswer802 = ts8.t8a3();

                        ttt8(chatId, result804);

                        String response3 = "";
                        if (userAnswer802.equals(correctAnswer802)) {
                            response3 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response3 = "Неправильно. Ответ на вопрос \"";
                        }
                        //    sendMessage(chatId, response3);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;
                    case 3:
                        deleteMessage(chatId, messageId);

                        String userAnswer803 = callbackData;
                        userAnswers.add(userAnswer803);

                        String correctAnswer503 = ts8.t8a4();

                        ttt8(chatId, result805);

                        String response4 = "";
                        if (userAnswer803.equals(correctAnswer503)) {
                            response4 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response4 = "Неправильно. Ответ на вопрос \"";
                        }
                        //   sendMessage(chatId, response4);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;
                    case 4:
                        deleteMessage(chatId, messageId);

                        String userAnswer804 = callbackData;
                        userAnswers.add(userAnswer804);

                        String correctAnswer804 = ts8.t8a5();

                        ttt8(chatId, result806);

                        String response5 = "";
                        if (userAnswer804.equals(correctAnswer804)) {
                            response5 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response5 = "Неправильно. Ответ на вопрос \"";
                        }
                        //   sendMessage(chatId, response5);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;

                    case 5:
                        deleteMessage(chatId, messageId);

                        String userAnswer805 = callbackData;
                        userAnswers.add(userAnswer805);

                        String correctAnswer805 = ts8.t8a6();

                        ttt8(chatId, result807);

                        String response6 = "";
                        if (userAnswer805.equals(correctAnswer805)) {
                            response6 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response6 = "Неправильно. Ответ на вопрос \"";
                        }
                        //  sendMessage(chatId, response6);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;

                    case 6:
                        deleteMessage(chatId, messageId);

                        String userAnswer806 = callbackData;
                        userAnswers.add(userAnswer806);

                        String correctAnswer807 = ts8.t8a7();

                        ttt8(chatId, result808);

                        String response7 = "";
                        if (userAnswer806.equals(correctAnswer807)) {
                            response7 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response7 = "Неправильно. Ответ на вопрос \"";
                        }
                        // sendMessage(chatId, response7);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;

                    case 7:
                        deleteMessage(chatId, messageId);

                        String userAnswer807 = callbackData;
                        userAnswers.add(userAnswer807);

                        String correctAnswer808 = ts8.t8a8();

                        ttt8(chatId, result809);

                        String response8 = "";
                        if (userAnswer807.equals(correctAnswer808)) {
                            response8 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response8 = "Неправильно. Ответ на вопрос \"";
                        }
                        //  sendMessage(chatId, response8);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;

                    case 8:
                        deleteMessage(chatId, messageId);
                        String userAnswer809 = callbackData;
                        userAnswers.add(userAnswer809);
                        String correctAnswer809 = ts8.t8a8();

                        String response17 = "";

                        if (userAnswer809.equals(correctAnswer809)) {
                            response17 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response17 = "Неправильно. Ответ на вопрос \"";
                        }
                        //  sendMessage(chatId, response17);
                        userCurrentQuestions.remove(chatId); // Удаление состояния пользователя после завершения теста


                    default:
                        String test = (String) storeAnswer.get(update.getCallbackQuery().getFrom().getId()).get("test");
                        String scoreMessage = calculateScore8(chatId, readExcelFile8, userAnswers, test);
                        storeAnswer.remove(update.getCallbackQuery().getFrom().getId());
                        sendMessage(chatId, scoreMessage);

                        try {
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            Connection con = DriverManager.getConnection(
                                    "jdbc:mysql://37.143.15.239:3306/telegram-bot", "root", "yiPDmV6d75");

                            String idtg = String.valueOf(chatId);

                            System.out.println("idtg: " + idtg);
                            // Проверяем, существует ли уже запись с указанным idtg
                            String checkQuery = "SELECT * FROM user WHERE idtg = ?";
                            PreparedStatement checkStmt = con.prepareStatement(checkQuery);
                            checkStmt.setString(1, String.valueOf(idtg));
                            ResultSet resultSet = checkStmt.executeQuery();

                            if (resultSet.next()) {
                                // Запись с указанным idtg уже существует, выполняем обновление данных
                                String updateQuery = "UPDATE user SET test8 = ? WHERE idtg = ?";
                                PreparedStatement updateStmt = con.prepareStatement(updateQuery);
                                updateStmt.setString(1, fdb8);
                                updateStmt.setString(2, String.valueOf(idtg));
                                int rowsAffected = updateStmt.executeUpdate();

                                if (rowsAffected > 0) {
                                    System.out.println("Данные успешно обновлены");
                                    aftt8(chatId); // Вызываем метод после успешного обновления данных
                                } else {
                                    System.out.println("Не удалось обновить данные");
                                }
                            } else {
                                // Запись с указанным idtg не существует, ничего не делаем
                                System.out.println("Нет записи с указанным idtg");
                            }

                            con.close();
                        } catch (Exception e) {
                            System.out.println(e);
                        }

                        userCurrentQuestions.remove(chatId); // Удаление состояния пользователя после завершения теста


                        break;

                }
            }
            if (callbackData.equals("test9")) { // TEST9999999999999999999999999
                next9(chatId);
                deleteMessage(chatId, messageId);
            } else if (callbackData.equals("next9")) {

                ttt9(chatId, result901);


                deleteMessage(chatId, messageId);


            } else if (callbackData.equals("A9") || callbackData.equals("B9") || callbackData.equals("C9") || callbackData.equals("D9")) {
                int currentQuestion = userCurrentQuestions.getOrDefault(chatId, 1); // Получение текущего вопроса для пользователя

                switch (currentQuestion) {
                    case 1:


                        deleteMessage(chatId, messageId);

                        String userAnswer901 = callbackData;
                        userAnswers.add(userAnswer901);

                        String correctAnswer901 = ts9.t9a1();

                        ttt9(chatId, result902);

                        String response2 = "";
                        if (userAnswer901.equals(correctAnswer901)) {
                            response2 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response2 = "Неправильно. Ответ на вопрос \"";
                        }
                        //  sendMessage(chatId, response2);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;
                    case 2:
                        deleteMessage(chatId, messageId);

                        String userAnswer902 = callbackData;
                        userAnswers.add(userAnswer902);

                        String correctAnswer902 = ts9.t9a2();

                        ttt9(chatId, result903);

                        String response3 = "";
                        if (userAnswer902.equals(correctAnswer902)) {
                            response3 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response3 = "Неправильно. Ответ на вопрос \"";
                        }
                        //   sendMessage(chatId, response3);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;
                    case 3:
                        deleteMessage(chatId, messageId);

                        String userAnswer903 = callbackData;
                        userAnswers.add(userAnswer903);

                        String correctAnswer903 = ts9.t9a3();

                        for9(chatId, result904);

                        String response4 = "";
                        if (userAnswer903.equals(correctAnswer903)) {
                            response4 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response4 = "Неправильно. Ответ на вопрос \"";
                        }
                        //  sendMessage(chatId, response4);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;
                    case 4:
                        deleteMessage(chatId, messageId);

                        String userAnswer904 = callbackData;
                        userAnswers.add(userAnswer904);

                        String correctAnswer904 = ts9.t9a4();

                        ttt9(chatId, result905);

                        String response5 = "";
                        if (userAnswer904.equals(correctAnswer904)) {
                            response5 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response5 = "Неправильно. Ответ на вопрос \"";
                        }
                        //  sendMessage(chatId, response5);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;

                    case 5:
                        deleteMessage(chatId, messageId);

                        String userAnswer905 = callbackData;
                        userAnswers.add(userAnswer905);

                        String correctAnswer905 = ts9.t9a5();

                        for9(chatId, result906);

                        String response6 = "";
                        if (userAnswer905.equals(correctAnswer905)) {
                            response6 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response6 = "Неправильно. Ответ на вопрос \"";
                        }
                        //   sendMessage(chatId, response6);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;

                    case 6:
                        deleteMessage(chatId, messageId);

                        String userAnswer906 = callbackData;
                        userAnswers.add(userAnswer906);

                        String correctAnswer906 = ts9.t9a6();


                        String response7 = "";
                        if (userAnswer906.equals(correctAnswer906)) {
                            response7 = "Правильно! Ответ на вопрос \"";
                        } else {
                            response7 = "Неправильно. Ответ на вопрос \"";
                        }
                        //   sendMessage(chatId, response7);


                        userCurrentQuestions.remove(chatId); // Удаление состояния пользователя после завершения теста


                    default:
                        String test = (String) storeAnswer.get(update.getCallbackQuery().getFrom().getId()).get("test");
                        String scoreMessage = calculateScore9(chatId, readExcelFile9, userAnswers, test);
                        storeAnswer.remove(update.getCallbackQuery().getFrom().getId());
                        sendMessage(chatId, scoreMessage);


                        try {
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            Connection con = DriverManager.getConnection(
                                    "jdbc:mysql://37.143.15.239:3306/telegram-bot", "root", "yiPDmV6d75");

                            String idtg = String.valueOf(chatId);

                            System.out.println("idtg: " + idtg);
                            // Проверяем, существует ли уже запись с указанным idtg
                            String checkQuery = "SELECT * FROM user WHERE idtg = ?";
                            PreparedStatement checkStmt = con.prepareStatement(checkQuery);
                            checkStmt.setString(1, String.valueOf(idtg));
                            ResultSet resultSet = checkStmt.executeQuery();

                            if (resultSet.next()) {
                                // Запись с указанным idtg уже существует, выполняем обновление данных
                                String updateQuery = "UPDATE user SET test9 = ? WHERE idtg = ?";
                                PreparedStatement updateStmt = con.prepareStatement(updateQuery);
                                updateStmt.setString(1, fdb9);
                                updateStmt.setString(2, String.valueOf(idtg));
                                int rowsAffected = updateStmt.executeUpdate();

                                if (rowsAffected > 0) {
                                    System.out.println("Данные успешно обновлены");
                                    aftt9(chatId); // Вызываем метод после успешного обновления данных
                                } else {
                                    System.out.println("Не удалось обновить данные");
                                }
                            } else {
                                // Запись с указанным idtg не существует, ничего не делаем
                                System.out.println("Нет записи с указанным idtg");
                            }

                            con.close();
                        } catch (Exception e) {
                            System.out.println(e);
                        }

                        userCurrentQuestions.remove(chatId); // Удаление состояния пользователя после завершения теста


                        break;

                }
            }

          if (callbackData.equals("next10")) {

              deleteMessage(chatId, messageId);


            it(chatId, result1001); // вызов метода getRandomQuestionFromDatabase





            } else if (callbackData.equals("A10") || callbackData.equals("B10") || callbackData.equals("C10") || callbackData.equals("D10")) {
              int Answers = correctitog.getOrDefault(chatId,0);
              int currentQuestion = userCurrentQuestions.getOrDefault(chatId, 1); // Получение текущего вопроса для пользователя
                switch (currentQuestion) {
                    case 1:


                        deleteMessage(chatId, messageId);
                        String userAnswer1000 = callbackData;

                        userAnswers.add(userAnswer1000);


                        /*int size = 1;  // Ограничение на количество итераций

                        for (String question : questionAndAnswer.keySet()) {
                            String correctAnswer = questionAndAnswer.get(question);
                            System.out.println("Вопрос: " + questionAndAnswer.firstEntry());
                            System.out.println("Правильный ответ: " + questionAndAnswer.lastKey());

                            size--;
                            if (size == 0) {
                                break;  // Выходим из цикла после одной итерации
                            }
                        }*/

                        it(chatId, result1002);


                        for (String question : questionAndAnswer.keySet()) {
                            String correctAnswer1 = questionAndAnswer.get(question);
                            String response = "";

                            if (userAnswer1000.equals(correctAnswer1)) {
                                response = "Правильно! Ответ на вопрос \"" + correctAnswer1;
                                correctitog.put(chatId, Answers + 1);
                            } else {
                                response = "Неправильно. Ответ на вопрос \" " + correctAnswer1;
                            }


                              //  sendMessage(chatId, response);// Вывод сообщения только если еще не было выведено

                        }


                        // Переход к следующему вопросу
                        userCurrentQuestions.put(chatId, currentQuestion + 1);
                        break;
                    case 2:
                        deleteMessage(chatId, messageId);

                        String userAnswer1001 = callbackData;

                        userAnswers.add(userAnswer1001);

                        for (String question : questionAndAnswer2.keySet()) {
                            String correctAnswer1 = questionAndAnswer2.get(question);
                            String response = "";

                            if (userAnswer1001.equals(correctAnswer1)) {
                                response = "Правильно! Ответ на вопрос \"" + correctAnswer1;
                                correctitog.put(chatId, Answers + 1);
                            } else {
                                response = "Неправильно. Ответ на вопрос \" " + correctAnswer1;
                            }


                           // sendMessage(chatId, response); // Вывод сообщения только если еще не было выведено

                        }


                        it(chatId, result1003);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;
                    case 3:
                        deleteMessage(chatId, messageId);

                        String userAnswer1002 = callbackData;

                        userAnswers.add(userAnswer1002);

                        for (String question : questionAndAnswer3.keySet()) {
                            String correctAnswer1 = questionAndAnswer3.get(question);
                            String response = "";

                            if (userAnswer1002.equals(correctAnswer1)) {
                                response = "Правильно! Ответ на вопрос \"" + correctAnswer1;
                                correctitog.put(chatId, Answers + 1);
                            } else {
                                response = "Неправильно. Ответ на вопрос \" " + correctAnswer1;
                            }


                          //  sendMessage(chatId, response); // Вывод сообщения только если еще не было выведено

                        }


                        it(chatId, result1004);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;
                    case 4:
                        deleteMessage(chatId, messageId);

                        String userAnswer1003 = callbackData;

                        userAnswers.add(userAnswer1003);

                        for (String question : questionAndAnswer4.keySet()) {
                            String correctAnswer1 = questionAndAnswer4.get(question);
                            String response = "";

                            if (userAnswer1003.equals(correctAnswer1)) {
                                response = "Правильно! Ответ на вопрос \"" + correctAnswer1;
                                correctitog.put(chatId, Answers + 1);
                            } else {
                                response = "Неправильно. Ответ на вопрос \" " + correctAnswer1;
                            }


                           // sendMessage(chatId, response); // Вывод сообщения только если еще не было выведено

                        }


                        it(chatId, result1005);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;

                    case 5:
                        deleteMessage(chatId, messageId);

                        String userAnswer1004 = callbackData;

                        userAnswers.add(userAnswer1004);

                        for (String question : questionAndAnswer5.keySet()) {
                            String correctAnswer1 = questionAndAnswer5.get(question);
                            String response = "";

                            if (userAnswer1004.equals(correctAnswer1)) {
                                response = "Правильно! Ответ на вопрос \"" + correctAnswer1;
                                correctitog.put(chatId, Answers + 1);
                            } else {
                                response = "Неправильно. Ответ на вопрос \" " + correctAnswer1;
                            }


                           // sendMessage(chatId, response); // Вывод сообщения только если еще не было выведено

                        }


                        it(chatId, result1006);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;

                    case 6:
                        deleteMessage(chatId, messageId);

                        String userAnswer1005 = callbackData;

                        userAnswers.add(userAnswer1005);

                        for (String question : questionAndAnswer6.keySet()) {
                            String correctAnswer1 = questionAndAnswer6.get(question);
                            String response = "";

                            if (userAnswer1005.equals(correctAnswer1)) {
                                response = "Правильно! Ответ на вопрос \"" + correctAnswer1;
                                correctitog.put(chatId, Answers + 1);
                            } else {
                                response = "Неправильно. Ответ на вопрос \" " + correctAnswer1;
                            }


                           // sendMessage(chatId, response); // Вывод сообщения только если еще не было выведено

                        }


                        it(chatId, result1007);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;

                    case 7:
                        deleteMessage(chatId, messageId);

                        String userAnswer1006 = callbackData;

                        userAnswers.add(userAnswer1006);

                        for (String question : questionAndAnswer7.keySet()) {
                            String correctAnswer1 = questionAndAnswer7.get(question);
                            String response = "";

                            if (userAnswer1006.equals(correctAnswer1)) {
                                response = "Правильно! Ответ на вопрос \"" + correctAnswer1;
                                correctitog.put(chatId, Answers + 1);
                            } else {
                                response = "Неправильно. Ответ на вопрос \" " + correctAnswer1;
                            }


                          //  sendMessage(chatId, response); // Вывод сообщения только если еще не было выведено

                        }


                        it(chatId, result1008);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;

                    case 8:
                        deleteMessage(chatId, messageId);

                        String userAnswer1008 = callbackData;

                        userAnswers.add(userAnswer1008);

                        for (String question : questionAndAnswer8.keySet()) {
                            String correctAnswer1 = questionAndAnswer8.get(question);
                            String response = "";

                            if (userAnswer1008.equals(correctAnswer1)) {
                                response = "Правильно! Ответ на вопрос \"" + correctAnswer1;
                                correctitog.put(chatId, Answers + 1);
                            } else {
                                response = "Неправильно. Ответ на вопрос \" " + correctAnswer1;
                            }


                          //  sendMessage(chatId, response); // Вывод сообщения только если еще не было выведено

                        }


                        it(chatId, result1009);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;

                    case 9:
                        deleteMessage(chatId, messageId);

                        String userAnswer1009 = callbackData;

                        userAnswers.add(userAnswer1009);

                        for (String question : questionAndAnswer9.keySet()) {
                            String correctAnswer1 = questionAndAnswer9.get(question);
                            String response = "";

                            if (userAnswer1009.equals(correctAnswer1)) {
                                response = "Правильно! Ответ на вопрос \"" + correctAnswer1;
                                correctitog.put(chatId, Answers + 1);
                            } else {
                                response = "Неправильно. Ответ на вопрос \" " + correctAnswer1;
                            }


                          //  sendMessage(chatId, response); // Вывод сообщения только если еще не было выведено

                        }


                        it(chatId, result1010);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;
                    case 10:
                        deleteMessage(chatId, messageId);

                        String userAnswer1010 = callbackData;

                        userAnswers.add(userAnswer1010);

                        for (String question : questionAndAnswer10.keySet()) {
                            String correctAnswer1 = questionAndAnswer10.get(question);
                            String response = "";

                            if (userAnswer1010.equals(correctAnswer1)) {
                                response = "Правильно! Ответ на вопрос \"" + correctAnswer1;
                                correctitog.put(chatId, Answers + 1);
                            } else {
                                response = "Неправильно. Ответ на вопрос \" " + correctAnswer1;
                            }


                          //  sendMessage(chatId, response); // Вывод сообщения только если еще не было выведено

                        }


                        it(chatId, result1011);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;
                    case 11:
                        deleteMessage(chatId, messageId);

                        String userAnswer1011 = callbackData;

                        userAnswers.add(userAnswer1011);

                        for (String question : questionAndAnswer11.keySet()) {
                            String correctAnswer1 = questionAndAnswer11.get(question);
                            String response = "";

                            if (userAnswer1011.equals(correctAnswer1)) {
                                response = "Правильно! Ответ на вопрос \"" + correctAnswer1;
                                correctitog.put(chatId, Answers + 1);
                            } else {
                                response = "Неправильно. Ответ на вопрос \" " + correctAnswer1;
                            }


                          //  sendMessage(chatId, response); // Вывод сообщения только если еще не было выведено

                        }


                        it(chatId, result1012);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;
                    case 12:
                        deleteMessage(chatId, messageId);

                        String userAnswer1012 = callbackData;

                        userAnswers.add(userAnswer1012);

                        for (String question : questionAndAnswer12.keySet()) {
                            String correctAnswer1 = questionAndAnswer12.get(question);
                            String response = "";

                            if (userAnswer1012.equals(correctAnswer1)) {
                                response = "Правильно! Ответ на вопрос \"" + correctAnswer1;
                                correctitog.put(chatId, Answers + 1);
                            } else {
                                response = "Неправильно. Ответ на вопрос \" " + correctAnswer1;
                            }


                           // sendMessage(chatId, response); // Вывод сообщения только если еще не было выведено

                        }


                        it(chatId, result1013);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;
                    case 13:
                        deleteMessage(chatId, messageId);

                        String userAnswer1013 = callbackData;

                        userAnswers.add(userAnswer1013);

                        for (String question : questionAndAnswer13.keySet()) {
                            String correctAnswer1 = questionAndAnswer13.get(question);
                            String response = "";

                            if (userAnswer1013.equals(correctAnswer1)) {
                                response = "Правильно! Ответ на вопрос \"" + correctAnswer1;
                                correctitog.put(chatId, Answers + 1);
                            } else {
                                response = "Неправильно. Ответ на вопрос \" " + correctAnswer1;
                            }


                          //  sendMessage(chatId, response); // Вывод сообщения только если еще не было выведено

                        }


                        it(chatId, result1014);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;
                    case 14:
                        deleteMessage(chatId, messageId);

                        String userAnswer1014 = callbackData;

                        userAnswers.add(userAnswer1014);

                        for (String question : questionAndAnswer14.keySet()) {
                            String correctAnswer1 = questionAndAnswer14.get(question);
                            String response = "";

                            if (userAnswer1014.equals(correctAnswer1)) {
                                response = "Правильно! Ответ на вопрос \"" + correctAnswer1;
                                correctitog.put(chatId, Answers + 1);
                            } else {
                                response = "Неправильно. Ответ на вопрос \" " + correctAnswer1;
                            }


                          //  sendMessage(chatId, response); // Вывод сообщения только если еще не было выведено

                        }


                        it(chatId, result1015);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;
                    case 15:
                        deleteMessage(chatId, messageId);

                        String userAnswer1015 = callbackData;

                        userAnswers.add(userAnswer1015);

                        for (String question : questionAndAnswer15.keySet()) {
                            String correctAnswer1 = questionAndAnswer15.get(question);
                            String response = "";

                            if (userAnswer1015.equals(correctAnswer1)) {
                                response = "Правильно! Ответ на вопрос \"" + correctAnswer1;
                                correctitog.put(chatId, Answers + 1);
                            } else {
                                response = "Неправильно. Ответ на вопрос \" " + correctAnswer1;
                            }


                           // sendMessage(chatId, response); // Вывод сообщения только если еще не было выведено

                        }


                        it(chatId, result1016);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;
                    case 16:
                        deleteMessage(chatId, messageId);

                        String userAnswer1016 = callbackData;

                        userAnswers.add(userAnswer1016);

                        for (String question : questionAndAnswer16.keySet()) {
                            String correctAnswer1 = questionAndAnswer16.get(question);
                            String response = "";

                            if (userAnswer1016.equals(correctAnswer1)) {
                                response = "Правильно! Ответ на вопрос \"" + correctAnswer1;
                                correctitog.put(chatId, Answers + 1);
                            } else {
                                response = "Неправильно. Ответ на вопрос \" " + correctAnswer1;
                            }


                           // sendMessage(chatId, response); // Вывод сообщения только если еще не было выведено

                        }


                        it(chatId, result1017);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;
                    case 17:
                        deleteMessage(chatId, messageId);

                        String userAnswer1017 = callbackData;

                        userAnswers.add(userAnswer1017);

                        for (String question : questionAndAnswer17.keySet()) {
                            String correctAnswer1 = questionAndAnswer17.get(question);
                            String response = "";

                            if (userAnswer1017.equals(correctAnswer1)) {
                                response = "Правильно! Ответ на вопрос \"" + correctAnswer1;
                                correctitog.put(chatId, Answers + 1);
                            } else {
                                response = "Неправильно. Ответ на вопрос \" " + correctAnswer1;
                            }


                            //sendMessage(chatId, response); // Вывод сообщения только если еще не было выведено

                        }


                        it(chatId, result1018);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;
                    case 18:
                        deleteMessage(chatId, messageId);

                        String userAnswer1018 = callbackData;

                        userAnswers.add(userAnswer1018);

                        for (String question : questionAndAnswer18.keySet()) {
                            String correctAnswer1 = questionAndAnswer18.get(question);
                            String response = "";

                            if (userAnswer1018.equals(correctAnswer1)) {
                                response = "Правильно! Ответ на вопрос \"" + correctAnswer1;
                                correctitog.put(chatId, Answers + 1);
                            } else {
                                response = "Неправильно. Ответ на вопрос \" " + correctAnswer1;
                            }


                           // sendMessage(chatId, response); // Вывод сообщения только если еще не было выведено

                        }


                        it(chatId, result1019);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;
                    case 19:
                        deleteMessage(chatId, messageId);

                        String userAnswer1019 = callbackData;

                        userAnswers.add(userAnswer1019);

                        for (String question : questionAndAnswer19.keySet()) {
                            String correctAnswer1 = questionAndAnswer19.get(question);
                            String response = "";

                            if (userAnswer1019.equals(correctAnswer1)) {
                                response = "Правильно! Ответ на вопрос \"" + correctAnswer1;
                                correctitog.put(chatId, Answers + 1);
                            } else {
                                response = "Неправильно. Ответ на вопрос \" " + correctAnswer1;
                            }


                            // // Вывод сообщения только если еще не было выведено

                        }


                        it(chatId, result1020);


                        userCurrentQuestions.put(chatId, currentQuestion + 1); // Переход к следующему вопросу

                        break;

                    case 20:
                        deleteMessage(chatId, messageId);

                        String userAnswer1020 = callbackData;

                        userAnswers.add(userAnswer1020);

                        for (String question : questionAndAnswer20.keySet()) {
                            String correctAnswer1 = questionAndAnswer20.get(question);
                            String response = "";

                            if (userAnswer1020.equals(correctAnswer1)) {
                                response = "Правильно! Ответ на вопрос \"" + correctAnswer1;
                                correctitog.put(chatId, Answers + 1);
                            } else {
                                response = "Неправильно. Ответ на вопрос \" " + correctAnswer1;
                            }


                            //sendMessage(chatId, response); // Вывод сообщения только если еще не было выведено

                        }


                        userCurrentQuestions.remove(chatId); // Удаление состояния пользователя после завершения теста


                    default:
                        String test = (String) storeAnswer.get(update.getCallbackQuery().getFrom().getId()).get("test");

                        // Calculate pass percentage
                        double passThreshold =  0.8; // 80% pass threshold
                        double percentageCorrect = (double) Answers / 20;
                        int percentageCorrectInt = (int) Math.round(percentageCorrect * 100);


                        String scoreMessage;
                        if (percentageCorrect >= passThreshold) {
                            // Test passed
                            scoreMessage = "Тест пройден!\nКоличество Правильных ответов: " + percentageCorrectInt + "% из 100%" ;
                        } else {
                            // Test not passed
                            scoreMessage = "Тест Не пройден!\nКоличество Правильных ответов: " + percentageCorrectInt +
                                    "% из 100%";
                        }

                        // Display the pass/fail message
                        sendMessage(chatId, scoreMessage);


                        // Clean up and remove user state
                        storeAnswer.remove(update.getCallbackQuery().getFrom().getId());



                        try {
                            Class.forName("com.mysql.cj.jdbc.Driver");
                            Connection con = DriverManager.getConnection(
                                    "jdbc:mysql://37.143.15.239:3306/telegram-bot", "root", "yiPDmV6d75");

                            String idtg = String.valueOf(chatId);

                            System.out.println("idtg: " + idtg);
                            // Проверяем, существует ли уже запись с указанным idtg
                            String checkQuery = "SELECT * FROM user WHERE idtg = ?";
                            PreparedStatement checkStmt = con.prepareStatement(checkQuery);
                            checkStmt.setString(1, String.valueOf(idtg));
                            ResultSet resultSet = checkStmt.executeQuery();

                            if (resultSet.next()) {
                                // Запись с указанным idtg уже существует, выполняем обновление данных
                                String updateQuery = "UPDATE user SET itogoviy = ? WHERE idtg = ?";
                                PreparedStatement updateStmt = con.prepareStatement(updateQuery);
                                updateStmt.setString(1, String.valueOf(Answers));
                                updateStmt.setString(2, String.valueOf(idtg));
                                int rowsAffected = updateStmt.executeUpdate();

                                if (rowsAffected > 0) {
                                    System.out.println("Данные успешно обновлены");
                                    aftt10(chatId); // Вызываем метод после успешного обновления данных
                                } else {
                                    System.out.println("Не удалось обновить данные");
                                }
                            } else {
                                // Запись с указанным idtg не существует, ничего не делаем
                                System.out.println("Нет записи с указанным idtg");
                            }

                            con.close();
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                        userCurrentQuestions.remove(chatId);
                        break;

                }
            }

                }
            }






    private String calculateScore(long chatId, Test1 readExcelFile1, List<String> userAnswers, String test) {
        int score = 0;
        String[] correctAnswers = readExcelFile1.getCorrectAnswers();
        StringBuilder responseBuilder = new StringBuilder();
        for (int i = 0; i < correctAnswers.length; i++) {
            if (userAnswers.get(i).equals(correctAnswers[i])) {
                score++;
            }
        }

        double percentage = (double) score / correctAnswers.length * 100;
        SendMessage message = new SendMessage();
        String formattedPercentage = String.format("%.0f%%", percentage); // Округляем до целого числа и добавляем символ процента


        if (percentage >= 80) {
            String response = "Поздравляю! Тест пройден!\nКоличество правильных ответов: " + formattedPercentage + " из 100%";
            responseBuilder.append(response).append("\n");
        } else {
            String response = "Тест НЕ пройден!\nКоличество правильных ответов: " + formattedPercentage + " из 100%";
            responseBuilder.append(response).append("\n");
        }

        fdb1 = formattedPercentage;
        //System.out.println(fdb1);


        return responseBuilder.toString();

    }




    private String calculateScore2(long chatId, Test2 readExcelFile2, List<String> userAnswers, String test) {
        int score = 0;
        String[] correctAnswers = readExcelFile2.getCorrectAnswers2();
        StringBuilder responseBuilder = new StringBuilder();
        for (int i = 0; i < correctAnswers.length; i++) {
            if (userAnswers.get(i).equals(correctAnswers[i])) {
                score++;
            }
        }

        double percentage = (double) score / correctAnswers.length * 100;
        String formattedPercentage = String.format("%.0f%%", percentage); // Округляем до целого числа и добавляем символ процента

        if (percentage >= 80) {
            String response = "Поздравляю! Тест пройден!\nКоличество правильных ответов: " + formattedPercentage + " из 100%";
            responseBuilder.append(response).append("\n");
        } else {
            String response = "Тест НЕ пройден!\nКоличество правильных ответов: " + formattedPercentage + " из 100%";
            responseBuilder.append(response).append("\n");
        }

        fdb2 = formattedPercentage;
        //System.out.println(fdb2);

        return responseBuilder.toString();
    }

    private String calculateScore3(long chatId, Test3 readExcelFile3, List<String> userAnswers, String test) {
        int score = 0;
        String[] correctAnswers = readExcelFile3.getCorrectAnswers3();
        StringBuilder responseBuilder = new StringBuilder();
        for (int i = 0; i < correctAnswers.length; i++) {
            if (userAnswers.get(i).equals(correctAnswers[i])) {
                score++;
            }
        }

        double percentage = (double) score / correctAnswers.length * 100;
        String formattedPercentage = String.format("%.0f%%", percentage); // Округляем до целого числа и добавляем символ процента

        if (percentage >= 80) {
            String response = "Поздравляю! Тест пройден!\nКоличество правильных ответов: " + formattedPercentage + " из 100%";
            responseBuilder.append(response).append("\n");
        } else {
            String response = "Тест НЕ пройден!\nКоличество правильных ответов: " + formattedPercentage + " из 100%";
            responseBuilder.append(response).append("\n");
        }

        fdb3 = formattedPercentage;
        //System.out.println(fdb3);

        return responseBuilder.toString();
    }

    private String calculateScore4(long chatId, Test4 readExcelFile4, List<String> userAnswers, String test) {
        int score = 0;
        String[] correctAnswers = readExcelFile4.getCorrectAnswers4();
        StringBuilder responseBuilder = new StringBuilder();
        for (int i = 0; i < correctAnswers.length; i++) {
            if (userAnswers.get(i).equals(correctAnswers[i])) {
                score++;
            }
        }

        double percentage = (double) score / correctAnswers.length * 100;
        String formattedPercentage = String.format("%.0f%%", percentage); // Округляем до целого числа и добавляем символ процента

        if (percentage >= 80) {
            String response = "Поздравляю! Тест пройден!\nКоличество правильных ответов: " + formattedPercentage + " из 100%";
            responseBuilder.append(response).append("\n");
        } else {
            String response = "Тест НЕ пройден!\nКоличество правильных ответов: " + formattedPercentage + " из 100%";
            responseBuilder.append(response).append("\n");
        }

        fdb4 = formattedPercentage;
       // System.out.println(fdb4);

        return responseBuilder.toString();
    }

    private String calculateScore5(long chatId, Test5 readExcelFile5, List<String> userAnswers, String test) {
        int score = 0;
        String[] correctAnswers = readExcelFile5.getCorrectAnswers5();
        StringBuilder responseBuilder = new StringBuilder();
        for (int i = 0; i < correctAnswers.length; i++) {
            if (userAnswers.get(i).equals(correctAnswers[i])) {
                score++;
            }
        }

        double percentage = (double) score / correctAnswers.length * 100;
        String formattedPercentage = String.format("%.0f%%", percentage); // Округляем до целого числа и добавляем символ процента

        if (percentage >= 80) {
            String response = "Поздравляю! Тест пройден!\nКоличество правильных ответов: " + formattedPercentage + " из 100%";
            responseBuilder.append(response).append("\n");
        } else {
            String response = "Тест НЕ пройден!\nКоличество правильных ответов: " + formattedPercentage + " из 100%";
            responseBuilder.append(response).append("\n");
        }

        fdb5 = formattedPercentage;
        //System.out.println(fdb5);

        return responseBuilder.toString();
    }

    private String calculateScore6(long chatId, Test6 readExcelFile6, List<String> userAnswers, String test) {
        int score = 0;
        String[] correctAnswers = readExcelFile6.getCorrectAnswers6();
        StringBuilder responseBuilder = new StringBuilder();
        for (int i = 0; i < correctAnswers.length; i++) {
            if (userAnswers.get(i).equals(correctAnswers[i])) {
                score++;
            }
        }

        double percentage = (double) score / correctAnswers.length * 100;
        String formattedPercentage = String.format("%.0f%%", percentage); // Округляем до целого числа и добавляем символ процента

        if (percentage >= 80) {
            String response = "Поздравляю! Тест пройден!\nКоличество правильных ответов: " + formattedPercentage + " из 100%";
            responseBuilder.append(response).append("\n");
        } else {
            String response = "Тест НЕ пройден!\nКоличество правильных ответов: " + formattedPercentage + " из 100%";
            responseBuilder.append(response).append("\n");
        }

        fdb6 = formattedPercentage;
       // System.out.println(fdb6);

        return responseBuilder.toString();
    }

    private String calculateScore7(long chatId, Test7 readExcelFile7, List<String> userAnswers, String test) {
        int score = 0;
        String[] correctAnswers = readExcelFile7.getCorrectAnswers7();
        StringBuilder responseBuilder = new StringBuilder();
        for (int i = 0; i < correctAnswers.length; i++) {
            if (userAnswers.get(i).equals(correctAnswers[i])) {
                score++;
            }
        }

        double percentage = (double) score / correctAnswers.length * 100;
        String formattedPercentage = String.format("%.0f%%", percentage); // Округляем до целого числа и добавляем символ процента

        if (percentage >= 80) {
            String response = "Поздравляю! Тест пройден!\nКоличество правильных ответов: " + formattedPercentage + " из 100%";
            responseBuilder.append(response).append("\n");
        } else {
            String response = "Тест НЕ пройден!\nКоличество правильных ответов: " + formattedPercentage + " из 100%";
            responseBuilder.append(response).append("\n");
        }

        fdb7 = formattedPercentage;
       // System.out.println(fdb7);

        return responseBuilder.toString();
    }

    private String calculateScore8(long chatId, Test8 readExcelFile8, List<String> userAnswers, String test) {
        int score = 0;
        String[] correctAnswers = readExcelFile8.getCorrectAnswers8();
        StringBuilder responseBuilder = new StringBuilder();
        for (int i = 0; i < correctAnswers.length; i++) {
            if (userAnswers.get(i).equals(correctAnswers[i])) {
                score++;
            }
        }

        double percentage = (double) score / correctAnswers.length * 100;
        String formattedPercentage = String.format("%.0f%%", percentage); // Округляем до целого числа и добавляем символ процента

        if (percentage >= 80) {
            String response = "Поздравляю! Тест пройден!\nКоличество правильных ответов: " + formattedPercentage + " из 100%";
            responseBuilder.append(response).append("\n");
        } else {
            String response = "Тест НЕ пройден!\nКоличество правильных ответов: " + formattedPercentage + " из 100%";
            responseBuilder.append(response).append("\n");
        }

        fdb8 = formattedPercentage;
       // System.out.println(fdb8);

        return responseBuilder.toString();
    }

    private String calculateScore9(long chatId, Test9 readExcelFile9, List<String> userAnswers, String test) {
        int score = 0;
        String[] correctAnswers = readExcelFile9.getCorrectAnswers9();
        StringBuilder responseBuilder = new StringBuilder();
        for (int i = 0; i < correctAnswers.length; i++) {
            if (userAnswers.get(i).equals(correctAnswers[i])) {
                score++;
            }
        }

        double percentage = (double) score / correctAnswers.length * 100;
        String formattedPercentage = String.format("%.0f%%", percentage); // Округляем до целого числа и добавляем символ процента

        if (percentage >= 80) {
            String response = "Поздравляю! Тест пройден!\nКоличество правильных ответов: " + formattedPercentage + " из 100%";
            responseBuilder.append(response).append("\n");
        } else {
            String response = "Тест НЕ пройден!\nКоличество правильных ответов: " + formattedPercentage + " из 100%";
            responseBuilder.append(response).append("\n");
        }

        fdb9 = formattedPercentage;
       // System.out.println(fdb9);

        return responseBuilder.toString();
    }


    private void sendMainMenu(long chatId) {
        // Создаем кнопки
        KeyboardButton topHeroesButton = new KeyboardButton();
        topHeroesButton.setText(TEORY_TEXT);


        KeyboardButton topPlayersButton = new KeyboardButton();
        topPlayersButton.setText(TEST_TEXT);

        KeyboardButton rezzz = new KeyboardButton();
        rezzz.setText(REZZZ);

        KeyboardButton itog = new KeyboardButton();
        itog.setText(ITOG);


        // Создаем клавиатуру
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setOneTimeKeyboard(false);
        replyKeyboardMarkup.setResizeKeyboard(true);

        List<KeyboardRow> keyboardRows = new ArrayList<>();

        // Создаем отдельные строки для каждой кнопки
        KeyboardRow row1 = new KeyboardRow();
        row1.add(topHeroesButton);

        KeyboardRow row2 = new KeyboardRow();
        row2.add(topPlayersButton);

        KeyboardRow row3 = new KeyboardRow();
        row3.add(rezzz);

        KeyboardRow row4 = new KeyboardRow();
        row4.add(itog);

        keyboardRows.add(row1);
        keyboardRows.add(row2);
        keyboardRows.add(row3);
        keyboardRows.add(row4);

        replyKeyboardMarkup.setKeyboard(keyboardRows);

        // Создаем сообщение с клавиатурой
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("Кнопки находятся \uD83D\uDC47");
        message.setReplyMarkup(replyKeyboardMarkup);

        try {
            execute(message);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }








    public void sendTopHeroesMessage(long chatId) {
        // Создаем главную кнопку
        KeyboardButton topHeroesButton = new KeyboardButton(TEORY_TEXT);
        topHeroesButton.setText(TEORY_TEXT);

        // Создаем сообщение с главной кнопкой и клавиатурой
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        List<KeyboardRow> keyboardRows = new ArrayList<>();
        KeyboardRow keyboardRow = new KeyboardRow();
        keyboardRow.add(topHeroesButton);
        keyboardRows.add(keyboardRow);
        replyKeyboardMarkup.setKeyboard(keyboardRows);
        message.setReplyMarkup(replyKeyboardMarkup);
        //String response = parseMessage(message.getText());

        // Создаем список кнопок-подменю и добавляем их в инлайн-клавиатуру
        List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        List<InlineKeyboardButton> row4 = new ArrayList<>();
        List<InlineKeyboardButton> row5 = new ArrayList<>();
        List<InlineKeyboardButton> row6 = new ArrayList<>();
        List<InlineKeyboardButton> row7 = new ArrayList<>();
        List<InlineKeyboardButton> row8 = new ArrayList<>();
        List<InlineKeyboardButton> row9 = new ArrayList<>();


        // Add 6 inline buttons to row6
        row1.add(createInlineButton("\uD83D\uDCE6Работа на складе", "bl1"));
        row2.add(createInlineButton("\uD83C\uDF8CВнешний вид", "bl2"));
        row3.add(createInlineButton("\uD83D\uDED2Взаимодействие с ТМЦ", "bl3"));
        row4.add(createInlineButton("\uD83D\uDC77\uD83C\uDFFCВодитель на смене", "bl4"));
        row5.add(createInlineButton("\uD83D\uDD3CПодъем", "bl5"));
        row6.add(createInlineButton("\uD83D\uDE9BДоставка", "bl6"));
        row7.add(createInlineButton("\uD83D\uDCDEВзаимодействие с клиентом", "bl7"));
        row8.add(createInlineButton("\uD83C\uDFE2Взаимодействие с СТЦ", "bl8"));
        row9.add(createInlineButton("\uD83D\uDD27Возврат товара", "bl9"));


        rowsInline.add(row1);
        rowsInline.add(row2);
        rowsInline.add(row3);
        rowsInline.add(row4);
        rowsInline.add(row5);
        rowsInline.add(row6);
        rowsInline.add(row7);
        rowsInline.add(row8);
        rowsInline.add(row9);


        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline);

        message.setReplyMarkup(markupInline);
        message.setText("Выберите тему, которую хотите изучить");


        try {
            execute(message);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    private static InlineKeyboardButton createInlineButton(String buttonText, String callbackData) {
        InlineKeyboardButton button = new InlineKeyboardButton();
        button.setText(buttonText);
        button.setCallbackData(callbackData);
        return button;
    }

    private void sendTopPlayersMessage(long chatId) {
        // Создаем главную кнопку
        KeyboardButton topPlayersButton = new KeyboardButton(TEST_TEXT);
        topPlayersButton.setText(TEST_TEXT);

        // Создаем сообщение с главной кнопкой и клавиатурой
        SendMessage message1 = new SendMessage();
        message1.setChatId(chatId);
        ReplyKeyboardMarkup replyKeyboardMarkup1 = new ReplyKeyboardMarkup();
        replyKeyboardMarkup1.setSelective(true);
        replyKeyboardMarkup1.setResizeKeyboard(true);
        replyKeyboardMarkup1.setOneTimeKeyboard(false); // добавляем эту строку
        List<KeyboardRow> keyboardRows1 = new ArrayList<>();
        KeyboardRow keyboardRow1 = new KeyboardRow();
        keyboardRow1.add(topPlayersButton);
        keyboardRows1.add(keyboardRow1);
        replyKeyboardMarkup1.setKeyboard(keyboardRows1);
        message1.setReplyMarkup(replyKeyboardMarkup1);

        // Создаем список кнопок-подменю и добавляем их в инлайн-клавиатуру
        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        List<InlineKeyboardButton> row4 = new ArrayList<>();
        List<InlineKeyboardButton> row5 = new ArrayList<>();
        List<InlineKeyboardButton> row6 = new ArrayList<>();
        List<InlineKeyboardButton> row7 = new ArrayList<>();
        List<InlineKeyboardButton> row8 = new ArrayList<>();
        List<InlineKeyboardButton> row9 = new ArrayList<>();


        // Add 6 inline buttons to row6
        row1.add(createInlineButton1("\uD83D\uDCE6Работа на складе", "test1"));
        row2.add(createInlineButton1("\uD83C\uDF8CВнешний вид", "test2"));
        row3.add(createInlineButton1("\uD83D\uDED2Взаимодействие с ТМЦ", "test3"));
        row4.add(createInlineButton1("\uD83D\uDC77\uD83C\uDFFCВодитель на смене", "test4"));
        row5.add(createInlineButton1("\uD83D\uDD3CПодъём", "test5"));
        row6.add(createInlineButton1("\uD83D\uDE9BДоставка", "test6"));
        row7.add(createInlineButton1("\uD83D\uDCDEВзаимодействие с клиентом", "test7"));
        row8.add(createInlineButton1("\uD83C\uDFE2Взаимодействие с СТЦ", "test8"));
        row9.add(createInlineButton1("\uD83D\uDD27Возврат товара", "test9"));


        rowsInline1.add(row1);
        rowsInline1.add(row2);
        rowsInline1.add(row3);
        rowsInline1.add(row4);
        rowsInline1.add(row5);
        rowsInline1.add(row6);
        rowsInline1.add(row7);
        rowsInline1.add(row8);
        rowsInline1.add(row9);



        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);

        // Добавляем инлайн-клавиатуру в сообщение
        message1.setReplyMarkup(markupInline);

        // Устанавливаем текст сообщения
        message1.setText("Выберите тест, который хотите пройти");

        try {
            execute(message1);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }


    private InlineKeyboardButton createInlineButton1(String buttonText, String callbackData) {
        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText(buttonText);
        button1.setCallbackData(callbackData);
        return button1;
    }

    public void rezzz(long chatId) {
        // Создаем главную кнопку
        KeyboardButton rezz = new KeyboardButton(REZZZ);
        rezz.setText(REZZZ);

        // Создаем сообщение с главной кнопкой и клавиатурой
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        ReplyKeyboardMarkup replyKeyboardMarkup1 = new ReplyKeyboardMarkup();
        replyKeyboardMarkup1.setSelective(true);
        replyKeyboardMarkup1.setResizeKeyboard(true);
        replyKeyboardMarkup1.setOneTimeKeyboard(false); // добавляем эту строку
        List<KeyboardRow> keyboardRows1 = new ArrayList<>();
        KeyboardRow keyboardRow1 = new KeyboardRow();
        keyboardRow1.add(rezz);
        keyboardRows1.add(keyboardRow1);
        replyKeyboardMarkup1.setKeyboard(keyboardRows1);
        message.setReplyMarkup(replyKeyboardMarkup1);

        // Создаем список кнопок-подменю и добавляем их в инлайн-клавиатуру
        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();


        // Add 6 inline buttons to row6
        row1.add(createInlineButton1("⭐\uFE0FМои результаты", "testrez"));
        row1.add(createInlineButton1("✨Общий рейтинг", "rating"));


        rowsInline1.add(row1);
        rowsInline1.add(row2);


        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);

        // Добавляем инлайн-клавиатуру в сообщение
        message.setReplyMarkup(markupInline);

        // Устанавливаем текст сообщения
        message.setText("Посмотрите свои результаты и общий рейтинг");

        try {
            execute(message);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    public void zatichka(long chatId) {
        // Создаем главную кнопку


        // Создаем сообщение с главной кнопкой и клавиатурой
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        ReplyKeyboardMarkup replyKeyboardMarkup1 = new ReplyKeyboardMarkup();
        replyKeyboardMarkup1.setSelective(true);
        replyKeyboardMarkup1.setResizeKeyboard(true);
        replyKeyboardMarkup1.setOneTimeKeyboard(false); // добавляем эту строку
        List<KeyboardRow> keyboardRows1 = new ArrayList<>();
        KeyboardRow keyboardRow1 = new KeyboardRow();

        keyboardRows1.add(keyboardRow1);
        replyKeyboardMarkup1.setKeyboard(keyboardRows1);
        message.setReplyMarkup(replyKeyboardMarkup1);

        // Создаем список кнопок-подменю и добавляем их в инлайн-клавиатуру
        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();


        // Add 6 inline buttons to row6
        row1.add(createInlineButton1("\uD83D\uDCD5К теории", "teory"));



        rowsInline1.add(row1);
        rowsInline1.add(row2);


        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);

        // Добавляем инлайн-клавиатуру в сообщение
        message.setReplyMarkup(markupInline);

        // Устанавливаем текст сообщения
        message.setText("Скоро сделаем:)");

        try {
            execute(message);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    private long sendttt(long chatId, String result) {
        SendMessage message1 = new SendMessage();
        message1.setChatId(chatId);
        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();

        row1.add(createInlineButton1("A", "A"));
        row1.add(createInlineButton1("B", "B"));
        row2.add(createInlineButton1("C", "C"));
        row2.add(createInlineButton1("D", "D"));

        rowsInline1.add(row1);
        rowsInline1.add(row2);

        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);
        message1.setText("");
        result1 = readExcelFile1.b1q1();
        result2 = readExcelFile1.b1q2();
        result3 = readExcelFile1.b1q3();
        result4 = readExcelFile1.b1q4();
        result5 = readExcelFile1.b1q5();
        result6 = readExcelFile1.b1q6();
        result7 = readExcelFile1.b1q7();
        result8 = readExcelFile1.b1q8();
        result9 = readExcelFile1.b1q9();
        result10 = readExcelFile1.b1q10();
        result11 = readExcelFile1.b1q11();
        result12 = readExcelFile1.b1q12();

        String text = result + "\nВыберите один из вариантов:";
        message1.setText(text);
        message1.setReplyMarkup(markupInline);

        try {
            execute(message1);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
        return chatId;
    }


    private void for1(long chatId, String result) {
        // Создаем сообщение с текстом и клавиатурой
        SendMessage message1 = new SendMessage();
        message1.setChatId(chatId);

        // Создаем список кнопок-подменю и добавляем их в инлайн-клавиатуру
        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();

        // Add 4 inline buttons to rows
        row1.add(createInlineButton1("A", "A"));
        row1.add(createInlineButton1("B", "B"));
        row2.add(createInlineButton1("C", "C"));

        rowsInline1.add(row1);
        rowsInline1.add(row2);

        // Создаем объект для клавиатуры
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);
        message1.setText("");

        result7 = readExcelFile1.b1q7();
        result12 = readExcelFile1.b1q12();

        // Устанавливаем текст сообщения
        String text = result + "Выберите один из вариантов:";
        message1.setText(text);

        // Добавляем клавиатуру в сообщение
        message1.setReplyMarkup(markupInline);


        try {
            execute(message1);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }




    private long ttt2(long chatId, String result) {
        SendMessage message1 = new SendMessage();
        message1.setChatId(chatId);

        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        List<InlineKeyboardButton> row4 = new ArrayList<>();

        row1.add(createInlineButton1("A", "A2"));
        row1.add(createInlineButton1("B", "B2"));
        row2.add(createInlineButton1("C", "C2"));
        row2.add(createInlineButton1("D", "D2"));

        rowsInline1.add(row1);
        rowsInline1.add(row2);

        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);
        message1.setText("");


        //TEST2
        result23 = readExcelFile2.b2q3();
        result24 = readExcelFile2.b2q4();
        result25 = readExcelFile2.b2q5();
        result26 = readExcelFile2.b2q6();


        String text = result + "\nВыберите один из вариантов:";
        message1.setText(text);

        message1.setReplyMarkup(markupInline);

        try {
            execute(message1);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
        return chatId;
    }
    private void for2(long chatId, String result) {
        // Создаем сообщение с текстом и клавиатурой
        SendMessage message1 = new SendMessage();
        message1.setChatId(chatId);

        // Создаем список кнопок-подменю и добавляем их в инлайн-клавиатуру
        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        List<InlineKeyboardButton> row3 = new ArrayList<>();

        // Add 4 inline buttons to rows
        row1.add(createInlineButton1("A", "A2"));
        row1.add(createInlineButton1("B", "B2"));
        row2.add(createInlineButton1("C", "C2"));

        rowsInline1.add(row1);
        rowsInline1.add(row2);

        // Создаем объект для клавиатуры
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);
        message1.setText("");

        result21 = readExcelFile2.b2q1();
        result22 = readExcelFile2.b2q2();

        // Устанавливаем текст сообщения
        String text = result + "Выберите один из вариантов:";
        message1.setText(text);

        // Добавляем клавиатуру в сообщение
        message1.setReplyMarkup(markupInline);


        try {
            execute(message1);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    private long ttt3(long chatId, String result) {
        SendMessage message1 = new SendMessage();
        message1.setChatId(chatId);

        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        List<InlineKeyboardButton> row3 = new ArrayList<>();
        List<InlineKeyboardButton> row4 = new ArrayList<>();

        row1.add(createInlineButton1("A", "A3"));
        row1.add(createInlineButton1("B", "B3"));
        row2.add(createInlineButton1("C", "C3"));
        row2.add(createInlineButton1("D", "D3"));

        rowsInline1.add(row1);
        rowsInline1.add(row2);

        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);
        message1.setText("");


        //TEST3
        result31 = readExcelFile3.b3q1();
        //result32 = readExcelFile3.b3q2();
        result33 = readExcelFile3.b3q3();
        result34 = readExcelFile3.b3q4();
        result35 = readExcelFile3.b3q5();


        String text = result + "\nВыберите один из вариантов:";
        message1.setText(text);

        message1.setReplyMarkup(markupInline);

        try {
            execute(message1);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
        return chatId;
    }

    private void for3(long chatId, String result) {
        // Создаем сообщение с текстом и клавиатурой
        SendMessage message1 = new SendMessage();
        message1.setChatId(chatId);

        // Создаем список кнопок-подменю и добавляем их в инлайн-клавиатуру
        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        List<InlineKeyboardButton> row3 = new ArrayList<>();

        // Add 4 inline buttons to rows
        row1.add(createInlineButton1("A", "A3"));
        row1.add(createInlineButton1("B", "B3"));
        row2.add(createInlineButton1("C", "C3"));

        rowsInline1.add(row1);
        rowsInline1.add(row2);

        // Создаем объект для клавиатуры
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);
        message1.setText("");

        result32 = readExcelFile3.b3q2();


        // Устанавливаем текст сообщения
        String text = result + "Выберите один из вариантов:";
        message1.setText(text);

        // Добавляем клавиатуру в сообщение
        message1.setReplyMarkup(markupInline);


        try {
            execute(message1);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    private long ttt4(long chatId, String result) {
        SendMessage message1 = new SendMessage();
        message1.setChatId(chatId);

        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();

        row1.add(createInlineButton1("A", "A4"));
        row1.add(createInlineButton1("B", "B4"));
        row2.add(createInlineButton1("C", "C4"));
        row2.add(createInlineButton1("D", "D4"));

        rowsInline1.add(row1);
        rowsInline1.add(row2);

        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);
        message1.setText("");


        //TEST4
        result401 = readExcelFile4.b4q1();
        //result402 = readExcelFile4.b4q2();
        result403 = readExcelFile4.b4q3();
        result404 = readExcelFile4.b4q4();
        result405 = readExcelFile4.b4q5();
        result406 = readExcelFile4.b4q6();
        result407 = readExcelFile4.b4q7();
       // result408 = readExcelFile4.b4q8();
      //  result409 = readExcelFile4.b4q9();
        result410 = readExcelFile4.b4q10();
        result411 = readExcelFile4.b4q11();
       // result412 = readExcelFile4.b4q12();
       // result413 = readExcelFile4.b4q13();
        result414 = readExcelFile4.b4q14();
       // result415 = readExcelFile4.b4q15();
        result416 = readExcelFile4.b4q16();


        String text = result + "\nВыберите один из вариантов:";
        message1.setText(text);

        message1.setReplyMarkup(markupInline);

        try {
            execute(message1);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
        return chatId;
    }

    private void for4(long chatId, String result) {
        // Создаем сообщение с текстом и клавиатурой
        SendMessage message1 = new SendMessage();
        message1.setChatId(chatId);

        // Создаем список кнопок-подменю и добавляем их в инлайн-клавиатуру
        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        List<InlineKeyboardButton> row3 = new ArrayList<>();

        // Add 4 inline buttons to rows
        row1.add(createInlineButton1("A", "A4"));
        row1.add(createInlineButton1("B", "B4"));
        row2.add(createInlineButton1("C", "C4"));

        rowsInline1.add(row1);
        rowsInline1.add(row2);

        // Создаем объект для клавиатуры
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);
        message1.setText("");
        result402 = readExcelFile4.b4q2();
        result408 = readExcelFile4.b4q8();
        result409 = readExcelFile4.b4q9();
        result412 = readExcelFile4.b4q12();
        result413 = readExcelFile4.b4q13();
        result415 = readExcelFile4.b4q15();


        // Устанавливаем текст сообщения
        String text = result + "Выберите один из вариантов:";
        message1.setText(text);

        // Добавляем клавиатуру в сообщение
        message1.setReplyMarkup(markupInline);


        try {
            execute(message1);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    private long ttt5(long chatId, String result) {
        SendMessage message1 = new SendMessage();
        message1.setChatId(chatId);

        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();

        row1.add(createInlineButton1("A", "A5"));
        row1.add(createInlineButton1("B", "B5"));
        row2.add(createInlineButton1("C", "C5"));
        row2.add(createInlineButton1("D", "D5"));

        rowsInline1.add(row1);
        rowsInline1.add(row2);

        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);
        message1.setText("");


        //TEST5
        result501 = readExcelFile5.b5q1();
        //result502 = readExcelFile5.b5q2();
        result503 = readExcelFile5.b5q3();
        result504 = readExcelFile5.b5q4();
        result505 = readExcelFile5.b5q5();
        result506 = readExcelFile5.b5q6();
        result507 = readExcelFile5.b5q7();
       // result508 = readExcelFile5.b5q8();
        //result509 = readExcelFile5.b5q9();


        String text = result + "\nВыберите один из вариантов:";
        message1.setText(text);

        message1.setReplyMarkup(markupInline);

        try {
            execute(message1);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
        return chatId;
    }

    private void for5(long chatId, String result) {
        // Создаем сообщение с текстом и клавиатурой
        SendMessage message1 = new SendMessage();
        message1.setChatId(chatId);

        // Создаем список кнопок-подменю и добавляем их в инлайн-клавиатуру
        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        List<InlineKeyboardButton> row3 = new ArrayList<>();

        // Add 4 inline buttons to rows
        row1.add(createInlineButton1("A", "A5"));
        row1.add(createInlineButton1("B", "B5"));
        row2.add(createInlineButton1("C", "C5"));

        rowsInline1.add(row1);
        rowsInline1.add(row2);

        // Создаем объект для клавиатуры
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);
        message1.setText("");
        result502 = readExcelFile5.b5q2();
        result508 = readExcelFile5.b5q8();
        result509 = readExcelFile5.b5q9();


        // Устанавливаем текст сообщения
        String text = result + "Выберите один из вариантов:";
        message1.setText(text);

        // Добавляем клавиатуру в сообщение
        message1.setReplyMarkup(markupInline);


        try {
            execute(message1);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }


    private long ttt6(long chatId, String result) {
        SendMessage message1 = new SendMessage();
        message1.setChatId(chatId);

        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();

        row1.add(createInlineButton1("A", "A6"));
        row1.add(createInlineButton1("B", "B6"));
        row2.add(createInlineButton1("C", "C6"));
        row2.add(createInlineButton1("D", "D6"));

        rowsInline1.add(row1);
        rowsInline1.add(row2);

        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);
        message1.setText("");


        //TEST6

        result605 = readExcelFile6.b6q5();
        result609 = readExcelFile6.b6q9();
        result610 = readExcelFile6.b6q10();
        result611 = readExcelFile6.b6q11();
        result612 = readExcelFile6.b6q12();
        result613 = readExcelFile6.b6q13();
        //result614 = readExcelFile6.b6q14();


        String text = result + "\nВыберите один из вариантов:";
        message1.setText(text);

        message1.setReplyMarkup(markupInline);

        try {
            execute(message1);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
        return chatId;
    }

    private void for6(long chatId, String result) {
        // Создаем сообщение с текстом и клавиатурой
        SendMessage message1 = new SendMessage();
        message1.setChatId(chatId);

        // Создаем список кнопок-подменю и добавляем их в инлайн-клавиатуру
        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        List<InlineKeyboardButton> row3 = new ArrayList<>();

        // Add 4 inline buttons to rows
        row1.add(createInlineButton1("A", "A6"));
        row1.add(createInlineButton1("B", "B6"));
        row2.add(createInlineButton1("C", "C6"));

        rowsInline1.add(row1);
        rowsInline1.add(row2);

        // Создаем объект для клавиатуры
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);
        message1.setText("");
        result601 = readExcelFile6.b6q1();
        result602 = readExcelFile6.b6q2();
        result603 = readExcelFile6.b6q3();
        result606 = readExcelFile6.b6q6();
        result607 = readExcelFile6.b6q7();
        result608 = readExcelFile6.b6q8();


        // Устанавливаем текст сообщения
        String text = result + "Выберите один из вариантов:";
        message1.setText(text);

        // Добавляем клавиатуру в сообщение
        message1.setReplyMarkup(markupInline);


        try {
            execute(message1);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    private void for62(long chatId, String result) {
        // Создаем сообщение с текстом и клавиатурой
        SendMessage message1 = new SendMessage();
        message1.setChatId(chatId);

        // Создаем список кнопок-подменю и добавляем их в инлайн-клавиатуру
        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();


        // Add 4 inline buttons to rows
        row1.add(createInlineButton1("A", "A6"));
        row1.add(createInlineButton1("B", "B6"));


        rowsInline1.add(row1);


        // Создаем объект для клавиатуры
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);
        message1.setText("");
        result604 = readExcelFile6.b6q4();


        // Устанавливаем текст сообщения
        String text = result + "\nВыберите один из вариантов:";
        message1.setText(text);

        // Добавляем клавиатуру в сообщение
        message1.setReplyMarkup(markupInline);


        try {
            execute(message1);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    private long ttt7(long chatId, String result) {
        SendMessage message1 = new SendMessage();
        message1.setChatId(chatId);

        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();

        row1.add(createInlineButton1("A", "A7"));
        row1.add(createInlineButton1("B", "B7"));
        row2.add(createInlineButton1("C", "C7"));
        row2.add(createInlineButton1("D", "D7"));

        rowsInline1.add(row1);
        rowsInline1.add(row2);

        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);
        message1.setText("");


        //TEST7
        result701 = readExcelFile7.b7q1();
        result702 = readExcelFile7.b7q2();

        //result704 = readExcelFile7.b7q4();
        result711 = readExcelFile7.b7q11();
        result712 = readExcelFile7.b7q12();
        result713 = readExcelFile7.b7q13();
        result714 = readExcelFile7.b7q14();

        result716 = readExcelFile7.b7q16();
        result717 = readExcelFile7.b7q17();
        result718 = readExcelFile7.b7q18();


        String text = result + "\nВыберите один из вариантов:";
        message1.setText(text);

        message1.setReplyMarkup(markupInline);

        try {
            execute(message1);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
        return chatId;
    }

    private void for7(long chatId, String result) {
        // Создаем сообщение с текстом и клавиатурой
        SendMessage message1 = new SendMessage();
        message1.setChatId(chatId);

        // Создаем список кнопок-подменю и добавляем их в инлайн-клавиатуру
        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();
        List<InlineKeyboardButton> row3 = new ArrayList<>();

        // Add 4 inline buttons to rows
        row1.add(createInlineButton1("A", "A7"));
        row1.add(createInlineButton1("B", "B7"));
        row2.add(createInlineButton1("C", "C7"));

        rowsInline1.add(row1);
        rowsInline1.add(row2);

        result703 = readExcelFile7.b7q3();
        result704 = readExcelFile7.b7q4();
        result705 = readExcelFile7.b7q5();
        result706 = readExcelFile7.b7q6();
        result707 = readExcelFile7.b7q7();
        result708 = readExcelFile7.b7q8();
        result709 = readExcelFile7.b7q9();
        result710 = readExcelFile7.b7q10();
        result715 = readExcelFile7.b7q15();
        result719 = readExcelFile7.b7q19();
        result720 = readExcelFile7.b7q20();

        // Создаем объект для клавиатуры
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);
        message1.setText("");



        // Устанавливаем текст сообщения
        String text = result + "Выберите один из вариантов:";
        message1.setText(text);

        // Добавляем клавиатуру в сообщение
        message1.setReplyMarkup(markupInline);


        try {
            execute(message1);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    private long ttt8(long chatId, String result) {
        SendMessage message1 = new SendMessage();
        message1.setChatId(chatId);

        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();

        row1.add(createInlineButton1("A", "A8"));
        row1.add(createInlineButton1("B", "B8"));
        row2.add(createInlineButton1("C", "C8"));
        row2.add(createInlineButton1("D", "D8"));

        rowsInline1.add(row1);
        rowsInline1.add(row2);

        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);
        message1.setText("");


        //TEST7
       // result801 = readExcelFile8.b8q1();
        result802 = readExcelFile8.b8q2();
        result803 = readExcelFile8.b8q3();
        result804 = readExcelFile8.b8q4();
        result805 = readExcelFile8.b8q5();
        result806 = readExcelFile8.b8q6();
        result807 = readExcelFile8.b8q7();
        result808 = readExcelFile8.b8q8();
        result809 = readExcelFile8.b8q9();


        String text = result + "\nВыберите один из вариантов:";
        message1.setText(text);

        message1.setReplyMarkup(markupInline);

        try {
            execute(message1);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
        return chatId;
    }


    private long ttt9(long chatId, String result) {
        SendMessage message1 = new SendMessage();
        message1.setChatId(chatId);

        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();

        row1.add(createInlineButton1("A", "A9"));
        row1.add(createInlineButton1("B", "B9"));
        row2.add(createInlineButton1("C", "C9"));
        row2.add(createInlineButton1("D", "D9"));

        rowsInline1.add(row1);
        rowsInline1.add(row2);

        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);
        message1.setText("");


        //TEST7
        result901 = readExcelFile9.b9q1();
        result902 = readExcelFile9.b9q2();
        result903 = readExcelFile9.b9q3();
        result904 = readExcelFile9.b9q4();
        result905 = readExcelFile9.b9q5();
        result906 = readExcelFile9.b9q6();


        String text = result + "\nВыберите один из вариантов:";
        message1.setText(text);

        message1.setReplyMarkup(markupInline);

        try {
            execute(message1);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
        return chatId;
    }

    private void for9(long chatId, String result) {
        // Создаем сообщение с текстом и клавиатурой
        SendMessage message1 = new SendMessage();
        message1.setChatId(chatId);

        // Создаем список кнопок-подменю и добавляем их в инлайн-клавиатуру
        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();

        // Add 4 inline buttons to rows
        row1.add(createInlineButton1("A", "A9"));
        row1.add(createInlineButton1("B", "B9"));
        row2.add(createInlineButton1("C", "C9"));

        rowsInline1.add(row1);
        rowsInline1.add(row2);

        result904 = readExcelFile9.b9q4();
        result906 = readExcelFile9.b9q6();

        // Создаем объект для клавиатуры
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);
        message1.setText("");



        // Устанавливаем текст сообщения
        String text = result + "Выберите один из вариантов:";
        message1.setText(text);

        // Добавляем клавиатуру в сообщение
        message1.setReplyMarkup(markupInline);


        try {
            execute(message1);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

   /** private long itog(long chatId, String result) {
        SendMessage message1 = new SendMessage();
        message1.setChatId(chatId);

        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();

        row1.add(createInlineButton1("A", "A10"));
        row1.add(createInlineButton1("B", "B10"));
        row2.add(createInlineButton1("C", "C10"));
        row2.add(createInlineButton1("D", "D10"));

        rowsInline1.add(row1);
        rowsInline1.add(row2);

        result101 = String.valueOf(ts10.ti1());
        //result102= ts10.ti2();
        result103= ts10.ti3();
        result104= ts10.ti4();
        result105= ts10.ti5();
        result106= ts10.ti6();
        result107= ts10.ti7();
        result108= ts10.ti8();
        result109= ts10.ti9();
        result110= ts10.ti10();
        result111= ts10.ti11();
        result112= ts10.ti12();
        result113= ts10.ti13();
        result114= ts10.ti14();
        result115= ts10.ti15();
        result116= ts10.ti16();
        result117= ts10.ti17();
        result118= ts10.ti18();
        result119= ts10.ti19();
        result120= ts10.ti20();
        result121= ts10.ti21();
        result122= ts10.ti22();
        result123= ts10.ti23();
        result124 =ts10.ti24();
        result125 =ts10.ti25();
        result126 =ts10.ti26();
        result127 =ts10.ti27();
        result128 =ts10.ti28();
        result129 =ts10.ti29();
        result130 =ts10.ti30();
        result131 =ts10.ti31();
        result132 =ts10.ti32();
        result133 =ts10.ti33();
        result134 =ts10.ti34();
        result135 =ts10.ti35();
        result136 =ts10.ti36();
        result137 =ts10.ti37();
        result138 =ts10.ti38();
        result139 =ts10.ti39();
        result140 =ts10.ti40();
        result141 =ts10.ti41();
        result142 =ts10.ti42();
        result143 =ts10.ti43();
        result144 =ts10.ti44();
        result145 =ts10.ti45();
        result146 =ts10.ti46();
        result147 =ts10.ti47();
        result148 =ts10.ti48();
        result149 =ts10.ti49();
        result150 =ts10.ti50();
        result151 =ts10.ti51();
        result152 =ts10.ti52();
        result153 =ts10.ti53();
        result154 =ts10.ti54();
        result155 =ts10.ti55();
        result156 =ts10.ti56();
        result157 =ts10.ti57();
        result158 =ts10.ti58();
        result159 =ts10.ti59();
        result160 =ts10.ti60();
        result161 =ts10.ti61();
        result162 =ts10.ti62();
        result163 =ts10.ti63();
        result164 =ts10.ti64();
        result165 =ts10.ti65();
        result166 =ts10.ti66();
        result167 =ts10.ti67();
        result168 =ts10.ti68();
        result169 =ts10.ti69();
        result170 =ts10.ti70();
        result171 =ts10.ti71();
        result172 =ts10.ti72();
        result173 =ts10.ti73();
        result174 =ts10.ti74();
        result175 =ts10.ti75();
        result176 =ts10.ti76();
        result177 =ts10.ti77();
        result178 =ts10.ti78();
        result179 =ts10.ti79();
        result180 =ts10.ti80();
        result181 =ts10.ti81();
        result182 =ts10.ti82();
        result183 =ts10.ti83();
        result184 =ts10.ti84();
        result185 =ts10.ti85();
        result186 =ts10.ti86();
        result187 =ts10.ti87();
        result188 =ts10.ti88();
        result189 =ts10.ti89();
        result190 =ts10.ti90();
        result191 =ts10.ti91();
        result192 =ts10.ti92();
        result193 =ts10.ti93();
        result194 =ts10.ti94();
        result195 =ts10.ti95();
        result196 =ts10.ti96();
        result197 =ts10.ti97();

        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);
        message1.setText("");





        String text = result + "\nВыберите один из вариантов:";
        message1.setText(text);

        message1.setReplyMarkup(markupInline);

        try {
            execute(message1);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
        return chatId;
    }*/

    private void it(long chatId, String result) {
        SendMessage message1 = new SendMessage();
        message1.setChatId(chatId);



        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();

        row1.add(createInlineButton1("A", "A10"));
        row1.add(createInlineButton1("B", "B10"));
        row2.add(createInlineButton1("C", "C10"));
        row2.add(createInlineButton1("D", "D10"));

        rowsInline1.add(row1);
        rowsInline1.add(row2);

        result1001 = questionData.result1001;
        result1002 = questionData2.result1002;
        result1003 = questionData3.result1003;
        result1004 = questionData4.result1004;
        result1005 = questionData5.result1005;
        result1006 = questionData6.result1006;
        result1007 = questionData7.result1007;
        result1008 = questionData8.result1008;
        result1009 = questionData9.result1009;
        result1010 = questionData10.result1010;
        result1011 = questionData11.result1011;
        result1012 = questionData12.result1012;
        result1013 = questionData13.result1013;
        result1014 = questionData14.result1014;
        result1015 = questionData15.result1015;
        result1016 = questionData16.result1016;
        result1017 = questionData17.result1017;
        result1018 = questionData18.result1018;
        result1019 = questionData19.result1019;
        result1020 = questionData20.result1020;

       /*it2= ts11.getRandomQuestionFromDatabase2();
       it3= ts11.getRandomQuestionFromDatabase3();
       it4= ts11.getRandomQuestionFromDatabase4();
       it5= ts11.getRandomQuestionFromDatabase5();
       it6= ts11.getRandomQuestionFromDatabase6();*/

        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);
        message1.setText("");


        String text = result + "\nВыберите один из вариантов:";
        message1.setText(text);

        message1.setReplyMarkup(markupInline);

        try {
            execute(message1);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }

    }

    private void next(long chatId) {

        // Создаем сообщение с текстом и клавиатурой
        SendMessage message1 = new SendMessage();
        message1.setChatId(chatId);

        // Создаем список кнопок-подменю и добавляем их в инлайн-клавиатуру
        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();


        // Add 4 inline buttons to rows
        row1.add(createInlineButton1("ПРОДОЛЖИТЬ", "next"));


        rowsInline1.add(row1);


        // Создаем объект для клавиатуры
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);
        message1.setText("");

        // Устанавливаем текст сообщения
        String text = "В этом тесте будет 12 вопросов, нажмите кнопку, чтобы начать тест";
        message1.setText(text);


        // Добавляем клавиатуру в сообщение
        message1.setReplyMarkup(markupInline);


        try {
            execute(message1);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }


    private void next2(long chatId) {

        // Создаем сообщение с текстом и клавиатурой
        SendMessage message1 = new SendMessage();
        message1.setChatId(chatId);

        // Создаем список кнопок-подменю и добавляем их в инлайн-клавиатуру
        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();


        // Add 4 inline buttons to rows
        row1.add(createInlineButton1("ПРОДОЛЖИТЬ", "next2"));


        rowsInline1.add(row1);


        // Создаем объект для клавиатуры
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);
        message1.setText("");

        // Устанавливаем текст сообщения
        String text = "В этом тесте будет 6 вопросов, нажмите кнопку, чтобы начать тест";
        message1.setText(text);


        // Добавляем клавиатуру в сообщение
        message1.setReplyMarkup(markupInline);


        try {
            execute(message1);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    private void next3(long chatId) {

        // Создаем сообщение с текстом и клавиатурой
        SendMessage message1 = new SendMessage();
        message1.setChatId(chatId);

        // Создаем список кнопок-подменю и добавляем их в инлайн-клавиатуру
        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();


        // Add 4 inline buttons to rows
        row1.add(createInlineButton1("ПРОДОЛЖИТЬ", "next3"));


        rowsInline1.add(row1);


        // Создаем объект для клавиатуры
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);
        message1.setText("");

        // Устанавливаем текст сообщения
        String text = "В этом тесте будет 5 вопросов, нажмите кнопку, чтобы начать тест";
        message1.setText(text);


        // Добавляем клавиатуру в сообщение
        message1.setReplyMarkup(markupInline);


        try {
            execute(message1);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    private void next4(long chatId) {

        // Создаем сообщение с текстом и клавиатурой
        SendMessage message1 = new SendMessage();
        message1.setChatId(chatId);

        // Создаем список кнопок-подменю и добавляем их в инлайн-клавиатуру
        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();


        // Add 4 inline buttons to rows
        row1.add(createInlineButton1("ПРОДОЛЖИТЬ", "next4"));


        rowsInline1.add(row1);


        // Создаем объект для клавиатуры
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);
        message1.setText("");

        // Устанавливаем текст сообщения
        String text = "В этом тесте будет 16 вопросов, нажмите кнопку, чтобы начать тест";
        message1.setText(text);


        // Добавляем клавиатуру в сообщение
        message1.setReplyMarkup(markupInline);


        try {
            execute(message1);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    private void next5(long chatId) {

        // Создаем сообщение с текстом и клавиатурой
        SendMessage message1 = new SendMessage();
        message1.setChatId(chatId);

        // Создаем список кнопок-подменю и добавляем их в инлайн-клавиатуру
        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();


        // Add 4 inline buttons to rows
        row1.add(createInlineButton1("ПРОДОЛЖИТЬ", "next5"));


        rowsInline1.add(row1);


        // Создаем объект для клавиатуры
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);
        message1.setText("");

        // Устанавливаем текст сообщения
        String text = "В этом тесте будет 9 вопросов, нажмите кнопку, чтобы начать тест";
        message1.setText(text);


        // Добавляем клавиатуру в сообщение
        message1.setReplyMarkup(markupInline);


        try {
            execute(message1);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    private void next6(long chatId) {

        // Создаем сообщение с текстом и клавиатурой
        SendMessage message1 = new SendMessage();
        message1.setChatId(chatId);

        // Создаем список кнопок-подменю и добавляем их в инлайн-клавиатуру
        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();


        // Add 4 inline buttons to rows
        row1.add(createInlineButton1("ПРОДОЛЖИТЬ", "next6"));


        rowsInline1.add(row1);


        // Создаем объект для клавиатуры
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);
        message1.setText("");

        // Устанавливаем текст сообщения
        String text = "В этом тесте будет 13 вопросов, нажмите кнопку, чтобы начать тест";
        message1.setText(text);


        // Добавляем клавиатуру в сообщение
        message1.setReplyMarkup(markupInline);


        try {
            execute(message1);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    private void next7(long chatId) {

        // Создаем сообщение с текстом и клавиатурой
        SendMessage message1 = new SendMessage();
        message1.setChatId(chatId);

        // Создаем список кнопок-подменю и добавляем их в инлайн-клавиатуру
        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();


        // Add 4 inline buttons to rows
        row1.add(createInlineButton1("ПРОДОЛЖИТЬ", "next7"));


        rowsInline1.add(row1);


        // Создаем объект для клавиатуры
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);
        message1.setText("");

        // Устанавливаем текст сообщения
        String text = "В этом тесте будет 20 вопросов, нажмите кнопку, чтобы начать тест";
        message1.setText(text);


        // Добавляем клавиатуру в сообщение
        message1.setReplyMarkup(markupInline);


        try {
            execute(message1);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    private void next8(long chatId) {

        // Создаем сообщение с текстом и клавиатурой
        SendMessage message1 = new SendMessage();
        message1.setChatId(chatId);

        // Создаем список кнопок-подменю и добавляем их в инлайн-клавиатуру
        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();


        // Add 4 inline buttons to rows
        row1.add(createInlineButton1("ПРОДОЛЖИТЬ", "next8"));


        rowsInline1.add(row1);


        // Создаем объект для клавиатуры
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);
        message1.setText("");

        // Устанавливаем текст сообщения
        String text = "В этом тесте будет 8 вопросов, нажмите кнопку, чтобы начать тест";
        message1.setText(text);


        // Добавляем клавиатуру в сообщение
        message1.setReplyMarkup(markupInline);


        try {
            execute(message1);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    private void next9(long chatId) {

        // Создаем сообщение с текстом и клавиатурой
        SendMessage message1 = new SendMessage();
        message1.setChatId(chatId);

        // Создаем список кнопок-подменю и добавляем их в инлайн-клавиатуру
        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();


        // Add 4 inline buttons to rows
        row1.add(createInlineButton1("ПРОДОЛЖИТЬ", "next9"));


        rowsInline1.add(row1);


        // Создаем объект для клавиатуры
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);
        message1.setText("");

        // Устанавливаем текст сообщения
        String text = "В этом тесте будет 6 вопросов, нажмите кнопку, чтобы начать тест";
        message1.setText(text);


        // Добавляем клавиатуру в сообщение
        message1.setReplyMarkup(markupInline);


        try {
            execute(message1);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    private void next10(long chatId) { //Итоговый тест предупреждение

        // Создаем сообщение с текстом и клавиатурой
        SendMessage message1 = new SendMessage();
        message1.setChatId(chatId);

        // Создаем список кнопок-подменю и добавляем их в инлайн-клавиатуру
        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();


        // Add 4 inline buttons to rows
        row1.add(createInlineButton1("ПРОДОЛЖИТЬ", "next10"));


        rowsInline1.add(row1);


        // Создаем объект для клавиатуры
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);
        message1.setText("");

        // Устанавливаем текст сообщения
        String text = "В этом тесте будет 20 вопросов, нажмите кнопку, чтобы начать тест";
        message1.setText(text);


        // Добавляем клавиатуру в сообщение
        message1.setReplyMarkup(markupInline);


        try {
            execute(message1);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    private void phone(long chatId) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("Давайте знакомиться!\nВам не нужно представляться, просто нажмите на кнопку <b>\"Отправить номер\"</b> \uD83D\uDC47 и я угадаю как вас зовут.");
        message.setParseMode("HTML");


        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(true);

        KeyboardButton keyboardButton = new KeyboardButton();
        keyboardButton.setText("\uD83D\uDCF1Отправить номер");
        keyboardButton.setRequestContact(true);


        KeyboardRow keyboardRow = new KeyboardRow();
        keyboardRow.add(keyboardButton);

        List<KeyboardRow> keyboardRows = new ArrayList<>();
        keyboardRows.add(keyboardRow);

        replyKeyboardMarkup.setKeyboard(keyboardRows);

        message.setReplyMarkup(replyKeyboardMarkup);

        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }



    public void aftt1(long chatId) {
        // Создаем сообщение
        SendMessage message = new SendMessage();
        message.setChatId(chatId);

        // Проверяем условие и добавляем соответствующие кнопки
        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();

        int fdb1Value = Integer.parseInt(fdb1.replace("%", ""));
        if (fdb1Value >= 80) {
            row1.add(createInlineButton1("\uD83D\uDDC3К списку тестов", "test"));
            row2.add(createInlineButton1("\uD83D\uDCD5К теории", "teory"));
        } else {
            row1.add(createInlineButton1("↩\uFE0FПройти повторно", "test1"));
            row2.add(createInlineButton1("\uD83D\uDCD5К теории", "teory"));
        }

        rowsInline1.add(row1);
        rowsInline1.add(row2);
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);

        // Устанавливаем текст сообщения
        String text = "Что делаем дальше?\n";
        message.setText(text);

        // Добавляем клавиатуру в сообщение
        message.setReplyMarkup(markupInline);

        try {
            execute(message);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    public void aftt2(long chatId) {
        // Создаем сообщение
        SendMessage message = new SendMessage();
        message.setChatId(chatId);

        // Проверяем условие и добавляем соответствующие кнопки
        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();

        int fdb2Value = Integer.parseInt(fdb2.replace("%", ""));
        if (fdb2Value >= 80) {
            row1.add(createInlineButton1("\uD83D\uDDC3К списку тестов", "test"));
            row2.add(createInlineButton1("\uD83D\uDCD5К теории", "teory"));
        } else {
            row1.add(createInlineButton1("↩\uFE0FПройти повторно", "test2"));
            row2.add(createInlineButton1("\uD83D\uDCD5К теории", "teory"));
        }

        rowsInline1.add(row1);
        rowsInline1.add(row2);
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);

        // Устанавливаем текст сообщения
        String text = "Что делаем дальше?\n";
        message.setText(text);

        // Добавляем клавиатуру в сообщение
        message.setReplyMarkup(markupInline);

        try {
            execute(message);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
    public void aftt3(long chatId) {
        // Создаем сообщение
        SendMessage message = new SendMessage();
        message.setChatId(chatId);

        // Проверяем условие и добавляем соответствующие кнопки
        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();

        int fdb3Value = Integer.parseInt(fdb3.replace("%", ""));
        if (fdb3Value >= 80) {
            row1.add(createInlineButton1("\uD83D\uDDC3К списку тестов", "test"));
            row2.add(createInlineButton1("\uD83D\uDCD5К теории", "teory"));
        } else {
            row1.add(createInlineButton1("↩\uFE0FПройти повторно", "test3"));
            row2.add(createInlineButton1("\uD83D\uDCD5К теории", "teory"));
        }

        rowsInline1.add(row1);
        rowsInline1.add(row2);
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);

        // Устанавливаем текст сообщения
        String text = "Что делаем дальше?\n";
        message.setText(text);

        // Добавляем клавиатуру в сообщение
        message.setReplyMarkup(markupInline);

        try {
            execute(message);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
    public void aftt4(long chatId) {
        // Создаем сообщение
        SendMessage message = new SendMessage();
        message.setChatId(chatId);

        // Проверяем условие и добавляем соответствующие кнопки
        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();

        int fdb4Value = Integer.parseInt(fdb4.replace("%", ""));
        if (fdb4Value >= 80) {
            row1.add(createInlineButton1("\uD83D\uDDC3К списку тестов", "test"));
            row2.add(createInlineButton1("\uD83D\uDCD5К теории", "teory"));
        } else {
            row1.add(createInlineButton1("↩\uFE0FПройти повторно", "test4"));
            row2.add(createInlineButton1("\uD83D\uDCD5К теории", "teory"));
        }

        rowsInline1.add(row1);
        rowsInline1.add(row2);
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);

        // Устанавливаем текст сообщения
        String text = "Что делаем дальше?\n";
        message.setText(text);

        // Добавляем клавиатуру в сообщение
        message.setReplyMarkup(markupInline);

        try {
            execute(message);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
    public void aftt5(long chatId) {
        // Создаем сообщение
        SendMessage message = new SendMessage();
        message.setChatId(chatId);

        // Проверяем условие и добавляем соответствующие кнопки
        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();

        int fdb5Value = Integer.parseInt(fdb5.replace("%", ""));
        if (fdb5Value >= 80) {
            row1.add(createInlineButton1("\uD83D\uDDC3К списку тестов", "test"));
            row2.add(createInlineButton1("\uD83D\uDCD5К теории", "teory"));
        } else {
            row1.add(createInlineButton1("↩\uFE0FПройти повторно", "test5"));
            row2.add(createInlineButton1("\uD83D\uDCD5К теории", "teory"));
        }

        rowsInline1.add(row1);
        rowsInline1.add(row2);
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);

        // Устанавливаем текст сообщения
        String text = "Что делаем дальше?\n";
        message.setText(text);

        // Добавляем клавиатуру в сообщение
        message.setReplyMarkup(markupInline);

        try {
            execute(message);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
    public void aftt6(long chatId) {
        // Создаем сообщение
        SendMessage message = new SendMessage();
        message.setChatId(chatId);

        // Проверяем условие и добавляем соответствующие кнопки
        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();

        int fdb6Value = Integer.parseInt(fdb6.replace("%", ""));
        if (fdb6Value >= 80) {
            row1.add(createInlineButton1("\uD83D\uDDC3К списку тестов", "test"));
            row2.add(createInlineButton1("\uD83D\uDCD5К теории", "teory"));
        } else {
            row1.add(createInlineButton1("↩\uFE0FПройти повторно", "test6"));
            row2.add(createInlineButton1("\uD83D\uDCD5К теории", "teory"));
        }

        rowsInline1.add(row1);
        rowsInline1.add(row2);
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);

        // Устанавливаем текст сообщения
        String text = "Что делаем дальше?\n";
        message.setText(text);

        // Добавляем клавиатуру в сообщение
        message.setReplyMarkup(markupInline);

        try {
            execute(message);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
    public void aftt7(long chatId) {
        // Создаем сообщение
        SendMessage message = new SendMessage();
        message.setChatId(chatId);

        // Проверяем условие и добавляем соответствующие кнопки
        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();

        int fdb7Value = Integer.parseInt(fdb7.replace("%", ""));
        if (fdb7Value >= 80) {
            row1.add(createInlineButton1("\uD83D\uDDC3К списку тестов", "test"));
            row2.add(createInlineButton1("\uD83D\uDCD5К теории", "teory"));
        } else {
            row1.add(createInlineButton1("↩\uFE0FПройти повторно", "test7"));
            row2.add(createInlineButton1("\uD83D\uDCD5К теории", "teory"));
        }

        rowsInline1.add(row1);
        rowsInline1.add(row2);
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);

        // Устанавливаем текст сообщения
        String text = "Что делаем дальше?\n";
        message.setText(text);

        // Добавляем клавиатуру в сообщение
        message.setReplyMarkup(markupInline);

        try {
            execute(message);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
    public void aftt8(long chatId) {
        // Создаем сообщение
        SendMessage message = new SendMessage();
        message.setChatId(chatId);

        // Проверяем условие и добавляем соответствующие кнопки
        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();

        int fdb8Value = Integer.parseInt(fdb8.replace("%", ""));
        if (fdb8Value >= 80) {
            row1.add(createInlineButton1("\uD83D\uDDC3К списку тестов", "test"));
            row2.add(createInlineButton1("\uD83D\uDCD5К теории", "teory"));
        } else {
            row1.add(createInlineButton1("↩\uFE0FПройти повторно", "test8"));
            row2.add(createInlineButton1("\uD83D\uDCD5К теории", "teory"));
        }

        rowsInline1.add(row1);
        rowsInline1.add(row2);
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);

        // Устанавливаем текст сообщения
        String text = "Что делаем дальше?\n";
        message.setText(text);

        // Добавляем клавиатуру в сообщение
        message.setReplyMarkup(markupInline);

        try {
            execute(message);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
    public void aftt9(long chatId) {
        // Создаем сообщение
        SendMessage message = new SendMessage();
        message.setChatId(chatId);

        // Проверяем условие и добавляем соответствующие кнопки
        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();

        int fdb9Value = Integer.parseInt(fdb9.replace("%", ""));
        if (fdb9Value >= 80) {
            row1.add(createInlineButton1("\uD83D\uDDC3К списку тестов", "test"));
            row2.add(createInlineButton1("\uD83D\uDCD5К теории", "teory"));
        } else {
            row1.add(createInlineButton1("↩\uFE0FПройти повторно", "test9"));
            row2.add(createInlineButton1("\uD83D\uDCD5К теории", "teory"));
        }

        rowsInline1.add(row1);
        rowsInline1.add(row2);
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);

        // Устанавливаем текст сообщения
        String text = "Что делаем дальше?\n";
        message.setText(text);

        // Добавляем клавиатуру в сообщение
        message.setReplyMarkup(markupInline);

        try {
            execute(message);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
    public void aftt10(long chatId) {
        // Создаем сообщение
        SendMessage message = new SendMessage();
        message.setChatId(chatId);

        // Проверяем условие и добавляем соответствующие кнопки
        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();



            row1.add(createInlineButton1("↩\uFE0FПройти повторно", "test2"));
            row2.add(createInlineButton1("\uD83D\uDCD5К теории", "teory"));


        rowsInline1.add(row1);
        rowsInline1.add(row2);
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);

        // Устанавливаем текст сообщения
        String text = "Вы можете повторить теорию или пройти тест повторно\n";
        message.setText(text);

        // Добавляем клавиатуру в сообщение
        message.setReplyMarkup(markupInline);

        try {
            execute(message);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }




    public void aftb1(long chatId) {
        // Создаем сообщение с текстом и клавиатурой
        SendMessage message1 = new SendMessage();
        message1.setChatId(chatId);

        // Создаем список кнопок-подменю и добавляем их в инлайн-клавиатуру
        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();

        // Add 4 inline buttons to rows
        row1.add(createInlineButton1("✅Перейти к тесту", "test1"));
        row2.add(createInlineButton1("\uD83D\uDCD5К теории", "teory"));

        rowsInline1.add(row1);
        rowsInline1.add(row2);

        // Создаем объект для клавиатуры
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);
        message1.setText("");

        // Устанавливаем текст сообщения
        String text = "Можно пройти тест по данному блоку или продолжить изучать теорию";
        message1.setText(text);

        // Добавляем клавиатуру в сообщение
        message1.setReplyMarkup(markupInline);

        try {
            execute(message1);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }


    }



    private void aftb2(long chatId) {

        // Создаем сообщение с текстом и клавиатурой
        SendMessage message1 = new SendMessage();
        message1.setChatId(chatId);

        // Создаем список кнопок-подменю и добавляем их в инлайн-клавиатуру
        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();


        // Add 4 inline buttons to rows
        row1.add(createInlineButton1("✅Перейти к тесту", "test2"));
        row2.add(createInlineButton1("\uD83D\uDCD5К теории", "teory"));


        rowsInline1.add(row1);
        rowsInline1.add(row2);


        // Создаем объект для клавиатуры
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);
        message1.setText("");

        // Устанавливаем текст сообщения
        String text = "Можно пройти тест по данному блоку или продолжить изучать теорию";
        message1.setText(text);


        // Добавляем клавиатуру в сообщение
        message1.setReplyMarkup(markupInline);


        try {
            execute(message1);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    private void aftb3(long chatId) {

        // Создаем сообщение с текстом и клавиатурой
        SendMessage message1 = new SendMessage();
        message1.setChatId(chatId);

        // Создаем список кнопок-подменю и добавляем их в инлайн-клавиатуру
        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();


        // Add 4 inline buttons to rows
        row1.add(createInlineButton1("✅Перейти к тесту", "test3"));
        row2.add(createInlineButton1("\uD83D\uDCD5К теории", "teory"));


        rowsInline1.add(row1);
        rowsInline1.add(row2);


        // Создаем объект для клавиатуры
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);
        message1.setText("");

        // Устанавливаем текст сообщения
        String text = "Можно пройти тест по данному блоку или продолжить изучать теорию";
        message1.setText(text);


        // Добавляем клавиатуру в сообщение
        message1.setReplyMarkup(markupInline);


        try {
            execute(message1);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    private void aftb4(long chatId) {

        // Создаем сообщение с текстом и клавиатурой
        SendMessage message1 = new SendMessage();
        message1.setChatId(chatId);

        // Создаем список кнопок-подменю и добавляем их в инлайн-клавиатуру
        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();


        // Add 4 inline buttons to rows
        row1.add(createInlineButton1("✅Перейти к тесту", "test4"));
        row2.add(createInlineButton1("\uD83D\uDCD5К теории", "teory"));


        rowsInline1.add(row1);
        rowsInline1.add(row2);


        // Создаем объект для клавиатуры
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);
        message1.setText("");

        // Устанавливаем текст сообщения
        String text = "Можно пройти тест по данному блоку или продолжить изучать теорию";
        message1.setText(text);


        // Добавляем клавиатуру в сообщение
        message1.setReplyMarkup(markupInline);


        try {
            execute(message1);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
    private void aftb5(long chatId) {

        // Создаем сообщение с текстом и клавиатурой
        SendMessage message1 = new SendMessage();
        message1.setChatId(chatId);

        // Создаем список кнопок-подменю и добавляем их в инлайн-клавиатуру
        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();


        // Add 4 inline buttons to rows
        row1.add(createInlineButton1("✅Перейти к тесту", "test5"));
        row2.add(createInlineButton1("\uD83D\uDCD5К теории", "teory"));


        rowsInline1.add(row1);
        rowsInline1.add(row2);


        // Создаем объект для клавиатуры
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);
        message1.setText("");

        // Устанавливаем текст сообщения
        String text = "Можно пройти тест по данному блоку или продолжить изучать теорию";
        message1.setText(text);


        // Добавляем клавиатуру в сообщение
        message1.setReplyMarkup(markupInline);


        try {
            execute(message1);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    private void aftb6(long chatId) {

        // Создаем сообщение с текстом и клавиатурой
        SendMessage message1 = new SendMessage();
        message1.setChatId(chatId);

        // Создаем список кнопок-подменю и добавляем их в инлайн-клавиатуру
        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();


        // Add 4 inline buttons to rows
        row1.add(createInlineButton1("✅Перейти к тесту", "test6"));
        row2.add(createInlineButton1("\uD83D\uDCD5К теории", "teory"));


        rowsInline1.add(row1);
        rowsInline1.add(row2);


        // Создаем объект для клавиатуры
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);
        message1.setText("");

        // Устанавливаем текст сообщения
        String text = "Можно пройти тест по данному блоку или продолжить изучать теорию";
        message1.setText(text);


        // Добавляем клавиатуру в сообщение
        message1.setReplyMarkup(markupInline);


        try {
            execute(message1);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
    private void aftb7(long chatId) {

        // Создаем сообщение с текстом и клавиатурой
        SendMessage message1 = new SendMessage();
        message1.setChatId(chatId);

        // Создаем список кнопок-подменю и добавляем их в инлайн-клавиатуру
        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();


        // Add 4 inline buttons to rows
        row1.add(createInlineButton1("✅Перейти к тесту", "test7"));
        row2.add(createInlineButton1("\uD83D\uDCD5К теории", "teory"));


        rowsInline1.add(row1);
        rowsInline1.add(row2);


        // Создаем объект для клавиатуры
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);
        message1.setText("");

        // Устанавливаем текст сообщения
        String text = "Можно пройти тест по данному блоку или продолжить изучать теорию";
        message1.setText(text);


        // Добавляем клавиатуру в сообщение
        message1.setReplyMarkup(markupInline);


        try {
            execute(message1);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
    private void aftb8(long chatId) {

        // Создаем сообщение с текстом и клавиатурой
        SendMessage message1 = new SendMessage();
        message1.setChatId(chatId);

        // Создаем список кнопок-подменю и добавляем их в инлайн-клавиатуру
        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();


        // Add 4 inline buttons to rows
        row1.add(createInlineButton1("✅Перейти к тесту", "test8"));
        row2.add(createInlineButton1("\uD83D\uDCD5К теории", "teory"));


        rowsInline1.add(row1);
        rowsInline1.add(row2);


        // Создаем объект для клавиатуры
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);
        message1.setText("");

        // Устанавливаем текст сообщения
        String text = "Можно пройти тест по данному блоку или продолжить изучать теорию";
        message1.setText(text);


        // Добавляем клавиатуру в сообщение
        message1.setReplyMarkup(markupInline);


        try {
            execute(message1);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }
    private void aftb9(long chatId) {

        // Создаем сообщение с текстом и клавиатурой
        SendMessage message1 = new SendMessage();
        message1.setChatId(chatId);

        // Создаем список кнопок-подменю и добавляем их в инлайн-клавиатуру
        List<List<InlineKeyboardButton>> rowsInline1 = new ArrayList<>();
        List<InlineKeyboardButton> row1 = new ArrayList<>();
        List<InlineKeyboardButton> row2 = new ArrayList<>();


        // Add 4 inline buttons to rows
        row1.add(createInlineButton1("✅Перейти к тесту", "test9"));
        row2.add(createInlineButton1("\uD83D\uDCD5К теории", "teory"));


        rowsInline1.add(row1);
        rowsInline1.add(row2);


        // Создаем объект для клавиатуры
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        markupInline.setKeyboard(rowsInline1);
        message1.setText("");

        // Устанавливаем текст сообщения
        String text = "Можно пройти тест по данному блоку или продолжить изучать теорию";
        message1.setText(text);


        // Добавляем клавиатуру в сообщение
        message1.setReplyMarkup(markupInline);


        try {
            execute(message1);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

}
