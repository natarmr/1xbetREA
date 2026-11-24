package a;

import org.xbet.client1.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.qgz[], still in use, count: 1, list:
  (r0v1 a.qgz[]) from 0x003e: CONSTRUCTOR (r0v1 a.qgz[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:63) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class qgz {
    AMERICA(R.string.leaderboard_america_region, "america"),
    /* JADX INFO: Fake field, exist only in values array */
    EUROPE(R.string.leaderboard_europe_region, "europe"),
    /* JADX INFO: Fake field, exist only in values array */
    SEA(R.string.leaderboard_sea_region, "sea"),
    /* JADX INFO: Fake field, exist only in values array */
    CHINA(R.string.leaderboard_china_region, "china");

    public static final /* synthetic */ c0o e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28710a;
    public final String b;

    static {
        e = new c0o(qgzVarArr);
    }

    public qgz(int i, String str) {
        super(str, i);
        this.f28710a = i;
        this.b = str;
    }

    public static qgz valueOf(String str) {
        return (qgz) Enum.valueOf(qgz.class, str);
    }

    public static qgz[] values() {
        return (qgz[]) d.clone();
    }
}
