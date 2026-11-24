package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.o5r0[], still in use, count: 1, list:
  (r0v1 a.o5r0[]) from 0x001e: CONSTRUCTOR (r0v1 a.o5r0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:31) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes4.dex */
public final class o5r0 {
    /* JADX INFO: Fake field, exist only in values array */
    SWIPE("swipe"),
    IGNORE("ignore");

    public static final m6m0 b = new m6m0((byte) 22);
    public static final /* synthetic */ c0o e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24702a;

    static {
        e = new c0o(new o5r0[]{r0, r1});
    }

    public o5r0(String str) {
        super(str, i);
        this.f24702a = str;
    }

    public static o5r0 valueOf(String str) {
        return (o5r0) Enum.valueOf(o5r0.class, str);
    }

    public static o5r0[] values() {
        return (o5r0[]) d.clone();
    }
}
