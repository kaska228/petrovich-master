package org.example;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test8 {

    public String[] getCorrectAnswers8() {
        String[] correctAnswers8 = { t8a2(), t8a3(), t8a4(),t8a5(),t8a6(),t8a7(),t8a8(),t8a9()
        };
        return correctAnswers8;
    }

    public String b8q2() {
        String result1 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 1; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test8 WHERE id_test8 = ?";
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
    public String t8a2() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 1;
            String query = "SELECT correct FROM test8 WHERE id_test8 = ?";
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

    public String b8q3() {
        String result1 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 2; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test8 WHERE id_test8 = ?";
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
    public String t8a3() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 2;
            String query = "SELECT correct FROM test8 WHERE id_test8 = ?";
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
    public String b8q4() {
        String result1 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 3; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test8 WHERE id_test8 = ?";
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
    public String t8a4() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 3;
            String query = "SELECT correct FROM test8 WHERE id_test8 = ?";
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
    public String b8q5() {
        String result1 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 4; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test8 WHERE id_test8 = ?";
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

    public String t8a5() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 4;
            String query = "SELECT correct FROM test8 WHERE id_test8 = ?";
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
    public String b8q6() {
        String result1 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 5; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test8 WHERE id_test8 = ?";
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

    public String t8a6() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 5;
            String query = "SELECT correct FROM test8 WHERE id_test8 = ?";
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
    public String b8q7() {
        String result1 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 6; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test8 WHERE id_test8 = ?";
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

    public String t8a7() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 6;
            String query = "SELECT correct FROM test8 WHERE id_test8 = ?";
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
    public String b8q8() {
        String result1 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 7; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test8 WHERE id_test8 = ?";
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

    public String t8a8() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 7;
            String query = "SELECT correct FROM test8 WHERE id_test8 = ?";
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
    public String b8q9() {
        String result1 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 8; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test8 WHERE id_test8 = ?";
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

    public String t8a9() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 8;
            String query = "SELECT correct FROM test8 WHERE id_test8 = ?";
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
