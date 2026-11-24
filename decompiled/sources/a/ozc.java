package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.ozc[], still in use, count: 1, list:
  (r0v1 a.ozc[]) from 0x0026: CONSTRUCTOR (r0v1 a.ozc[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:39) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class ozc {
    MAX_PAYOUT(0),
    MIN_PAYOUT(1),
    POSSIBLE_PAYOUT(2);

    public static final /* synthetic */ c0o f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f26097a;

    static {
        f = new c0o(ozcVarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ozc(int i) {
        super(str, i);
        this.f26097a = i;
    }

    public static ozc valueOf(String str) {
        return (ozc) Enum.valueOf(ozc.class, str);
    }

    public static ozc[] values() {
        return (ozc[]) e.clone();
    }
}
