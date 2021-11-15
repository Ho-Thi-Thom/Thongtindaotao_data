/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GetFileJson;

import Database.GetInforStudent;
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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ngoct
 */
public class WriteJsonStudents {

    public static void tachMSSV() {
        //tách file json ra file ma số chỉ mã số sinh viên
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("data_json\\dien_tu_vien_thong.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\mssvDTVT.json");

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
        } finally {
            try {
                inputStream.close();
                inputStreamReader.close();
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

    public static void tachMSSV_TUD() {
        //tách file json ra file ma số chỉ mã số sinh viên
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("data_json\\toan_ung_dung.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\mssvtoan_ung_dung.json");

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
        } finally {
            try {
                inputStream.close();
                inputStreamReader.close();
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

    public static void tachMSSV_thu_vien_van_phong() {
        //tách file json ra file ma số chỉ mã số sinh viên
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("data_json\\thu_vien_van_phong.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\mssvthu_vien_van_phong.json");

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
        } finally {
            try {
                inputStream.close();
                inputStreamReader.close();
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

    public static void tachMSSV_tai_chinh_ke_toan() {
        //tách file json ra file ma số chỉ mã số sinh viên
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("data_json\\tai_chinh_ke_toan.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\mssvtai_chinh_ke_toan.json");

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
        } finally {
            try {
                inputStream.close();
                inputStreamReader.close();
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

    public static void tachMSSV_SP_ky_thuat() {
        //tách file json ra file ma số chỉ mã số sinh viên
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("data_json\\SP_ky_thuat.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\mssvSP_ky_thuat.json");

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
        } finally {
            try {
                inputStream.close();
                inputStreamReader.close();
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

    public static void tachMSSV_SP_khoa_hoc_xa_hoi() {
        //tách file json ra file ma số chỉ mã số sinh viên
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("data_json\\SP_khoa_hoc_xa_hoi.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\mssvSP_khoa_hoc_xa_hoi.json");

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
        } finally {
            try {
                inputStream.close();
                inputStreamReader.close();
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

    public static void tachMSSV_SP_khoa_hoc_tu_nhien() {
        //tách file json ra file ma số chỉ mã số sinh viên
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("data_json\\SP_khoa_hoc_tu_nhien.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\mssvSP_khoa_hoc_tu_nhien.json");

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
        } finally {
            try {
                inputStream.close();
                inputStreamReader.close();
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

    public static void tachMSSV_quan_tri_kinh_doanh() {
        //tách file json ra file ma số chỉ mã số sinh viên
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("data_json\\quan_tri_kinh_doanh.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\mssvquan_tri_kinh_doanh.json");

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
        } finally {
            try {
                inputStream.close();
                inputStreamReader.close();
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

    public static void tachMSSV_quan_he_quoc_te() {
        //tách file json ra file ma số chỉ mã số sinh viên
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("data_json\\quan_he_quoc_te.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\mssvquan_he_quoc_te.json");
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
        } finally {
            try {
                inputStream.close();
                inputStreamReader.close();
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

    public static void tachMSSVgiao_duc() {
        //tách file json ra file ma số chỉ mã số sinh viên
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("data_json\\giao_duc.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\mssvgiao_duc.json");

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
        } finally {
            try {
                inputStream.close();
                inputStreamReader.close();
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

    public static void tachMSSVgiao_duc_chinh_tri() {
        //tách file json ra file ma số chỉ mã số sinh viên
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("data_json\\giao_duc_chinh_tri.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\mssvgiao_duc_chinh_tri.json");

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
        } finally {
            try {
                inputStream.close();
                inputStreamReader.close();
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

    public static void tachMSSVgiao_duc_mam_non() {
        //tách file json ra file ma số chỉ mã số sinh viên
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("data_json\\giao_duc_mam_non.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\mssvgiao_duc_mam_non.json");

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
        } finally {
            try {
                inputStream.close();
                inputStreamReader.close();
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

    public static void tachMSSVgiao_duc_tieu_hoc() {
        //tách file json ra file ma số chỉ mã số sinh viên
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("data_json\\giao_duc_tieu_hoc.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\mssvgiao_duc_tieu_hoc.json");

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
        } finally {
            try {
                inputStream.close();
                inputStreamReader.close();
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

    public static void tachMSSVkhoa_hoc_moi_truong() {
        //tách file json ra file ma số chỉ mã số sinh viên
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("data_json\\khoa_hoc_moi_truong.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\mssvkhoa_hoc_moi_truong.json");

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
        } finally {
            try {
                inputStream.close();
                inputStreamReader.close();
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

    public static void tachMSSVluat() {
        //tách file json ra file ma số chỉ mã số sinh viên
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("data_json\\luat.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\luat.json");

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
        } finally {
            try {
                inputStream.close();
                inputStreamReader.close();
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

    public static void tachMSSVnghe_thuat() {
        //tách file json ra file ma số chỉ mã số sinh viên
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("data_json\\nghe_thuat.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\mssvnghe_thuat.json");

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
        } finally {
            try {
                inputStream.close();
                inputStreamReader.close();
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

    public static void tachMSSVngoai_ngu() {
        //tách file json ra file ma số chỉ mã số sinh viên
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("data_json\\ngoai_ngu.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\mssvngoai_ngu.json");

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
        } finally {
            try {
                inputStream.close();
                inputStreamReader.close();
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }

    public static void read() {
//        đọc file chỉ mã số sinh viên
//          lấy thông tin sinh viên về add vào file json
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("new_db_json\\mssvDTVT.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\inforDTVT.json");

            try {
                OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(f, true), StandardCharsets.UTF_8);
                Gson gson = new Gson();
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        InforStudentData stu = GetInforStudent.getInforStudent(line);
                        String json = mapper.writeValueAsString(stu);
                        System.out.println("test " + json);
                        writer.write(json);
                        writer.write("\n");
                        writer.flush();

                    } catch (Exception ex) {
                        continue;
                    }
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        } finally {
            try {
                inputStream.close();
                inputStreamReader.close();
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void readtoan_ung_dung() {
//        đọc file chỉ mã số sinh viên
//          lấy thông tin sinh viên về add vào file json
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("new_db_json\\mssvtoan_ung_dung.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\infortoan_ung_dung.json");

            try {
                OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(f, true), StandardCharsets.UTF_8);
                Gson gson = new Gson();
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        InforStudentData stu = GetInforStudent.getInforStudent(line);
                        String json = mapper.writeValueAsString(stu);
                        System.out.println("test " + json);
                        writer.write(json);
                        writer.write("\n");
                        writer.flush();

                    } catch (Exception ex) {
                        continue;
                    }
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        } finally {
            try {
                inputStream.close();
                inputStreamReader.close();
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void readthu_vien_van_phong() {
//        đọc file chỉ mã số sinh viên
//          lấy thông tin sinh viên về add vào file json
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("new_db_json\\mssvthu_vien_van_phong.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\inforthu_vien_van_phong.json");

            try {
                OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(f, true), StandardCharsets.UTF_8);
                Gson gson = new Gson();
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        InforStudentData stu = GetInforStudent.getInforStudent(line);
                        String json = mapper.writeValueAsString(stu);
                        System.out.println("test " + json);
                        writer.write(json);
                        writer.write("\n");
                        writer.flush();

                    } catch (Exception ex) {
                        continue;
                    }
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        } finally {
            try {
                inputStream.close();
                inputStreamReader.close();
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void readtai_chinh_ke_toan() {
//        đọc file chỉ mã số sinh viên
//          lấy thông tin sinh viên về add vào file json
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("new_db_json\\mssvtai_chinh_ke_toan.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\infortai_chinh_ke_toan.json");

            try {
                OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(f, true), StandardCharsets.UTF_8);
                Gson gson = new Gson();
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        InforStudentData stu = GetInforStudent.getInforStudent(line);
                        String json = mapper.writeValueAsString(stu);
                        System.out.println("test " + json);
                        writer.write(json);
                        writer.write("\n");
                        writer.flush();

                    } catch (Exception ex) {
                        continue;
                    }
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        } finally {
            try {
                inputStream.close();
                inputStreamReader.close();
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void readSP_ky_thuat() {
//        đọc file chỉ mã số sinh viên
//          lấy thông tin sinh viên về add vào file json
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("new_db_json\\mssvSP_ky_thuat.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\inforSP_ky_thuat.json");

            try {
                OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(f, true), StandardCharsets.UTF_8);
                Gson gson = new Gson();
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        InforStudentData stu = GetInforStudent.getInforStudent(line);
                        String json = mapper.writeValueAsString(stu);
                        System.out.println("test " + json);
                        writer.write(json);
                        writer.write("\n");
                        writer.flush();

                    } catch (Exception ex) {
                        continue;
                    }
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        } finally {
            try {
                inputStream.close();
                inputStreamReader.close();
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void readSP_khoa_hoc_xa_hoi() {
//        đọc file chỉ mã số sinh viên
//          lấy thông tin sinh viên về add vào file json
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("new_db_json\\mssvSP_khoa_hoc_xa_hoi.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\inforSP_khoa_hoc_xa_hoi.json");

            try {
                OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(f, true), StandardCharsets.UTF_8);
                Gson gson = new Gson();
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        InforStudentData stu = GetInforStudent.getInforStudent(line);
                        String json = mapper.writeValueAsString(stu);
                        System.out.println("test " + json);
                        writer.write(json);
                        writer.write("\n");
                        writer.flush();

                    } catch (Exception ex) {
                        continue;
                    }
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        } finally {
            try {
                inputStream.close();
                inputStreamReader.close();
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void readSP_khoa_hoc_tu_nhien() {
//        đọc file chỉ mã số sinh viên
//          lấy thông tin sinh viên về add vào file json
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("new_db_json\\mssvSP_khoa_hoc_tu_nhien.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\inforSP_khoa_hoc_tu_nhien.json");

            try {
                OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(f, true), StandardCharsets.UTF_8);
                Gson gson = new Gson();
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        InforStudentData stu = GetInforStudent.getInforStudent(line);
                        String json = mapper.writeValueAsString(stu);
                        System.out.println("test " + json);
                        writer.write(json);
                        writer.write("\n");
                        writer.flush();

                    } catch (Exception ex) {
                        continue;
                    }
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        } finally {
            try {
                inputStream.close();
                inputStreamReader.close();
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void readquan_tri_kinh_doanh() {
//        đọc file chỉ mã số sinh viên
//          lấy thông tin sinh viên về add vào file json
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("new_db_json\\mssvquan_tri_kinh_doanh.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\inforDTVT.json");

            try {
                OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(f, true), StandardCharsets.UTF_8);
                Gson gson = new Gson();
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        InforStudentData stu = GetInforStudent.getInforStudent(line);
                        String json = mapper.writeValueAsString(stu);
                        System.out.println("test " + json);
                        writer.write(json);
                        writer.write("\n");
                        writer.flush();

                    } catch (Exception ex) {
                        continue;
                    }
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        } finally {
            try {
                inputStream.close();
                inputStreamReader.close();
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void readquan_he_quoc_te() {
//        đọc file chỉ mã số sinh viên
//          lấy thông tin sinh viên về add vào file json
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("new_db_json\\mssvquan_he_quoc_te.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\inforquan_he_quoc_te.json");

            try {
                OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(f, true), StandardCharsets.UTF_8);
                Gson gson = new Gson();
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        InforStudentData stu = GetInforStudent.getInforStudent(line);
                        String json = mapper.writeValueAsString(stu);
                        System.out.println("test " + json);
                        writer.write(json);
                        writer.write("\n");
                        writer.flush();

                    } catch (Exception ex) {
                        continue;
                    }
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        } finally {
            try {
                inputStream.close();
                inputStreamReader.close();
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void readgiao_duc() {
//        đọc file chỉ mã số sinh viên
//          lấy thông tin sinh viên về add vào file json
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("new_db_json\\mssvgiao_duc.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\inforgiao_duc.json");

            try {
                OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(f, true), StandardCharsets.UTF_8);
                Gson gson = new Gson();
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        InforStudentData stu = GetInforStudent.getInforStudent(line);
                        String json = mapper.writeValueAsString(stu);
                        System.out.println("test " + json);
                        writer.write(json);
                        writer.write("\n");
                        writer.flush();

                    } catch (Exception ex) {
                        continue;
                    }
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        } finally {
            try {
                inputStream.close();
                inputStreamReader.close();
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void readgiao_duc_chinh_tri() {
//        đọc file chỉ mã số sinh viên
//          lấy thông tin sinh viên về add vào file json
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("new_db_json\\mssvgiao_duc_chinh_tri.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\inforgiao_duc_chinh_tri.json");

            try {
                OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(f, true), StandardCharsets.UTF_8);
                Gson gson = new Gson();
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        InforStudentData stu = GetInforStudent.getInforStudent(line);
                        String json = mapper.writeValueAsString(stu);
                        System.out.println("test " + json);
                        writer.write(json);
                        writer.write("\n");
                        writer.flush();

                    } catch (Exception ex) {
                        continue;
                    }
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        } finally {
            try {
                inputStream.close();
                inputStreamReader.close();
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void readgiao_duc_mam_non() {
//        đọc file chỉ mã số sinh viên
//          lấy thông tin sinh viên về add vào file json
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("new_db_json\\mssvgiao_duc_mam_non.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\inforquan_he_quoc_tegiao_duc_mam_non.json");

            try {
                OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(f, true), StandardCharsets.UTF_8);
                Gson gson = new Gson();
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        InforStudentData stu = GetInforStudent.getInforStudent(line);
                        String json = mapper.writeValueAsString(stu);
                        System.out.println("test " + json);
                        writer.write(json);
                        writer.write("\n");
                        writer.flush();

                    } catch (Exception ex) {
                        continue;
                    }
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        } finally {
            try {
                inputStream.close();
                inputStreamReader.close();
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void readgiao_duc_tieu_hoc() {
//        đọc file chỉ mã số sinh viên
//          lấy thông tin sinh viên về add vào file json
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("new_db_json\\mssvgiao_duc_tieu_hoc.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\inforgiao_duc_tieu_hoc.json");

            try {
                OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(f, true), StandardCharsets.UTF_8);
                Gson gson = new Gson();
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        InforStudentData stu = GetInforStudent.getInforStudent(line);
                        String json = mapper.writeValueAsString(stu);
                        System.out.println("test " + json);
                        writer.write(json);
                        writer.write("\n");
                        writer.flush();

                    } catch (Exception ex) {
                        continue;
                    }
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        } finally {
            try {
                inputStream.close();
                inputStreamReader.close();
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void readkhoa_hoc_moi_truong() {
//        đọc file chỉ mã số sinh viên
//          lấy thông tin sinh viên về add vào file json
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("new_db_json\\mssvkhoa_hoc_moi_truong.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\inforkhoa_hoc_moi_truong.json");

            try {
                OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(f, true), StandardCharsets.UTF_8);
                Gson gson = new Gson();
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        InforStudentData stu = GetInforStudent.getInforStudent(line);
                        String json = mapper.writeValueAsString(stu);
                        System.out.println("test " + json);
                        writer.write(json);
                        writer.write("\n");
                        writer.flush();

                    } catch (Exception ex) {
                        continue;
                    }
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        } finally {
            try {
                inputStream.close();
                inputStreamReader.close();
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void readluat() {
//        đọc file chỉ mã số sinh viên
//          lấy thông tin sinh viên về add vào file json
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("new_db_json\\mssvluat.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\inforluat.json");

            try {
                OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(f, true), StandardCharsets.UTF_8);
                Gson gson = new Gson();
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        InforStudentData stu = GetInforStudent.getInforStudent(line);
                        String json = mapper.writeValueAsString(stu);
                        System.out.println("test " + json);
                        writer.write(json);
                        writer.write("\n");
                        writer.flush();

                    } catch (Exception ex) {
                        continue;
                    }
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        } finally {
            try {
                inputStream.close();
                inputStreamReader.close();
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void readnghe_thuat() {
//        đọc file chỉ mã số sinh viên
//          lấy thông tin sinh viên về add vào file json
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("new_db_json\\mssvnghe_thuat.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\infornghe_thuat.json");

            try {
                OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(f, true), StandardCharsets.UTF_8);
                Gson gson = new Gson();
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        InforStudentData stu = GetInforStudent.getInforStudent(line);
                        String json = mapper.writeValueAsString(stu);
                        System.out.println("test " + json);
                        writer.write(json);
                        writer.write("\n");
                        writer.flush();

                    } catch (Exception ex) {
                        continue;
                    }
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        } finally {
            try {
                inputStream.close();
                inputStreamReader.close();
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void readngoai_ngu() {
//        đọc file chỉ mã số sinh viên
//          lấy thông tin sinh viên về add vào file json
        List<String> arrListIT = new ArrayList<String>();
        List<String> arrTemp = new ArrayList<String>();
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        try {
            File file = new File("new_db_json\\mssvngoai_ngu.json");
            inputStream = new FileInputStream(file);
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            ObjectMapper mapper = new ObjectMapper();
            String line = "";
            File f = new File("new_db_json\\inforngoai_ngu.json");

            try {
                OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(f, true), StandardCharsets.UTF_8);
                Gson gson = new Gson();
                int i = 0;
                while ((line = reader.readLine()) != null) {
                    try {
                        InforStudentData stu = GetInforStudent.getInforStudent(line);
                        String json = mapper.writeValueAsString(stu);
                        System.out.println("test " + json);
                        writer.write(json);
                        writer.write("\n");
                        writer.flush();

                    } catch (Exception ex) {
                        continue;
                    }
                }

            } catch (IOException ex) {
                System.out.println("errorr");
            }

        } catch (FileNotFoundException ex) {
        } finally {
            try {
                inputStream.close();
                inputStreamReader.close();
                reader.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
//        tachMSSV_TUD();
//        readtoan_ung_dung();
//tachMSSV_SP_khoa_hoc_tu_nhien();
//readSP_khoa_hoc_tu_nhien();
//tachMSSV_SP_khoa_hoc_xa_hoi();
//readSP_khoa_hoc_xa_hoi();
//tachMSSV_SP_ky_thuat();
//readSP_ky_thuat();
//tachMSSV_quan_he_quoc_te();
//readquan_he_quoc_te();
//tachMSSV_quan_tri_kinh_doanh();
//readquan_tri_kinh_doanh();
//it
//dtvt
//        tachMSSVgiao_duc();
//        readgiao_duc();
//        tachMSSVgiao_duc_chinh_tri();
//        readgiao_duc_chinh_tri();
//        tachMSSVgiao_duc_mam_non();
//        readgiao_duc_mam_non();
//        tachMSSVgiao_duc_tieu_hoc();
//        readgiao_duc_tieu_hoc();
//        tachMSSVkhoa_hoc_moi_truong();
//        readkhoa_hoc_moi_truong();
//        tachMSSVluat();
//        readluat();
//        tachMSSVnghe_thuat();
//        readnghe_thuat();
//        tachMSSVngoai_ngu();
//        readngoai_ngu();
//        tachMSSV_tai_chinh_ke_toan();
//        readtai_chinh_ke_toan();
//        tachMSSV_thu_vien_van_phong();
//        readthu_vien_van_phong();
    }
}
