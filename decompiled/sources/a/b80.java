package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v21 a.b80[], still in use, count: 1, list:
  (r0v21 a.b80[]) from 0x010b: CONSTRUCTOR (r0v21 a.b80[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:268) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes2.dex */
@ahi0(with = c80.class)
public final class b80 {
    UNKNOWN("unknown"),
    /* JADX INFO: Fake field, exist only in values array */
    ZERO("0"),
    /* JADX INFO: Fake field, exist only in values array */
    ONE("1"),
    /* JADX INFO: Fake field, exist only in values array */
    TWO("2"),
    /* JADX INFO: Fake field, exist only in values array */
    THREE("3"),
    /* JADX INFO: Fake field, exist only in values array */
    FOUR("4"),
    /* JADX INFO: Fake field, exist only in values array */
    FIVE("5"),
    /* JADX INFO: Fake field, exist only in values array */
    SIX("6"),
    /* JADX INFO: Fake field, exist only in values array */
    SEVEN("7"),
    /* JADX INFO: Fake field, exist only in values array */
    EIGHT("8"),
    /* JADX INFO: Fake field, exist only in values array */
    NINE("9"),
    /* JADX INFO: Fake field, exist only in values array */
    TEN("10"),
    /* JADX INFO: Fake field, exist only in values array */
    ELEVEN("11"),
    /* JADX INFO: Fake field, exist only in values array */
    TWELVE("12"),
    /* JADX INFO: Fake field, exist only in values array */
    FIRST_HALF("13"),
    /* JADX INFO: Fake field, exist only in values array */
    LAST_HALF("14"),
    /* JADX INFO: Fake field, exist only in values array */
    LOW("15"),
    /* JADX INFO: Fake field, exist only in values array */
    MIDDLE("16"),
    /* JADX INFO: Fake field, exist only in values array */
    HIGH("17"),
    /* JADX INFO: Fake field, exist only in values array */
    RED("18"),
    /* JADX INFO: Fake field, exist only in values array */
    BLACK("19");

    public static final a80 Companion = new a80();
    public static final /* synthetic */ c0o d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2133a;

    static {
        d = new c0o(new b80[]{r1, new b80("0"), new b80("1"), new b80("2"), new b80("3"), new b80("4"), new b80("5"), new b80("6"), new b80("7"), new b80("8"), new b80("9"), new b80("10"), new b80("11"), new b80("12"), new b80("13"), new b80("14"), new b80("15"), new b80("16"), new b80("17"), new b80("18"), new b80("19")});
    }

    public b80(String str) {
        super(str, i);
        this.f2133a = str;
    }

    public static b80 valueOf(String str) {
        return (b80) Enum.valueOf(b80.class, str);
    }

    public static b80[] values() {
        return (b80[]) c.clone();
    }
}
