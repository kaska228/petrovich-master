package org.example;
import Pac.ITOGOVIY.*;

import java.sql.*;
import java.util.TreeMap;

public class Itogoviy {
    public static TreeMap<String, String> questionAndAnswer = new TreeMap<>();
    static TreeMap<String, String> questionAndAnswer2 = new TreeMap<>();
    static TreeMap<String, String> questionAndAnswer3 = new TreeMap<>();
    static TreeMap<String, String> questionAndAnswer4 = new TreeMap<>();
    static TreeMap<String, String> questionAndAnswer5 = new TreeMap<>();
    static TreeMap<String, String> questionAndAnswer6 = new TreeMap<>();
    static TreeMap<String, String> questionAndAnswer7 = new TreeMap<>();
    static TreeMap<String, String> questionAndAnswer8 = new TreeMap<>();
    static TreeMap<String, String> questionAndAnswer9 = new TreeMap<>();
    static TreeMap<String, String> questionAndAnswer10 = new TreeMap<>();
    static TreeMap<String, String> questionAndAnswer11 = new TreeMap<>();
    static TreeMap<String, String> questionAndAnswer12 = new TreeMap<>();
    static TreeMap<String, String> questionAndAnswer13 = new TreeMap<>();
    static TreeMap<String, String> questionAndAnswer14 = new TreeMap<>();
    static TreeMap<String, String> questionAndAnswer15 = new TreeMap<>();
    static TreeMap<String, String> questionAndAnswer16 = new TreeMap<>();
    static TreeMap<String, String> questionAndAnswer17 = new TreeMap<>();
    static TreeMap<String, String> questionAndAnswer18 = new TreeMap<>();
    static TreeMap<String, String> questionAndAnswer19 = new TreeMap<>();
    static TreeMap<String, String> questionAndAnswer20 = new TreeMap<>();



    public static TreeMap<String, String> getQuestionAndAnswer() {
        return questionAndAnswer;
    }
    public static TreeMap<String, String> getQuestionAndAnswer2() {
        return questionAndAnswer2;
    }
    public static TreeMap<String, String> getQuestionAndAnswer3() {
        return questionAndAnswer3;
    }
    public static TreeMap<String, String> getQuestionAndAnswer4() {
        return questionAndAnswer4;
    }
    public static TreeMap<String, String> getQuestionAndAnswer5() {
        return questionAndAnswer5;
    }
    public static TreeMap<String, String> getQuestionAndAnswer6() {
        return questionAndAnswer6;
    }
    public static TreeMap<String, String> getQuestionAndAnswer7() {
        return questionAndAnswer7;
    }
    public static TreeMap<String, String> getQuestionAndAnswer8() {
        return questionAndAnswer8;
    }
    public static TreeMap<String, String> getQuestionAndAnswer9() {
        return questionAndAnswer9;
    }
    public static TreeMap<String, String> getQuestionAndAnswer10() {
        return questionAndAnswer10;
    }
    public static TreeMap<String, String> getQuestionAndAnswer11() {
        return questionAndAnswer11;
    }
    public static TreeMap<String, String> getQuestionAndAnswer12() {
        return questionAndAnswer12;
    }
    public static TreeMap<String, String> getQuestionAndAnswer13() {
        return questionAndAnswer13;
    }
    public static TreeMap<String, String> getQuestionAndAnswer14() {
        return questionAndAnswer14;
    }
    public static TreeMap<String, String> getQuestionAndAnswer15() {
        return questionAndAnswer15;
    }
    public static TreeMap<String, String> getQuestionAndAnswer16() {
        return questionAndAnswer16;
    }
    public static TreeMap<String, String> getQuestionAndAnswer17() {
        return questionAndAnswer17;
    }
    public static TreeMap<String, String> getQuestionAndAnswer18() {
        return questionAndAnswer18;
    }
    public static TreeMap<String, String> getQuestionAndAnswer19() {
        return questionAndAnswer19;
    }
    public static TreeMap<String, String> getQuestionAndAnswer20() {
        return questionAndAnswer20;
    }









