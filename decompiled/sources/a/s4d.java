package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.s4d[], still in use, count: 1, list:
  (r0v1 a.s4d[]) from 0x0027: CONSTRUCTOR (r0v1 a.s4d[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:40) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class s4d {
    TWO_TONE(1),
    TONE_1(2),
    TONE_2(3);

    public static final r4d b = new r4d();
    public static final /* synthetic */ c0o g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f31599a;

    static {
        g = new c0o(new s4d[]{r0, r1, r2});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public s4d(int i) {
        super(str, i);
        this.f31599a = i;
    }

    public static s4d valueOf(String str) {
        return (s4d) Enum.valueOf(s4d.class, str);
    }

    public static s4d[] values() {
        return (s4d[]) f.clone();
    }
}
