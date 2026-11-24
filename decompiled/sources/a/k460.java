package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.k460[], still in use, count: 1, list:
  (r0v1 a.k460[]) from 0x0052: CONSTRUCTOR (r0v1 a.k460[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:83) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class k460 {
    /* JADX INFO: Fake field, exist only in values array */
    EVENTS(0L),
    /* JADX INFO: Fake field, exist only in values array */
    TEAMS(1L),
    /* JADX INFO: Fake field, exist only in values array */
    CHAMPS(2L),
    /* JADX INFO: Fake field, exist only in values array */
    TRACKED(3L),
    XGAMES(4L),
    AGGREGATOR(5L),
    /* JADX INFO: Fake field, exist only in values array */
    VIEWED(6L);

    public static final /* synthetic */ c0o e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f17654a;

    static {
        e = new c0o(k460VarArr);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [byte, int] */
    public k460(long j) {
        super(str, i);
        this.f17654a = (int) j;
    }

    public static k460 valueOf(String str) {
        return (k460) Enum.valueOf(k460.class, str);
    }

    public static k460[] values() {
        return (k460[]) d.clone();
    }
}
