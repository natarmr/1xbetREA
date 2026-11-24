package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.vi10[], still in use, count: 1, list:
  (r0v1 a.vi10[]) from 0x002a: CONSTRUCTOR (r0v1 a.vi10[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:43) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes.dex */
public final class vi10 {
    AVAILABLE("0"),
    /* JADX INFO: Fake field, exist only in values array */
    UNAVAILABLE("1"),
    AWAITING("2");

    public static final /* synthetic */ c0o e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37455a;

    static {
        e = new c0o(vi10VarArr);
    }

    public vi10(String str) {
        super(str, i);
        this.f37455a = str;
    }

    public static vi10 valueOf(String str) {
        return (vi10) Enum.valueOf(vi10.class, str);
    }

    public static vi10[] values() {
        return (vi10[]) d.clone();
    }
}
