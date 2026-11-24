package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.iz8[], still in use, count: 1, list:
  (r0v1 a.iz8[]) from 0x001e: CONSTRUCTOR (r0v1 a.iz8[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:31) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@ahi0(with = jz8.class)
public final class iz8 {
    /* JADX INFO: Fake field, exist only in values array */
    NOT_CONTRACTED("0"),
    CONTRACTED("1");

    public static final hz8 Companion = new hz8();
    public static final /* synthetic */ c0o d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15624a;

    static {
        d = new c0o(new iz8[]{r0, r1});
    }

    public iz8(String str) {
        super(str, i);
        this.f15624a = str;
    }

    public static iz8 valueOf(String str) {
        return (iz8) Enum.valueOf(iz8.class, str);
    }

    public static iz8[] values() {
        return (iz8[]) c.clone();
    }
}
