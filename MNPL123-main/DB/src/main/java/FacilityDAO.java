package DB.src.main.java;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FacilityDAO {
    //get方法
    public static Facility getFacility(int num,String n){
        Facility facility=null;
        try{
            Connection conn=JDBCTool.getConnection();
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM Facility WHERE number="+num+" AND name="+n);

            while(rs.next()){
                int number=rs.getInt("number");
                String name=rs.getString("name");
                double fee=rs.getDouble("fee");
                boolean index0=rs.getBoolean("10-11");
                boolean index1=rs.getBoolean("11-12");
                boolean index2=rs.getBoolean("12-13");
                boolean index3=rs.getBoolean("13-14");
                boolean index4=rs.getBoolean("14-15");
                boolean index5=rs.getBoolean("15-16");
                boolean index6=rs.getBoolean("16-17");
                boolean index7=rs.getBoolean("17-18");
                boolean index8=rs.getBoolean("18-19");
                boolean index9=rs.getBoolean("19-20");
                boolean index10=rs.getBoolean("20-21");
                boolean index11=rs.getBoolean("21-22");
                boolean[] time=new boolean[12];
                time[0]=index0;
                time[1]=index1;
                time[2]=index2;
                time[3]=index3;
                time[4]=index4;
                time[5]=index5;
                time[6]=index6;
                time[7]=index7;
                time[8]=index8;
                time[9]=index9;
                time[10]=index10;
                time[11]=index11;

                facility=new Facility(number,time,name,fee);
            }

            rs.close();
            st.close();
            conn.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return facility;
    }
    //删除
    public static boolean deleteFacility(int num){
        try{
            Connection conn=JDBCTool.getConnection();
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("DELETE FROM Facility WHERE number="+num);

            rs.close();
            st.close();
            conn.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return true;
    }

    //更新
    public static boolean updateFacility(Facility f){
        try{
            Connection conn=JDBCTool.getConnection();
            Statement st=conn.createStatement();
            st.executeQuery("UPDATE Facility SET '10-11'='"+f.getTime()[0]+"' WHERE ('number'='"+f.getNumber()+"') AND ('name="+f.getName()+"')");
            st.executeQuery("UPDATE Facility SET '11-12'='"+f.getTime()[1]+"' WHERE ('number'='"+f.getNumber()+"') AND ('name="+f.getName()+"')");
            st.executeQuery("UPDATE Facility SET '12-13'='"+f.getTime()[2]+"' WHERE ('number'='"+f.getNumber()+"') AND ('name="+f.getName()+"')");
            st.executeQuery("UPDATE Facility SET '13-14'='"+f.getTime()[3]+"' WHERE ('number'='"+f.getNumber()+"') AND ('name="+f.getName()+"')");
            st.executeQuery("UPDATE Facility SET '14-15'='"+f.getTime()[4]+"' WHERE ('number'='"+f.getNumber()+"') AND ('name="+f.getName()+"')");
            st.executeQuery("UPDATE Facility SET '15-16'='"+f.getTime()[5]+"' WHERE ('number'='"+f.getNumber()+"') AND ('name="+f.getName()+"')");
            st.executeQuery("UPDATE Facility SET '16-17'='"+f.getTime()[6]+"' WHERE ('number'='"+f.getNumber()+"') AND ('name="+f.getName()+"')");
            st.executeQuery("UPDATE Facility SET '17-18'='"+f.getTime()[7]+"' WHERE ('number'='"+f.getNumber()+"') AND ('name="+f.getName()+"')");
            st.executeQuery("UPDATE Facility SET '18-19'='"+f.getTime()[8]+"' WHERE ('number'='"+f.getNumber()+"') AND ('name="+f.getName()+"')");
            st.executeQuery("UPDATE Facility SET '19-20'='"+f.getTime()[9]+"' WHERE ('number'='"+f.getNumber()+"') AND ('name="+f.getName()+"')");
            st.executeQuery("UPDATE Facility SET '20-21'='"+f.getTime()[10]+"' WHERE ('number'='"+f.getNumber()+"') AND ('name="+f.getName()+"')");
            st.executeQuery("UPDATE Facility SET '21-22'='"+f.getTime()[11]+"' WHERE ('number'='"+f.getNumber()+"') AND ('name="+f.getName()+"')");

            st.close();
            conn.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return true;
    }
    //插入
    public static boolean insertFacility(Facility f){
        try{
            Connection conn=JDBCTool.getConnection();
            Statement st=conn.createStatement();
            for(int i=0;i<12;i++){
                st.executeQuery("INSERT INTO Facility VALUES ("+f.getNumber()+",'"+f.getName()+"','"+f.getFee()+"','"+f.getTime()[i]+")");
            }

            st.close();
            conn.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return true;
    }
}
