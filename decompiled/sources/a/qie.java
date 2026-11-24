package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.qie[], still in use, count: 1, list:
  (r0v1 a.qie[]) from 0x006f: CONSTRUCTOR (r0v1 a.qie[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:112) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@ahi0(with = rie.class)
public final class qie {
    TEAM("1"),
    PLAYER("2"),
    /* JADX INFO: Fake field, exist only in values array */
    DATA("4"),
    POSITION_WITH_CHANGE("5"),
    POSITION("6"),
    /* JADX INFO: Fake field, exist only in values array */
    FORM("7"),
    /* JADX INFO: Fake field, exist only in values array */
    TOURNAMENT("9"),
    ICON("10"),
    UNKNOWN("0");

    public static final pie Companion = new pie();
    public static final /* synthetic */ c0o i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28787a;

    static {
        i = new c0o(new qie[]{r0, r1, r2, r3, r4, r5, r6, r7, r8});
    }

    public qie(String str) {
        super(str, i);
        this.f28787a = str;
    }

    public static qie valueOf(String str) {
        return (qie) Enum.valueOf(qie.class, str);
    }

    public static qie[] values() {
        return (qie[]) h.clone();
    }
}
