package a;

import java.util.LinkedHashMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.hgt[], still in use, count: 1, list:
  (r0v1 a.hgt[]) from 0x0023: CONSTRUCTOR (r1v2 a.c0o) = (r0v1 a.hgt[]) A[MD:(java.lang.Enum[]):void (m)] (LINE:36) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class hgt {
    NONE(-1),
    /* JADX INFO: Fake field, exist only in values array */
    MALE(1),
    /* JADX INFO: Fake field, exist only in values array */
    FEMALE(2);

    public static final pek b;
    public static final LinkedHashMap c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13029a;

    static {
        byte b2 = 0;
        c0o c0oVar = new c0o(hgtVarArr);
        b = new pek();
        int iA = wp20.a(r3d.q(c0oVar, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        y2 y2Var = new y2(c0oVar, b2);
        while (y2Var.hasNext()) {
            Object next = y2Var.next();
            linkedHashMap.put(Integer.valueOf(((hgt) next).f13029a), next);
        }
        c = linkedHashMap;
    }

    public hgt(int i) {
        super(str, i);
        this.f13029a = i;
    }

    public static hgt valueOf(String str) {
        return (hgt) Enum.valueOf(hgt.class, str);
    }

    public static hgt[] values() {
        return (hgt[]) e.clone();
    }
}
