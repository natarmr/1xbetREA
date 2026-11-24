package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.p5r0[], still in use, count: 1, list:
  (r0v1 a.p5r0[]) from 0x0063: CONSTRUCTOR (r0v1 a.p5r0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:100) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class p5r0 {
    POPULAR_SPORT("popular_sport"),
    /* JADX INFO: Fake field, exist only in values array */
    SPORTS_LIVE("sports_live"),
    /* JADX INFO: Fake field, exist only in values array */
    SPORTS_LINE("sports_line"),
    /* JADX INFO: Fake field, exist only in values array */
    SPORTS_STREAM("sports_stream"),
    /* JADX INFO: Fake field, exist only in values array */
    SPORTS_BET_ON_YOURS("sports_bet_on_yours"),
    /* JADX INFO: Fake field, exist only in values array */
    CHAMP_LIVE("champ_live"),
    /* JADX INFO: Fake field, exist only in values array */
    CHAMP_LINE("champ_live"),
    /* JADX INFO: Fake field, exist only in values array */
    CHAMP_STREAM("champ_stream"),
    /* JADX INFO: Fake field, exist only in values array */
    CHAMP_BET_ON_YOURS("champ_bet_on_yours");

    public static final g9m0 b = new g9m0();
    public static final /* synthetic */ c0o e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26419a;

    static {
        e = new c0o(new p5r0[]{r0, new p5r0("sports_live"), new p5r0("sports_line"), new p5r0("sports_stream"), new p5r0("sports_bet_on_yours"), new p5r0("champ_live"), new p5r0("champ_live"), new p5r0("champ_stream"), new p5r0("champ_bet_on_yours")});
    }

    public p5r0(String str) {
        super(str, i);
        this.f26419a = str;
    }

    public static p5r0 valueOf(String str) {
        return (p5r0) Enum.valueOf(p5r0.class, str);
    }

    public static p5r0[] values() {
        return (p5r0[]) d.clone();
    }
}
