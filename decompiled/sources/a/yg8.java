package a;

import java.util.LinkedHashMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.yg8[], still in use, count: 1, list:
  (r0v1 a.yg8[]) from 0x0023: CONSTRUCTOR (r1v2 a.c0o) = (r0v1 a.yg8[]) A[MD:(java.lang.Enum[]):void (m)] (LINE:36) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class yg8 {
    NONE(-1),
    /* JADX INFO: Fake field, exist only in values array */
    SPORT(0),
    /* JADX INFO: Fake field, exist only in values array */
    CASINO_AND_GAMES(1);

    public static final kl5 b;
    public static final LinkedHashMap c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42574a;

    static {
        c0o c0oVar = new c0o(yg8VarArr);
        b = new kl5();
        int iA = wp20.a(r3d.q(c0oVar, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        y2 y2Var = new y2(c0oVar, (byte) 0);
        while (y2Var.hasNext()) {
            Object next = y2Var.next();
            linkedHashMap.put(Integer.valueOf(((yg8) next).f42574a), next);
        }
        c = linkedHashMap;
    }

    public yg8(int i) {
        super(str, i);
        this.f42574a = i;
    }

    public static yg8 valueOf(String str) {
        return (yg8) Enum.valueOf(yg8.class, str);
    }

    public static yg8[] values() {
        return (yg8[]) e.clone();
    }
}
