package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.t540[], still in use, count: 1, list:
  (r0v1 a.t540[]) from 0x0046: CONSTRUCTOR (r0v1 a.t540[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:71) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class t540 {
    /* JADX INFO: Fake field, exist only in values array */
    CLIENT_CALLED("ClientCalled"),
    /* JADX INFO: Fake field, exist only in values array */
    UNSEAT_ALL_OPERATORS("UnsetAllOperators"),
    /* JADX INFO: Fake field, exist only in values array */
    BOT_CALLED("BotCalled"),
    /* JADX INFO: Fake field, exist only in values array */
    TIMEOUT("Timeout"),
    /* JADX INFO: Fake field, exist only in values array */
    NO_ONLINE("NoOnline"),
    NO_REASON("NoReason");

    public static final /* synthetic */ c0o d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33351a;

    static {
        d = new c0o(t540VarArr);
    }

    public t540(String str) {
        super(str, i);
        this.f33351a = str;
    }

    public static t540 valueOf(String str) {
        return (t540) Enum.valueOf(t540.class, str);
    }

    public static t540[] values() {
        return (t540[]) c.clone();
    }
}
