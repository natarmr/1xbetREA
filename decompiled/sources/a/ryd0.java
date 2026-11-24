package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.ryd0[], still in use, count: 1, list:
  (r0v1 a.ryd0[]) from 0x0058: CONSTRUCTOR (r0v1 a.ryd0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:89) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class ryd0 {
    /* JADX INFO: Fake field, exist only in values array */
    TEAM_STAT(t9m0.RAINBOW_TEAM_STAT),
    /* JADX INFO: Fake field, exist only in values array */
    ROUND_STAT(t9m0.RAINBOW_ROUND_STAT),
    /* JADX INFO: Fake field, exist only in values array */
    BANS_AND_PICKS(t9m0.RAINBOW_BANS_AND_PICKS),
    /* JADX INFO: Fake field, exist only in values array */
    MAP_SERIES(t9m0.RAINBOW_MAP_SERIES),
    /* JADX INFO: Fake field, exist only in values array */
    COMPOSITION(t9m0.RAINBOW_COMPOSITION),
    /* JADX INFO: Fake field, exist only in values array */
    BANS_STAT(t9m0.RAINBOW_BANS_STAT),
    /* JADX INFO: Fake field, exist only in values array */
    COMPARE_TEAMS(t9m0.RAINBOW_COMPARE_TEAMS),
    /* JADX INFO: Fake field, exist only in values array */
    LAST_MATCHES(t9m0.RAINBOW_LAST_MATCHES);

    public static final /* synthetic */ c0o c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9m0 f31310a;

    static {
        c = new c0o(ryd0VarArr);
    }

    public ryd0(t9m0 t9m0Var) {
        super(str, i);
        this.f31310a = t9m0Var;
    }

    public static ryd0 valueOf(String str) {
        return (ryd0) Enum.valueOf(ryd0.class, str);
    }

    public static ryd0[] values() {
        return (ryd0[]) b.clone();
    }
}
