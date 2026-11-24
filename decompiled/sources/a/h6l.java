package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.h6l[], still in use, count: 1, list:
  (r0v1 a.h6l[]) from 0x0084: CONSTRUCTOR (r0v1 a.h6l[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:133) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class h6l {
    /* JADX INFO: Fake field, exist only in values array */
    ABOUT_MAP(t9m0.DOTA_ABOUT_MAP),
    /* JADX INFO: Fake field, exist only in values array */
    STATISTIC(t9m0.DOTA_STATISTIC),
    /* JADX INFO: Fake field, exist only in values array */
    BANS_AND_PICKS(t9m0.DOTA_BANS_PICKS),
    /* JADX INFO: Fake field, exist only in values array */
    GRAPH(t9m0.DOTA_GRAPH),
    /* JADX INFO: Fake field, exist only in values array */
    GAME_LOG(t9m0.DOTA_GAME_LOG),
    /* JADX INFO: Fake field, exist only in values array */
    COMPOSITIONS(t9m0.DOTA_COMPOSITION),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYER_ABILITIES(t9m0.DOTA_PLAYER_ABILITIES),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_STATISTICS(t9m0.DOTA_ITEM_STATISTICS),
    /* JADX INFO: Fake field, exist only in values array */
    BEST_HEROES(t9m0.DOTA_BEST_HEROES),
    /* JADX INFO: Fake field, exist only in values array */
    LAST_MATCHES(t9m0.DOTA_LAST_MATCHES),
    /* JADX INFO: Fake field, exist only in values array */
    FUTURE_MATCHES(t9m0.DOTA_FUTURE_MATCHES),
    /* JADX INFO: Fake field, exist only in values array */
    GAME_STAGE(t9m0.DOTA_STAGE_TABLE);

    public static final /* synthetic */ c0o c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9m0 f12534a;

    static {
        c = new c0o(h6lVarArr);
    }

    public h6l(t9m0 t9m0Var) {
        super(str, i);
        this.f12534a = t9m0Var;
    }

    public static h6l valueOf(String str) {
        return (h6l) Enum.valueOf(h6l.class, str);
    }

    public static h6l[] values() {
        return (h6l[]) b.clone();
    }
}
