package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.sw5[], still in use, count: 1, list:
  (r0v1 a.sw5[]) from 0x0038: CONSTRUCTOR (r0v1 a.sw5[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:57) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class sw5 {
    /* JADX INFO: Fake field, exist only in values array */
    ROUND_ZERO(0),
    ROUND_8(1),
    ROUND_16(2),
    ROUND_360(3),
    ROUND_12(4);

    public static final cl5 b = new cl5((byte) 2);
    public static final /* synthetic */ c0o h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f32903a;

    static {
        h = new c0o(new sw5[]{r0, r1, r2, r3, r4});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public sw5(int i) {
        super(str, i);
        this.f32903a = i;
    }

    public static sw5 valueOf(String str) {
        return (sw5) Enum.valueOf(sw5.class, str);
    }

    public static sw5[] values() {
        return (sw5[]) g.clone();
    }
}
