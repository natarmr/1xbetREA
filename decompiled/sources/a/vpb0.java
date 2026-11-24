package a;

import org.xbet.client1.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.vpb0[], still in use, count: 1, list:
  (r0v1 a.vpb0[]) from 0x0062: CONSTRUCTOR (r0v1 a.vpb0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:99) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class vpb0 {
    HERO_NAME(R.string.player_name_2),
    /* JADX INFO: Fake field, exist only in values array */
    PLACE(R.string.player_info_position),
    /* JADX INFO: Fake field, exist only in values array */
    BASE(R.string.base),
    /* JADX INFO: Fake field, exist only in values array */
    KILLS(R.string.kills),
    /* JADX INFO: Fake field, exist only in values array */
    DEATHS(R.string.deaths),
    /* JADX INFO: Fake field, exist only in values array */
    LIFE_TIME(R.string.life_time),
    /* JADX INFO: Fake field, exist only in values array */
    BOMB_COUNT(R.string.bomb_count_ellpisized),
    /* JADX INFO: Fake field, exist only in values array */
    DEFUSE(R.string.defuse);

    public static final /* synthetic */ c0o d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37797a;

    static {
        d = new c0o(vpb0VarArr);
    }

    public vpb0(int i) {
        super(str, i);
        this.f37797a = i;
    }

    public static vpb0 valueOf(String str) {
        return (vpb0) Enum.valueOf(vpb0.class, str);
    }

    public static vpb0[] values() {
        return (vpb0[]) c.clone();
    }
}
