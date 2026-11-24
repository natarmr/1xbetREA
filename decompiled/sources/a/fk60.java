package a;

import java.util.Set;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v19 a.fk60[], still in use, count: 1, list:
  (r0v19 a.fk60[]) from 0x01a5: CONSTRUCTOR (r0v19 a.fk60[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:422) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class fk60 {
    OFFICE(1),
    BET_CONSCTRUCTOR(3),
    /* JADX INFO: Fake field, exist only in values array */
    FINBET(4),
    PROMO_COUPONE(5),
    CYBER_SPORT(7),
    GAME_SCREEN(8),
    STATISTICS_RATING(9),
    POPULAR_OLD_OS(11),
    INSIGHTS(12),
    SWIPE_X(13),
    MENU_TAB_AGGREGATOR(14),
    AGGREGATOR_SLOTS(15),
    LIVE_AGGREGATOR(16),
    AGGREGATOR_PROMO(17),
    AGGREGATOR_TOURNAMENTS(18),
    TOTO(19),
    POPULAR_PERSONALIZATION_TOP(20),
    CYBER_EVENT(21),
    CYBER_TOURNAMENT(22),
    CYBER_TEAM(23),
    CYBER_PROMO(24),
    CYBER_CALENDAR(25),
    CYBER_PARTNERS(26),
    MY_AGGREGATOR_INTERNAL(29),
    POPULAR_OLD_DEVICE(30),
    POPULAR_AGGREGATOR(31),
    TEAM_BET(32),
    BET_BUILDER(33);

    public static final uuz b;
    public static final Set c;
    public static final /* synthetic */ c0o g1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f9675a;

    static {
        fk60 fk60Var = MENU_TAB_AGGREGATOR;
        fk60 fk60Var2 = AGGREGATOR_SLOTS;
        fk60 fk60Var3 = LIVE_AGGREGATOR;
        fk60 fk60Var4 = AGGREGATOR_PROMO;
        fk60 fk60Var5 = AGGREGATOR_TOURNAMENTS;
        fk60 fk60Var6 = MY_AGGREGATOR_INTERNAL;
        g1 = new c0o(fk60VarArr);
        b = new uuz();
        c = tx3.l0(new fk60[]{fk60Var, fk60Var2, fk60Var3, fk60Var4, fk60Var5, fk60Var6});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public fk60(int i) {
        super(str, i);
        this.f9675a = i;
    }

    public static fk60 valueOf(String str) {
        return (fk60) Enum.valueOf(fk60.class, str);
    }

    public static fk60[] values() {
        return (fk60[]) f1.clone();
    }

    public final String a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 23) {
            return "my_aggregator";
        }
        switch (iOrdinal) {
            case 10:
                return "menu_aggregator";
            case 11:
            case 12:
                return "aggregator_slots";
            case 13:
                return "aggregator_promo";
            case 14:
                return "aggregator_tournaments";
            default:
                return "";
        }
    }
}
