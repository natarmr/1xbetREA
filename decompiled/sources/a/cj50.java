package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.cj50[], still in use, count: 1, list:
  (r0v1 a.cj50[]) from 0x0038: CONSTRUCTOR (r0v1 a.cj50[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:57) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class cj50 {
    YELLOW_CARDS(26L),
    RED_CARDS(71L),
    CORNERS(70L),
    UNKNOWN(-1L);

    public static final evz b = new evz();
    public static final /* synthetic */ c0o h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4443a;

    static {
        h = new c0o(new cj50[]{r0, r1, r2, r3});
    }

    public cj50(long j) {
        super(str, i);
        this.f4443a = j;
    }

    public static cj50 valueOf(String str) {
        return (cj50) Enum.valueOf(cj50.class, str);
    }

    public static cj50[] values() {
        return (cj50[]) g.clone();
    }
}
