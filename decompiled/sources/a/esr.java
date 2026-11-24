package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.esr[], still in use, count: 1, list:
  (r0v1 a.esr[]) from 0x0050: CONSTRUCTOR (r0v1 a.esr[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:81) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class esr {
    NOTHING(0),
    DOUBLE_BONUS(1),
    RETURN_HALF(2),
    FREE_BET(3),
    FREE_SPIN(4),
    WILD_FREE_BET(5),
    SPECIAL_BONUS(666);

    public static final nek b = new nek();
    public static final /* synthetic */ c0o k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f8344a;

    static {
        k = new c0o(new esr[]{r0, r1, r2, r3, r4, r5, r6});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public esr(int i) {
        super(str, i);
        this.f8344a = i;
    }

    public static esr valueOf(String str) {
        return (esr) Enum.valueOf(esr.class, str);
    }

    public static esr[] values() {
        return (esr[]) j.clone();
    }

    public final boolean a() {
        return this == FREE_BET;
    }

    public final boolean b() {
        return this == WILD_FREE_BET;
    }
}
