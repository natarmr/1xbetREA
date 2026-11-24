package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.clg0[], still in use, count: 1, list:
  (r0v1 a.clg0[]) from 0x0020: CONSTRUCTOR (r0v1 a.clg0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:33) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class clg0 {
    DEFAULT(""),
    BUTTON("button");

    public static final gne0 b = new gne0((byte) 10);
    public static final /* synthetic */ c0o f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4558a;

    static {
        f = new c0o(new clg0[]{r0, r1});
    }

    public clg0(String str) {
        super(str, i);
        this.f4558a = str;
    }

    public static clg0 valueOf(String str) {
        return (clg0) Enum.valueOf(clg0.class, str);
    }

    public static clg0[] values() {
        return (clg0[]) e.clone();
    }
}
