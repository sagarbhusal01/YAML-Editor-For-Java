package np.com.Sagarbhusal01;

import java.util.Objects;

class Config {

//    Mode represent how the data is going to be stored into the filesystem
    private String Mode ="dynamic";

    protected String getMode() {
        return this.Mode;
    }

    protected void setMode(String mode)   {
        if(Objects.equals(mode, "normal"))
        {
            this.Mode=mode;
        }
    }

}
