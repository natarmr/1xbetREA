package a;

import org.xbet.client1.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.urs[], still in use, count: 1, list:
  (r0v1 a.urs[]) from 0x0042: CONSTRUCTOR (r0v1 a.urs[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:67) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class urs {
    BY_POPULAR(R.string.byPopular, 0, "byPopular"),
    /* JADX INFO: Fake field, exist only in values array */
    COEFFICIENT_ASC(R.string.coefficient_asc, 1, "coefficient_asc"),
    /* JADX INFO: Fake field, exist only in values array */
    COEFFICIENT_DESC(R.string.coefficient_desc, 2, "coefficient_desc"),
    /* JADX INFO: Fake field, exist only in values array */
    ALPHA(R.string.alpha, 3, "alpha");

    public static final xak d = new xak(25);
    public static final /* synthetic */ c0o g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36179a;
    public final int b;
    public final byte c;

    static {
        g = new c0o(new urs[]{r0, new urs(R.string.coefficient_asc, 1, "coefficient_asc"), new urs(R.string.coefficient_desc, 2, "coefficient_desc"), new urs(R.string.alpha, 3, "alpha")});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public urs(int i, int i2, String str) {
        super(str, i);
        this.f36179a = str;
        this.b = i;
        this.c = i2;
    }

    public static urs valueOf(String str) {
        return (urs) Enum.valueOf(urs.class, str);
    }

    public static urs[] values() {
        return (urs[]) f.clone();
    }
}
