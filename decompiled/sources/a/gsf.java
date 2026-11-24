package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.gsf[], still in use, count: 1, list:
  (r0v1 a.gsf[]) from 0x001c: CONSTRUCTOR (r0v1 a.gsf[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:29) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@ahi0(with = hsf.class)
public final class gsf {
    /* JADX INFO: Fake field, exist only in values array */
    COUNTER_TERRORIST("1"),
    /* JADX INFO: Fake field, exist only in values array */
    TERRORIST("2");

    public static final fsf Companion = new fsf();
    public static final /* synthetic */ c0o c = new c0o(new gsf[]{new gsf("1"), new gsf("2")});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11827a;

    static {
    }

    public gsf(String str) {
        super(str, i);
        this.f11827a = str;
    }

    public static gsf valueOf(String str) {
        return (gsf) Enum.valueOf(gsf.class, str);
    }

    public static gsf[] values() {
        return (gsf[]) b.clone();
    }
}
