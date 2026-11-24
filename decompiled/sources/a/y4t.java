package a;

import org.xbet.client1.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.y4t[], still in use, count: 1, list:
  (r0v1 a.y4t[]) from 0x00a0: CONSTRUCTOR (r0v1 a.y4t[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:161) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class y4t {
    d(R.string.popular_games_in_center_of_attention, "160291"),
    e(R.string.selection_for_you, "159891"),
    f(R.string.popular_games_best, "158984"),
    g(R.string.popular_games_new, "158983"),
    h(R.string.popular_games_lotteries, "156973"),
    i(R.string.cases_slots, "103713"),
    j(R.string.popular_games_stairs, "156964"),
    k(R.string.popular_games_dices, "156965"),
    l(R.string.popular_games_card, "156957"),
    m(R.string.popular_games_other, "157343");

    public static final nek c = new nek();
    public static final /* synthetic */ c0o o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42020a;
    public final int b;

    static {
        o = new c0o(new y4t[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9});
    }

    public y4t(int i2, String str) {
        super(str, i);
        this.f42020a = str;
        this.b = i2;
    }

    public static y4t valueOf(String str) {
        return (y4t) Enum.valueOf(y4t.class, str);
    }

    public static y4t[] values() {
        return (y4t[]) n.clone();
    }
}
