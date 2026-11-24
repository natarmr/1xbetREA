package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.yk0[], still in use, count: 1, list:
  (r0v1 a.yk0[]) from 0x001c: CONSTRUCTOR (r0v1 a.yk0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:29) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class yk0 {
    FAVORITES(0),
    VIEWED(1);

    public static final /* synthetic */ c0o e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f42763a;

    static {
        e = new c0o(yk0VarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public yk0(int i) {
        super(str, i);
        this.f42763a = i;
    }

    public static yk0 valueOf(String str) {
        return (yk0) Enum.valueOf(yk0.class, str);
    }

    public static yk0[] values() {
        return (yk0[]) d.clone();
    }
}
