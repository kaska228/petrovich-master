package org.example;


import org.apache.commons.lang3.tuple.Pair;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;


public class Test1 {

    private Map<Integer, Pair<String, LocalDate>> cache = new HashMap<>();
    private LocalDate lastUpdateDate;
    private static final LocalTime UPDATE_TIME = LocalTime.of(0, 0); // Время обновления данных

    public String[] getCorrectAnswers() {
        String[] correctAnswers1 = {getAnswerForQuestion1(), getAnswerForQuestion2(), getAnswerForQuestion3(), getAnswerForQuestion4(),getAnswerForQuestion5()
        ,getAnswerForQuestion6(), getAnswerForQuestion7(), getAnswerForQuestion8(), getAnswerForQuestion9(), getAnswerForQuestion10(),
                getAnswerForQuestion11(), getAnswerForQuestion12()};
        return correctAnswers1;
    }

    public String[] getQuestions() {
        String[] questions = new String[12];
        questions[0] = b1q1();
        questions[1] = b1q2();
        questions[2] = b1q3();
        questions[3] = b1q4();
        questions[4] = b1q5();
        questions[5] = b1q6();
        questions[6] = b1q7();
        questions[7] = b1q8();
        questions[8] = b1q9();
        questions[9] = b1q10();
        questions[10] = b1q11();
        questions[11] = b1q12();
        return questions;
    }



