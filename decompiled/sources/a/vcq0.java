package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.vcq0[], still in use, count: 1, list:
  (r0v1 a.vcq0[]) from 0x0032: CONSTRUCTOR (r0v1 a.vcq0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:51) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@ahi0(with = wcq0.class)
public final class vcq0 {
    /* JADX INFO: Fake field, exist only in values array */
    SINGLE("1"),
    /* JADX INFO: Fake field, exist only in values array */
    DOUBLE("2"),
    /* JADX INFO: Fake field, exist only in values array */
    TREBLE("3"),
    UNKNOWN("0");

    public static final ucq0 Companion = new ucq0();
    public static final /* synthetic */ c0o d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f37199a;

    static {
        d = new c0o(new vcq0[]{r0, r1, r2, r3});
    }

    public vcq0(String str) {
        super(str, i);
        this.f37199a = str;
    }

    public static vcq0 valueOf(String str) {
        return (vcq0) Enum.valueOf(vcq0.class, str);
    }

    public static vcq0[] values() {
        return (vcq0[]) c.clone();
    }
}
