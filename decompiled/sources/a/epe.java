package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.epe[], still in use, count: 1, list:
  (r0v1 a.epe[]) from 0x001e: CONSTRUCTOR (r0v1 a.epe[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:31) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class epe {
    HLTV("hltv"),
    /* JADX INFO: Fake field, exist only in values array */
    VALVE("valve");

    public static final /* synthetic */ c0o d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8183a;

    static {
        d = new c0o(epeVarArr);
    }

    public epe(String str) {
        super(str, i);
        this.f8183a = str;
    }

    public static epe valueOf(String str) {
        return (epe) Enum.valueOf(epe.class, str);
    }

    public static epe[] values() {
        return (epe[]) c.clone();
    }
}
