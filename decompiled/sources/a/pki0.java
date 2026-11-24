package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.pki0[], still in use, count: 1, list:
  (r0v1 a.pki0[]) from 0x002c: CONSTRUCTOR (r0v1 a.pki0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:45) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class pki0 implements xrz {
    SESSION_TIME_LIMIT_1_DAY(31),
    SESSION_TIME_LIMIT_30_DAY(36),
    SESSION_TIME_LIMIT_7_DAY(43);

    public static final /* synthetic */ c0o f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f27136a;

    static {
        f = new c0o(pki0VarArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public pki0(int i) {
        super(str, i);
        bnz bnzVar = bnz.f2907a;
        this.f27136a = i;
    }

    public static pki0 valueOf(String str) {
        return (pki0) Enum.valueOf(pki0.class, str);
    }

    public static pki0[] values() {
        return (pki0[]) e.clone();
    }

    @Override // a.xrz
    public final bnz a() {
        return bnz.g;
    }

    @Override // a.xrz
    public final int getId() {
        return this.f27136a;
    }
}
