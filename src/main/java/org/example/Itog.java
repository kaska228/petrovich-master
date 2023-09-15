package org.example;

import org.apache.commons.lang3.tuple.Pair;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;


public class Itog {

    private Map<Integer, Pair<String, LocalDate>> cache = new HashMap<>();
    private LocalDate lastUpdateDate;
    private static final LocalTime UPDATE_TIME = LocalTime.of(0, 0); // Время обновления данных


    public String[] getCorrectAnswers10(int i) {
        String[] correctAnswers10 = {ait1(), ait2(), ait3(), ait4(),ait5()
                ,ait6(), ait7(), ait8(),ait9(),ait10(),ait11(),ait12(),ait13(),ait14(),ait15(),ait16(),ait17(),ait18(),ait19(),ait20(),ait21(),ait22(),ait23()
                ,ait24(),ait25(),ait26(),ait27(),ait28(),ait29(),ait30(),ait31(),ait32(),ait33(),ait34()
                ,ait35(),ait36(),ait37(),ait38(),ait39(),ait40(),ait41(),ait42()
                ,ait43(),ait44(),ait45(),ait45(),ait46(),ait47(),ait48(),ait49(),ait50(),ait51(),ait52(),ait53(),ait54(),ait55(),ait56(),ait57()
        ,ait58(),ait59(),ait60(),ait61(),ait62(),ait63(),ait64(),ait65(),ait66(),ait67(),ait68(),ait69(),ait70(),ait71(),ait72(),ait73(),ait74(),ait75(),ait76(),ait77(),ait78(),ait79(),ait80(),ait81()
                ,ait82(),ait83(),ait84(),ait85(),ait86(),ait87(),ait88(),ait89(),ait90(),ait91(),ait92(),ait93(),ait94(),ait95(),ait96(),ait97()};
        return correctAnswers10;
    }
   public String ti1() {

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

                String query = "SELECT quest, A, B, C, D FROM itog WHERE Id_test1 = ?";
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

    public String ait1() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 1;
            String query = "SELECT correct FROM itog WHERE Id_test1 = ?";
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


    public String ait2() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 2;
            String query = "SELECT correct FROM itog WHERE Id_test1 = ?";
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

    public String ti3() {
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

                String query = "SELECT quest, A, B, C, D FROM itog WHERE Id_test1 = ?";
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
    public String ait3() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 3;
            String query = "SELECT correct FROM itog WHERE Id_test1 = ?";
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

    public String ti4() {
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

                String query = "SELECT quest, A, B, C, D FROM itog WHERE Id_test1 = ?";
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
    public String ait4() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 4;
            String query = "SELECT correct FROM itog WHERE Id_test1 = ?";
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

    public String ti5() {
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

                String query = "SELECT quest, A, B, C, D FROM itog WHERE Id_test1 = ?";
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
    public String ait5() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 5;
            String query = "SELECT correct FROM itog WHERE Id_test1 = ?";
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

    public String ti6() {
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

                String query = "SELECT quest, A, B, C, D FROM itog WHERE Id_test1 = ?";
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
    public String ait6() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 6;
            String query = "SELECT correct FROM itog WHERE Id_test1 = ?";
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

    public String ti7() {
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

                String query = "SELECT quest, A, B, C, D FROM itog WHERE Id_test1 = ?";
                PreparedStatement stmt = con.prepareStatement(query);
                stmt.setInt(1, id);
                ResultSet resultSet = stmt.executeQuery();

                String result7 = "";
                if (resultSet.next()) {
                    String question = resultSet.getString("quest");
                    String answ1 = resultSet.getString("A");
                    String answ2 = resultSet.getString("B");
                    String answ3 = resultSet.getString("C");
                    String answ4 = resultSet.getString("D");

                    result7 += question + "\n";
                    result7 += answ1 + "\n";
                    result7 += answ2 + "\n";
                    result7 += answ3 + "\n";
                    result7 += answ4 + "\n";
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

    public String ait7() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 7;
            String query = "SELECT correct FROM itog WHERE Id_test1 = ?";
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

    public String ti8() {
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

                String query = "SELECT quest, A, B, C, D FROM itog WHERE Id_test1 = ?";
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
    public String ait8() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 8;
            String query = "SELECT correct FROM itog WHERE Id_test1 = ?";
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

    public String ti9() {
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

                String query = "SELECT quest, A, B, C, D FROM itog WHERE Id_test1 = ?";
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

    public String ait9() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 9;
            String query = "SELECT correct FROM itog WHERE Id_test1 = ?";
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

    public String ti10() {
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

                String query = "SELECT quest, A, B, C, D FROM itog WHERE Id_test1 = ?";
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
    public String ait10() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 10;
            String query = "SELECT correct FROM itog WHERE Id_test1 = ?";
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

    public String ti11() {
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

                String query = "SELECT quest, A, B, C, D FROM itog WHERE Id_test1 = ?";
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
    public String ait11() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 11;
            String query = "SELECT correct FROM itog WHERE Id_test1 = ?";
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

    public String ti12() {
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

                String query = "SELECT quest, A, B, C, D FROM itog WHERE Id_test1 = ?";
                PreparedStatement stmt = con.prepareStatement(query);
                stmt.setInt(1, id);
                ResultSet resultSet = stmt.executeQuery();

                String result12 = "";
                if (resultSet.next()) {
                    String question = resultSet.getString("quest");
                    String answ1 = resultSet.getString("A");
                    String answ2 = resultSet.getString("B");
                    String answ3 = resultSet.getString("C");
                    String answ4 = resultSet.getString("D");

                    result12 += question + "\n";
                    result12 += answ1 + "\n";
                    result12 += answ2 + "\n";
                    result12 += answ3 + "\n";
                    result12 += answ4 + "\n";
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
    public String ait12() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 12;
            String query = "SELECT correct FROM itog WHERE Id_test1 = ?";
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
                String query = "SELECT quest, A, B, C, D FROM itog WHERE Id_test1 = ?";
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

    public String ti13() {
        String result1 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 13; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result1;
    }

    public String ait13() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 13;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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

    public String ti14() {
        String result2 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 14; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result2;
    }
    public String ait14() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 14;
            String query = "SELECT correct FROM itog WHERE Id_test1 = ?";
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

    public String ti15() {
        String result3 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 15; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result3;
    }
    public String ait15() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 15;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti16() {
        String result4 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 16; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result4;
    }
    public String ait16() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 16;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti17() {
        String result5 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 17; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result5;
    }

    public String ait17() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 17;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti18() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 18; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait18() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 18;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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

    public String ti19() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 19; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait19() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 19;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti20() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 20; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait20() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 20;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti21() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 21; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait21() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 21;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti22() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 22; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }

    public String ti23() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 23; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait23() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 23;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ait22() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 22;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti24() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 24; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait24() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 24;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti25() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 25; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait25() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 25;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti26() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 26; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait26() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 26;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti27() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 27; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait27() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 27;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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

    public String ti28() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 28; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait28() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 28;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti29() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 29; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait29() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 29;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti30() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 30; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait30() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 30;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti31() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 31; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait31() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 31;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti32() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 32; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait32() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 32;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti33() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 33; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait33() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 33;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti34() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 34; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait34() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 34;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti35() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 35; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait35() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 35;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti36() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 36; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait36() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 36;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti37() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 37; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait37() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 37;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti38() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 38; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait38() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 38;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti39() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 39; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait39() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 39;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti40() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 40; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait40() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 40;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti41() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 41; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait41() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 41;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti42() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 42; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait42() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 42;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti43() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 43; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait43() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 43;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti44() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 44; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait44() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 44;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti45() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 45; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait45() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 45;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti46() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 46; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait46() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 46;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti47() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 47; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait47() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 47;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti48() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 48; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait48() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 48;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti49() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 49; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait49() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 49;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti50() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 50; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait50() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 50;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti51() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 51; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait51() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 51;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti52() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 52; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait52() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 52;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti53() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 53; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait53() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 53;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti54() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 54; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait54() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 54;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti55() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 55; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait55() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 55;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti56() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 56; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait56() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 56;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti57() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 57; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait57() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 57;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti58() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 58; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait58() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 58;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti59() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 59; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait59() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 59;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti60() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 60; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait60() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 60;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti61() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 61; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait61() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 61;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti62() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 62; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait62() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 62;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti63() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 63; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait63() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 63;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti64() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 64; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait64() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 64;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti65() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 65; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait65() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 65;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti66() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 66; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait66() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 66;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti67() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 67; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait67() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 67;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti68() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 68; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait68() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 68;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti69() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 69; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait69() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 69;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti70() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 70; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait70() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 70;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti71() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 71; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait71() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 71;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti72() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 72; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait72() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 72;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti73() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 73; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait73() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 73;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti74() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 74; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait74() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 74;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti75() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 75; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait75() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 75;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti76() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 76; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait76() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 76;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti77() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 77; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait77() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 77;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti78() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 78; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait78() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 78;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti79() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 79; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait79() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 79;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti80() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 80; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait80() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 80;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti81() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 81; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait81() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 81;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti82() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 82; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait82() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 82;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti83() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 83; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait83() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 83;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti84() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 84; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait84() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 84;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti85() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 85; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait85() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 85;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti86() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 86; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait86() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 86;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti87() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 87; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait87() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 87;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti88() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 88; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait88() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 88;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti89() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 89; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait89() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 89;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti90() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 90; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait90() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 90;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti91() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 91; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait91() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 91;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti92() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 92; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait92() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 92;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti93() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 93; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait93() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 93;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti94() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 94; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait94() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 94;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti95() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 95; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait95() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 95;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti96() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 96; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait96() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 96;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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
    public String ti97() {
        String result6 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 97; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM itog WHERE id_test1 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

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
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result6;
    }
    public String ait97() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 97;
            String query = "SELECT correct FROM itog WHERE id_test1 = ?";
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


}
