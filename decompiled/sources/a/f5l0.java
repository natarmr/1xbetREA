package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.f5l0[], still in use, count: 1, list:
  (r0v1 a.f5l0[]) from 0x0026: CONSTRUCTOR (r0v1 a.f5l0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:39) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class f5l0 implements fnf0 {
    SPORTS,
    EVENTS,
    EVENT_GROUPS;

    public static final /* synthetic */ c0o f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8967a;

    static {
        f = new c0o(f5l0VarArr);
    }

    public f5l0() {
        super(str, i);
        this.f8967a = name();
    }

    public static f5l0 valueOf(String str) {
        return (f5l0) Enum.valueOf(f5l0.class, str);
    }

    public static f5l0[] values() {
        return (f5l0[]) e.clone();
    }

    @Override // a.fnf0
    public final String a() {
        return this.f8967a;
    }
}
