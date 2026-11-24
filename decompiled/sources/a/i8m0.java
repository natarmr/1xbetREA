package a;

import org.xbet.client1.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.i8m0[], still in use, count: 1, list:
  (r0v1 a.i8m0[]) from 0x005f: CONSTRUCTOR (r0v1 a.i8m0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:96) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class i8m0 {
    CHECK(R.drawable.ic_status_green_check_circle),
    /* JADX INFO: Fake field, exist only in values array */
    PLUS(R.drawable.ic_status_green_plus_circle),
    CROSS(R.drawable.ic_status_red_cross_circle),
    /* JADX INFO: Fake field, exist only in values array */
    MINUS(R.drawable.ic_status_red_minus_circle),
    WARNING_YELLOW(R.drawable.ic_status_yellow_warning_circle),
    WARNING_ORANGE(R.drawable.ic_status_orange_warning_circle),
    WARNING_RED(R.drawable.ic_status_red_warning_circle);

    public static final /* synthetic */ c0o h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14347a;

    static {
        h = new c0o(i8m0VarArr);
    }

    public i8m0(int i) {
        super(str, i);
        this.f14347a = i;
    }

    public static i8m0 valueOf(String str) {
        return (i8m0) Enum.valueOf(i8m0.class, str);
    }

    public static i8m0[] values() {
        return (i8m0[]) g.clone();
    }
}
