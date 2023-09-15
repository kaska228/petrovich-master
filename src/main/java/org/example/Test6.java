package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test6 {

    public String[] getCorrectAnswers6() {
        String[] correctAnswers6 = {t6a1(), t6a2(), t6a3(), t6a4(),t6a5(),t6a6(),t6a7(),t6a8(),t6a9(),t6a10(),t6a11(),t6a12(),t6a13()
        };
        return correctAnswers6;
    }

    public String b6q1() {
        String result1 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 1; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test6 WHERE id_test6 = ?";
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

    public String t6a1() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 1;
            String query = "SELECT correct FROM test6 WHERE id_test6 = ?";
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

    public String b6q2() {
        String result2 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 2; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test6 WHERE id_test6 = ?";
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
    public String t6a2() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 2;
            String query = "SELECT correct FROM test6 WHERE id_test6 = ?";
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
    public String b6q3() {
        String result1 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 3; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test6 WHERE id_test6 = ?";
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
    public String t6a3() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 3;
            String query = "SELECT correct FROM test6 WHERE id_test6 = ?";
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
    public String b6q4() {
        String result1 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 4; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test6 WHERE id_test6 = ?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery();

            if (resultSet.next()) {
                String question = resultSet.getString("quest");
                String answ1 = resultSet.getString("A");
                String answ2 = resultSet.getString("B");


                result1 += question + "\n";
                result1 += answ1 + "\n";
                result1 += answ2 + "\n";

            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result1;
    }
    public String t6a4() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 4;
            String query = "SELECT correct FROM test6 WHERE id_test6 = ?";
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
    public String b6q5() {
        String result1 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 5; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test6 WHERE id_test6 = ?";
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

    public String t6a5() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 5;
            String query = "SELECT correct FROM test6 WHERE id_test6 = ?";
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
    public String b6q6() {
        String result1 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 6; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test6 WHERE id_test6 = ?";
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

    public String t6a6() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 6;
            String query = "SELECT correct FROM test6 WHERE id_test6 = ?";
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

    public String b6q7() {
        String result1 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 7; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test6 WHERE id_test6 = ?";
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

    public String t6a7() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 7;
            String query = "SELECT correct FROM test6 WHERE id_test6 = ?";
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
    public String b6q8() {
        String result1 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 8; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test6 WHERE id_test6 = ?";
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

    public String t6a8() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 8;
            String query = "SELECT correct FROM test6 WHERE id_test6 = ?";
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
    public String b6q9() {
        String result1 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 9; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test6 WHERE id_test6 = ?";
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

    public String t6a9() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 9;
            String query = "SELECT correct FROM test6 WHERE id_test6 = ?";
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
    public String b6q10() {
        String result1 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 10; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test6 WHERE id_test6 = ?";
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
    public String t6a10() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 10;
            String query = "SELECT correct FROM test6 WHERE id_test6 = ?";
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



    public String b6q11() {
        String result1 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 11; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test6 WHERE id_test6 = ?";
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
    public String t6a11() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 11;
            String query = "SELECT correct FROM test6 WHERE id_test6 = ?";
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
    public String b6q12() {
        String result1 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 12; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test6 WHERE id_test6 = ?";
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
    public String t6a12() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 12;
            String query = "SELECT correct FROM test6 WHERE id_test6 = ?";
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
    public String b6q13() {
        String result1 = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 13; // Идентификатор строки, которую вы хотите выбрать
            String query = "SELECT quest, A, B, C, D FROM test6 WHERE id_test6 = ?";
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
    public String t6a13() {
        String answer = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://37.143.15.239:3306/test1", "root", "yiPDmV6d75");

            int id = 13;
            String query = "SELECT correct FROM test6 WHERE id_test6 = ?";
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
