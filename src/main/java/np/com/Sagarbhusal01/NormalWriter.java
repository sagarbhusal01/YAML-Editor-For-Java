package np.com.Sagarbhusal01;

import java.util.HashMap;


class NormalWriter  {

    protected NormalWriter(HashMap<String,String> MappedData, String PathName) {

        utils utils=new utils();
//
//        First check the file exist or not; if not then create a new file under the given Pathname
//
        if(utils.IfFileDonotExist(PathName)) utils.CreateFile(PathName,"No file was found so,");

//
//        Simply the mapped data can be written into the file without any modification
//
        utils.WriteToFile(String.valueOf(MappedData),PathName,false);

    }

}

