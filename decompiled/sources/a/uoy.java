package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.uoy[], still in use, count: 1, list:
  (r0v1 a.uoy[]) from 0x005d: CONSTRUCTOR (r0v1 a.uoy[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:94) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class uoy {
    UNKNOWN(0),
    LIVE(1),
    /* JADX INFO: Fake field, exist only in values array */
    LIVE_LINE(2),
    LINE(3),
    /* JADX INFO: Fake field, exist only in values array */
    ZONE_PLAY(4),
    FINANCE_365(6),
    BONUS(7),
    /* JADX INFO: Fake field, exist only in values array */
    BM(8),
    /* JADX INFO: Fake field, exist only in values array */
    BM_LIVE(9);

    public static final tqt b = new tqt();
    public static final /* synthetic */ c0o i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f36034a;

    static {
        i = new c0o(new uoy[]{r0, r1, r2, r3, r4, r5, r6, new uoy(8), new uoy(9)});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public uoy(int i2) {
        super(str, i);
        this.f36034a = i2;
    }

    public static uoy valueOf(String str) {
        return (uoy) Enum.valueOf(uoy.class, str);
    }

    public static uoy[] values() {
        return (uoy[]) h.clone();
    }
}
