package np.com.Sagarbhusal01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class DynamicReader {
    public   HashMap<String,String>  Read(String PathName) {


        try
        {
//
//            listOfEachLine is the ArrayList used for storing the data of each line in the array
//
            ArrayList<String> listOfEachLine = new ArrayList<String>();
//
//
//
            HashMap<String,String> Data = new HashMap<>();
//
//
//
//
            try
            {
                BufferedReader bf = new BufferedReader(new FileReader(PathName));

                String line = bf.readLine();

                while (line != null) {
//
//                   Adding the Read line into the arrayList
//


                    if (!line.startsWith("#")&&!line.isBlank()) {
                        listOfEachLine.add(line.replaceAll(" ",""));

                    }



//
                    line = bf.readLine();
                }

                bf.close();
            }
            catch (IOException e) {
                System.out.println("An error occurred while Reading the file ");
            }


//
//
//        here the Arraylist is operated to convert each line into two set,
//        i.e. key and value for HashMap to be returned.
//
            for (String listOfString : listOfEachLine) {
                Data.put(listOfString.split(":")[0], listOfString.split(":")[1]);
            }
//
//
//

            return Data;
        }
        catch (IndexOutOfBoundsException e)
        {
            System.out.println("An error occurred while reading the file." +
                    "\n May be the file don't contain both key and value for each items" +
                    "\n or the mode is set into the different filesystem "
            );
        }

        return null;
    }
}
