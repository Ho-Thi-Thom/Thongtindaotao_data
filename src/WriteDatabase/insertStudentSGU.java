package WriteDatabase;

import Model.InforStudentData;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author HO_THI_THOM
 */
public class insertStudentSGU {

    Connection conn = null;
    sqlConnection connect = new sqlConnection();
    ArrayList<String> listMSSV = new ArrayList<>();

    public void ConnectDB() {
        if (conn == null) {
            conn = connect.getConnect();

        }
    }

    public void InsertStudent() {
        ConnectDB();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File f = new File("new_db_json\\TVVP\\inforthu_vien_van_phong.json");
            inputStream = new FileInputStream(f);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();

            String line="";
            while ((line = reader.readLine()) != null) {
                InforStudentData stu = mapper.readValue(line, InforStudentData.class);
                System.out.println(" "+stu.getStudenID());
//                listMSSV.add(stu.getStudenID());
                String sql = "INSERT INTO inforthu_vien_van_phong VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1, stu.getStudenID().trim());
                ps.setString(2, stu.getNameStudent().trim());
                ps.setString(3, stu.getKey().trim());
                ps.setString(4, stu.getSex().trim());
                ps.setString(5, stu.getBirthplace());
                ps.setString(6, stu.getClasss().trim());
                ps.setString(7, stu.getBranch().trim());
                ps.setString(8, stu.getSpecialized().trim());
                ps.setString(9, stu.getFaculty().trim());
                ps.setString(10, stu.getEducate().trim());
                ps.setString(11, stu.getCourse().trim());
                ps.setString(12, stu.getConsultant().trim());
                ps.setString(13, stu.getBirthday().trim());
                ps.setString(14, stu.getCredit().trim());
                ps.setString(15, stu.getMark10().trim());
                ps.setString(16, stu.getMark4().trim());
                ps.executeUpdate();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        insertStudentSGU ins = new insertStudentSGU();
        ins.InsertStudent();
    }
}
