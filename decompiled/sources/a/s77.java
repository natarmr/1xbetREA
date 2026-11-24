package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.s77[], still in use, count: 1, list:
  (r0v1 a.s77[]) from 0x0058: CONSTRUCTOR (r0v1 a.s77[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:89) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class s77 {
    EVENTS(0),
    TOTO(1),
    AUTO(2),
    UNSETTLED(3),
    SALE(4),
    AGGREGATOR(5),
    JACKPOT(6),
    LOTTO(7);

    public static final bj5 b = new bj5();
    public static final /* synthetic */ c0o l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f31736a;

    static {
        l = new c0o(new s77[]{r0, r1, r2, r3, r4, r5, r6, r7});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s77(int i) {
        super(str, i);
        this.f31736a = i;
    }

    public static s77 valueOf(String str) {
        return (s77) Enum.valueOf(s77.class, str);
    }

    public static s77[] values() {
        return (s77[]) k.clone();
    }
}
