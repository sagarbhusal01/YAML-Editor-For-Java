package np.com.Sagarbhusal01;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class utils {



//
//    As the name suggest this method returns boolean value after checking the file exists or not
//
    protected boolean IfFileDonotExist(String PathName) {
        File file = new File(PathName);
        return !file.exists() || file.isDirectory();
    }



    protected void CreateFile(String PathName,String Message)
    {
        System.out.println(Message);
        try {
            File file = new File(PathName);
            if (file.createNewFile()) {
                System.out.println("New file is created under the name: " + file.getName());
            } else {
                System.out.println("File already exists ");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating new file ");
        }
    }





    protected void WriteToFile(String Data,String PathName)
    {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File(PathName), true));
            bw.write(Data);
            bw.newLine();
            bw.close();
        } catch (Exception e) {
            System.out.println("An error has occurred while writing to the file.");
        }
    }








}


