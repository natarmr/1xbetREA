package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.z2m0[], still in use, count: 1, list:
  (r0v1 a.z2m0[]) from 0x0033: CONSTRUCTOR (r0v1 a.z2m0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:52) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class z2m0 {
    UNKNOWN(-1),
    /* JADX INFO: Fake field, exist only in values array */
    NOT_PLAYED(0),
    /* JADX INFO: Fake field, exist only in values array */
    WIN(1),
    /* JADX INFO: Fake field, exist only in values array */
    DRAW(2),
    /* JADX INFO: Fake field, exist only in values array */
    LOSS(3);

    public static final y2m0 b = new y2m0((byte) 0);
    public static final /* synthetic */ c0o e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43677a;

    static {
        e = new c0o(new z2m0[]{r0, new z2m0(0), new z2m0(1), new z2m0(2), new z2m0(3)});
    }

    public z2m0(int i) {
        super(str, i);
        this.f43677a = i;
    }

    public static z2m0 valueOf(String str) {
        return (z2m0) Enum.valueOf(z2m0.class, str);
    }

    public static z2m0[] values() {
        return (z2m0[]) d.clone();
    }
}
