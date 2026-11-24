package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.m810[], still in use, count: 1, list:
  (r0v1 a.m810[]) from 0x002c: CONSTRUCTOR (r0v1 a.m810[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:45) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes.dex */
public final class m810 implements xrz {
    LOSS_LIMIT_1_DAY(10),
    LOSS_LIMIT_7_DAY(11),
    LOSS_LIMIT_30_DAY(12);

    public static final /* synthetic */ c0o f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f21348a;

    static {
        f = new c0o(m810VarArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public m810(int i) {
        super(str, i);
        bnz bnzVar = bnz.f2907a;
        this.f21348a = i;
    }

    public static m810 valueOf(String str) {
        return (m810) Enum.valueOf(m810.class, str);
    }

    public static m810[] values() {
        return (m810[]) e.clone();
    }

    @Override // a.xrz
    public final bnz a() {
        return bnz.f2907a;
    }

    @Override // a.xrz
    public final int getId() {
        return this.f21348a;
    }
}
