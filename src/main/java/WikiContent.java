import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WikiContent {
    @SerializedName("data")
    @Expose
    public List<Datum> data = null;
}
