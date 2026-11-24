package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class r6w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r6w f29954a;
    public static final r6w b;
    public static final r6w c;
    public static final r6w d;
    public static final r6w e;
    public static final r6w f;
    public static final r6w g;
    public static final r6w h;
    public static final r6w i;
    public static final r6w j;
    public static final r6w k;
    public static final /* synthetic */ r6w[] l;

    static {
        r6w r6wVar = new r6w("BET_SCREEN_BETS_HISTORY", 0);
        f29954a = r6wVar;
        r6w r6wVar2 = new r6w("BET_SCREEN_TOTO_HISTORY", 1);
        b = r6wVar2;
        r6w r6wVar3 = new r6w("BET_SCREEN_JACKPOT_HISTORY", 2);
        c = r6wVar3;
        r6w r6wVar4 = new r6w("BET_SCREEN_AUTO_HISTORY", 3);
        d = r6wVar4;
        r6w r6wVar5 = new r6w("BET_SCREEN_NON_CALC_HISTORY", 4);
        e = r6wVar5;
        r6w r6wVar6 = new r6w("BET_SCREEN_AGGREGATOR_HISTORY", 5);
        f = r6wVar6;
        r6w r6wVar7 = new r6w("BET_SCREEN_ABOUT_BET", 6);
        g = r6wVar7;
        r6w r6wVar8 = new r6w("BET_SCREEN", 7);
        h = r6wVar8;
        r6w r6wVar9 = new r6w("BET_SCREEN_BET_INFO", 8);
        i = r6wVar9;
        r6w r6wVar10 = new r6w("BET_SCREEN_CHOOSE_ACTION", 9);
        j = r6wVar10;
        r6w r6wVar11 = new r6w("BET_SCREEN_BET_SELL", 10);
        k = r6wVar11;
        l = new r6w[]{r6wVar, r6wVar2, r6wVar3, r6wVar4, r6wVar5, r6wVar6, r6wVar7, r6wVar8, r6wVar9, r6wVar10, r6wVar11};
    }

    public static r6w valueOf(String str) {
        return (r6w) Enum.valueOf(r6w.class, str);
    }

    public static r6w[] values() {
        return (r6w[]) l.clone();
    }

    public final String a() {
        switch (ordinal()) {
            case 0:
                return "bets";
            case 1:
                return "toto";
            case 2:
                return "jackpot";
            case 3:
                return "claim";
            case 4:
                return "noncalc";
            case 5:
                return "aggregator";
            case 6:
                return "about_bet";
            case 7:
                return "screen";
            case 8:
                return "bet_info";
            case 9:
                return "bet_sell_choose_action";
            case 10:
                return "bet_sell";
            default:
                t9f.b();
                return null;
        }
    }
}
