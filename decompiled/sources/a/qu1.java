package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.qu1[], still in use, count: 1, list:
  (r0v1 a.qu1[]) from 0x0032: CONSTRUCTOR (r0v1 a.qu1[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:51) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class qu1 {
    /* JADX INFO: Fake field, exist only in values array */
    PICTURE("Picture"),
    /* JADX INFO: Fake field, exist only in values array */
    PICTURE_HEAD("PictureHead"),
    /* JADX INFO: Fake field, exist only in values array */
    GRADIENT("Gradient"),
    FIXED("Fixed");

    public static final pek0 b = new pek0();
    public static final /* synthetic */ c0o e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29327a;

    static {
        e = new c0o(new qu1[]{r0, r1, r2, r3});
    }

    public qu1(String str) {
        super(str, i);
        this.f29327a = str;
    }

    public static qu1 valueOf(String str) {
        return (qu1) Enum.valueOf(qu1.class, str);
    }

    public static qu1[] values() {
        return (qu1[]) d.clone();
    }
}
