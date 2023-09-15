package org.example;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test3 {

    public String[] getCorrectAnswers3() {
        String[] correctAnswers3 = {t3a1(), t3a2(), t3a3(), t3a4(),t3a5()
        };
        return correctAnswers3;
    }
    public String b3q1() {
        String result1 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 1; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test3 WHERE id_test3 = ?";
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

    public String t3a1() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 1;
            String query = "SELECT correct FROM test3 WHERE id_test3 = ?";
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

    public String b3q2() {
        String result2 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 2; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test3 WHERE id_test3 = ?";
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
    public String t3a2() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 2;
            String query = "SELECT correct FROM test3 WHERE id_test3 = ?";
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

    public String b3q3() {
        String result3 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 3; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test3 WHERE id_test3 = ?";
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
    public String t3a3() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 3;
            String query = "SELECT correct FROM test3 WHERE id_test3 = ?";
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

    public String b3q4() {
        String result4 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 4; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test3 WHERE id_test3 = ?";
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
    public String t3a4() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 4;
            String query = "SELECT correct FROM test3 WHERE id_test3 = ?";
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
    public String b3q5() {
        String result5 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 5; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test3 WHERE id_test3 = ?";
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

    public String t3a5() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 5;
            String query = "SELECT correct FROM test3 WHERE id_test3 = ?";
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