    public String b1q1() {

            int id = 1; // Идентификатор строки, которую вы хотите выбрать

            if (cache.containsKey(id)) {
                Pair<String, LocalDate> entry = cache.get(id);
                if (entry.getRight().equals(LocalDate.now())) {
                    return entry.getLeft();
                }
            }

            if (lastUpdateDate == null || lastUpdateDate.isBefore(LocalDate.now())) {
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

                    String query = "SELECT quest, A, B, C, D FROM test1 WHERE Id_test1 = ?";
                    PreparedStatement stmt = con.prepareStatement(query);
                    stmt.setInt(1, id);
                    ResultSet resultSet = stmt.executeQuery();

                    String result1 = "";
                    if (resultSet.next()) {
                        String question = resultSet.getString("quest");
                        String answ1 = resultSet.getString("A");
                        String answ2 = resultSet.getString("B");
                        String answ3 = resultSet.getString("C");
                        String answ4 = resultSet.getString("D");

                        result1 += question + "\n";
                        result1 += answ1 + "\n";
                        result1 += answ2 + "\n";
                        result1 += answ3 + "\n";
                        result1 += answ4 + "\n";

                        String formattedText = question.replaceAll("(?i)1. Какой скоростной режим необходимо соблюдать на территории СТЦ и прилегающих территориях?","*1. Какой скоростной режим необходимо соблюдать на территории СТЦ и прилегающих территориях?*");

                    }

                    con.close();
                    cache.put(id, Pair.of(result1, LocalDate.now()));
                    lastUpdateDate = LocalDate.now();
                    return result1;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            Pair<String, LocalDate> entry = cache.get(id);
            return entry != null ? entry.getLeft() : "";
        }




    public String getAnswerForQuestion1() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 1;
            String query = "SELECT correct FROM test1 WHERE Id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

            if (resultSet.next()) {
                answer = resultSet.getString("correct");
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return answer;
    }


    public String b1q2() {
        int id = 2; // Идентификатор строки, которую вы хотите выбрать
        updateCache();
        if (cache.containsKey(id)) {
            Pair<String, LocalDate> entry = cache.get(id);
            if (entry.getRight().equals(LocalDate.now())) {
                return entry.getLeft();
            }
        }

        if (lastUpdateDate == null || lastUpdateDate.isBefore(LocalDate.now())) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

                String query = "SELECT quest, A, B, C, D FROM test1 WHERE Id_test1 = ?";
                PreparedStatement stmt = con.prepareStatement(query);
                stmt.setInt(1, id);
                ResultSet resultSet = stmt.executeQuery();

                String result2 = "";
                if (resultSet.next()) {
                    String question = resultSet.getString("quest");
                    String answ1 = resultSet.getString("A");
                    String answ2 = resultSet.getString("B");
                    String answ3 = resultSet.getString("C");
                    String answ4 = resultSet.getString("D");

                    result2 += question + "\n";
                    result2 += answ1 + "\n";
                    result2 += answ2 + "\n";
                    result2 += answ3 + "\n";
                    result2 += answ4 + "\n";
                }

                con.close();
                cache.put(id, Pair.of(result2, LocalDate.now()));
                lastUpdateDate = LocalDate.now();
                return result2;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        Pair<String, LocalDate> entry = cache.get(id);
        return entry != null ? entry.getLeft() : "";
    }



    public String getAnswerForQuestion2() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 2;
            String query = "SELECT correct FROM test1 WHERE Id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

            if (resultSet.next()) {
                answer = resultSet.getString("correct");
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return answer;
    }

    public String b1q3() {
        int id = 3; // Идентификатор строки, которую вы хотите выбрать

        if (cache.containsKey(id)) {
            Pair<String, LocalDate> entry = cache.get(id);
            if (entry.getRight().equals(LocalDate.now())) {
                return entry.getLeft();
            }
        }

        if (lastUpdateDate == null || lastUpdateDate.isBefore(LocalDate.now())) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

                String query = "SELECT quest, A, B, C, D FROM test1 WHERE Id_test1 = ?";
                PreparedStatement stmt = con.prepareStatement(query);
                stmt.setInt(1, id);
                ResultSet resultSet = stmt.executeQuery();

                String result3 = "";
                if (resultSet.next()) {
                    String question = resultSet.getString("quest");
                    String answ1 = resultSet.getString("A");
                    String answ2 = resultSet.getString("B");
                    String answ3 = resultSet.getString("C");
                    String answ4 = resultSet.getString("D");

                    result3 += question + "\n";
                    result3 += answ1 + "\n";
                    result3 += answ2 + "\n";
                    result3 += answ3 + "\n";
                    result3 += answ4 + "\n";
                }

                con.close();
                cache.put(id, Pair.of(result3, LocalDate.now()));
                lastUpdateDate = LocalDate.now();
                return result3;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        Pair<String, LocalDate> entry = cache.get(id);
        return entry != null ? entry.getLeft() : "";
    }
    public String getAnswerForQuestion3() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 3;
            String query = "SELECT correct FROM test1 WHERE Id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

            if (resultSet.next()) {
                answer = resultSet.getString("correct");
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return answer;
    }

    public String b1q4() {
        int id = 4; // Идентификатор строки, которую вы хотите выбрать

        if (cache.containsKey(id)) {
            Pair<String, LocalDate> entry = cache.get(id);
            if (entry.getRight().equals(LocalDate.now())) {
                return entry.getLeft();
            }
        }

        if (lastUpdateDate == null || lastUpdateDate.isBefore(LocalDate.now())) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

                String query = "SELECT quest, A, B, C, D FROM test1 WHERE Id_test1 = ?";
                PreparedStatement stmt = con.prepareStatement(query);
                stmt.setInt(1, id);
                ResultSet resultSet = stmt.executeQuery();

                String result4 = "";
                if (resultSet.next()) {
                    String question = resultSet.getString("quest");
                    String answ1 = resultSet.getString("A");
                    String answ2 = resultSet.getString("B");
                    String answ3 = resultSet.getString("C");
                    String answ4 = resultSet.getString("D");

                    result4 += question + "\n";
                    result4 += answ1 + "\n";
                    result4 += answ2 + "\n";
                    result4 += answ3 + "\n";
                    result4 += answ4 + "\n";
                }

                con.close();
                cache.put(id, Pair.of(result4, LocalDate.now()));
                lastUpdateDate = LocalDate.now();
                return result4;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        Pair<String, LocalDate> entry = cache.get(id);
        return entry != null ? entry.getLeft() : "";
    }
    public String getAnswerForQuestion4() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 4;
            String query = "SELECT correct FROM test1 WHERE Id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

            if (resultSet.next()) {
                answer = resultSet.getString("correct");
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return answer;
    }

    public String b1q5() {
        int id = 5; // Идентификатор строки, которую вы хотите выбрать

        if (cache.containsKey(id)) {
            Pair<String, LocalDate> entry = cache.get(id);
            if (entry.getRight().equals(LocalDate.now())) {
                return entry.getLeft();
            }
        }

        if (lastUpdateDate == null || lastUpdateDate.isBefore(LocalDate.now())) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

                String query = "SELECT quest, A, B, C, D FROM test1 WHERE Id_test1 = ?";
                PreparedStatement stmt = con.prepareStatement(query);
                stmt.setInt(1, id);
                ResultSet resultSet = stmt.executeQuery();

                String result5 = "";
                if (resultSet.next()) {
                    String question = resultSet.getString("quest");
                    String answ1 = resultSet.getString("A");
                    String answ2 = resultSet.getString("B");
                    String answ3 = resultSet.getString("C");
                    String answ4 = resultSet.getString("D");

                    result5 += question + "\n";
                    result5 += answ1 + "\n";
                    result5 += answ2 + "\n";
                    result5 += answ3 + "\n";
                    result5 += answ4 + "\n";
                }

                con.close();
                cache.put(id, Pair.of(result5, LocalDate.now()));
                lastUpdateDate = LocalDate.now();
                return result5;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        Pair<String, LocalDate> entry = cache.get(id);
        return entry != null ? entry.getLeft() : "";

    }
    public String getAnswerForQuestion5() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 5;
            String query = "SELECT correct FROM test1 WHERE Id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

            if (resultSet.next()) {
                answer = resultSet.getString("correct");
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return answer;
    }

    public String b1q6() {
        int id = 6; // Идентификатор строки, которую вы хотите выбрать

        if (cache.containsKey(id)) {
            Pair<String, LocalDate> entry = cache.get(id);
            if (entry.getRight().equals(LocalDate.now())) {
                return entry.getLeft();
            }
        }

        if (lastUpdateDate == null || lastUpdateDate.isBefore(LocalDate.now())) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

                String query = "SELECT quest, A, B, C, D FROM test1 WHERE Id_test1 = ?";
                PreparedStatement stmt = con.prepareStatement(query);
                stmt.setInt(1, id);
                ResultSet resultSet = stmt.executeQuery();

                String result6 = "";
                if (resultSet.next()) {
                    String question = resultSet.getString("quest");
                    String answ1 = resultSet.getString("A");
                    String answ2 = resultSet.getString("B");
                    String answ3 = resultSet.getString("C");
                    String answ4 = resultSet.getString("D");

                    result6 += question + "\n";
                    result6 += answ1 + "\n";
                    result6 += answ2 + "\n";
                    result6 += answ3 + "\n";
                    result6 += answ4 + "\n";
                }

                con.close();
                cache.put(id, Pair.of(result6, LocalDate.now()));
                lastUpdateDate = LocalDate.now();
                return result6;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        Pair<String, LocalDate> entry = cache.get(id);
        return entry != null ? entry.getLeft() : "";

    }
    public String getAnswerForQuestion6() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 6;
            String query = "SELECT correct FROM test1 WHERE Id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

            if (resultSet.next()) {
                answer = resultSet.getString("correct");
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return answer;
    }

    public String b1q7() {
        int id = 7; // Идентификатор строки, которую вы хотите выбрать

        if (cache.containsKey(id)) {
            Pair<String, LocalDate> entry = cache.get(id);
            if (entry.getRight().equals(LocalDate.now())) {
                return entry.getLeft();
            }
        }

        if (lastUpdateDate == null || lastUpdateDate.isBefore(LocalDate.now())) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

                String query = "SELECT quest, A, B, C  FROM test1 WHERE Id_test1 = ?";
                PreparedStatement stmt = con.prepareStatement(query);
                stmt.setInt(1, id);
                ResultSet resultSet = stmt.executeQuery();

                String result7 = "";
                if (resultSet.next()) {
                    String question = resultSet.getString("quest");
                    String answ1 = resultSet.getString("A");
                    String answ2 = resultSet.getString("B");
                    String answ3 = resultSet.getString("C");
                    //String answ4 = resultSet.getString("D");

                    result7 += question + "\n";
                    result7 += answ1 + "\n";
                    result7 += answ2 + "\n";
                    result7 += answ3 + "";
                   // result7 += answ4 + "\n";
                }

                con.close();
                cache.put(id, Pair.of(result7, LocalDate.now()));
                lastUpdateDate = LocalDate.now();
                return result7;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        Pair<String, LocalDate> entry = cache.get(id);
        return entry != null ? entry.getLeft() : "";

    }

    public String getAnswerForQuestion7() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 7;
            String query = "SELECT correct FROM test1 WHERE Id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

            if (resultSet.next()) {
                answer = resultSet.getString("correct");
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return answer;
    }

    public String b1q8() {
        int id = 8; // Идентификатор строки, которую вы хотите выбрать

        if (cache.containsKey(id)) {
            Pair<String, LocalDate> entry = cache.get(id);
            if (entry.getRight().equals(LocalDate.now())) {
                return entry.getLeft();
            }
        }

        if (lastUpdateDate == null || lastUpdateDate.isBefore(LocalDate.now())) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

                String query = "SELECT quest, A, B, C, D FROM test1 WHERE Id_test1 = ?";
                PreparedStatement stmt = con.prepareStatement(query);
                stmt.setInt(1, id);
                ResultSet resultSet = stmt.executeQuery();

                String result8 = "";
                if (resultSet.next()) {
                    String question = resultSet.getString("quest");
                    String answ1 = resultSet.getString("A");
                    String answ2 = resultSet.getString("B");
                    String answ3 = resultSet.getString("C");
                    String answ4 = resultSet.getString("D");

                    result8 += question + "\n";
                    result8 += answ1 + "\n";
                    result8 += answ2 + "\n";
                    result8 += answ3 + "\n";
                    result8 += answ4 + "\n";
                }

                con.close();
                cache.put(id, Pair.of(result8, LocalDate.now()));
                lastUpdateDate = LocalDate.now();
                return result8;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        Pair<String, LocalDate> entry = cache.get(id);
        return entry != null ? entry.getLeft() : "";

    }
    public String getAnswerForQuestion8() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 8;
            String query = "SELECT correct FROM test1 WHERE Id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

            if (resultSet.next()) {
                answer = resultSet.getString("correct");
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return answer;
    }

    public String b1q9() {
        int id = 9; // Идентификатор строки, которую вы хотите выбрать

        if (cache.containsKey(id)) {
            Pair<String, LocalDate> entry = cache.get(id);
            if (entry.getRight().equals(LocalDate.now())) {
                return entry.getLeft();
            }
        }

        if (lastUpdateDate == null || lastUpdateDate.isBefore(LocalDate.now())) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

                String query = "SELECT quest, A, B, C, D FROM test1 WHERE Id_test1 = ?";
                PreparedStatement stmt = con.prepareStatement(query);
                stmt.setInt(1, id);
                ResultSet resultSet = stmt.executeQuery();

                String result9 = "";
                if (resultSet.next()) {
                    String question = resultSet.getString("quest");
                    String answ1 = resultSet.getString("A");
                    String answ2 = resultSet.getString("B");
                    String answ3 = resultSet.getString("C");
                    String answ4 = resultSet.getString("D");

                    result9 += question + "\n";
                    result9 += answ1 + "\n";
                    result9 += answ2 + "\n";
                    result9 += answ3 + "\n";
                    result9 += answ4 + "\n";
                }

                con.close();
                cache.put(id, Pair.of(result9, LocalDate.now()));
                lastUpdateDate = LocalDate.now();
                return result9;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        Pair<String, LocalDate> entry = cache.get(id);
        return entry != null ? entry.getLeft() : "";

    }

    public String getAnswerForQuestion9() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 9;
            String query = "SELECT correct FROM test1 WHERE Id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

            if (resultSet.next()) {
                answer = resultSet.getString("correct");
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return answer;
    }

    public String b1q10() {
        int id = 10; // Идентификатор строки, которую вы хотите выбрать

        if (cache.containsKey(id)) {
            Pair<String, LocalDate> entry = cache.get(id);
            if (entry.getRight().equals(LocalDate.now())) {
                return entry.getLeft();
            }
        }

        if (lastUpdateDate == null || lastUpdateDate.isBefore(LocalDate.now())) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

                String query = "SELECT quest, A, B, C, D FROM test1 WHERE Id_test1 = ?";
                PreparedStatement stmt = con.prepareStatement(query);
                stmt.setInt(1, id);
                ResultSet resultSet = stmt.executeQuery();

                String result10 = "";
                if (resultSet.next()) {
                    String question = resultSet.getString("quest");
                    String answ1 = resultSet.getString("A");
                    String answ2 = resultSet.getString("B");
                    String answ3 = resultSet.getString("C");
                    String answ4 = resultSet.getString("D");

                    result10 += question + "\n";
                    result10 += answ1 + "\n";
                    result10 += answ2 + "\n";
                    result10 += answ3 + "\n";
                    result10 += answ4 + "\n";
                }

                con.close();
                cache.put(id, Pair.of(result10, LocalDate.now()));
                lastUpdateDate = LocalDate.now();
                return result10;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        Pair<String, LocalDate> entry = cache.get(id);
        return entry != null ? entry.getLeft() : "";

    }
    public String getAnswerForQuestion10() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 10;
            String query = "SELECT correct FROM test1 WHERE Id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

            if (resultSet.next()) {
                answer = resultSet.getString("correct");
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return answer;
    }

    public String b1q11() {
        int id = 11; // Идентификатор строки, которую вы хотите выбрать

        if (cache.containsKey(id)) {
            Pair<String, LocalDate> entry = cache.get(id);
            if (entry.getRight().equals(LocalDate.now())) {
                return entry.getLeft();
            }
        }

        if (lastUpdateDate == null || lastUpdateDate.isBefore(LocalDate.now())) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

                String query = "SELECT quest, A, B, C, D FROM test1 WHERE Id_test1 = ?";
                PreparedStatement stmt = con.prepareStatement(query);
                stmt.setInt(1, id);
                ResultSet resultSet = stmt.executeQuery();

                String result11 = "";
                if (resultSet.next()) {
                    String question = resultSet.getString("quest");
                    String answ1 = resultSet.getString("A");
                    String answ2 = resultSet.getString("B");
                    String answ3 = resultSet.getString("C");
                    String answ4 = resultSet.getString("D");

                    result11 += question + "\n";
                    result11 += answ1 + "\n";
                    result11 += answ2 + "\n";
                    result11 += answ3 + "\n";
                    result11 += answ4 + "\n";
                }

                con.close();
                cache.put(id, Pair.of(result11, LocalDate.now()));
                lastUpdateDate = LocalDate.now();
                return result11;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        Pair<String, LocalDate> entry = cache.get(id);
        return entry != null ? entry.getLeft() : "";

    }
    public String getAnswerForQuestion11() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 11;
            String query = "SELECT correct FROM test1 WHERE Id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

            if (resultSet.next()) {
                answer = resultSet.getString("correct");
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return answer;
    }

    public String b1q12() {
        int id = 12; // Идентификатор строки, которую вы хотите выбрать

        if (cache.containsKey(id)) {
            Pair<String, LocalDate> entry = cache.get(id);
            if (entry.getRight().equals(LocalDate.now())) {
                return entry.getLeft();
            }
        }

        if (lastUpdateDate == null || lastUpdateDate.isBefore(LocalDate.now())) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

                String query = "SELECT quest, A, B, C, D FROM test1 WHERE Id_test1 = ?";
                PreparedStatement stmt = con.prepareStatement(query);
                stmt.setInt(1, id);
                ResultSet resultSet = stmt.executeQuery();

                String result12 = "";
                if (resultSet.next()) {
                    String question = resultSet.getString("quest");
                    String answ1 = resultSet.getString("A");
                    String answ2 = resultSet.getString("B");
                    String answ3 = resultSet.getString("C");
                  //  String answ4 = resultSet.getString("D");

                    result12 += question + "\n";
                    result12 += answ1 + "\n";
                    result12 += answ2 + "\n";
                    result12 += answ3 + "";
                   // result12 += answ4 + "\n";
                }

                con.close();
                cache.put(id, Pair.of(result12, LocalDate.now()));
                lastUpdateDate = LocalDate.now();
                return result12;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        Pair<String, LocalDate> entry = cache.get(id);
        return entry != null ? entry.getLeft() : "";

    }
    public String getAnswerForQuestion12() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 12;
            String query = "SELECT correct FROM test1 WHERE Id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

            if (resultSet.next()) {
                answer = resultSet.getString("correct");
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return answer;
    }
    private void updateCache() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            for (int id = 1; id <= 12; id++) {
                String query = "SELECT quest, A, B, C, D FROM test1 WHERE Id_test1 = ?";
                PreparedStatement stmt = con.prepareStatement(query);
                stmt.setInt(1, id);
                ResultSet resultSet = stmt.executeQuery();

                String result = "";
                if (resultSet.next()) {
                    String question = resultSet.getString("quest");
                    String answ1 = resultSet.getString("A");
                    String answ2 = resultSet.getString("B");
                    String answ3 = resultSet.getString("C");
                    String answ4 = resultSet.getString("D");

                    result += question + "\n";
                    result += answ1 + "\n";
                    result += answ2 + "\n";
                    result += answ3 + "\n";
                    result += answ4 + "\n";
                }

                cache.put(id, Pair.of(result, LocalDate.now()));
            }

            con.close();
            lastUpdateDate = LocalDate.now();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

