package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.j3q[], still in use, count: 1, list:
  (r0v1 a.j3q[]) from 0x003a: CONSTRUCTOR (r0v1 a.j3q[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:59) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class j3q {
    /* JADX INFO: Fake field, exist only in values array */
    ALL_STATUS(-100),
    /* JADX INFO: Fake field, exist only in values array */
    ALL_BET_TYPE(-200),
    /* JADX INFO: Fake field, exist only in values array */
    PERIOD_DAY(-300),
    /* JADX INFO: Fake field, exist only in values array */
    PERIOD_FULL(-400),
    /* JADX INFO: Fake field, exist only in values array */
    PERIOD_SELECT(-500);

    public static final /* synthetic */ c0o c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f15849a;

    static {
        c = new c0o(j3qVarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j3q(int i) {
        super(str, i);
        this.f15849a = i;
    }

    public static j3q valueOf(String str) {
        return (j3q) Enum.valueOf(j3q.class, str);
    }

    public static j3q[] values() {
        return (j3q[]) b.clone();
    }
}
