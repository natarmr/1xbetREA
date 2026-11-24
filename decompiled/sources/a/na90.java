package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.na90[], still in use, count: 1, list:
  (r0v1 a.na90[]) from 0x0034: CONSTRUCTOR (r0v1 a.na90[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:53) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@ahi0(with = oa90.class)
public final class na90 {
    /* JADX INFO: Fake field, exist only in values array */
    PAYMENT_IMMEDIATELY("1"),
    /* JADX INFO: Fake field, exist only in values array */
    PAYMENT_AFTER_ROLEPLAYING("2"),
    PAYMENT_AFTER_DEPOSIT("3"),
    UNKNOWN("0");

    public static final ma90 Companion = new ma90();
    public static final /* synthetic */ c0o e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f23180a;

    static {
        e = new c0o(new na90[]{r0, r1, r2, r3});
    }

    public na90(String str) {
        super(str, i);
        this.f23180a = str;
    }

    public static na90 valueOf(String str) {
        return (na90) Enum.valueOf(na90.class, str);
    }

    public static na90[] values() {
        return (na90[]) d.clone();
    }
}
