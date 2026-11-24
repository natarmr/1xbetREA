package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v3 a.c310[], still in use, count: 1, list:
  (r0v3 a.c310[]) from 0x00a4: CONSTRUCTOR (r0v3 a.c310[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:165) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class c310 {
    /* JADX INFO: Fake field, exist only in values array */
    ABOUT_MAP(t9m0.LOL_ABOUT_MAP),
    TEAM_STAT_RED_BLUE_TABLET(t9m0.LOL_TEAM_STAT_RED_BLUE),
    TEAM_STAT_RED(t9m0.LOL_TEAM_STAT_RED),
    TEAM_STAT_BLUE(t9m0.LOL_TEAM_STAT_BLUE),
    /* JADX INFO: Fake field, exist only in values array */
    STAT_AND_ITEMS(t9m0.LOL_STAT_AND_ITEMS),
    /* JADX INFO: Fake field, exist only in values array */
    BANS_AND_PICKS(t9m0.LOL_BANS_AND_PICKS),
    /* JADX INFO: Fake field, exist only in values array */
    GAME_LOG(t9m0.LOL_GAME_LOG),
    /* JADX INFO: Fake field, exist only in values array */
    GRAPH(t9m0.LOL_GRAPH),
    /* JADX INFO: Fake field, exist only in values array */
    COMPOSITION(t9m0.LOL_COMPOSITION),
    /* JADX INFO: Fake field, exist only in values array */
    BEST_HEROES(t9m0.LOL_BEST_HEROES),
    /* JADX INFO: Fake field, exist only in values array */
    COMPARE_TEAM(t9m0.LOL_COMPARE_TEAM),
    /* JADX INFO: Fake field, exist only in values array */
    LAST_MATCHES(t9m0.LOL_LAST_MATCHES),
    /* JADX INFO: Fake field, exist only in values array */
    FUTURE_MATCHES(t9m0.LOL_FUTURE_MATCHES),
    /* JADX INFO: Fake field, exist only in values array */
    STAGE_TABLE(t9m0.LOL_STAGE_TABLE);

    public static final /* synthetic */ c0o f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9m0 f3650a;

    static {
        f = new c0o(c310VarArr);
    }

    public c310(t9m0 t9m0Var) {
        super(str, i);
        this.f3650a = t9m0Var;
    }

    public static c310 valueOf(String str) {
        return (c310) Enum.valueOf(c310.class, str);
    }

    public static c310[] values() {
        return (c310[]) e.clone();
    }
}
