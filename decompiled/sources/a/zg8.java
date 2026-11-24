package a;

import java.util.LinkedHashMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.zg8[], still in use, count: 1, list:
  (r0v1 a.zg8[]) from 0x0021: CONSTRUCTOR (r1v2 a.c0o) = (r0v1 a.zg8[]) A[MD:(java.lang.Enum[]):void (m)] (LINE:34) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class zg8 {
    /* JADX INFO: Fake field, exist only in values array */
    NONE(-1),
    /* JADX INFO: Fake field, exist only in values array */
    SPORT(0),
    /* JADX INFO: Fake field, exist only in values array */
    CASINO_AND_GAMES(1);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44331a;

    static {
        c0o c0oVar = new c0o(zg8VarArr);
        int iA = wp20.a(r3d.q(c0oVar, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        y2 y2Var = new y2(c0oVar, (byte) 0);
        while (y2Var.hasNext()) {
            Object next = y2Var.next();
            linkedHashMap.put(Integer.valueOf(((zg8) next).f44331a), next);
        }
    }

    public zg8(int i) {
        super(str, i);
        this.f44331a = i;
    }

    public static zg8 valueOf(String str) {
        return (zg8) Enum.valueOf(zg8.class, str);
    }

    public static zg8[] values() {
        return (zg8[]) b.clone();
    }
}
