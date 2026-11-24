package a;

import org.xbet.client1.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.j3p0[], still in use, count: 1, list:
  (r0v1 a.j3p0[]) from 0x0020: CONSTRUCTOR (r0v1 a.j3p0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:33) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class j3p0 {
    c(R.string.events, "EVENTS"),
    /* JADX INFO: Fake field, exist only in values array */
    EF21(R.string.team_bet_about_team, "ABOUT_TEAM");

    public static final /* synthetic */ c0o e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15848a;
    public final int b;

    static {
        e = new c0o(j3p0VarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j3p0(int i, String str) {
        super(str, i);
        this.f15848a = i;
        this.b = i;
    }

    public static j3p0 valueOf(String str) {
        return (j3p0) Enum.valueOf(j3p0.class, str);
    }

    public static j3p0[] values() {
        return (j3p0[]) d.clone();
    }
}
