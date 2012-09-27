package com.sayem.rough;


public class GetRunmode {

    public static void main(String [] args){

        //System.out.println(System.getProperty("user.dir"));
        Xls_Reader xls = new Xls_Reader(System.getProperty("user.dir") + "\\src\\main\\java\\com\\sayem\\data\\Test Cases.xlsx");

        // Test Cases data start from row number #2
        // Keep "Test Cases" in Constants class later!
        // Keep the "Y" in Constants class

/*
        for(int rowNum=2; rowNum<=xls.getRowCount("Test Cases"); rowNum++){
            if(xls.getCellData("Test Cases", "Runmode", rowNum).equalsIgnoreCase("Y"))
                System.out.println(xls.getCellData("Test Cases", "TCID", rowNum) +" -- "+xls.getCellData("Test Cases", "Runmode", rowNum));
*/

            // Print Test Cases with Runmode "Y"

            System.out.println(TestUtil.isExecutable("Test2", xls));
            System.out.println(TestUtil.isExecutable("Test4", xls));

        }


}
