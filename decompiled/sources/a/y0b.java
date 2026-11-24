package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.y0b[], still in use, count: 1, list:
  (r0v1 a.y0b[]) from 0x0026: CONSTRUCTOR (r0v1 a.y0b[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:39) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class y0b {
    NO_CASHBACK(0),
    PROMO(1),
    PERCENT(2);

    public static final /* synthetic */ c0o f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f41797a;

    static {
        f = new c0o(y0bVarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y0b(int i) {
        super(str, i);
        this.f41797a = i;
    }

    public static y0b valueOf(String str) {
        return (y0b) Enum.valueOf(y0b.class, str);
    }

    public static y0b[] values() {
        return (y0b[]) e.clone();
    }
}
