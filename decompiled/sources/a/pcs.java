package a;

import org.xbet.client1.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.pcs[], still in use, count: 1, list:
  (r0v1 a.pcs[]) from 0x002f: CONSTRUCTOR (r0v1 a.pcs[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:48) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class pcs {
    /* JADX INFO: Fake field, exist only in values array */
    WIN_METHOD(R.string.method_of_win, 1L),
    /* JADX INFO: Fake field, exist only in values array */
    SIG_STR(R.string.significant_hits, 2L),
    /* JADX INFO: Fake field, exist only in values array */
    GRAPPLING(R.string.grappling, 3L);

    public static final /* synthetic */ c0o d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f26774a;
    public final int b;

    static {
        d = new c0o(pcsVarArr);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [byte, int] */
    public pcs(int i, long j) {
        super(str, i);
        this.f26774a = (int) j;
        this.b = i;
    }

    public static pcs valueOf(String str) {
        return (pcs) Enum.valueOf(pcs.class, str);
    }

    public static pcs[] values() {
        return (pcs[]) c.clone();
    }
}
