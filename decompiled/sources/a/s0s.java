package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.s0s[], still in use, count: 1, list:
  (r0v1 a.s0s[]) from 0x0058: CONSTRUCTOR (r0v1 a.s0s[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:89) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class s0s {
    ONE_X_LIVE_AGGREGATOR(75L),
    POPULAR(17L),
    RECOMMENDED(-1L),
    LIVE_AGGREGATOR(37L),
    /* JADX INFO: Fake field, exist only in values array */
    SLOTS(1L),
    /* JADX INFO: Fake field, exist only in values array */
    CRASH_POPULAR(149L),
    UNKNOWN(-2L);

    public static final /* synthetic */ c0o h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31424a;

    static {
        h = new c0o(s0sVarArr);
    }

    public s0s(long j) {
        super(str, i);
        this.f31424a = j;
    }

    public static s0s valueOf(String str) {
        return (s0s) Enum.valueOf(s0s.class, str);
    }

    public static s0s[] values() {
        return (s0s[]) g.clone();
    }
}
