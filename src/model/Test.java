package model;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        Node hotelMG = new Node();
        hotelMG.key = "Hotel";
        hotelMG.value = "Hotal Data";
        List<Node> childOfHotelMG = new ArrayList<>();

        Node division = new Node();
        Node department = new Node();
        Node designation = new Node();

        childOfHotelMG.add(division);
        childOfHotelMG.add(department);
        childOfHotelMG.add(designation);

        hotelMG.nodeList = childOfHotelMG;


        division.key = "Division";
        division.value = "Executive Management";
        List<Node> childOfDivision = new ArrayList<>();
        Node executiveManagement = new Node();
        executiveManagement.key = "Division";
        executiveManagement.value = "Executive Management";
        childOfDivision.add(executiveManagement);

        department.key = "Department";
        department.value = "Management Office";
        List<Node> departmentListChild = new ArrayList<>();
        Node managementOffice = new Node();
        managementOffice.key = "Department";
        managementOffice.value = "Management office";
        departmentListChild.add(managementOffice);


        designation.key = "Designation";
        designation.value = "GM/HM/PA2GM/H&SM";
        List<Node> designationChildList = new ArrayList<>();

        Node generalManager = new Node();
        generalManager.key = "Designation";
        generalManager.value = "GeneralManager";

        Node hotelManager = new Node();
        hotelManager.key = "Designation";
        hotelManager.value = "Hotel Manager";

        Node pa2GeneralManager = new Node();
        pa2GeneralManager.key = "Designation";
        pa2GeneralManager.value = "PA to General manager";

        Node healthAndSafetyManager = new Node();
        healthAndSafetyManager.key = "Designation";
        healthAndSafetyManager.value = "Health and Safety Manager";

        designationChildList.add(generalManager);
        designationChildList.add(hotelManager);
        designationChildList.add(pa2GeneralManager);
        designationChildList.add(healthAndSafetyManager);

        designation.nodeList = designationChildList;

        List<Node> executiveManagerChildList = new ArrayList<>();
        executiveManagerChildList.add(managementOffice);
        executiveManagement.nodeList=executiveManagerChildList;

        List<Node> managementOfficeChildList = new ArrayList<>();
        managementOfficeChildList.add(generalManager);
        managementOfficeChildList.add(hotelManager);
        managementOfficeChildList.add(pa2GeneralManager);
        managementOfficeChildList.add(healthAndSafetyManager);
        managementOffice.nodeList=managementOfficeChildList;
        division.nodeList=executiveManagerChildList;
        department.nodeList=managementOfficeChildList;

        NodeService nodeService = new NodeService();
        nodeService.hotelmanning(hotelMG);

    }
}
