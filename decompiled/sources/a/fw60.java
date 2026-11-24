package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class fw60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fw60 f10244a;
    public static final fw60 b;
    public static final fw60 c;
    public static final fw60 d;
    public static final fw60 e;
    public static final fw60 f;
    public static final fw60 g;
    public static final fw60 h;
    public static final fw60 i;
    public static final fw60 j;
    public static final /* synthetic */ fw60[] k;

    static {
        fw60 fw60Var = new fw60("ONEXGAMES_ALL_GAMES_CLICKED", 0);
        f10244a = fw60Var;
        fw60 fw60Var2 = new fw60("ONEXGAMES_PROMO_CLICKED", 1);
        b = fw60Var2;
        fw60 fw60Var3 = new fw60("ONEXGAMES_CASHBACK_CLICKED", 2);
        c = fw60Var3;
        fw60 fw60Var4 = new fw60("ONEXGAMES_FAVORITE_CLICKED", 3);
        d = fw60Var4;
        fw60 fw60Var5 = new fw60("ONEXGAMES_PROMO_LUCKY_WHEEL_CLICKED", 4);
        e = fw60Var5;
        fw60 fw60Var6 = new fw60("ONEXGAMES_PROMO_BONUS_CLICKED", 5);
        f = fw60Var6;
        fw60 fw60Var7 = new fw60("ONEXGAMES_PROMO_BONUS_INFO_CLICKED", 6);
        g = fw60Var7;
        fw60 fw60Var8 = new fw60("ONEXGAMES_PROMO_WEEKLY_REWARD_CLICKED", 7);
        h = fw60Var8;
        fw60 fw60Var9 = new fw60("ONEXGAMES_PROMO_TOURNAMENT_CLICKED", 8);
        i = fw60Var9;
        fw60 fw60Var10 = new fw60("ONEXGAMES_PROMO_JACKPOT_CLICKED", 9);
        j = fw60Var10;
        k = new fw60[]{fw60Var, fw60Var2, fw60Var3, fw60Var4, fw60Var5, fw60Var6, fw60Var7, fw60Var8, fw60Var9, fw60Var10};
    }

    public static fw60 valueOf(String str) {
        return (fw60) Enum.valueOf(fw60.class, str);
    }

    public static fw60[] values() {
        return (fw60[]) k.clone();
    }

    public final String getValue() {
        switch (ordinal()) {
            case 0:
                return "games_all";
            case 1:
                return "games_bonuses";
            case 2:
                return "games_cashback";
            case 3:
                return "games_favor";
            case 4:
                return "lucky_wheel";
            case 5:
                return "bonus";
            case 6:
                return "bonus_info";
            case 7:
                return "weekly_reward";
            case 8:
                return "daily_tournament";
            case 9:
                return "jackpot";
            default:
                t9f.b();
                return null;
        }
    }
}
