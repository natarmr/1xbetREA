package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.rqf[], still in use, count: 1, list:
  (r0v1 a.rqf[]) from 0x004e: CONSTRUCTOR (r0v1 a.rqf[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:79) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes4.dex */
public final class rqf {
    /* JADX INFO: Fake field, exist only in values array */
    ABOUT_MAP(t9m0.CS_ABOUT_MAP),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYER_STATISTIC(t9m0.CS_PLAYER_STATISTIC),
    /* JADX INFO: Fake field, exist only in values array */
    STAT_ROUNDS(t9m0.CS_STAT_ROUNDS),
    /* JADX INFO: Fake field, exist only in values array */
    COMPOSITION(t9m0.CS_COMPOSITION),
    /* JADX INFO: Fake field, exist only in values array */
    LAST_MATCHES(t9m0.CS_LAST_MATCHES),
    /* JADX INFO: Fake field, exist only in values array */
    FUTURE_MATCHES(t9m0.CS_FUTURE_MATCHES),
    /* JADX INFO: Fake field, exist only in values array */
    STAGE_TABLE(t9m0.CS_STAGE_TABLE);

    public static final /* synthetic */ c0o c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9m0 f30928a;

    static {
        c = new c0o(rqfVarArr);
    }

    public rqf(t9m0 t9m0Var) {
        super(str, i);
        this.f30928a = t9m0Var;
    }

    public static rqf valueOf(String str) {
        return (rqf) Enum.valueOf(rqf.class, str);
    }

    public static rqf[] values() {
        return (rqf[]) b.clone();
    }
}
