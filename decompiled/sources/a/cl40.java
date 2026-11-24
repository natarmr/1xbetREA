package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.cl40[], still in use, count: 1, list:
  (r0v1 a.cl40[]) from 0x0026: CONSTRUCTOR (r0v1 a.cl40[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:39) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes4.dex */
public final class cl40 {
    BLUE(1),
    RED(2),
    UNKNOWN(0);

    public static final /* synthetic */ c0o f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f4539a;

    static {
        f = new c0o(cl40VarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public cl40(int i) {
        super(str, i);
        this.f4539a = i;
    }

    public static cl40 valueOf(String str) {
        return (cl40) Enum.valueOf(cl40.class, str);
    }

    public static cl40[] values() {
        return (cl40[]) e.clone();
    }
}
