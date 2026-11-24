package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.boh[], still in use, count: 1, list:
  (r0v1 a.boh[]) from 0x0035: CONSTRUCTOR (r0v1 a.boh[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:54) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class boh {
    UNKNOWN(-1),
    /* JADX INFO: Fake field, exist only in values array */
    REAL(0),
    /* JADX INFO: Fake field, exist only in values array */
    SYNTHETIC(1),
    /* JADX INFO: Fake field, exist only in values array */
    ONE_X_CYBER(2),
    OLD_CYBER(3);

    public static final qud b = new qud();
    public static final /* synthetic */ c0o f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2933a;

    static {
        f = new c0o(new boh[]{r0, r1, r2, r3, r4});
    }

    public boh(int i) {
        super(str, i);
        this.f2933a = i;
    }

    public static boh valueOf(String str) {
        return (boh) Enum.valueOf(boh.class, str);
    }

    public static boh[] values() {
        return (boh[]) e.clone();
    }
}
