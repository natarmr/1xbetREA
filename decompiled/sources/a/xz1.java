package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.xz1[], still in use, count: 1, list:
  (r0v1 a.xz1[]) from 0x0050: CONSTRUCTOR (r0v1 a.xz1[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:81) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class xz1 {
    /* JADX INFO: Fake field, exist only in values array */
    CATEGORIES("categories"),
    /* JADX INFO: Fake field, exist only in values array */
    PROMO("promo"),
    /* JADX INFO: Fake field, exist only in values array */
    TVBET("tvbet"),
    /* JADX INFO: Fake field, exist only in values array */
    VIPCASHBACK("vipcashback"),
    /* JADX INFO: Fake field, exist only in values array */
    PROMOPRIZES("promoprizes"),
    /* JADX INFO: Fake field, exist only in values array */
    PROMOCODES("promocodes"),
    UNKNOWN("unknown");

    public static final gfk0 b = new gfk0(19);
    public static final /* synthetic */ c0o e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41732a;

    static {
        e = new c0o(new xz1[]{r0, r1, r2, r3, r4, r5, r6});
    }

    public xz1(String str) {
        super(str, i);
        this.f41732a = str;
    }

    public static xz1 valueOf(String str) {
        return (xz1) Enum.valueOf(xz1.class, str);
    }

    public static xz1[] values() {
        return (xz1[]) d.clone();
    }
}
