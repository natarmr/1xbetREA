package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.j1g[], still in use, count: 1, list:
  (r0v1 a.j1g[]) from 0x0031: CONSTRUCTOR (r0v1 a.j1g[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:50) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes5.dex */
public final class j1g {
    REAL(0),
    SYNTHETIC(1),
    CYBER(2),
    UNKNOWN(-1);

    public static final std b = new std();
    public static final /* synthetic */ c0o h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15732a;

    static {
        h = new c0o(new j1g[]{r0, r1, r2, r3});
    }

    public j1g(int i) {
        super(str, i);
        this.f15732a = i;
    }

    public static j1g valueOf(String str) {
        return (j1g) Enum.valueOf(j1g.class, str);
    }

    public static j1g[] values() {
        return (j1g[]) g.clone();
    }
}
