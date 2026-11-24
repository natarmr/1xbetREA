package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class wxv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wxv f39948a;
    public static final wxv b;
    public static final /* synthetic */ wxv[] c;

    static {
        wxv wxvVar = new wxv("Horizontal", 0);
        f39948a = wxvVar;
        wxv wxvVar2 = new wxv("Vertical", 1);
        b = wxvVar2;
        c = new wxv[]{wxvVar, wxvVar2};
    }

    public static wxv valueOf(String str) {
        return (wxv) Enum.valueOf(wxv.class, str);
    }

    public static wxv[] values() {
        return (wxv[]) c.clone();
    }
}
