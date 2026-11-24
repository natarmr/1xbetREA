package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.q8k[], still in use, count: 1, list:
  (r0v1 a.q8k[]) from 0x0038: CONSTRUCTOR (r0v1 a.q8k[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:57) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes2.dex */
public final class q8k implements xrz {
    DEPOSIT_LIMIT_1_DAY(20),
    DEPOSIT_LIMIT_7_DAY(21),
    DEPOSIT_LIMIT_30_DAY(22),
    DEPOSIT_LIMIT_UNTIL_VERIFICATION(23);

    public static final /* synthetic */ c0o g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f28304a;

    static {
        g = new c0o(q8kVarArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q8k(int i) {
        super(str, i);
        bnz bnzVar = bnz.f2907a;
        this.f28304a = i;
    }

    public static q8k valueOf(String str) {
        return (q8k) Enum.valueOf(q8k.class, str);
    }

    public static q8k[] values() {
        return (q8k[]) f.clone();
    }

    @Override // a.xrz
    public final bnz a() {
        return bnz.b;
    }

    @Override // a.xrz
    public final int getId() {
        return this.f28304a;
    }
}
