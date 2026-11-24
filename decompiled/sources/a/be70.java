package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.be70[], still in use, count: 1, list:
  (r0v1 a.be70[]) from 0x0026: CONSTRUCTOR (r0v1 a.be70[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:39) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@ahi0(with = ce70.class)
public final class be70 {
    /* JADX INFO: Fake field, exist only in values array */
    ENABLED("1"),
    /* JADX INFO: Fake field, exist only in values array */
    UNDER_MAINTENANCE("2"),
    /* JADX INFO: Fake field, exist only in values array */
    DISABLED("3");

    public static final ae70 Companion = new ae70();
    public static final /* synthetic */ c0o c = new c0o(new be70[]{new be70("1"), new be70("2"), new be70("3")});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2435a;

    static {
    }

    public be70(String str) {
        super(str, i);
        this.f2435a = str;
    }

    public static be70 valueOf(String str) {
        return (be70) Enum.valueOf(be70.class, str);
    }

    public static be70[] values() {
        return (be70[]) b.clone();
    }
}
