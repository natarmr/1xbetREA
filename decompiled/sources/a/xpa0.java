package a;

import java.util.LinkedHashMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.xpa0[], still in use, count: 1, list:
  (r0v1 a.xpa0[]) from 0x0025: CONSTRUCTOR (r1v2 a.c0o) = (r0v1 a.xpa0[]) A[MD:(java.lang.Enum[]):void (m)] (LINE:38) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class xpa0 {
    YES(1),
    /* JADX INFO: Fake field, exist only in values array */
    NO(2),
    NONE(-1);

    public static final rl70 b;
    public static final LinkedHashMap c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41260a;

    static {
        byte b2 = 0;
        c0o c0oVar = new c0o(xpa0VarArr);
        b = new rl70();
        int iA = wp20.a(r3d.q(c0oVar, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        y2 y2Var = new y2(c0oVar, b2);
        while (y2Var.hasNext()) {
            Object next = y2Var.next();
            linkedHashMap.put(Integer.valueOf(((xpa0) next).f41260a), next);
        }
        c = linkedHashMap;
    }

    public xpa0(int i) {
        super(str, i);
        this.f41260a = i;
    }

    public static xpa0 valueOf(String str) {
        return (xpa0) Enum.valueOf(xpa0.class, str);
    }

    public static xpa0[] values() {
        return (xpa0[]) f.clone();
    }
}
