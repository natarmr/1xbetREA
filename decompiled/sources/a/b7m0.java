package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.b7m0[], still in use, count: 1, list:
  (r0v1 a.b7m0[]) from 0x0028: CONSTRUCTOR (r0v1 a.b7m0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:41) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@ahi0(with = c7m0.class)
public final class b7m0 {
    UNKNOWN("0"),
    /* JADX INFO: Fake field, exist only in values array */
    YELLOW_CARDS("26"),
    /* JADX INFO: Fake field, exist only in values array */
    RED_CARDS("71");

    public static final a7m0 Companion = new a7m0();
    public static final /* synthetic */ c0o d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2117a;

    static {
        d = new c0o(new b7m0[]{r0, new b7m0("26"), new b7m0("71")});
    }

    public b7m0(String str) {
        super(str, i);
        this.f2117a = str;
    }

    public static b7m0 valueOf(String str) {
        return (b7m0) Enum.valueOf(b7m0.class, str);
    }

    public static b7m0[] values() {
        return (b7m0[]) c.clone();
    }
}
