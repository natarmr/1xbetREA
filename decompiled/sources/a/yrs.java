package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.yrs[], still in use, count: 1, list:
  (r0v1 a.yrs[]) from 0x001c: CONSTRUCTOR (r0v1 a.yrs[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:29) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes6.dex */
public final class yrs {
    /* JADX INFO: Fake field, exist only in values array */
    STATISTIC(t9m0.UFC_GENERAL_STATISTIC),
    /* JADX INFO: Fake field, exist only in values array */
    LAST_FIGHTS(t9m0.UFC_LAST_FIGHTS);

    public static final /* synthetic */ c0o c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9m0 f43136a;

    static {
        c = new c0o(yrsVarArr);
    }

    public yrs(t9m0 t9m0Var) {
        super(str, i);
        this.f43136a = t9m0Var;
    }

    public static yrs valueOf(String str) {
        return (yrs) Enum.valueOf(yrs.class, str);
    }

    public static yrs[] values() {
        return (yrs[]) b.clone();
    }
}
