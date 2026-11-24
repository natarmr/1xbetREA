package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.e9l[], still in use, count: 1, list:
  (r0v1 a.e9l[]) from 0x0074: CONSTRUCTOR (r0v1 a.e9l[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:117) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class e9l {
    SELECTED_HEROES(t9m0.DOTA_SELECTED_HEROES),
    MINI_MAP(t9m0.DOTA_MINI_MAP),
    MINI_MAP_SELECTED_HEROES(t9m0.DOTA_MINI_MAP_SELECTED_HEROES),
    /* JADX INFO: Fake field, exist only in values array */
    STATISTIC_ITEMS_SKILLS(t9m0.DOTA_STATISTIC_ITEMS_SKILLS),
    /* JADX INFO: Fake field, exist only in values array */
    GOLD_CREEPS_BUYBACK(t9m0.DOTA_GOLD_CREEPS_BUYBACK),
    /* JADX INFO: Fake field, exist only in values array */
    BANS_PICKS(t9m0.DOTA_BANS_PICKS),
    /* JADX INFO: Fake field, exist only in values array */
    PREVIOUS_GAMES(t9m0.DOTA_PREVIOUS_GAMES),
    /* JADX INFO: Fake field, exist only in values array */
    COMPOSITION(t9m0.DOTA_COMPOSITION),
    /* JADX INFO: Fake field, exist only in values array */
    BEST_HEROES(t9m0.DOTA_BEST_HEROES),
    /* JADX INFO: Fake field, exist only in values array */
    LAST_MATCHES(t9m0.DOTA_LAST_MATCHES);

    public static final /* synthetic */ c0o f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9m0 f7427a;

    static {
        f = new c0o(e9lVarArr);
    }

    public e9l(t9m0 t9m0Var) {
        super(str, i);
        this.f7427a = t9m0Var;
    }

    public static e9l valueOf(String str) {
        return (e9l) Enum.valueOf(e9l.class, str);
    }

    public static e9l[] values() {
        return (e9l[]) e.clone();
    }
}
