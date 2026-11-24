package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.urv[], still in use, count: 1, list:
  (r0v1 a.urv[]) from 0x0039: CONSTRUCTOR (r0v1 a.urv[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:58) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class urv {
    SIZE_1(1),
    SIZE_2(2),
    SIZE_3(3),
    /* JADX INFO: Fake field, exist only in values array */
    SIZE_4(4),
    SIZE_5(5);

    public static final trv b = new trv();
    public static final /* synthetic */ c0o h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f36181a;

    static {
        h = new c0o(new urv[]{r0, r1, r2, r3, r4});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public urv(int i) {
        super(str, i);
        this.f36181a = i;
    }

    public static urv valueOf(String str) {
        return (urv) Enum.valueOf(urv.class, str);
    }

    public static urv[] values() {
        return (urv[]) g.clone();
    }
}
