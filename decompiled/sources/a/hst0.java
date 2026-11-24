package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.hst0[], still in use, count: 1, list:
  (r0v1 a.hst0[]) from 0x001c: CONSTRUCTOR (r0v1 a.hst0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:29) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class hst0 implements fnf0 {
    USER,
    BALANCE;

    public static final /* synthetic */ c0o e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13601a;

    static {
        e = new c0o(hst0VarArr);
    }

    public hst0() {
        super(str, i);
        this.f13601a = name();
    }

    public static hst0 valueOf(String str) {
        return (hst0) Enum.valueOf(hst0.class, str);
    }

    public static hst0[] values() {
        return (hst0[]) d.clone();
    }

    @Override // a.fnf0
    public final String a() {
        return this.f13601a;
    }
}
