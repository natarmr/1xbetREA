package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.qvo0[], still in use, count: 1, list:
  (r0v1 a.qvo0[]) from 0x002b: CONSTRUCTOR (r0v1 a.qvo0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:44) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class qvo0 {
    b("DEFAULT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF20("MAX_PAYOUT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF32("MIN_PAYOUT");

    public static final /* synthetic */ c0o d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f29396a;

    static {
        d = new c0o(qvo0VarArr);
    }

    public qvo0(String str) {
        super(str, i);
        this.f29396a = num;
    }

    public static qvo0 valueOf(String str) {
        return (qvo0) Enum.valueOf(qvo0.class, str);
    }

    public static qvo0[] values() {
        return (qvo0[]) c.clone();
    }
}
