package a;

import org.xbet.client1.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.esj0[], still in use, count: 1, list:
  (r0v1 a.esj0[]) from 0x0029: CONSTRUCTOR (r0v1 a.esj0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:42) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class esj0 {
    /* JADX INFO: Fake field, exist only in values array */
    DISTANCE(R.string.ufc_shot_map_distance),
    /* JADX INFO: Fake field, exist only in values array */
    CLINCH(R.string.ufc_shot_map_clinch),
    /* JADX INFO: Fake field, exist only in values array */
    GROUND(R.string.ufc_shot_map_ground);

    public static final /* synthetic */ c0o c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8331a;

    static {
        c = new c0o(esj0VarArr);
    }

    public esj0(int i) {
        super(str, i);
        this.f8331a = i;
    }

    public static esj0 valueOf(String str) {
        return (esj0) Enum.valueOf(esj0.class, str);
    }

    public static esj0[] values() {
        return (esj0[]) b.clone();
    }
}
