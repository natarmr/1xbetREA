package a;

import com.huawei.hms.android.HwBuildEx;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.n8k[], still in use, count: 1, list:
  (r0v1 a.n8k[]) from 0x0087: CONSTRUCTOR (r0v1 a.n8k[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:136) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class n8k {
    LIMIT_5000(5000),
    LIMIT_10000(HwBuildEx.VersionCodes.CUR_DEVELOPMENT),
    LIMIT_25000(25000),
    LIMIT_50000(50000),
    LIMIT_100000(100000),
    LIMIT_500000(500000),
    LIMIT_1000000(1000000),
    LIMIT_2500000(2500000),
    UNLIMITED(999999999),
    UNKNOWN(-1);

    public static final qud b = new qud();
    public static final /* synthetic */ c0o n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23093a;

    static {
        n = new c0o(new n8k[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9});
    }

    public n8k(int i) {
        super(str, i);
        this.f23093a = i;
    }

    public static n8k valueOf(String str) {
        return (n8k) Enum.valueOf(n8k.class, str);
    }

    public static n8k[] values() {
        return (n8k[]) m.clone();
    }
}
