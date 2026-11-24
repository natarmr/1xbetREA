package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.yqt0[], still in use, count: 1, list:
  (r0v1 a.yqt0[]) from 0x000f: CONSTRUCTOR (r0v1 a.yqt0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:16) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class yqt0 implements fnf0 {
    USER_CONSENT;

    public static final /* synthetic */ c0o d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43092a;

    static {
        d = new c0o(yqt0VarArr);
    }

    public yqt0() {
        super("USER_CONSENT", 0);
        this.f43092a = name();
    }

    public static yqt0 valueOf(String str) {
        return (yqt0) Enum.valueOf(yqt0.class, str);
    }

    public static yqt0[] values() {
        return (yqt0[]) c.clone();
    }

    @Override // a.fnf0
    public final String a() {
        return this.f43092a;
    }
}
