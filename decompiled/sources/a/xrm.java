package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.xrm[], still in use, count: 1, list:
  (r0v1 a.xrm[]) from 0x002e: CONSTRUCTOR (r0v1 a.xrm[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:47) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes6.dex */
public final class xrm {
    /* JADX INFO: Fake field, exist only in values array */
    ROUND_ZERO(0),
    ROUND_8(1),
    ROUND_16(2),
    ROUND_360(3);

    public static final pek b = new pek();
    public static final /* synthetic */ c0o g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f41377a;

    static {
        g = new c0o(new xrm[]{r0, r1, r2, r3});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xrm(int i) {
        super(str, i);
        this.f41377a = i;
    }

    public static xrm valueOf(String str) {
        return (xrm) Enum.valueOf(xrm.class, str);
    }

    public static xrm[] values() {
        return (xrm[]) f.clone();
    }
}
