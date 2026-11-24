package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.u540[], still in use, count: 1, list:
  (r0v1 a.u540[]) from 0x0028: CONSTRUCTOR (r0v1 a.u540[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:41) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class u540 {
    /* JADX INFO: Fake field, exist only in values array */
    LOW("Low"),
    /* JADX INFO: Fake field, exist only in values array */
    MEDIUM("Medium"),
    UNKNOWN("Unknown");

    public static final /* synthetic */ c0o d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35076a;

    static {
        d = new c0o(u540VarArr);
    }

    public u540(String str) {
        super(str, i);
        this.f35076a = str;
    }

    public static u540 valueOf(String str) {
        return (u540) Enum.valueOf(u540.class, str);
    }

    public static u540[] values() {
        return (u540[]) c.clone();
    }
}
