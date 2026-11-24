package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.a3h[], still in use, count: 1, list:
  (r0v1 a.a3h[]) from 0x007b: CONSTRUCTOR (r0v1 a.a3h[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:124) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@ahi0(with = b3h.class)
public final class a3h {
    UNKNOWN("0"),
    /* JADX INFO: Fake field, exist only in values array */
    FIRST_EVENT("1"),
    /* JADX INFO: Fake field, exist only in values array */
    SECOND_EVENT("2"),
    /* JADX INFO: Fake field, exist only in values array */
    THIRD_EVENT("3"),
    /* JADX INFO: Fake field, exist only in values array */
    FOURTH_EVENT("4"),
    /* JADX INFO: Fake field, exist only in values array */
    FIFTH_EVENT("5"),
    /* JADX INFO: Fake field, exist only in values array */
    SIXTH_EVENT("6"),
    /* JADX INFO: Fake field, exist only in values array */
    SEVENTH_EVENT("7"),
    /* JADX INFO: Fake field, exist only in values array */
    EIGHTH_EVENT("8"),
    /* JADX INFO: Fake field, exist only in values array */
    NINTH_EVENT("9"),
    /* JADX INFO: Fake field, exist only in values array */
    TENTH_EVENT("10");

    public static final z2h Companion = new z2h();
    public static final /* synthetic */ c0o d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f171a;

    static {
        d = new c0o(new a3h[]{r0, new a3h("1"), new a3h("2"), new a3h("3"), new a3h("4"), new a3h("5"), new a3h("6"), new a3h("7"), new a3h("8"), new a3h("9"), new a3h("10")});
    }

    public a3h(String str) {
        super(str, i);
        this.f171a = str;
    }

    public static a3h valueOf(String str) {
        return (a3h) Enum.valueOf(a3h.class, str);
    }

    public static a3h[] values() {
        return (a3h[]) c.clone();
    }
}
