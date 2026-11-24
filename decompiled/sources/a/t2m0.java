package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.t2m0[], still in use, count: 1, list:
  (r0v1 a.t2m0[]) from 0x0058: CONSTRUCTOR (r0v1 a.t2m0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:89) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes6.dex */
public final class t2m0 {
    NO_COLOR(0),
    DarkBlue(1),
    GREEN(2),
    LIGHT_GREEN(3),
    YELLOW(4),
    LIGHT_YELLOW(5),
    LIGHT_RED(6),
    RED(7);

    public static final s2m0 b = new s2m0();
    public static final /* synthetic */ c0o l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f33223a;

    static {
        l = new c0o(new t2m0[]{r0, r1, r2, r3, r4, r5, r6, r7});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t2m0(int i) {
        super(str, i);
        this.f33223a = i;
    }

    public static t2m0 valueOf(String str) {
        return (t2m0) Enum.valueOf(t2m0.class, str);
    }

    public static t2m0[] values() {
        return (t2m0[]) k.clone();
    }
}
