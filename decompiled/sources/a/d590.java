package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.d590[], still in use, count: 1, list:
  (r0v1 a.d590[]) from 0x008f: CONSTRUCTOR (r0v1 a.d590[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:144) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public final class d590 {
    /* JADX INFO: Fake field, exist only in values array */
    PNG("image/png", ".png"),
    /* JADX INFO: Fake field, exist only in values array */
    JPEG("image/jpeg", ".jpeg"),
    /* JADX INFO: Fake field, exist only in values array */
    GIF("image/gif", ".gif"),
    /* JADX INFO: Fake field, exist only in values array */
    HEIC("image/heic", ".heic"),
    /* JADX INFO: Fake field, exist only in values array */
    SVG("image/svg+xml", ".svg"),
    /* JADX INFO: Fake field, exist only in values array */
    MP4("video/mp4", ".mp4"),
    /* JADX INFO: Fake field, exist only in values array */
    MOV("video/quicktime", ".mov"),
    /* JADX INFO: Fake field, exist only in values array */
    WMV("video/x-ms-wmv", ".wmv"),
    /* JADX INFO: Fake field, exist only in values array */
    WEBM("video/webm", ".webm"),
    /* JADX INFO: Fake field, exist only in values array */
    AVI("video/avi", ".avi"),
    /* JADX INFO: Fake field, exist only in values array */
    PDF("application/pdf", ".pdf");

    public static final jh70 c = new jh70();
    public static final /* synthetic */ c0o e = new c0o(new d590[]{new d590("image/png", ".png"), new d590("image/jpeg", ".jpeg"), new d590("image/gif", ".gif"), new d590("image/heic", ".heic"), new d590("image/svg+xml", ".svg"), new d590("video/mp4", ".mp4"), new d590("video/quicktime", ".mov"), new d590("video/x-ms-wmv", ".wmv"), new d590("video/webm", ".webm"), new d590("video/avi", ".avi"), new d590("application/pdf", ".pdf")});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5495a;
    public final String b;

    static {
    }

    public d590(String str, String str2) {
        super(str, i);
        this.f5495a = str;
        this.b = str2;
    }

    public static d590 valueOf(String str) {
        return (d590) Enum.valueOf(d590.class, str);
    }

    public static d590[] values() {
        return (d590[]) d.clone();
    }
}
