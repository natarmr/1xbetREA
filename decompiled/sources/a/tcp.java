package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.tcp[], still in use, count: 1, list:
  (r0v1 a.tcp[]) from 0x0062: CONSTRUCTOR (r0v1 a.tcp[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:99) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class tcp {
    GAMES(0),
    OTHER(1),
    TRACKING(2),
    VIEWED(3),
    CASINO(4),
    TEAM(5),
    CHAMPION(6),
    ONE_X_GAMES(7),
    /* JADX INFO: Fake field, exist only in values array */
    NO_TAG(-1);

    public static final /* synthetic */ c0o k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f33727a;

    static {
        k = new c0o(tcpVarArr);
    }

    public tcp(int i) {
        super(str, i);
        this.f33727a = i;
    }

    public static tcp valueOf(String str) {
        return (tcp) Enum.valueOf(tcp.class, str);
    }

    public static tcp[] values() {
        return (tcp[]) j.clone();
    }
}