        public static QuestionData getRandomQuestionFromDatabase() {

            String result1001 = "";

            try {
                // Здесь необходимо заменить "your_database_url", "your_username" и "your_password"
                String databaseUrl = "jdbc:mysql://37.143.15.239:3306/test1";
                String username = "root";
                String password = "yiPDmV6d75";

                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection(databaseUrl, username, password);

                String query = "SELECT id_test1, quest, A, B, C, D, correct FROM itog ORDER BY RAND() LIMIT 1";
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);

                if (resultSet.next()) {
                    int questionId = resultSet.getInt("id_test1");
                    String question = resultSet.getString("quest");
                    String answ1 = resultSet.getString("A");
                    String answ2 = resultSet.getString("B");
                    String answ3 = resultSet.getString("C");
                    String answ4 = resultSet.getString("D");
                    String correctAnswer = resultSet.getString("correct");

                    questionAndAnswer.put(question, correctAnswer);

                    result1001 += question + "\n";
                    result1001 += answ1 + "\n";
                    result1001 += answ2 + "\n";
                    result1001 += answ3 + "\n";
                    result1001 += answ4 + "\n";
                }

                connection.close();
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }

            return new QuestionData(result1001);
        }




    public static QuestionData2 getRandomQuestionFromDatabase2() {
            String result1002 = "";

            try {
                // Здесь необходимо заменить "your_database_url", "your_username" и "your_password"
                String databaseUrl = "jdbc:mysql://37.143.15.239:3306/test1";
                String username = "root";
                String password = "yiPDmV6d75";

                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection connection = DriverManager.getConnection(databaseUrl, username, password);

                String query = "SELECT id_test1, quest, A, B, C, D, correct FROM itog ORDER BY RAND() LIMIT 1";
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(query);

                if (resultSet.next()) {
                    int questionId = resultSet.getInt("id_test1");
                    String question = resultSet.getString("quest");
                    String answ1 = resultSet.getString("A");
                    String answ2 = resultSet.getString("B");
                    String answ3 = resultSet.getString("C");
                    String answ4 = resultSet.getString("D");
                    String correctAnswer = resultSet.getString("correct");

                    questionAndAnswer2.put(question, correctAnswer);

                    result1002 += question + "\n";
                    result1002 += answ1 + "\n";
                    result1002 += answ2 + "\n";
                    result1002 += answ3 + "\n";
                    result1002 += answ4 + "\n";
                }

                connection.close();
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }

            return new QuestionData2(result1002);
    }

    public static QuestionData3 getRandomQuestionFromDatabase3() {
        String result1003 = "";

        try {
            // Здесь необходимо заменить "your_database_url", "your_username" и "your_password"
            String databaseUrl = "jdbc:mysql://37.143.15.239:3306/test1";
            String username = "root";
            String password = "yiPDmV6d75";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(databaseUrl, username, password);

            String query = "SELECT id_test1, quest, A, B, C, D, correct FROM itog ORDER BY RAND() LIMIT 1";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                int questionId = resultSet.getInt("id_test1");
                String question = resultSet.getString("quest");
                String answ1 = resultSet.getString("A");
                String answ2 = resultSet.getString("B");
                String answ3 = resultSet.getString("C");
                String answ4 = resultSet.getString("D");
                String correctAnswer = resultSet.getString("correct");

                questionAndAnswer3.put(question, correctAnswer);

                result1003 += question + "\n";
                result1003 += answ1 + "\n";
                result1003 += answ2 + "\n";
                result1003 += answ3 + "\n";
                result1003 += answ4 + "\n";
            }

            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return new QuestionData3(result1003);
    }

    public static QuestionData4 getRandomQuestionFromDatabase4() {
        String result1004 = "";

        try {
            // Здесь необходимо заменить "your_database_url", "your_username" и "your_password"
            String databaseUrl = "jdbc:mysql://37.143.15.239:3306/test1";
            String username = "root";
            String password = "yiPDmV6d75";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(databaseUrl, username, password);

            String query = "SELECT id_test1, quest, A, B, C, D, correct FROM itog ORDER BY RAND() LIMIT 1";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                int questionId = resultSet.getInt("id_test1");
                String question = resultSet.getString("quest");
                String answ1 = resultSet.getString("A");
                String answ2 = resultSet.getString("B");
                String answ3 = resultSet.getString("C");
                String answ4 = resultSet.getString("D");
                String correctAnswer = resultSet.getString("correct");

                questionAndAnswer4.put(question, correctAnswer);

                result1004 += question + "\n";
                result1004 += answ1 + "\n";
                result1004 += answ2 + "\n";
                result1004 += answ3 + "\n";
                result1004 += answ4 + "\n";
            }

            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return new QuestionData4(result1004);
    }

    public static QuestionData5 getRandomQuestionFromDatabase5() {
        String result1005 = "";

        try {
            // Здесь необходимо заменить "your_database_url", "your_username" и "your_password"
            String databaseUrl = "jdbc:mysql://37.143.15.239:3306/test1";
            String username = "root";
            String password = "yiPDmV6d75";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(databaseUrl, username, password);

            String query = "SELECT id_test1, quest, A, B, C, D, correct FROM itog ORDER BY RAND() LIMIT 1";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                int questionId = resultSet.getInt("id_test1");
                String question = resultSet.getString("quest");
                String answ1 = resultSet.getString("A");
                String answ2 = resultSet.getString("B");
                String answ3 = resultSet.getString("C");
                String answ4 = resultSet.getString("D");
                String correctAnswer = resultSet.getString("correct");

                questionAndAnswer5.put(question, correctAnswer);

                result1005 += question + "\n";
                result1005 += answ1 + "\n";
                result1005 += answ2 + "\n";
                result1005 += answ3 + "\n";
                result1005 += answ4 + "\n";
            }

            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return new QuestionData5(result1005);
    }

    public static QuestionData6 getRandomQuestionFromDatabase6() {
        String result1006 = "";

        try {
            // Здесь необходимо заменить "your_database_url", "your_username" и "your_password"
            String databaseUrl = "jdbc:mysql://37.143.15.239:3306/test1";
            String username = "root";
            String password = "yiPDmV6d75";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(databaseUrl, username, password);

            String query = "SELECT id_test1, quest, A, B, C, D, correct, block FROM itog ORDER BY RAND() LIMIT 1";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                int questionId = resultSet.getInt("id_test1");
                String question = resultSet.getString("quest");
                String answ1 = resultSet.getString("A");
                String answ2 = resultSet.getString("B");
                String answ3 = resultSet.getString("C");
                String answ4 = resultSet.getString("D");
                String correctAnswer = resultSet.getString("correct");
                String block = resultSet.getString("block");

                questionAndAnswer6.put(question, correctAnswer);

                result1006 += question + "\n";
                result1006 += answ1 + "\n";
                result1006 += answ2 + "\n";
                result1006 += answ3 + "\n";
                result1006 += answ4 + "\n";
            }

            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return new QuestionData6(result1006);
    }



    public static QuestionData7 getRandomQuestionFromDatabase7() {
        String result1007 = "";

        try {
            // Здесь необходимо заменить "your_database_url", "your_username" и "your_password"
            String databaseUrl = "jdbc:mysql://37.143.15.239:3306/test1";
            String username = "root";
            String password = "yiPDmV6d75";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(databaseUrl, username, password);

            String query = "SELECT id_test1, quest, A, B, C, D, correct FROM itog ORDER BY RAND() LIMIT 1";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                int questionId = resultSet.getInt("id_test1");
                String question = resultSet.getString("quest");
                String answ1 = resultSet.getString("A");
                String answ2 = resultSet.getString("B");
                String answ3 = resultSet.getString("C");
                String answ4 = resultSet.getString("D");
                String correctAnswer = resultSet.getString("correct");

                questionAndAnswer7.put(question, correctAnswer);

                result1007 += question + "\n";
                result1007 += answ1 + "\n";
                result1007 += answ2 + "\n";
                result1007 += answ3 + "\n";
                result1007 += answ4 + "\n";
            }

            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return new QuestionData7(result1007);
    }

    public static QuestionData8 getRandomQuestionFromDatabase8() {
        String result1008 = "";

        try {
            // Здесь необходимо заменить "your_database_url", "your_username" и "your_password"
            String databaseUrl = "jdbc:mysql://37.143.15.239:3306/test1";
            String username = "root";
            String password = "yiPDmV6d75";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(databaseUrl, username, password);

            String query = "SELECT id_test1, quest, A, B, C, D, correct FROM itog ORDER BY RAND() LIMIT 1";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                int questionId = resultSet.getInt("id_test1");
                String question = resultSet.getString("quest");
                String answ1 = resultSet.getString("A");
                String answ2 = resultSet.getString("B");
                String answ3 = resultSet.getString("C");
                String answ4 = resultSet.getString("D");
                String correctAnswer = resultSet.getString("correct");

                questionAndAnswer8.put(question, correctAnswer);

                result1008 += question + "\n";
                result1008 += answ1 + "\n";
                result1008 += answ2 + "\n";
                result1008 += answ3 + "\n";
                result1008 += answ4 + "\n";
            }

            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return new QuestionData8(result1008);
    }

    public static QuestionData9 getRandomQuestionFromDatabase9() {
        String result1009 = "";

        try {
            // Здесь необходимо заменить "your_database_url", "your_username" и "your_password"
            String databaseUrl = "jdbc:mysql://37.143.15.239:3306/test1";
            String username = "root";
            String password = "yiPDmV6d75";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(databaseUrl, username, password);

            String query = "SELECT id_test1, quest, A, B, C, D, correct FROM itog ORDER BY RAND() LIMIT 1";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                int questionId = resultSet.getInt("id_test1");
                String question = resultSet.getString("quest");
                String answ1 = resultSet.getString("A");
                String answ2 = resultSet.getString("B");
                String answ3 = resultSet.getString("C");
                String answ4 = resultSet.getString("D");
                String correctAnswer = resultSet.getString("correct");

                questionAndAnswer9.put(question, correctAnswer);

                result1009 += question + "\n";
                result1009 += answ1 + "\n";
                result1009 += answ2 + "\n";
                result1009 += answ3 + "\n";
                result1009 += answ4 + "\n";
            }

            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return new QuestionData9(result1009);
    }
    public static QuestionData10 getRandomQuestionFromDatabase10() {
        String result1010 = "";

        try {
            // Здесь необходимо заменить "your_database_url", "your_username" и "your_password"
            String databaseUrl = "jdbc:mysql://37.143.15.239:3306/test1";
            String username = "root";
            String password = "yiPDmV6d75";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(databaseUrl, username, password);

            String query = "SELECT id_test1, quest, A, B, C, D, correct FROM itog ORDER BY RAND() LIMIT 1";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                int questionId = resultSet.getInt("id_test1");
                String question = resultSet.getString("quest");
                String answ1 = resultSet.getString("A");
                String answ2 = resultSet.getString("B");
                String answ3 = resultSet.getString("C");
                String answ4 = resultSet.getString("D");
                String correctAnswer = resultSet.getString("correct");

                questionAndAnswer10.put(question, correctAnswer);

                result1010 += question + "\n";
                result1010 += answ1 + "\n";
                result1010 += answ2 + "\n";
                result1010 += answ3 + "\n";
                result1010 += answ4 + "\n";
            }

            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return new QuestionData10(result1010);
    }
    public static QuestionData11 getRandomQuestionFromDatabase11() {
        String result1011 = "";

        try {
            // Здесь необходимо заменить "your_database_url", "your_username" и "your_password"
            String databaseUrl = "jdbc:mysql://37.143.15.239:3306/test1";
            String username = "root";
            String password = "yiPDmV6d75";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(databaseUrl, username, password);

            String query = "SELECT id_test1, quest, A, B, C, D, correct FROM itog ORDER BY RAND() LIMIT 1";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                int questionId = resultSet.getInt("id_test1");
                String question = resultSet.getString("quest");
                String answ1 = resultSet.getString("A");
                String answ2 = resultSet.getString("B");
                String answ3 = resultSet.getString("C");
                String answ4 = resultSet.getString("D");
                String correctAnswer = resultSet.getString("correct");

                questionAndAnswer11.put(question, correctAnswer);

                result1011 += question + "\n";
                result1011 += answ1 + "\n";
                result1011 += answ2 + "\n";
                result1011 += answ3 + "\n";
                result1011 += answ4 + "\n";
            }

            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return new QuestionData11(result1011);
    }
    public static QuestionData12 getRandomQuestionFromDatabase12() {
        String result1012 = "";

        try {
            // Здесь необходимо заменить "your_database_url", "your_username" и "your_password"
            String databaseUrl = "jdbc:mysql://37.143.15.239:3306/test1";
            String username = "root";
            String password = "yiPDmV6d75";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(databaseUrl, username, password);

            String query = "SELECT id_test1, quest, A, B, C, D, correct FROM itog ORDER BY RAND() LIMIT 1";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                int questionId = resultSet.getInt("id_test1");
                String question = resultSet.getString("quest");
                String answ1 = resultSet.getString("A");
                String answ2 = resultSet.getString("B");
                String answ3 = resultSet.getString("C");
                String answ4 = resultSet.getString("D");
                String correctAnswer = resultSet.getString("correct");

                questionAndAnswer12.put(question, correctAnswer);

                result1012 += question + "\n";
                result1012 += answ1 + "\n";
                result1012 += answ2 + "\n";
                result1012 += answ3 + "\n";
                result1012 += answ4 + "\n";
            }

            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return new QuestionData12(result1012);
    }
    public static QuestionData13 getRandomQuestionFromDatabase13() {
        String result1013 = "";

        try {
            // Здесь необходимо заменить "your_database_url", "your_username" и "your_password"
            String databaseUrl = "jdbc:mysql://37.143.15.239:3306/test1";
            String username = "root";
            String password = "yiPDmV6d75";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(databaseUrl, username, password);

            String query = "SELECT id_test1, quest, A, B, C, D, correct FROM itog ORDER BY RAND() LIMIT 1";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                int questionId = resultSet.getInt("id_test1");
                String question = resultSet.getString("quest");
                String answ1 = resultSet.getString("A");
                String answ2 = resultSet.getString("B");
                String answ3 = resultSet.getString("C");
                String answ4 = resultSet.getString("D");
                String correctAnswer = resultSet.getString("correct");

                questionAndAnswer13.put(question, correctAnswer);

                result1013 += question + "\n";
                result1013 += answ1 + "\n";
                result1013 += answ2 + "\n";
                result1013 += answ3 + "\n";
                result1013 += answ4 + "\n";
            }

            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return new QuestionData13(result1013);
    }
    public static QuestionData14 getRandomQuestionFromDatabase14() {
        String result1014 = "";

        try {
            // Здесь необходимо заменить "your_database_url", "your_username" и "your_password"
            String databaseUrl = "jdbc:mysql://37.143.15.239:3306/test1";
            String username = "root";
            String password = "yiPDmV6d75";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(databaseUrl, username, password);

            String query = "SELECT id_test1, quest, A, B, C, D, correct FROM itog ORDER BY RAND() LIMIT 1";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                int questionId = resultSet.getInt("id_test1");
                String question = resultSet.getString("quest");
                String answ1 = resultSet.getString("A");
                String answ2 = resultSet.getString("B");
                String answ3 = resultSet.getString("C");
                String answ4 = resultSet.getString("D");
                String correctAnswer = resultSet.getString("correct");

                questionAndAnswer14.put(question, correctAnswer);

                result1014 += question + "\n";
                result1014 += answ1 + "\n";
                result1014 += answ2 + "\n";
                result1014 += answ3 + "\n";
                result1014 += answ4 + "\n";
            }

            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return new QuestionData14(result1014);
    }
    public static QuestionData15 getRandomQuestionFromDatabase15() {
        String result1015 = "";

        try {
            // Здесь необходимо заменить "your_database_url", "your_username" и "your_password"
            String databaseUrl = "jdbc:mysql://37.143.15.239:3306/test1";
            String username = "root";
            String password = "yiPDmV6d75";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(databaseUrl, username, password);

            String query = "SELECT id_test1, quest, A, B, C, D, correct FROM itog ORDER BY RAND() LIMIT 1";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                int questionId = resultSet.getInt("id_test1");
                String question = resultSet.getString("quest");
                String answ1 = resultSet.getString("A");
                String answ2 = resultSet.getString("B");
                String answ3 = resultSet.getString("C");
                String answ4 = resultSet.getString("D");
                String correctAnswer = resultSet.getString("correct");

                questionAndAnswer15.put(question, correctAnswer);

                result1015 += question + "\n";
                result1015 += answ1 + "\n";
                result1015 += answ2 + "\n";
                result1015 += answ3 + "\n";
                result1015 += answ4 + "\n";
            }

            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return new QuestionData15(result1015);
    }
    public static QuestionData16 getRandomQuestionFromDatabase16() {
        String result1016 = "";

        try {
            // Здесь необходимо заменить "your_database_url", "your_username" и "your_password"
            String databaseUrl = "jdbc:mysql://37.143.15.239:3306/test1";
            String username = "root";
            String password = "yiPDmV6d75";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(databaseUrl, username, password);

            String query = "SELECT id_test1, quest, A, B, C, D, correct FROM itog ORDER BY RAND() LIMIT 1";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                int questionId = resultSet.getInt("id_test1");
                String question = resultSet.getString("quest");
                String answ1 = resultSet.getString("A");
                String answ2 = resultSet.getString("B");
                String answ3 = resultSet.getString("C");
                String answ4 = resultSet.getString("D");
                String correctAnswer = resultSet.getString("correct");

                questionAndAnswer16.put(question, correctAnswer);

                result1016 += question + "\n";
                result1016 += answ1 + "\n";
                result1016 += answ2 + "\n";
                result1016 += answ3 + "\n";
                result1016 += answ4 + "\n";
            }

            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return new QuestionData16(result1016);
    }
    public static QuestionData17 getRandomQuestionFromDatabase17() {
        String result1017 = "";

        try {
            // Здесь необходимо заменить "your_database_url", "your_username" и "your_password"
            String databaseUrl = "jdbc:mysql://37.143.15.239:3306/test1";
            String username = "root";
            String password = "yiPDmV6d75";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(databaseUrl, username, password);

            String query = "SELECT id_test1, quest, A, B, C, D, correct FROM itog ORDER BY RAND() LIMIT 1";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                int questionId = resultSet.getInt("id_test1");
                String question = resultSet.getString("quest");
                String answ1 = resultSet.getString("A");
                String answ2 = resultSet.getString("B");
                String answ3 = resultSet.getString("C");
                String answ4 = resultSet.getString("D");
                String correctAnswer = resultSet.getString("correct");

                questionAndAnswer17.put(question, correctAnswer);

                result1017 += question + "\n";
                result1017 += answ1 + "\n";
                result1017 += answ2 + "\n";
                result1017 += answ3 + "\n";
                result1017 += answ4 + "\n";
            }

            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return new QuestionData17(result1017);
    }
    public static QuestionData18 getRandomQuestionFromDatabase18() {
        String result1018 = "";

        try {
            // Здесь необходимо заменить "your_database_url", "your_username" и "your_password"
            String databaseUrl = "jdbc:mysql://37.143.15.239:3306/test1";
            String username = "root";
            String password = "yiPDmV6d75";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(databaseUrl, username, password);

            String query = "SELECT id_test1, quest, A, B, C, D, correct FROM itog ORDER BY RAND() LIMIT 1";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                int questionId = resultSet.getInt("id_test1");
                String question = resultSet.getString("quest");
                String answ1 = resultSet.getString("A");
                String answ2 = resultSet.getString("B");
                String answ3 = resultSet.getString("C");
                String answ4 = resultSet.getString("D");
                String correctAnswer = resultSet.getString("correct");

                questionAndAnswer18.put(question, correctAnswer);

                result1018 += question + "\n";
                result1018 += answ1 + "\n";
                result1018 += answ2 + "\n";
                result1018 += answ3 + "\n";
                result1018 += answ4 + "\n";
            }

            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return new QuestionData18(result1018);
    }
    public static QuestionData19 getRandomQuestionFromDatabase19() {
        String result1019 = "";

        try {
            // Здесь необходимо заменить "your_database_url", "your_username" и "your_password"
            String databaseUrl = "jdbc:mysql://37.143.15.239:3306/test1";
            String username = "root";
            String password = "yiPDmV6d75";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(databaseUrl, username, password);

            String query = "SELECT id_test1, quest, A, B, C, D, correct FROM itog ORDER BY RAND() LIMIT 1";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                int questionId = resultSet.getInt("id_test1");
                String question = resultSet.getString("quest");
                String answ1 = resultSet.getString("A");
                String answ2 = resultSet.getString("B");
                String answ3 = resultSet.getString("C");
                String answ4 = resultSet.getString("D");
                String correctAnswer = resultSet.getString("correct");

                questionAndAnswer19.put(question, correctAnswer);

                result1019 += question + "\n";
                result1019 += answ1 + "\n";
                result1019 += answ2 + "\n";
                result1019 += answ3 + "\n";
                result1019 += answ4 + "\n";
            }

            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return new QuestionData19(result1019);
    }
    public static QuestionData20 getRandomQuestionFromDatabase20() {
        String result1020 = "";

        try {
            // Здесь необходимо заменить "your_database_url", "your_username" и "your_password"
            String databaseUrl = "jdbc:mysql://37.143.15.239:3306/test1";
            String username = "root";
            String password = "yiPDmV6d75";

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(databaseUrl, username, password);

            String query = "SELECT id_test1, quest, A, B, C, D, correct FROM itog ORDER BY RAND() LIMIT 1";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                int questionId = resultSet.getInt("id_test1");
                String question = resultSet.getString("quest");
                String answ1 = resultSet.getString("A");
                String answ2 = resultSet.getString("B");
                String answ3 = resultSet.getString("C");
                String answ4 = resultSet.getString("D");
                String correctAnswer = resultSet.getString("correct");

                questionAndAnswer20.put(question, correctAnswer);

                result1020 += question + "\n";
                result1020 += answ1 + "\n";
                result1020 += answ2 + "\n";
                result1020 += answ3 + "\n";
                result1020 += answ4 + "\n";
            }

            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        return new QuestionData20(result1020);
    }












}

