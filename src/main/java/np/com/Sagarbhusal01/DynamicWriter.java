package np.com.Sagarbhusal01;


import java.util.HashMap;
import java.util.Map;

class DynamicWriter {

    protected DynamicWriter(HashMap<String,String> MappedData, String PathName) {

        utils utils = new utils();
//
//       First check the file exist or not; if not then create a new file under the given Pathname
//

        if (utils.IfFileDonotExist(PathName)) utils.CreateFile(PathName, "No file was found so,");

//
//        looping over the data to write into the file
//

        for(Map.Entry<String,String> entry: MappedData.entrySet())
        {
            utils.WriteToFile(entry.getKey()+" : "+entry.getValue(),PathName);
        }

    }
}
