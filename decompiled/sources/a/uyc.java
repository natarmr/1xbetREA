package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.uyc[], still in use, count: 1, list:
  (r0v1 a.uyc[]) from 0x0027: CONSTRUCTOR (r0v1 a.uyc[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:40) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes.dex */
public final class uyc {
    IDLE(0),
    AVAILABLE(1),
    UNAVAILABLE(-1);

    public static final bj5 b = new bj5();
    public static final /* synthetic */ c0o g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36481a;

    static {
        g = new c0o(new uyc[]{r0, r1, r2});
    }

    public uyc(int i) {
        super(str, i);
        this.f36481a = i;
    }

    public static uyc valueOf(String str) {
        return (uyc) Enum.valueOf(uyc.class, str);
    }

    public static uyc[] values() {
        return (uyc[]) f.clone();
    }
}
