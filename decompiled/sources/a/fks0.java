package a;

import org.xbet.client1.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.fks0[], still in use, count: 1, list:
  (r0v1 a.fks0[]) from 0x0070: CONSTRUCTOR (r0v1 a.fks0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:113) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class fks0 {
    /* JADX INFO: Fake field, exist only in values array */
    Analytics(R.string.transfer_role_analytics),
    /* JADX INFO: Fake field, exist only in values array */
    Coach(R.string.transfer_role_coach),
    /* JADX INFO: Fake field, exist only in values array */
    Free(R.string.transfer_role_free),
    /* JADX INFO: Fake field, exist only in values array */
    Inactive(R.string.transfer_role_inactive),
    /* JADX INFO: Fake field, exist only in values array */
    Management(R.string.transfer_role_management),
    /* JADX INFO: Fake field, exist only in values array */
    Media(R.string.transfer_role_media),
    Retirement(R.string.transfer_role_retirement),
    /* JADX INFO: Fake field, exist only in values array */
    Substitute(R.string.transfer_role_substitute),
    Empty(R.string.empty_str);

    public static final g9m0 b = new g9m0();
    public static final /* synthetic */ c0o f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9708a;

    static {
        f = new c0o(new fks0[]{r0, r1, r2, r3, r4, r5, r6, r7, r8});
    }

    public fks0(int i) {
        super(str, i);
        this.f9708a = i;
    }

    public static fks0 valueOf(String str) {
        return (fks0) Enum.valueOf(fks0.class, str);
    }

    public static fks0[] values() {
        return (fks0[]) e.clone();
    }

    public final boolean a() {
        return this == Empty;
    }

    public final boolean b() {
        return this != Empty;
    }
}
