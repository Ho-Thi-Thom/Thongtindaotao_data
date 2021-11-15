/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GetFileJson;

import Database.getAllPoint;
import Model.InforStudentData;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ngoct
 */
public class WriteJsonAllPoint {

    public static void tachMSSV_TUD() {
        //tách file json ra file ma số chỉ mã số sinh viên
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {

            File file = new File("new_db_json\\TOANUD\\infortoan_ung_dung.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\TOANUD\\toan_ung_dung_mssv.json");

            try {
                OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(f, true), StandardCharsets.UTF_8);
                Gson gson = new Gson();
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        InforStudentData stu = gson.fromJson(line, InforStudentData.class);
                        arrListIT.add(stu.getStudenID());

                    } catch (Exception ex) {
                        continue;
                    }
                }

                for (int j = 0; j < arrListIT.size(); j++) {
                    if (!arrTemp.contains(arrListIT.get(j))) {
                        arrTemp.add(arrListIT.get(j));
                    }
                }

                // push into json
                for (int j = 0; j < arrTemp.size(); j++) {
                    System.out.println("arrTemp id " + arrTemp.get(j));
                    writer.write(arrTemp.get(j));
                    writer.write("\n");
                    writer.flush();
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        }

    }

    public static void read_toan_ung_dung() {
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("new_db_json\\TOANUD\\toan_ung_dung_mssv.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            String line = "";
            String f = "new_db_json\\TOANUD\\allpoint_toan_ung_dung.json";
            try {
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        getAllPoint.getAllPointId(line, f);
                        System.out.println(i);
                    } catch (Exception ex) {
                        continue;
                    }
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        }
    }

    public static void tachMSSV_DTVT() {
        //tách file json ra file ma số chỉ mã số sinh viên
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {

            File file = new File("new_db_json\\DTVT\\inforDTVT.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\DTVT\\DTVTmssv.json");

            try {
                OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(f, true), StandardCharsets.UTF_8);
                Gson gson = new Gson();
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        InforStudentData stu = gson.fromJson(line, InforStudentData.class);
                        arrListIT.add(stu.getStudenID());

                    } catch (Exception ex) {
                        continue;
                    }
                }

                for (int j = 0; j < arrListIT.size(); j++) {
                    if (!arrTemp.contains(arrListIT.get(j))) {
                        arrTemp.add(arrListIT.get(j));
                    }
                }

                // push into json
                for (int j = 0; j < arrTemp.size(); j++) {
                    System.out.println("arrTemp id " + arrTemp.get(j));
                    writer.write(arrTemp.get(j));
                    writer.write("\n");
                    writer.flush();
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        }

    }

    public static void readDTVT() {
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("new_db_json\\DTVT\\DTVTmssv.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            String line = "";
            String f = "new_db_json\\DTVT\\allpoint_DTVT.json";
            try {
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        getAllPoint.getAllPointId(line, f);
                        System.out.println(i);
                    } catch (Exception ex) {
                        continue;
                    }
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        }
    }

    public static void tachMSSV_GDCT() {
        //tách file json ra file ma số chỉ mã số sinh viên
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {

            File file = new File("new_db_json\\GDCT\\inforgiao_duc_chinh_tri.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\GDCT\\inforgiao_duc_chinh_trimssv.json");

            try {
                OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(f, true), StandardCharsets.UTF_8);
                Gson gson = new Gson();
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        InforStudentData stu = gson.fromJson(line, InforStudentData.class);
                        arrListIT.add(stu.getStudenID());

                    } catch (Exception ex) {
                        continue;
                    }
                }

                for (int j = 0; j < arrListIT.size(); j++) {
                    if (!arrTemp.contains(arrListIT.get(j))) {
                        arrTemp.add(arrListIT.get(j));
                    }
                }

                // push into json
                for (int j = 0; j < arrTemp.size(); j++) {
                    System.out.println("arrTemp id " + arrTemp.get(j));
                    writer.write(arrTemp.get(j));
                    writer.write("\n");
                    writer.flush();
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        }

    }

    public static void readGDCT() {
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("new_db_json\\GDCT\\inforgiao_duc_chinh_trimssv.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            String line = "";
            String f = "new_db_json\\GDCT\\allpoint_inforgiao_duc_chinh_tri.json";
            try {
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        getAllPoint.getAllPointId(line, f);
                        System.out.println(i);
                    } catch (Exception ex) {
                        continue;
                    }
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        }
    }

    public static void tachMSSV_GDMN() {
        //tách file json ra file ma số chỉ mã số sinh viên
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {

            File file = new File("new_db_json\\GDMN\\inforgiao_duc_mam_non.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\GDMN\\inforgiao_duc_mam_nonmssv.json");

            try {
                OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(f, true), StandardCharsets.UTF_8);
                Gson gson = new Gson();
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        InforStudentData stu = gson.fromJson(line, InforStudentData.class);
                        arrListIT.add(stu.getStudenID());

                    } catch (Exception ex) {
                        continue;
                    }
                }

                for (int j = 0; j < arrListIT.size(); j++) {
                    if (!arrTemp.contains(arrListIT.get(j))) {
                        arrTemp.add(arrListIT.get(j));
                    }
                }

                // push into json
                for (int j = 0; j < arrTemp.size(); j++) {
                    System.out.println("arrTemp id " + arrTemp.get(j));
                    writer.write(arrTemp.get(j));
                    writer.write("\n");
                    writer.flush();
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        }

    }

    public static void readGDMN() {
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("new_db_json\\GDMN\\inforgiao_duc_mam_nonmssv.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            String line = "";
            String f = "new_db_json\\GDMN\\allpoint_inforgiao_duc_mam_non.json";
            try {
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        getAllPoint.getAllPointId(line, f);
                        System.out.println(i);
                    } catch (Exception ex) {
                        continue;
                    }
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        }
    }

    public static void tachMSSV_GDTH() {
        //tách file json ra file ma số chỉ mã số sinh viên
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {

            File file = new File("new_db_json\\GDTH\\inforgiao_duc_tieu_hoc.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\GDTH\\inforgiao_duc_tieu_hocmssv.json");

            try {
                OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(f, true), StandardCharsets.UTF_8);
                Gson gson = new Gson();
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        InforStudentData stu = gson.fromJson(line, InforStudentData.class);
                        arrListIT.add(stu.getStudenID());

                    } catch (Exception ex) {
                        continue;
                    }
                }

                for (int j = 0; j < arrListIT.size(); j++) {
                    if (!arrTemp.contains(arrListIT.get(j))) {
                        arrTemp.add(arrListIT.get(j));
                    }
                }

                // push into json
                for (int j = 0; j < arrTemp.size(); j++) {
                    System.out.println("arrTemp id " + arrTemp.get(j));
                    writer.write(arrTemp.get(j));
                    writer.write("\n");
                    writer.flush();
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        }

    }

    public static void readGDTH() {
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("new_db_json\\GDTH\\inforgiao_duc_tieu_hocmssv.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            String line = "";
            String f = "new_db_json\\GDTH\\allpoint_inforgiao_duc_tieu_hoc.json";
            try {
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        getAllPoint.getAllPointId(line, f);
                        System.out.println(i);
                    } catch (Exception ex) {
                        continue;
                    }
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        }
    }

    public static void tachMSSV_GD() {
        //tách file json ra file ma số chỉ mã số sinh viên
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {

            File file = new File("new_db_json\\GD\\inforgiao_duc.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\GD\\inforgiao_ducmssv.json");

            try {
                OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(f, true), StandardCharsets.UTF_8);
                Gson gson = new Gson();
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        InforStudentData stu = gson.fromJson(line, InforStudentData.class);
                        arrListIT.add(stu.getStudenID());

                    } catch (Exception ex) {
                        continue;
                    }
                }

                for (int j = 0; j < arrListIT.size(); j++) {
                    if (!arrTemp.contains(arrListIT.get(j))) {
                        arrTemp.add(arrListIT.get(j));
                    }
                }

                // push into json
                for (int j = 0; j < arrTemp.size(); j++) {
                    System.out.println("arrTemp id " + arrTemp.get(j));
                    writer.write(arrTemp.get(j));
                    writer.write("\n");
                    writer.flush();
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        }

    }

    public static void readGD() {
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("new_db_json\\GD\\inforgiao_ducmssv.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            String line = "";
            String f = "new_db_json\\GD\\allpoint_inforgiao_duc.json";
            try {
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        getAllPoint.getAllPointId(line, f);
                        System.out.println(i);
                    } catch (Exception ex) {
                        continue;
                    }
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        }
    }

    public static void tachMSSV_IT() {
        //tách file json ra file ma số chỉ mã số sinh viên
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {

            File file = new File("new_db_json\\IT\\inforIT.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\IT\\inforITmssv.json");

            try {
                OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(f, true), StandardCharsets.UTF_8);
                Gson gson = new Gson();
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        InforStudentData stu = gson.fromJson(line, InforStudentData.class);
                        arrListIT.add(stu.getStudenID());

                    } catch (Exception ex) {
                        continue;
                    }
                }

                for (int j = 0; j < arrListIT.size(); j++) {
                    if (!arrTemp.contains(arrListIT.get(j))) {
                        arrTemp.add(arrListIT.get(j));
                    }
                }

                // push into json
                for (int j = 0; j < arrTemp.size(); j++) {
                    System.out.println("arrTemp id " + arrTemp.get(j));
                    writer.write(arrTemp.get(j));
                    writer.write("\n");
                    writer.flush();
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        }

    }

    public static void readIT() {
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("new_db_json\\IT\\inforITmssv.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            String line = "";
            String f = "new_db_json\\IT\\allpoint_inforIT.json";
            try {
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        getAllPoint.getAllPointId(line, f);
                        System.out.println(i);
                    } catch (Exception ex) {
                        continue;
                    }
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        }
    }

    public static void tachMSSV_KHMT() {
        //tách file json ra file ma số chỉ mã số sinh viên
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {

            File file = new File("new_db_json\\KHMT\\inforkhoa_hoc_moi_truong.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\KHMT\\inforkhoa_hoc_moi_truongmssv.json");

            try {
                OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(f, true), StandardCharsets.UTF_8);
                Gson gson = new Gson();
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        InforStudentData stu = gson.fromJson(line, InforStudentData.class);
                        arrListIT.add(stu.getStudenID());

                    } catch (Exception ex) {
                        continue;
                    }
                }

                for (int j = 0; j < arrListIT.size(); j++) {
                    if (!arrTemp.contains(arrListIT.get(j))) {
                        arrTemp.add(arrListIT.get(j));
                    }
                }

                // push into json
                for (int j = 0; j < arrTemp.size(); j++) {
                    System.out.println("arrTemp id " + arrTemp.get(j));
                    writer.write(arrTemp.get(j));
                    writer.write("\n");
                    writer.flush();
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        }

    }

    public static void readKHMT() {
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("new_db_json\\KHMT\\inforkhoa_hoc_moi_truongmssv.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            String line = "";
            String f = "new_db_json\\KHMT\\allpoint_inforkhoa_hoc_moi_truong.json";
            try {
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        getAllPoint.getAllPointId(line, f);
                        System.out.println(i);
                    } catch (Exception ex) {
                        continue;
                    }
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        }
    }

    public static void tachMSSV_QuanHeQuocTe() {
        //tách file json ra file ma số chỉ mã số sinh viên
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {

            File file = new File("new_db_json\\QuanHeQuocTe\\inforquan_he_quoc_te.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\QuanHeQuocTe\\inforquan_he_quoc_temssv.json");

            try {
                OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(f, true), StandardCharsets.UTF_8);
                Gson gson = new Gson();
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        InforStudentData stu = gson.fromJson(line, InforStudentData.class);
                        arrListIT.add(stu.getStudenID());

                    } catch (Exception ex) {
                        continue;
                    }
                }

                for (int j = 0; j < arrListIT.size(); j++) {
                    if (!arrTemp.contains(arrListIT.get(j))) {
                        arrTemp.add(arrListIT.get(j));
                    }
                }

                // push into json
                for (int j = 0; j < arrTemp.size(); j++) {
                    System.out.println("arrTemp id " + arrTemp.get(j));
                    writer.write(arrTemp.get(j));
                    writer.write("\n");
                    writer.flush();
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        }

    }

    public static void readQuanHeQuocTe() {
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("new_db_json\\QuanHeQuocTe\\inforquan_he_quoc_temssv.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            String line = "";
            String f = "new_db_json\\QuanHeQuocTe\\allpoint_inforquan_he_quoc_te.json";
            try {
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        getAllPoint.getAllPointId(line, f);
                        System.out.println(i);
                    } catch (Exception ex) {
                        continue;
                    }
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        }
    }

    public static void tachMSSV_SP_KHTN() {
        //tách file json ra file ma số chỉ mã số sinh viên
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {

            File file = new File("new_db_json\\SP_KHTN\\inforSP_khoa_hoc_tu_nhien.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\SP_KHTN\\inforSP_khoa_hoc_tu_nhienmssv.json");

            try {
                OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(f, true), StandardCharsets.UTF_8);
                Gson gson = new Gson();
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        InforStudentData stu = gson.fromJson(line, InforStudentData.class);
                        arrListIT.add(stu.getStudenID());

                    } catch (Exception ex) {
                        continue;
                    }
                }

                for (int j = 0; j < arrListIT.size(); j++) {
                    if (!arrTemp.contains(arrListIT.get(j))) {
                        arrTemp.add(arrListIT.get(j));
                    }
                }

                // push into json
                for (int j = 0; j < arrTemp.size(); j++) {
                    System.out.println("arrTemp id " + arrTemp.get(j));
                    writer.write(arrTemp.get(j));
                    writer.write("\n");
                    writer.flush();
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        }

    }

    public static void readSP_KHTN() {
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("new_db_json\\SP_KHTN\\inforSP_khoa_hoc_tu_nhienmssv.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            String line = "";
            String f = "new_db_json\\SP_KHTN\\allpoint_inforSP_khoa_hoc_tu_nhien.json";
            try {
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        getAllPoint.getAllPointId(line, f);
                        System.out.println(i);
                    } catch (Exception ex) {
                        continue;
                    }
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        }
    }

    public static void tachMSSV_SP_KHXH() {
        //tách file json ra file ma số chỉ mã số sinh viên
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {

            File file = new File("new_db_json\\SP_KHXH\\inforSP_khoa_hoc_xa_hoi.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\SP_KHXH\\inforSP_khoa_hoc_xa_hoimssv.json");

            try {
                OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(f, true), StandardCharsets.UTF_8);
                Gson gson = new Gson();
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        InforStudentData stu = gson.fromJson(line, InforStudentData.class);
                        arrListIT.add(stu.getStudenID());

                    } catch (Exception ex) {
                        continue;
                    }
                }

                for (int j = 0; j < arrListIT.size(); j++) {
                    if (!arrTemp.contains(arrListIT.get(j))) {
                        arrTemp.add(arrListIT.get(j));
                    }
                }

                // push into json
                for (int j = 0; j < arrTemp.size(); j++) {
                    System.out.println("arrTemp id " + arrTemp.get(j));
                    writer.write(arrTemp.get(j));
                    writer.write("\n");
                    writer.flush();
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        }

    }

    public static void readSP_KHXH() {
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("new_db_json\\SP_KHXH\\inforSP_khoa_hoc_xa_hoimssv.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            String line = "";
            String f = "new_db_json\\SP_KHXH\\allpoint_inforSP_khoa_hoc_xa_hoi.json";
            try {
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        getAllPoint.getAllPointId(line, f);
                        System.out.println(i);
                    } catch (Exception ex) {
                        continue;
                    }
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        }
    }

    public static void tachMSSV_SPKT() {
        //tách file json ra file ma số chỉ mã số sinh viên
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {

            File file = new File("new_db_json\\SPKT\\inforSP_ky_thuat.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\SPKT\\inforSP_ky_thuatmssv.json");

            try {
                OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(f, true), StandardCharsets.UTF_8);
                Gson gson = new Gson();
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        InforStudentData stu = gson.fromJson(line, InforStudentData.class);
                        arrListIT.add(stu.getStudenID());

                    } catch (Exception ex) {
                        continue;
                    }
                }

                for (int j = 0; j < arrListIT.size(); j++) {
                    if (!arrTemp.contains(arrListIT.get(j))) {
                        arrTemp.add(arrListIT.get(j));
                    }
                }

                // push into json
                for (int j = 0; j < arrTemp.size(); j++) {
                    System.out.println("arrTemp id " + arrTemp.get(j));
                    writer.write(arrTemp.get(j));
                    writer.write("\n");
                    writer.flush();
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        }

    }

    public static void readSPKT() {
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("new_db_json\\SPKT\\inforSP_ky_thuatmssv.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            String line = "";
            String f = "new_db_json\\SPKT\\allpoint_inforSP_inforSP_ky_thuat.json";
            try {
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        getAllPoint.getAllPointId(line, f);
                        System.out.println(i);
                    } catch (Exception ex) {
                        continue;
                    }
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        }
    }

    public static void tachMSSV_LUAT() {
        //tách file json ra file ma số chỉ mã số sinh viên
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {

            File file = new File("new_db_json\\LUAT\\inforluat.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\LUAT\\inforluatmssv.json");

            try {
                OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(f, true), StandardCharsets.UTF_8);
                Gson gson = new Gson();
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        InforStudentData stu = gson.fromJson(line, InforStudentData.class);
                        arrListIT.add(stu.getStudenID());

                    } catch (Exception ex) {
                        continue;
                    }
                }

                for (int j = 0; j < arrListIT.size(); j++) {
                    if (!arrTemp.contains(arrListIT.get(j))) {
                        arrTemp.add(arrListIT.get(j));
                    }
                }

                // push into json
                for (int j = 0; j < arrTemp.size(); j++) {
                    System.out.println("arrTemp id " + arrTemp.get(j));
                    writer.write(arrTemp.get(j));
                    writer.write("\n");
                    writer.flush();
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        }

    }

    public static void readLUAT() {
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("new_db_json\\LUAT\\inforluatmssv.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            String line = "";
            String f = "new_db_json\\LUAT\\allpoint_inforluat.json";
            try {
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        getAllPoint.getAllPointId(line, f);
                        System.out.println(i);
                    } catch (Exception ex) {
                        continue;
                    }
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        }
    }

    public static void tachMSSV_NGHETHUAT() {
        //tách file json ra file ma số chỉ mã số sinh viên
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {

            File file = new File("new_db_json\\NGHETHUAT\\infornghe_thuat.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\NGHETHUAT\\infornghe_thuatmssv.json");

            try {
                OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(f, true), StandardCharsets.UTF_8);
                Gson gson = new Gson();
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        InforStudentData stu = gson.fromJson(line, InforStudentData.class);
                        arrListIT.add(stu.getStudenID());

                    } catch (Exception ex) {
                        continue;
                    }
                }

                for (int j = 0; j < arrListIT.size(); j++) {
                    if (!arrTemp.contains(arrListIT.get(j))) {
                        arrTemp.add(arrListIT.get(j));
                    }
                }

                // push into json
                for (int j = 0; j < arrTemp.size(); j++) {
                    System.out.println("arrTemp id " + arrTemp.get(j));
                    writer.write(arrTemp.get(j));
                    writer.write("\n");
                    writer.flush();
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        }

    }

    public static void readNGHETHUAT() {
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("new_db_json\\NGHETHUAT\\infornghe_thuatmssv.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            String line = "";
            String f = "new_db_json\\NGHETHUAT\\allpoint_infornghe_thuat.json";
            try {
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        getAllPoint.getAllPointId(line, f);
                        System.out.println(i);
                    } catch (Exception ex) {
                        continue;
                    }
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        }
    }

    public static void tachMSSV_NGOAINGU() {
        //tách file json ra file ma số chỉ mã số sinh viên
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {

            File file = new File("new_db_json\\NGOAINGU\\inforngoai_ngu.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\NGOAINGU\\inforngoai_ngumssv.json");

            try {
                OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(f, true), StandardCharsets.UTF_8);
                Gson gson = new Gson();
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        InforStudentData stu = gson.fromJson(line, InforStudentData.class);
                        arrListIT.add(stu.getStudenID());

                    } catch (Exception ex) {
                        continue;
                    }
                }

                for (int j = 0; j < arrListIT.size(); j++) {
                    if (!arrTemp.contains(arrListIT.get(j))) {
                        arrTemp.add(arrListIT.get(j));
                    }
                }

                // push into json
                for (int j = 0; j < arrTemp.size(); j++) {
                    System.out.println("arrTemp id " + arrTemp.get(j));
                    writer.write(arrTemp.get(j));
                    writer.write("\n");
                    writer.flush();
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        }

    }

    public static void readNGOAINGU() {
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("new_db_json\\NGOAINGU\\inforngoai_ngumssv.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            String line = "";
            String f = "new_db_json\\NGOAINGU\\allpoint_inforngoai_ngu.json";
            try {
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        getAllPoint.getAllPointId(line, f);
                        System.out.println(i);
                    } catch (Exception ex) {
                        continue;
                    }
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        }
    }

    public static void tachMSSV_QTKD() {
        //tách file json ra file ma số chỉ mã số sinh viên
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {

            File file = new File("new_db_json\\QTKD\\infor_quan_tri_kinh_doanh.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\QTKD\\infor_quan_tri_kinh_doanhmssv.json");

            try {
                OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(f, true), StandardCharsets.UTF_8);
                Gson gson = new Gson();
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        InforStudentData stu = gson.fromJson(line, InforStudentData.class);
                        arrListIT.add(stu.getStudenID());

                    } catch (Exception ex) {
                        continue;
                    }
                }

                for (int j = 0; j < arrListIT.size(); j++) {
                    if (!arrTemp.contains(arrListIT.get(j))) {
                        arrTemp.add(arrListIT.get(j));
                    }
                }

                // push into json
                for (int j = 0; j < arrTemp.size(); j++) {
                    System.out.println("arrTemp id " + arrTemp.get(j));
                    writer.write(arrTemp.get(j));
                    writer.write("\n");
                    writer.flush();
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        }

    }

    public static void readQTKD() {
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("new_db_json\\QTKD\\infor_quan_tri_kinh_doanhmssv.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            String line = "";
            String f = "new_db_json\\QTKD\\allpoint_infor_quan_tri_kinh_doanh.json";
            try {
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        getAllPoint.getAllPointId(line, f);
                        System.out.println(i);
                    } catch (Exception ex) {
                        continue;
                    }
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        }
    }

    public static void tachMSSV_TVVP() {
        //tách file json ra file ma số chỉ mã số sinh viên
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {

            File file = new File("new_db_json\\TVVP\\inforthu_vien_van_phong.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\TVVP\\inforthu_vien_van_phongmssv.json");

            try {
                OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(f, true), StandardCharsets.UTF_8);
                Gson gson = new Gson();
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        InforStudentData stu = gson.fromJson(line, InforStudentData.class);
                        arrListIT.add(stu.getStudenID());

                    } catch (Exception ex) {
                        continue;
                    }
                }

                for (int j = 0; j < arrListIT.size(); j++) {
                    if (!arrTemp.contains(arrListIT.get(j))) {
                        arrTemp.add(arrListIT.get(j));
                    }
                }

                // push into json
                for (int j = 0; j < arrTemp.size(); j++) {
                    System.out.println("arrTemp id " + arrTemp.get(j));
                    writer.write(arrTemp.get(j));
                    writer.write("\n");
                    writer.flush();
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        }

    }

    public static void readTVVP() {
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("new_db_json\\TVVP\\inforthu_vien_van_phongmssv.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            String line = "";
            String f = "new_db_json\\TVVP\\allpoint_inforthu_vien_van_phong.json";
            try {
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        getAllPoint.getAllPointId(line, f);
                        System.out.println(i);
                    } catch (Exception ex) {
                        continue;
                    }
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        }
    }

    public static void tachMSSV_TCKT() {
        //tách file json ra file ma số chỉ mã số sinh viên
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {

            File file = new File("new_db_json\\TCKT\\infortai_chinh_ke_toan.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\TCKT\\infortai_chinh_ke_toanmssv.json");

            try {
                OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(f, true), StandardCharsets.UTF_8);
                Gson gson = new Gson();
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        InforStudentData stu = gson.fromJson(line, InforStudentData.class);
                        arrListIT.add(stu.getStudenID());

                    } catch (Exception ex) {
                        continue;
                    }
                }

                for (int j = 0; j < arrListIT.size(); j++) {
                    if (!arrTemp.contains(arrListIT.get(j))) {
                        arrTemp.add(arrListIT.get(j));
                    }
                }

                // push into json
                for (int j = 0; j < arrTemp.size(); j++) {
                    System.out.println("arrTemp id " + arrTemp.get(j));
                    writer.write(arrTemp.get(j));
                    writer.write("\n");
                    writer.flush();
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        }

    }

    public static void readTCKT() {
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("new_db_json\\TCKT\\infortai_chinh_ke_toanmssv.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            String line = "";
            String f = "new_db_json\\TCKT\\allpoint_infortai_chinh_ke_toan.json";
            try {
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        getAllPoint.getAllPointId(line, f);
                        System.out.println(i);
                    } catch (Exception ex) {
                        continue;
                    }
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        }
    }

    public static void main(String[] args) {
//        tachMSSV_TUD();
//        read_toan_ung_dung();
//        tachMSSV_DTVT();
//        readDTVT();
//        tachMSSV_GD();
//        readGD();
//        tachMSSV_GDMN();
//        readGDMN();
//        tachMSSV_GDCT();
//        readGDCT();
//        tachMSSV_GDTH();
//        readGDTH();
//        tachMSSV_IT();
//        readIT();
//        tachMSSV_KHMT();
//        readKHMT();
//        tachMSSV_QuanHeQuocTe();
//        readQuanHeQuocTe();
//        tachMSSV_SPKT();
//        readSPKT();
//        tachMSSV_SP_KHTN();
//        readSP_KHTN();
//        tachMSSV_SP_KHXH();
//        readSP_KHXH();
tachMSSV_LUAT();
readLUAT();
tachMSSV_NGHETHUAT();
readNGHETHUAT();
tachMSSV_NGOAINGU();
readNGOAINGU();
tachMSSV_TCKT();
readTCKT();
tachMSSV_TVVP();
readTVVP();
tachMSSV_QTKD();
readQTKD();

    }
}
