import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {
    @SerializedName("old_text")
    @Expose
    public String oldText;
    @SerializedName("page_title")
    @Expose
    public String pageTitle;
}
