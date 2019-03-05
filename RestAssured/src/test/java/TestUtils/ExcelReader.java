package TestUtils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ExcelReader {

    private  XSSFWorkbook workbook;
    //private static Map<String, String> map = new HashMap<>();

    public Object[][] excelData(String sheetName){
        int rowCount;
        int colCount;
        Object[][] data;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src\\Data\\FlightData.xlsx");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Input File Not Found....");
        }
        try {
            workbook = new XSSFWorkbook(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        XSSFSheet sheet = workbook.getSheet(sheetName);
        rowCount =  sheet.getLastRowNum();
        colCount = sheet.getRow(0).getLastCellNum();
        data = new Object[rowCount][1];

        for(int i=0;i<rowCount;i++){
            Map<Object,Object> map = new HashMap<>();
            for(int j=0;j<colCount;j++){
                map.put(sheet.getRow(0).getCell(j).toString(),sheet.getRow(i+1).getCell(j).toString().replace(".0",""));
            }
            System.out.println(i);
            data[i][0] = map;

        }
//        for (int i=1;i<rowCount;i++){
//            XSSFRow row = sheet.getRow(i);
//            for(int j=0;j<colCount;j++) {
//                XSSFCell cell = row.getCell(j);
//                switch (cell.getCellType()) {
//                    case Cell.CELL_TYPE_BOOLEAN:
//                        data[i - 1][j] = cell.getBooleanCellValue();
//                        break;
//                    case Cell.CELL_TYPE_NUMERIC:
//                        data[i - 1][j] = cell.getNumericCellValue();
//                        break;
//                    case Cell.CELL_TYPE_STRING:
//                        data[i - 1][j] = cell.getStringCellValue();
//                        break;
//                    case Cell.CELL_TYPE_BLANK:
//                        break;
//                    case Cell.CELL_TYPE_ERROR:
//                        data[i - 1][j] = cell.getErrorCellValue();
//                        break;
//                    //data[i-1][j]=cell.getStringCellValue();
//                    //System.out.println(data[i-1][j]);
//                }
//
//            }
//        }
        return data;
    }


}


//import java.io.FileInputStream;
//        import java.io.IOException;
//        import java.util.*;
//
//        import org.apache.poi.hssf.usermodel.HSSFSheet;
//        import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//        import org.apache.poi.ss.usermodel.Row;
//
//public class GetdatafromExcel {
//
//    private static String s = "Sheet1";
//    private static String s1 = "C:/Users/Nancy_Neha/eclipse-workspace/ClearTripProject/DataFiles/Testdata.xls";
//    private static Map<String, String> map = new HashMap<>();
//
//    public String get(String testcasename,String columnname) throws IOException {
//        FileInputStream fis;
//        int k =0;
//        try {
//            fis = new FileInputStream(s1);
//            HSSFWorkbook wb = new HSSFWorkbook(fis);
//            HSSFSheet ws = wb.getSheet(s);
//            int rows = ws.getPhysicalNumberOfRows();
//            for(int i=0;i<rows;i++){
//                int cols = ws.getRow(0).getPhysicalNumberOfCells();
//                for (int j = 0; j < cols; j++) {
//                    if(ws.getRow(i).getCell(j,Row.CREATE_NULL_AS_BLANK).toString().replace(".0", "").
//                            equalsIgnoreCase(columnname)){
//                        k=j;
//                    }
//                    map.put(ws.getRow(i).getCell(0,Row.CREATE_NULL_AS_BLANK).toString().replace(".0", ""),
//                            ws.getRow(i).getCell(k,Row.CREATE_NULL_AS_BLANK).toString().replace(".0", ""));
//                }
//            }
//        }catch (Exception e){e.printStackTrace(); }
//        return map.get(testcasename);
//    }
//    public static void main(String args[]) {
//
//    }
//}
