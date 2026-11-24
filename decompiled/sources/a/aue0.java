package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.aue0[], still in use, count: 1, list:
  (r0v1 a.aue0[]) from 0x0021: CONSTRUCTOR (r0v1 a.aue0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:34) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class aue0 {
    c("DEFAULT"),
    d("AGGREGATOR");

    public static final cge0 b = new cge0((byte) 3);
    public static final /* synthetic */ c0o f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f1475a;

    static {
        f = new c0o(new aue0[]{r0, r1});
    }

    public aue0(String str) {
        super(str, i);
        this.f1475a = num;
    }

    public static aue0 valueOf(String str) {
        return (aue0) Enum.valueOf(aue0.class, str);
    }

    public static aue0[] values() {
        return (aue0[]) e.clone();
    }
}
