package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.v5r0[], still in use, count: 1, list:
  (r0v1 a.v5r0[]) from 0x0073: CONSTRUCTOR (r0v1 a.v5r0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:116) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class v5r0 {
    POPULAR_SPORT("popular_sport"),
    SPORTS_LIVE("sports_live"),
    SPORTS_LINE("sports_line"),
    SPORTS_STREAM("sports_stream"),
    SPORTS_BET_ON_YOURS("sports_bet_on_yours"),
    CHAMP_LIVE("champ_live"),
    CHAMP_LINE("champ_live"),
    CHAMP_STREAM("champ_stream"),
    CHAMP_BET_ON_YOURS("champ_bet_on_yours");

    public static final s9m0 b = new s9m0();
    public static final /* synthetic */ c0o m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36839a;

    static {
        m = new c0o(new v5r0[]{r0, r1, r2, r3, r4, r5, r6, r7, r8});
    }

    public v5r0(String str) {
        super(str, i);
        this.f36839a = str;
    }

    public static v5r0 valueOf(String str) {
        return (v5r0) Enum.valueOf(v5r0.class, str);
    }

    public static v5r0[] values() {
        return (v5r0[]) l.clone();
    }
}
