package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.hql0[], still in use, count: 1, list:
  (r0v1 a.hql0[]) from 0x001c: CONSTRUCTOR (r0v1 a.hql0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:29) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes6.dex */
public final class hql0 {
    RIGHT(0),
    LEFT(1);

    public static final gne0 b = new gne0((byte) 27);
    public static final /* synthetic */ c0o f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13490a;

    static {
        f = new c0o(new hql0[]{r0, r1});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public hql0(int i) {
        super(str, i);
        this.f13490a = i;
    }

    public static hql0 valueOf(String str) {
        return (hql0) Enum.valueOf(hql0.class, str);
    }

    public static hql0[] values() {
        return (hql0[]) e.clone();
    }
}
