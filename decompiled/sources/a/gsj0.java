package a;

import org.xbet.client1.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.gsj0[], still in use, count: 1, list:
  (r0v1 a.gsj0[]) from 0x002f: CONSTRUCTOR (r0v1 a.gsj0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:48) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class gsj0 {
    /* JADX INFO: Fake field, exist only in values array */
    HEAD(R.string.ufc_shot_map_head, aph.f1252a),
    /* JADX INFO: Fake field, exist only in values array */
    BODY(R.string.ufc_shot_map_body, aph.b),
    /* JADX INFO: Fake field, exist only in values array */
    LEGS(R.string.ufc_shot_map_legs, aph.c);

    public static final /* synthetic */ c0o d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11833a;
    public final aph b;

    static {
        d = new c0o(gsj0VarArr);
    }

    public gsj0(int i, aph aphVar) {
        super(str, i);
        this.f11833a = i;
        this.b = aphVar;
    }

    public static gsj0 valueOf(String str) {
        return (gsj0) Enum.valueOf(gsj0.class, str);
    }

    public static gsj0[] values() {
        return (gsj0[]) c.clone();
    }
}
