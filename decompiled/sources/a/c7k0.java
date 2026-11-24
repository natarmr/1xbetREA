package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.c7k0[], still in use, count: 1, list:
  (r0v1 a.c7k0[]) from 0x0032: CONSTRUCTOR (r0v1 a.c7k0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:51) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@ahi0(with = d7k0.class)
public final class c7k0 {
    /* JADX INFO: Fake field, exist only in values array */
    MAIN("0"),
    /* JADX INFO: Fake field, exist only in values array */
    STAVKA("1"),
    /* JADX INFO: Fake field, exist only in values array */
    KZ("2"),
    OTHER("3");

    public static final b7k0 Companion = new b7k0();
    public static final /* synthetic */ c0o d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3868a;

    static {
        d = new c0o(new c7k0[]{r0, r1, r2, r3});
    }

    public c7k0(String str) {
        super(str, i);
        this.f3868a = str;
    }

    public static c7k0 valueOf(String str) {
        return (c7k0) Enum.valueOf(c7k0.class, str);
    }

    public static c7k0[] values() {
        return (c7k0[]) c.clone();
    }
}
