package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.izt0[], still in use, count: 1, list:
  (r0v1 a.izt0[]) from 0x0063: CONSTRUCTOR (r0v1 a.izt0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:100) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class izt0 {
    /* JADX INFO: Fake field, exist only in values array */
    ABOUT_MAP(t9m0.VALORANT_ABOUT_MAP),
    /* JADX INFO: Fake field, exist only in values array */
    STATISTIC_TABLET(t9m0.VALORANT_STATISTIC_TABLET),
    /* JADX INFO: Fake field, exist only in values array */
    COMPOSITION(t9m0.VALORANT_COMPOSITION),
    /* JADX INFO: Fake field, exist only in values array */
    TEAM_ADVANTAGE(t9m0.VALORANT_TEAM_ADVANTAGE),
    /* JADX INFO: Fake field, exist only in values array */
    ECONOMIC_GRAPH(t9m0.VALORANT_ECONOMIC_GRAPH),
    /* JADX INFO: Fake field, exist only in values array */
    AIM_PLAYERS(t9m0.VALORANT_AIM_PLAYERS),
    /* JADX INFO: Fake field, exist only in values array */
    LAST_MATCHES(t9m0.VALORANT_LAST_MATCHES),
    /* JADX INFO: Fake field, exist only in values array */
    FUTURE_MATCHES(t9m0.VALORANT_FUTURE_MATCHES),
    /* JADX INFO: Fake field, exist only in values array */
    STAGE_TABLE(t9m0.VALORANT_STAGE_TABLE);

    public static final /* synthetic */ c0o c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9m0 f15649a;

    static {
        c = new c0o(izt0VarArr);
    }

    public izt0(t9m0 t9m0Var) {
        super(str, i);
        this.f15649a = t9m0Var;
    }

    public static izt0 valueOf(String str) {
        return (izt0) Enum.valueOf(izt0.class, str);
    }

    public static izt0[] values() {
        return (izt0[]) b.clone();
    }
}
