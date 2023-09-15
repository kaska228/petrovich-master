package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test7 {

    public String[] getCorrectAnswers7() {
        String[] correctAnswers7 = {t7a1(), t7a2(), t7a3(), t7a4(),t7a5(),t7a6(),t7a7(),t7a8(),t7a9(),t7a10(),t7a11(),t7a12(),t7a13(),t7a14(),t7a15(),t7a16(),t7a17(),t7a18(),t7a19(),t7a20()
        };
        return correctAnswers7;
    }

    public String b7q1() {
        String result1 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 1; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test7 WHERE id_test7 = ?";
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

    public String t7a1() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 1;
            String query = "SELECT correct FROM test7 WHERE id_test7 = ?";
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

    public String b7q2() {
        String result1 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 2; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test7 WHERE id_test7 = ?";
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
    public String t7a2() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 2;
            String query = "SELECT correct FROM test7 WHERE id_test7 = ?";
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
    public String b7q3() {
        String result1 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 3; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test7 WHERE id_test7 = ?";
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
    public String t7a3() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 3;
            String query = "SELECT correct FROM test7 WHERE id_test7 = ?";
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
    public String b7q4() {
        String result1 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 4; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test7 WHERE id_test7 = ?";
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
    public String t7a4() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 4;
            String query = "SELECT correct FROM test7 WHERE id_test7 = ?";
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
    public String b7q5() {
        String result1 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 5; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test7 WHERE id_test7 = ?";
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

    public String t7a5() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 5;
            String query = "SELECT correct FROM test7 WHERE id_test7 = ?";
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
    public String b7q6() {
        String result1 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 6; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test7 WHERE id_test7 = ?";
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

    public String t7a6() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 6;
            String query = "SELECT correct FROM test7 WHERE id_test7 = ?";
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

    public String b7q7() {
        String result1 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 7; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test7 WHERE id_test7 = ?";
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

    public String t7a7() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 7;
            String query = "SELECT correct FROM test7 WHERE id_test7 = ?";
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
    public String b7q8() {
        String result1 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 8; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test7 WHERE id_test7 = ?";
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

    public String t7a8() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 8;
            String query = "SELECT correct FROM test7 WHERE id_test7 = ?";
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
    public String b7q9() {
        String result1 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 9; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test7 WHERE id_test7 = ?";
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

    public String t7a9() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 9;
            String query = "SELECT correct FROM test7 WHERE id_test7 = ?";
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
    public String b7q10() {
        String result1 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 10; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test7 WHERE id_test7 = ?";
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
    public String t7a10() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 10;
            String query = "SELECT correct FROM test7 WHERE id_test7 = ?";
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

    public String b7q11() {
        String result1 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 11; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test7 WHERE id_test7 = ?";
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
    public String t7a11() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 11;
            String query = "SELECT correct FROM test7 WHERE id_test7 = ?";
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

    public String b7q12() {
        String result1 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 12; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test7 WHERE id_test7 = ?";
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
    public String t7a12() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 12;
            String query = "SELECT correct FROM test7 WHERE id_test7 = ?";
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
    public String b7q13() {
        String result1 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 13; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test7 WHERE id_test7 = ?";
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
    public String t7a13() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 13;
            String query = "SELECT correct FROM test7 WHERE id_test7 = ?";
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
    public String b7q14() {
        String result1 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 14; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test7 WHERE id_test7 = ?";
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
    public String t7a14() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 14;
            String query = "SELECT correct FROM test7 WHERE id_test7 = ?";
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

    public String b7q15() {
        String result1 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 15; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test7 WHERE id_test7 = ?";
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
    public String t7a15() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 15;
            String query = "SELECT correct FROM test7 WHERE id_test7 = ?";
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
    public String b7q16() {
        String result1 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 16; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test7 WHERE id_test7 = ?";
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
    public String t7a16() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 16;
            String query = "SELECT correct FROM test7 WHERE id_test7 = ?";
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

    public String b7q17() {
        String result1 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 17; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test7 WHERE id_test7 = ?";
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
    public String t7a17() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 17;
            String query = "SELECT correct FROM test7 WHERE id_test7 = ?";
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
    public String b7q18() {
        String result1 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 18; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test7 WHERE id_test7 = ?";
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
    public String t7a18() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 18;
            String query = "SELECT correct FROM test7 WHERE id_test7 = ?";
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

    public String b7q19() {
        String result1 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 19; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test7 WHERE id_test7 = ?";
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
    public String t7a19() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 19;
            String query = "SELECT correct FROM test7 WHERE id_test7 = ?";
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
    public String b7q20() {
        String result1 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 20; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test7 WHERE id_test7 = ?";
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
    public String t7a20() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 20;
            String query = "SELECT correct FROM test7 WHERE id_test7 = ?";
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
