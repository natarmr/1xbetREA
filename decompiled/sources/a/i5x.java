package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.i5x[], still in use, count: 1, list:
  (r0v1 a.i5x[]) from 0x0046: CONSTRUCTOR (r0v1 a.i5x[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:71) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@ahi0(with = j5x.class)
public final class i5x {
    WAIT_FIRST_CARD("0"),
    /* JADX INFO: Fake field, exist only in values array */
    WAIT_SECOND_CARD("1"),
    /* JADX INFO: Fake field, exist only in values array */
    WAIT_THIRD_CARD("2"),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYER_ONE_WIN("4"),
    /* JADX INFO: Fake field, exist only in values array */
    PLAYER_TWO_WIN("5"),
    /* JADX INFO: Fake field, exist only in values array */
    DRAW("6");

    public static final h5x Companion = new h5x();
    public static final /* synthetic */ c0o d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14215a;

    static {
        d = new c0o(new i5x[]{r0, new i5x("1"), new i5x("2"), new i5x("4"), new i5x("5"), new i5x("6")});
    }

    public i5x(String str) {
        super(str, i);
        this.f14215a = str;
    }

    public static i5x valueOf(String str) {
        return (i5x) Enum.valueOf(i5x.class, str);
    }

    public static i5x[] values() {
        return (i5x[]) c.clone();
    }
}
