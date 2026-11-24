package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.nuu0[], still in use, count: 1, list:
  (r0v1 a.nuu0[]) from 0x0040: CONSTRUCTOR (r0v1 a.nuu0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:65) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class nuu0 {
    INTERNAL(0),
    PRIVATE(1),
    PROTECTED(2),
    PUBLIC(3),
    /* JADX INFO: Fake field, exist only in values array */
    PRIVATE_TO_THIS(4),
    /* JADX INFO: Fake field, exist only in values array */
    LOCAL(5);

    public static final /* synthetic */ c0o g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ijq f24162a;

    static {
        g = new c0o(nuu0VarArr);
    }

    public nuu0(int i) {
        super(str, i);
        ljq ljqVar = njq.d;
        ljqVar.getClass();
        this.f24162a = new ijq(ljqVar, i);
    }

    public static nuu0 valueOf(String str) {
        return (nuu0) Enum.valueOf(nuu0.class, str);
    }

    public static nuu0[] values() {
        return (nuu0[]) f.clone();
    }
}
