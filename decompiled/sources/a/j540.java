package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.j540[], still in use, count: 1, list:
  (r0v1 a.j540[]) from 0x0046: CONSTRUCTOR (r0v1 a.j540[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:71) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes5.dex */
public final class j540 {
    /* JADX INFO: Fake field, exist only in values array */
    LINE("line"),
    /* JADX INFO: Fake field, exist only in values array */
    LIVE("live"),
    /* JADX INFO: Fake field, exist only in values array */
    GAMES("games"),
    /* JADX INFO: Fake field, exist only in values array */
    AGGREGATOR("casino"),
    /* JADX INFO: Fake field, exist only in values array */
    BONUS("bonus"),
    UNKNOWN("unknown");

    public static final wsz b = new wsz();
    public static final /* synthetic */ c0o e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15916a;

    static {
        e = new c0o(new j540[]{r0, r1, r2, r3, r4, r5});
    }

    public j540(String str) {
        super(str, i);
        this.f15916a = str;
    }

    public static j540 valueOf(String str) {
        return (j540) Enum.valueOf(j540.class, str);
    }

    public static j540[] values() {
        return (j540[]) d.clone();
    }
}
