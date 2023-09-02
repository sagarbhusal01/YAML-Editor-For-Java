package np.com.Sagarbhusal01;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.HashMap;



class NormalReader {

    protected HashMap<String,String> Read(String PathName) {

//      initializations
//
//
        BufferedReader reader;

        HashMap<String,String> Data=new HashMap<>();

        StringBuilder AllReadTextData= new StringBuilder();

//
//
//



//
//        Reading the file of the provided path
//
        try {
            reader = new BufferedReader(new FileReader(PathName));
            String line = reader.readLine();

            while (line != null) {
//
//                Appending each line into the AllReadTextData which have a return type of string builder
//
                AllReadTextData.append(line);
                // read next line
                    line = reader.readLine();
            }

            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred while Reading the file ");
        }


//  Array is the returned value of EditTheInputText() method;
        String[] Array = EditTheInputText(AllReadTextData);

//
//        The following code operated on the Array transfer the following example
//
//        hello=saga
//        hi=sometext
//
//        into
//        [hello,saga]
//        [hi,sometext]
//        and then put that value in the HashMap named Data;
//
//

        for (int i = 0; i < Array.length; i++) {

            for (int j = 0; j < Array[i].length(); j++) {

                 if(Array[i].charAt(j)=='=')
                  {
                      Data.put(Array[i].split("=")[0],Array[i].split("=")[1]);
                   }
            }

        }

//
//
//
return Data;
        
    }



//
//    the  parameter passed into the EditTheInputText method looks like the following:
//    {hello=saga,hi=sometext}
//
//    After the data is passed into this method, Data is operated to remove curly braces and comma
//    so that it can be returned into unidirectional array of data which looks like the following
//
//    hello=saga
//    hi=sometext
//
    private  String[] EditTheInputText(StringBuilder AllTextData)
    {
        return AllTextData
                .deleteCharAt(0)
                .deleteCharAt(AllTextData.length()-1)
                .toString()
                .replaceAll(" ","")
                .split(",");
    }



}