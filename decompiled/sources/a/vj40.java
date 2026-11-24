package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.vj40[], still in use, count: 1, list:
  (r0v1 a.vj40[]) from 0x001c: CONSTRUCTOR (r0v1 a.vj40[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:29) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class vj40 {
    /* JADX INFO: Fake field, exist only in values array */
    STATISTIC(1L),
    /* JADX INFO: Fake field, exist only in values array */
    ITEMS(2L);

    public static final /* synthetic */ c0o c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f37510a;

    static {
        c = new c0o(vj40VarArr);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [byte, int] */
    public vj40(long j) {
        super(str, i);
        this.f37510a = (int) j;
    }

    public static vj40 valueOf(String str) {
        return (vj40) Enum.valueOf(vj40.class, str);
    }

    public static vj40[] values() {
        return (vj40[]) b.clone();
    }
}
