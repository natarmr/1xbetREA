package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class f4w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f4w f8934a;
    public static final f4w b;
    public static final f4w c;
    public static final f4w d;
    public static final f4w e;
    public static final f4w f;
    public static final f4w g;
    public static final f4w h;
    public static final /* synthetic */ f4w[] i;

    static {
        f4w f4wVar = new f4w("BET_HISTORY_MENU", 0);
        f8934a = f4wVar;
        f4w f4wVar2 = new f4w("BET_HISTORY_MENU_TYPE_BETS", 1);
        b = f4wVar2;
        f4w f4wVar3 = new f4w("BET_HISTORY_MENU_TYPE_TOTO", 2);
        c = f4wVar3;
        f4w f4wVar4 = new f4w("BET_HISTORY_MENU_TYPE_JACKPOT", 3);
        d = f4wVar4;
        f4w f4wVar5 = new f4w("BET_HISTORY_MENU_TYPE_CLAIMS", 4);
        e = f4wVar5;
        f4w f4wVar6 = new f4w("BET_HISTORY_MENU_TYPE_AGGREGATOR", 5);
        f = f4wVar6;
        f4w f4wVar7 = new f4w("BET_HISTORY_MENU_TYPE_NONCALC", 6);
        g = f4wVar7;
        f4w f4wVar8 = new f4w("BET_HISTORY_MENU_TYPE_HIDE", 7);
        h = f4wVar8;
        i = new f4w[]{f4wVar, f4wVar2, f4wVar3, f4wVar4, f4wVar5, f4wVar6, f4wVar7, f4wVar8};
    }

    public static f4w valueOf(String str) {
        return (f4w) Enum.valueOf(f4w.class, str);
    }

    public static f4w[] values() {
        return (f4w[]) i.clone();
    }

    public final String a() {
        switch (ordinal()) {
            case 0:
                return "bet_history_menu";
            case 1:
                return "bets";
            case 2:
                return "toto";
            case 3:
                return "jackpot";
            case 4:
                return "claims";
            case 5:
                return "aggregator";
            case 6:
                return "noncalc";
            case 7:
                return "hide";
            default:
                t9f.b();
                return null;
        }
    }
}
