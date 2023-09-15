package Rating;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UserRating {

    private long chatId;
    private long totalPoints;

    public UserRating(long chatId, long totalPoints) {
        this.chatId = chatId;
        this.totalPoints = totalPoints;
    }

    public long getChatId() {
        return chatId;
    }




    public static String getTopUsersText2(String chatId) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/telegram-bot", "root", "yiPDmV6d75");

            // Максимальное количество баллов и баллы текущего пользователя
            double maxPoints = 900.0; // Максимальное количество баллов
            double currentUserPoints = 0.0; // Количество баллов текущего пользователя

            // Получаем division текущего пользователя (замените на ваш способ получения)
            String userDivision = getUserDivision(chatId);

            // Получаем баллы текущего пользователя с учетом division
            String userQuery = "SELECT (test1 + test2 + test3 + test4 + test5 + test6 + test7 + test8 + test9) AS total_points " +
                    "FROM user WHERE idtg = ? AND division = ?";
            PreparedStatement userStmt = con.prepareStatement(userQuery);
            userStmt.setString(1, chatId);
            userStmt.setString(2, userDivision);
            ResultSet userResultSet = userStmt.executeQuery();

            if (userResultSet.next()) {
                currentUserPoints = userResultSet.getDouble("total_points");
            }

            // Преобразование в проценты
            // Преобразование в целое число с округлением
            int percent = (int) Math.round((currentUserPoints / maxPoints) * 100.0);

            // Ограничение процента до максимального значения 100%
            if (percent > 100.0) {
                percent = (int) 100.0;
            }

            // Получаем глобальный рейтинг текущего пользователя
            String globalRankQuery = "SELECT COUNT(*) AS rank FROM user " +
                    "WHERE (test1 + test2 + test3 + test4 + test5 + test6 + test7 + test8 + test9) > ?";
            PreparedStatement globalRankStmt = con.prepareStatement(globalRankQuery);
            globalRankStmt.setDouble(1, currentUserPoints);
            ResultSet globalRankResultSet = globalRankStmt.executeQuery();

            int globalRank = 0;
            if (globalRankResultSet.next()) {
                globalRank = globalRankResultSet.getInt("rank") + 1; // +1, так как мы считаем текущего пользователя
            }

            // Получаем рейтинг по division текущего пользователя
            String divisionRankQuery = "SELECT COUNT(*) AS rank FROM user " +
                    "WHERE (test1 + test2 + test3 + test4 + test5 + test6 + test7 + test8 + test9) > ? AND division = ?";
            PreparedStatement divisionRankStmt = con.prepareStatement(divisionRankQuery);
            divisionRankStmt.setDouble(1, currentUserPoints);
            divisionRankStmt.setString(2, userDivision);
            ResultSet divisionRankResultSet = divisionRankStmt.executeQuery();

            int divisionRank = 0;
            if (divisionRankResultSet.next()) {
                divisionRank = divisionRankResultSet.getInt("rank") + 1; // +1, так как мы считаем текущего пользователя
            }

            // Формируем текст сообщения, объединяя оба рейтинга
            String messageText = "*Общий рейтинг*" + "\n\n"+
            "*Ваше место:*" + "\n" +


                    "\uD83C\uDFC6 Среди всех водителей — " + "*" + globalRank + "*" + "\n" +
                    "\uD83C\uDF89 По СТЦ " + userDivision + " — " + "*" + divisionRank + "*" + "\n\n" +
                    "\uD83D\uDCC8 % правильных ответов — " + "*" + percent + "%*" + "\n\n" +
                    "_Пройдя тесты заново, Ваше место в рейтинге изменится._" + "\n\n" +
                    "_Успехов!_";
            

            return messageText;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    private static String getUserDivision(String chatId) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/telegram-bot", "root", "yiPDmV6d75");

            // SQL-запрос для получения division по chatId
            String divisionQuery = "SELECT division FROM user WHERE idtg = ?";
            PreparedStatement divisionStmt = con.prepareStatement(divisionQuery);
            divisionStmt.setString(1, chatId);
            ResultSet divisionResultSet = divisionStmt.executeQuery();

            // Проверяем, есть ли запись о пользователе
            if (divisionResultSet.next()) {
                String userDivision = divisionResultSet.getString("division");
                return userDivision;
            } else {
                // Возвращаем значение по умолчанию или обработайте отсутствие записи
                return "DefaultDivision";
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
