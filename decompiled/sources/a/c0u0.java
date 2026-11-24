package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.c0u0[], still in use, count: 1, list:
  (r0v1 a.c0u0[]) from 0x0044: CONSTRUCTOR (r0v1 a.c0u0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:69) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class c0u0 {
    /* JADX INFO: Fake field, exist only in values array */
    STATISTIC(t9m0.VALORANT_STATISTIC_TABLET),
    /* JADX INFO: Fake field, exist only in values array */
    ROUND_STATISTIC(t9m0.VALORANT_ROUND_STATISTIC),
    /* JADX INFO: Fake field, exist only in values array */
    MAP_SERIES(t9m0.VALORANT_MAP_SERIES),
    /* JADX INFO: Fake field, exist only in values array */
    COMPOSITION(t9m0.VALORANT_COMPOSITION),
    /* JADX INFO: Fake field, exist only in values array */
    MAPS_STATISTIC(t9m0.VALORANT_MAPS_STATISTIC),
    /* JADX INFO: Fake field, exist only in values array */
    LAST_MATCHES(t9m0.VALORANT_LAST_MATCHES);

    public static final /* synthetic */ c0o c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9m0 f3541a;

    static {
        c = new c0o(c0u0VarArr);
    }

    public c0u0(t9m0 t9m0Var) {
        super(str, i);
        this.f3541a = t9m0Var;
    }

    public static c0u0 valueOf(String str) {
        return (c0u0) Enum.valueOf(c0u0.class, str);
    }

    public static c0u0[] values() {
        return (c0u0[]) b.clone();
    }
}
