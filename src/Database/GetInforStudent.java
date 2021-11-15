 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Model.AllPoint;
import Model.InforStudentData;
import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.gargoylesoftware.htmlunit.SilentCssErrorHandler;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomNode;
import com.gargoylesoftware.htmlunit.html.DomNodeList;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlSpan;
import com.gargoylesoftware.htmlunit.html.HtmlSubmitInput;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;

import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;

/**
 *
 * @author ngoct
 */
public class GetInforStudent {
    
   
    
    public static InforStudentData getInforStudent (String mssv){
       InforStudentData st = new InforStudentData();
       try {
            final WebClient webClient = new WebClient();
            final URL url = new URL("http://thongtindaotao.sgu.edu.vn/default.aspx?page=nhapmasv&flag=XemDiemThi");
            // turn off warning html unit
            java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(Level.OFF);
            webClient.getOptions().setThrowExceptionOnScriptError(false);
            webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
            webClient.setCssErrorHandler(new SilentCssErrorHandler());
            
            final HtmlPage page = webClient.getPage(url);
            //click ô input de nhap mssv
            HtmlTextInput inputMSSV = page.getHtmlElementById("ctl00_ContentPlaceHolder1_ctl00_txtMaSV");
            inputMSSV.type(mssv);
            //click button OK
            HtmlSubmitInput submitButtonSearch = page.getHtmlElementById("ctl00_ContentPlaceHolder1_ctl00_btnOK");
            HtmlPage ttSinhVien;
            try{
                 ttSinhVien = submitButtonSearch.click();
                 //    private String studenID;
            st.setStudenID(mssv);
//    private String nameStudent;
            try {
                HtmlSpan nameStudent = ttSinhVien.getHtmlElementById("ctl00_ContentPlaceHolder1_ctl00_ucThongTinSV_lblTenSinhVien");
                st.setNameStudent(nameStudent.asText());
            } catch (ElementNotFoundException e) {
                e.printStackTrace();
            }
//    private String key;
            String key = mssv.substring(2, 4);
            st.setKey(key);
//    private String sex;
            try {
                HtmlSpan phai = ttSinhVien.getHtmlElementById("ctl00_ContentPlaceHolder1_ctl00_ucThongTinSV_lblPhai");
                st.setSex(phai.asText());
            } catch (ElementNotFoundException e) {
                e.printStackTrace();
            }
//    private String birthplace;
            try {
                HtmlSpan birthplace = ttSinhVien.getHtmlElementById("ctl00_ContentPlaceHolder1_ctl00_ucThongTinSV_lblNoiSinh");
                st.setBirthplace(birthplace.asText());
            } catch (ElementNotFoundException e) {
                e.printStackTrace();
            }
//    private String classs;
            try {
                HtmlSpan classs = ttSinhVien.getHtmlElementById("ctl00_ContentPlaceHolder1_ctl00_ucThongTinSV_lblLop");
                st.setClasss(classs.asText());
            } catch (ElementNotFoundException e) {
                e.printStackTrace();
            }
//    private String branch;
            try {
                HtmlSpan branch = ttSinhVien.getHtmlElementById("ctl00_ContentPlaceHolder1_ctl00_ucThongTinSV_lbNganh");
                st.setBranch(branch.asText());
            } catch (ElementNotFoundException e) {
                e.printStackTrace();
            }
//    private String specialized;
            try {
                HtmlSpan specialized = ttSinhVien.getHtmlElementById("ctl00_ContentPlaceHolder1_ctl00_ucThongTinSV_lblChNg");
                st.setSpecialized(specialized.asText());
            } catch (ElementNotFoundException e) {
                e.printStackTrace();
            }
//    private String faculty;
            try {
                HtmlSpan faculty = ttSinhVien.getHtmlElementById("ctl00_ContentPlaceHolder1_ctl00_ucThongTinSV_lblKhoa");
                st.setFaculty(faculty.asText());
            } catch (ElementNotFoundException e) {
                e.printStackTrace();
            }
//    private String educate;
            try {
                HtmlSpan educate = ttSinhVien.getHtmlElementById("ctl00_ContentPlaceHolder1_ctl00_ucThongTinSV_lblHeDaoTao");
                st.setEducate(educate.asText());
            } catch (ElementNotFoundException e) {
                e.printStackTrace();
            }
//    private String course;
            try {
                HtmlSpan course = ttSinhVien.getHtmlElementById("ctl00_ContentPlaceHolder1_ctl00_ucThongTinSV_lblKhoaHoc");
                st.setCourse(course.asText());
            } catch (ElementNotFoundException e) {
                e.printStackTrace();
            }
//    private String consultant;
            try {
                HtmlSpan consultant = ttSinhVien.getHtmlElementById("ctl00_ContentPlaceHolder1_ctl00_ucThongTinSV_lblCVHT");
                st.setConsultant(consultant.asText());
            } catch (ElementNotFoundException e) {
                e.printStackTrace();
            }
            
            
            try {
                DomNodeList<DomNode> listNameSubjectAndPoint = ttSinhVien.querySelectorAll(".row-diemTK .Label");
//                for (int i = 0; i < listNameSubjectAndPoint.getLength(); i++) {
//                    System.out.println("diem "+ listNameSubjectAndPoint.get(i).asText());                    
//                    System.out.println("index "+ i);
//                }
                int sizeList = listNameSubjectAndPoint.size();           
                String credit = listNameSubjectAndPoint.get(sizeList-1).asText();
                String mark10 = listNameSubjectAndPoint.get(sizeList-7).asText();
                String mark4 = listNameSubjectAndPoint.get(sizeList-5).asText();
                
//                System.out.println("credit "+ credit);
//                System.out.println("credit "+ mark10);
//                System.out.println("credit " + mark4);
                
                st.setMark10(mark10);
                st.setMark4(mark4);
                st.setCredit(credit);
                
            } catch (ElementNotFoundException e) {
                e.printStackTrace();
            }
                 
            }
            catch (ElementNotFoundException e){
                System.out.println("not found");
            }
            //Lay thong tin ca nhan
            


//    private String birthday;
            st.setBirthday(getbirthday(mssv));
        } catch (IOException ex) {
            System.out.println("Not Found");
        }
       
       return st;
    }
    
    public static String getbirthday(String mssv) {
        String reString = "";
        try {
            
            final WebClient webClient = new WebClient();
            final URL url = new URL("http://thongtindaotao.sgu.edu.vn/Default.aspx?page=thoikhoabieu&sta=1&id=" + mssv);
            // turn off warning html unit
            java.util.logging.Logger.getLogger("com.gargoylesoftware.htmlunit").setLevel(Level.OFF);
            webClient.getOptions().setThrowExceptionOnScriptError(false);
            webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
            webClient.setCssErrorHandler(new SilentCssErrorHandler());
           
            final HtmlPage page = webClient.getPage(url);
            //Get birthday
            try {
                HtmlSpan birthday = page.getHtmlElementById("ctl00_ContentPlaceHolder1_ctl00_lblContentTenSV");
                reString = birthday.asText().substring(birthday.asText().length() - 10, birthday.asText().length()).trim();
            } catch (Exception e) {
            }
        } catch (Exception e) {
        }
        return reString;
    }
    
    public static void main(String[] args) {

    }
}
