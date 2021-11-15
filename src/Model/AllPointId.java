/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.List;

/**
 *
 * @author HO_THI_THOM
 */
public class AllPointId {
    String id;
    
    List<AllPoint> allPoint;

    public AllPointId(String id, List<AllPoint> allPoint) {
        this.id = id;
        this.allPoint = allPoint;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<AllPoint> getAllPoint() {
        return allPoint;
    }

    public void setAllPoint(List<AllPoint> allPoint) {
        this.allPoint = allPoint;
    }

    public AllPointId() {
    }
    
}
