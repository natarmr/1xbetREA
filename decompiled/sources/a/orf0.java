package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.orf0[], still in use, count: 1, list:
  (r0v1 a.orf0[]) from 0x003c: CONSTRUCTOR (r0v1 a.orf0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:61) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@ahi0(with = prf0.class)
public final class orf0 {
    DYNAMITE("-1"),
    /* JADX INFO: Fake field, exist only in values array */
    EMPTY("0"),
    /* JADX INFO: Fake field, exist only in values array */
    CUP("1"),
    /* JADX INFO: Fake field, exist only in values array */
    GOLD("2"),
    /* JADX INFO: Fake field, exist only in values array */
    ALCOHOL("3");

    public static final nrf0 Companion = new nrf0();
    public static final /* synthetic */ c0o d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25734a;

    static {
        d = new c0o(new orf0[]{r0, new orf0("0"), new orf0("1"), new orf0("2"), new orf0("3")});
    }

    public orf0(String str) {
        super(str, i);
        this.f25734a = str;
    }

    public static orf0 valueOf(String str) {
        return (orf0) Enum.valueOf(orf0.class, str);
    }

    public static orf0[] values() {
        return (orf0[]) c.clone();
    }
}
