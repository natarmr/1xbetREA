package a;

import org.xbet.client1.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.vgc0[], still in use, count: 1, list:
  (r0v1 a.vgc0[]) from 0x0022: CONSTRUCTOR (r0v1 a.vgc0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:35) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class vgc0 {
    PROMO_SHOP(R.string.shop),
    PROMO_LIST(R.string.my_promo_codes);

    public static final jh70 b = new jh70();
    public static final /* synthetic */ c0o f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37375a;

    static {
        f = new c0o(new vgc0[]{r0, r1});
    }

    public vgc0(int i) {
        super(str, i);
        this.f37375a = i;
    }

    public static vgc0 valueOf(String str) {
        return (vgc0) Enum.valueOf(vgc0.class, str);
    }

    public static vgc0[] values() {
        return (vgc0[]) e.clone();
    }
}
