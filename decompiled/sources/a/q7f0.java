package a;

import java.util.LinkedHashMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.q7f0[], still in use, count: 1, list:
  (r0v1 a.q7f0[]) from 0x003c: CONSTRUCTOR (r1v2 a.c0o) = (r0v1 a.q7f0[]) A[MD:(java.lang.Enum[]):void (m)] (LINE:61) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class q7f0 {
    FULL(1),
    PHONE(2),
    ONE_CLICK(3),
    SOCIAL(4),
    REGULATOR(8);

    public static final gne0 b;
    public static final LinkedHashMap c;
    public static final /* synthetic */ c0o j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f28247a;

    static {
        byte b2 = 0;
        c0o c0oVar = new c0o(q7f0VarArr);
        j = c0oVar;
        b = new gne0((byte) 4);
        int iA = wp20.a(r3d.q(c0oVar, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        y2 y2Var = new y2(c0oVar, b2);
        while (y2Var.hasNext()) {
            Object next = y2Var.next();
            linkedHashMap.put(Integer.valueOf(((q7f0) next).f28247a), next);
        }
        c = linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q7f0(int i2) {
        super(str, i);
        this.f28247a = i2;
    }

    public static q7f0 valueOf(String str) {
        return (q7f0) Enum.valueOf(q7f0.class, str);
    }

    public static q7f0[] values() {
        return (q7f0[]) i.clone();
    }
}
