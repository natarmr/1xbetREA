package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.d310[], still in use, count: 1, list:
  (r0v1 a.d310[]) from 0x0027: CONSTRUCTOR (r0v1 a.d310[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:40) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class d310 {
    RADIANT(1),
    DIRE(2),
    UNKNOWN(3);

    public static final /* synthetic */ c0o f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f5380a;

    static {
        f = new c0o(d310VarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d310(int i) {
        super(str, i);
        this.f5380a = i;
    }

    public static d310 valueOf(String str) {
        return (d310) Enum.valueOf(d310.class, str);
    }

    public static d310[] values() {
        return (d310[]) e.clone();
    }
}
