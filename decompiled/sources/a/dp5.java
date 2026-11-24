package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.dp5[], still in use, count: 1, list:
  (r0v1 a.dp5[]) from 0x001a: CONSTRUCTOR (r0v1 a.dp5[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:27) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class dp5 {
    THEME(0),
    /* JADX INFO: Fake field, exist only in values array */
    STATIC(1);

    public static final cl5 b = new cl5(1);
    public static final /* synthetic */ c0o e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6445a;

    static {
        e = new c0o(new dp5[]{r0, new dp5(1)});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dp5(int i) {
        super(str, i);
        this.f6445a = i;
    }

    public static dp5 valueOf(String str) {
        return (dp5) Enum.valueOf(dp5.class, str);
    }

    public static dp5[] values() {
        return (dp5[]) d.clone();
    }
}
