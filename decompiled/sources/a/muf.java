package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.muf[], still in use, count: 1, list:
  (r0v1 a.muf[]) from 0x0028: CONSTRUCTOR (r0v1 a.muf[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:41) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes5.dex */
@ahi0(with = nuf.class)
public final class muf {
    /* JADX INFO: Fake field, exist only in values array */
    EMPTY("0"),
    /* JADX INFO: Fake field, exist only in values array */
    FAST_IDENTIFICATION("1"),
    UNKNOWN("2");

    public static final luf Companion = new luf();
    public static final /* synthetic */ c0o d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22410a;

    static {
        d = new c0o(new muf[]{r0, r1, r2});
    }

    public muf(String str) {
        super(str, i);
        this.f22410a = str;
    }

    public static muf valueOf(String str) {
        return (muf) Enum.valueOf(muf.class, str);
    }

    public static muf[] values() {
        return (muf[]) c.clone();
    }
}
