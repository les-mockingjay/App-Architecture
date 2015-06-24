package com.android.app.core.filesystem;

import java.io.IOException;

/**
 * Created by frodo on 2015/6/24.
 */
public interface Serializable {
    void serialize(Output out) throws IOException;

    void deserialize(Input in) throws IOException;
}
