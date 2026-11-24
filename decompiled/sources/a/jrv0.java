package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.jrv0[], still in use, count: 1, list:
  (r0v1 a.jrv0[]) from 0x0038: CONSTRUCTOR (r0v1 a.jrv0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:57) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes2.dex */
public final class jrv0 {
    OBJ('{', '}'),
    LIST('[', ']'),
    MAP('{', '}'),
    POLY_OBJ('[', ']');

    public static final /* synthetic */ c0o h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f17023a;
    public final char b;

    static {
        h = new c0o(jrv0VarArr);
    }

    public jrv0(char c, char c2) {
        super(str, i);
        this.f17023a = c;
        this.b = c2;
    }

    public static jrv0 valueOf(String str) {
        return (jrv0) Enum.valueOf(jrv0.class, str);
    }

    public static jrv0[] values() {
        return (jrv0[]) g.clone();
    }
}
