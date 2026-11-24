package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.mfg0[], still in use, count: 1, list:
  (r0v1 a.mfg0[]) from 0x001e: CONSTRUCTOR (r0v1 a.mfg0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:31) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@ahi0(with = nfg0.class)
public final class mfg0 {
    EUROPEAN("1"),
    /* JADX INFO: Fake field, exist only in values array */
    AMERICAN("2");

    public static final lfg0 Companion = new lfg0();
    public static final /* synthetic */ c0o d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21693a;

    static {
        d = new c0o(new mfg0[]{r0, new mfg0("2")});
    }

    public mfg0(String str) {
        super(str, i);
        this.f21693a = str;
    }

    public static mfg0 valueOf(String str) {
        return (mfg0) Enum.valueOf(mfg0.class, str);
    }

    public static mfg0[] values() {
        return (mfg0[]) c.clone();
    }
}
