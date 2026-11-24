package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.i0d[], still in use, count: 1, list:
  (r0v1 a.i0d[]) from 0x0039: CONSTRUCTOR (r0v1 a.i0d[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:58) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class i0d {
    SIZE_1(1),
    SIZE_2(2),
    SIZE_3(3),
    /* JADX INFO: Fake field, exist only in values array */
    SIZE_4(4),
    SIZE_5(5);

    public static final h0d b = new h0d();
    public static final /* synthetic */ c0o h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f13944a;

    static {
        h = new c0o(new i0d[]{r0, r1, r2, r3, r4});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i0d(int i) {
        super(str, i);
        this.f13944a = i;
    }

    public static i0d valueOf(String str) {
        return (i0d) Enum.valueOf(i0d.class, str);
    }

    public static i0d[] values() {
        return (i0d[]) g.clone();
    }
}
