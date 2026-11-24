package a;

import org.xbet.client1.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.l4b[], still in use, count: 1, list:
  (r0v1 a.l4b[]) from 0x0049: CONSTRUCTOR (r0v1 a.l4b[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:74) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes3.dex */
public final class l4b {
    ALL(R.string.tab_history_category_all),
    UPWARD(R.string.tab_history_category_up),
    DOWNWARD(R.string.tab_history_category_down),
    PROVISIONAL(R.string.tab_history_category_provisional),
    CLOSED(R.string.tab_history_category_cancel);

    public static final cl5 b = new cl5((byte) 19);
    public static final /* synthetic */ c0o i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19395a;

    static {
        i = new c0o(new l4b[]{r0, r1, r2, r3, r4});
    }

    public l4b(int i2) {
        super(str, i);
        this.f19395a = i2;
    }

    public static l4b valueOf(String str) {
        return (l4b) Enum.valueOf(l4b.class, str);
    }

    public static l4b[] values() {
        return (l4b[]) h.clone();
    }
}
