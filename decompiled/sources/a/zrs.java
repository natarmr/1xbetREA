package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.zrs[], still in use, count: 1, list:
  (r0v1 a.zrs[]) from 0x006b: CONSTRUCTOR (r0v1 a.zrs[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:108) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class zrs {
    TEAMS_RED_BLUE_SIDE_TABLET(t9m0.MLBB_TEAMS_RED_BLUE_SIDE),
    TEAMS_RED_SIDE_MOBILE(t9m0.MLBB_TEAMS_RED_SIDE),
    MINI_MAP(t9m0.MLBB_MINI_MAP),
    TEAMS_BLUE_SIDE_MOBILE(t9m0.MLBB_TEAMS_BLUE_SIDE),
    /* JADX INFO: Fake field, exist only in values array */
    STATISTIC_AND_ITEMS(t9m0.MLBB_STAT_AND_ITEMS),
    /* JADX INFO: Fake field, exist only in values array */
    BANS_PICKS(t9m0.MLBB_BANS_PICKS),
    /* JADX INFO: Fake field, exist only in values array */
    GOLD_GRAPH(t9m0.MLBB_GOLD_GRAPH),
    /* JADX INFO: Fake field, exist only in values array */
    PREVIOUS_MAPS(t9m0.MLBB_PREVIOUS_MAPS),
    /* JADX INFO: Fake field, exist only in values array */
    COMPOSITION(t9m0.MLBB_COMPOSITION);

    public static final /* synthetic */ c0o g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9m0 f44872a;

    static {
        g = new c0o(zrsVarArr);
    }

    public zrs(t9m0 t9m0Var) {
        super(str, i);
        this.f44872a = t9m0Var;
    }

    public static zrs valueOf(String str) {
        return (zrs) Enum.valueOf(zrs.class, str);
    }

    public static zrs[] values() {
        return (zrs[]) f.clone();
    }
}
