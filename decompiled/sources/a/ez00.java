package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.ez00[], still in use, count: 1, list:
  (r0v1 a.ez00[]) from 0x0025: CONSTRUCTOR (r0v1 a.ez00[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:38) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class ez00 {
    /* JADX INFO: Fake field, exist only in values array */
    RADIANT_ANCIENTS(7.28f, 84.3f, d310.RADIANT),
    /* JADX INFO: Fake field, exist only in values array */
    DIRE_ANCIENTS(84.3f, 7.28f, d310.DIRE);

    public static final /* synthetic */ c0o e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8649a;
    public final float b;
    public final d310 c;

    static {
        e = new c0o(ez00VarArr);
    }

    public ez00(float f, float f2, d310 d310Var) {
        super(str, i);
        this.f8649a = f;
        this.b = f2;
        this.c = d310Var;
    }

    public static ez00 valueOf(String str) {
        return (ez00) Enum.valueOf(ez00.class, str);
    }

    public static ez00[] values() {
        return (ez00[]) d.clone();
    }
}
