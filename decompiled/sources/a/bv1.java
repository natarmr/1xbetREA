package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.bv1[], still in use, count: 1, list:
  (r0v1 a.bv1[]) from 0x0034: CONSTRUCTOR (r0v1 a.bv1[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:53) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class bv1 {
    DESCRIPTION(0, s9s0.f31863a),
    GAMES(1, s9s0.b),
    /* JADX INFO: Fake field, exist only in values array */
    RESULTS(2, s9s0.c),
    /* JADX INFO: Fake field, exist only in values array */
    CONDITIONS(3, s9s0.d);

    public static final qek0 c = new qek0();
    public static final /* synthetic */ c0o g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f3260a;
    public final s9s0 b;

    static {
        g = new c0o(new bv1[]{r0, r1, new bv1(2, s9s0.c), new bv1(3, s9s0.d)});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bv1(int i, s9s0 s9s0Var) {
        super(str, i);
        this.f3260a = i;
        this.b = s9s0Var;
    }

    public static bv1 valueOf(String str) {
        return (bv1) Enum.valueOf(bv1.class, str);
    }

    public static bv1[] values() {
        return (bv1[]) f.clone();
    }
}
