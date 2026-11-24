package a;

import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.sh60[], still in use, count: 1, list:
  (r0v1 a.sh60[]) from 0x0011: CONSTRUCTOR (r0v1 a.sh60[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:18) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class sh60 {
    b;

    public static final /* synthetic */ c0o d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f32197a;

    static {
        d = new c0o(sh60VarArr);
    }

    public sh60() {
        super("PopularSports", 0);
        this.f32197a = c0oVar;
    }

    public static sh60 valueOf(String str) {
        return (sh60) Enum.valueOf(sh60.class, str);
    }

    public static sh60[] values() {
        return (sh60[]) c.clone();
    }
}
