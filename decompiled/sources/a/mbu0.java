package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.mbu0[], still in use, count: 1, list:
  (r0v1 a.mbu0[]) from 0x0060: CONSTRUCTOR (r0v1 a.mbu0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:97) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class mbu0 {
    UNKNOWN(-1),
    OPTIONS(0),
    EXTERNAL_LINK(3),
    NOMAPAY(4),
    BACK_OFFICE(7),
    SUM_SUB(8),
    SMART_ID(9),
    MOBILE_ID(10);

    public static final svs0 b = new svs0(8);
    public static final /* synthetic */ c0o l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21524a;

    static {
        l = new c0o(new mbu0[]{r0, r1, r2, r3, r4, r5, r6, r7});
    }

    public mbu0(int i) {
        super(str, i);
        this.f21524a = i;
    }

    public static mbu0 valueOf(String str) {
        return (mbu0) Enum.valueOf(mbu0.class, str);
    }

    public static mbu0[] values() {
        return (mbu0[]) k.clone();
    }
}
