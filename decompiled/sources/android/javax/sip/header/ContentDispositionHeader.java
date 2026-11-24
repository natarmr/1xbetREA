package android.javax.sip.header;

/* JADX INFO: loaded from: classes.dex */
public interface ContentDispositionHeader extends Parameters, Header {
    public static final String ALERT = "Alert";
    public static final String ICON = "Icon";
    public static final String NAME = "Content-Disposition";
    public static final String RENDER = "Render";
    public static final String SESSION = "Session";

    String getDispositionType();

    String getHandling();

    void setDispositionType(String str);

    void setHandling(String str);
}
