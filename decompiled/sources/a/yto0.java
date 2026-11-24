package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.yto0[], still in use, count: 1, list:
  (r0v1 a.yto0[]) from 0x0032: CONSTRUCTOR (r0v1 a.yto0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:51) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes2.dex */
public final class yto0 {
    /* JADX INFO: Fake field, exist only in values array */
    SPORT(0L),
    /* JADX INFO: Fake field, exist only in values array */
    CHAMP(1L),
    /* JADX INFO: Fake field, exist only in values array */
    GAME(2L),
    UNKNOWN(-1L);

    public static final g9m0 b = new g9m0();
    public static final /* synthetic */ c0o e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43230a;

    static {
        e = new c0o(new yto0[]{r0, r1, r2, r3});
    }

    public yto0(long j) {
        super(str, i);
        this.f43230a = j;
    }

    public static yto0 valueOf(String str) {
        return (yto0) Enum.valueOf(yto0.class, str);
    }

    public static yto0[] values() {
        return (yto0[]) d.clone();
    }
}
