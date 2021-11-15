package WriteDatabase;

import Model.AllPoint;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author HO_THI_THOM
 */
public class insertAllPointStudentSGU {

    Connection conn = null;
    sqlConnection connect = new sqlConnection();
    ArrayList<String> listMSSV = new ArrayList<>();

    public void ConnectDB() {
        if (conn == null) {
            conn = connect.getConnect();

        }
    }

    public void InsertAllPointStudent() {
        ConnectDB();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File f = new File("new_db_json\\TOANUD\\allpoint_toan_ung_dung.json");
            inputStream = new FileInputStream(f);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line="";
            while ((line = reader.readLine()) != null) {
                AllPoint stu = mapper.readValue(line, AllPoint.class);
                System.out.println(line);
//                listMSSV.add(stu.getStudenID());
                String sql = "INSERT INTO allpoint_toan_ung_dung VALUES(?,?,?,?,?,?)";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, stu.getId().trim());
                ps.setString(2, stu.getMamon().trim());
                ps.setString(3, stu.getTenmon().trim());
                ps.setString(4, stu.getDiem4().trim());
                ps.setString(5, stu.getDiem10().trim());
                ps.setString(6, stu.getXeploai().trim());
                ps.executeUpdate();
            }
        } catch (Exception ex) {
            System.out.print("error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        insertAllPointStudentSGU ins = new insertAllPointStudentSGU();
        ins.InsertAllPointStudent();
    }
}
