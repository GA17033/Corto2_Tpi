package videoclub;

import java.io.InputStream;

public interface IVideo {

    int getNumber();

    String getTitle();

    InputStream getDataAsStream();
}
