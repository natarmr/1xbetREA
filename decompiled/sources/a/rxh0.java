package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.rxh0[], still in use, count: 1, list:
  (r0v1 a.rxh0[]) from 0x0046: CONSTRUCTOR (r0v1 a.rxh0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:71) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@ahi0(with = sxh0.class)
public final class rxh0 {
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

    public static final qxh0 Companion = new qxh0();
    public static final /* synthetic */ c0o d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31265a;

    static {
        d = new c0o(new rxh0[]{r0, new rxh0("1"), new rxh0("2"), new rxh0("4"), new rxh0("5"), new rxh0("6")});
    }

    public rxh0(String str) {
        super(str, i);
        this.f31265a = str;
    }

    public static rxh0 valueOf(String str) {
        return (rxh0) Enum.valueOf(rxh0.class, str);
    }

    public static rxh0[] values() {
        return (rxh0[]) c.clone();
    }
}
