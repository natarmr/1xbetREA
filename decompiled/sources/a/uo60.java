package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.uo60[], still in use, count: 1, list:
  (r0v1 a.uo60[]) from 0x002c: CONSTRUCTOR (r0v1 a.uo60[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:45) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@ahi0(with = xpv0.class)
public final class uo60 {
    ENABLED("1"),
    UNDER_MAINTENANCE("2"),
    DISABLED("3");

    public static final to60 Companion = new to60();
    public static final /* synthetic */ c0o f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35997a;

    static {
        f = new c0o(new uo60[]{r0, r1, r2});
    }

    public uo60(String str) {
        super(str, i);
        this.f35997a = str;
    }

    public static uo60 valueOf(String str) {
        return (uo60) Enum.valueOf(uo60.class, str);
    }

    public static uo60[] values() {
        return (uo60[]) e.clone();
    }
}
