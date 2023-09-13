package np.com.Sagarbhusal01;

import java.util.HashMap;

public class YAML{

//
//    every method in this class is a mean to communicate to the outside classes.
//    method are protected in their respective classes  so this class calls those protected class and makes them public
//

    Config config=new Config();
    utils utils=new utils();



    public void setMode(String Mode)
    {
        config.setMode(Mode.toLowerCase());
    }



    public void CreateNewFile(String PathName)
    {
       utils.CreateFile(PathName," ");
    }




//
//    the Reader and Writer method checks the Mode configured and call the
//    respective protected class to operate onto them
//
    public void Writer(HashMap<String,String> MappedData,String PathName,boolean append)
    {

        if (config.getMode().equals("normal")) {
            new NormalWriter(MappedData, PathName,append);
        } else {
            new DynamicWriter(MappedData, PathName,append);
        }
    }




    public HashMap<String,String> Reader(String PathName)
    {

        if (config.getMode().equals("normal")) {
            return (new NormalReader().Read(PathName));
        }
        else
        {
            return (new DynamicReader().Read(PathName));
        }
    }

}
