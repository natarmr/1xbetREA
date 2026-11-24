package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.eg30[], still in use, count: 1, list:
  (r0v1 a.eg30[]) from 0x005a: CONSTRUCTOR (r0v1 a.eg30[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:91) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@ahi0(with = fg30.class)
public final class eg30 {
    UNKNOWN("unknown"),
    /* JADX INFO: Fake field, exist only in values array */
    MATCH_INTERRUPTED("1"),
    /* JADX INFO: Fake field, exist only in values array */
    MATCH_POSTPONED("2"),
    /* JADX INFO: Fake field, exist only in values array */
    MATCH_DETAIL_BEING_CONFIRMED("3"),
    /* JADX INFO: Fake field, exist only in values array */
    MATCH_CANCELED_WITH_RULES("4"),
    /* JADX INFO: Fake field, exist only in values array */
    OPPONENTS_WITHDRAWAL("5"),
    /* JADX INFO: Fake field, exist only in values array */
    MATCH_CANCELED("6"),
    /* JADX INFO: Fake field, exist only in values array */
    MATCH_INTERRUPTED_INFORMATION_CLARIFIED("7");

    public static final dg30 Companion = new dg30();
    public static final /* synthetic */ c0o d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7742a;

    static {
        d = new c0o(new eg30[]{r0, new eg30("1"), new eg30("2"), new eg30("3"), new eg30("4"), new eg30("5"), new eg30("6"), new eg30("7")});
    }

    public eg30(String str) {
        super(str, i);
        this.f7742a = str;
    }

    public static eg30 valueOf(String str) {
        return (eg30) Enum.valueOf(eg30.class, str);
    }

    public static eg30[] values() {
        return (eg30[]) c.clone();
    }
}
