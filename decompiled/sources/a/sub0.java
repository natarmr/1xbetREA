package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.sub0[], still in use, count: 1, list:
  (r0v1 a.sub0[]) from 0x003b: CONSTRUCTOR (r0v1 a.sub0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:60) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class sub0 {
    DEFAULT(1),
    SUCCESS(2),
    CLIENT_ERROR(3),
    SERVER_ERROR(4),
    ERROR(5);

    public static final nh70 b = new nh70();
    public static final /* synthetic */ c0o i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f32812a;

    static {
        i = new c0o(new sub0[]{r0, r1, r2, r3, r4});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public sub0(int i2) {
        super(str, i);
        this.f32812a = i2;
    }

    public static sub0 valueOf(String str) {
        return (sub0) Enum.valueOf(sub0.class, str);
    }

    public static sub0[] values() {
        return (sub0[]) h.clone();
    }
}
