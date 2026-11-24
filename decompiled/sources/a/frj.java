package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.frj[], still in use, count: 1, list:
  (r0v1 a.frj[]) from 0x0065: CONSTRUCTOR (r0v1 a.frj[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:102) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class frj {
    /* JADX INFO: Fake field, exist only in values array */
    OneXGames("1xgames"),
    /* JADX INFO: Fake field, exist only in values array */
    Casino("casino"),
    /* JADX INFO: Fake field, exist only in values array */
    Team("team"),
    /* JADX INFO: Fake field, exist only in values array */
    Champion("champion"),
    /* JADX INFO: Fake field, exist only in values array */
    Games("games"),
    /* JADX INFO: Fake field, exist only in values array */
    Other("other"),
    /* JADX INFO: Fake field, exist only in values array */
    Tracking("tracking"),
    /* JADX INFO: Fake field, exist only in values array */
    Viewed("viewed"),
    Unknown("");

    public static final kud b = new kud();
    public static final /* synthetic */ c0o e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10021a;

    static {
        e = new c0o(new frj[]{r0, r1, r2, r3, r4, r5, r6, r7, r8});
    }

    public frj(String str) {
        super(str, i);
        this.f10021a = str;
    }

    public static frj valueOf(String str) {
        return (frj) Enum.valueOf(frj.class, str);
    }

    public static frj[] values() {
        return (frj[]) d.clone();
    }
}
