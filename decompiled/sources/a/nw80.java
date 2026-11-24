package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class nw80 {
    public static final nw80 A;
    public static final nw80 B;
    public static final nw80 Y;
    public static final /* synthetic */ nw80[] Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nw80 f24223a;
    public static final nw80 b;
    public static final nw80 c;
    public static final nw80 d;
    public static final nw80 e;
    public static final nw80 f;
    public static final /* synthetic */ c0o f1;
    public static final nw80 g;
    public static final nw80 h;
    public static final nw80 i;
    public static final nw80 j;
    public static final nw80 k;
    public static final nw80 l;
    public static final nw80 m;
    public static final nw80 n;
    public static final nw80 o;
    public static final nw80 p;
    public static final nw80 q;
    public static final nw80 r;
    public static final nw80 s;
    public static final nw80 t;
    public static final nw80 u;
    public static final nw80 v;
    public static final nw80 w;
    public static final nw80 x;
    public static final nw80 y;
    public static final nw80 z;

    static {
        nw80 nw80Var = new nw80("LIVE_AGGREGATOR", 0);
        f24223a = nw80Var;
        nw80 nw80Var2 = new nw80("SLOTS", 1);
        b = nw80Var2;
        nw80 nw80Var3 = new nw80("BINGO", 2);
        c = nw80Var3;
        nw80 nw80Var4 = new nw80("BINGO_NEW", 3);
        d = nw80Var4;
        nw80 nw80Var5 = new nw80("SPORT", 4);
        e = nw80Var5;
        nw80 nw80Var6 = new nw80("FISHING", 5);
        f = nw80Var6;
        nw80 nw80Var7 = new nw80("IMPERIUM", 6);
        nw80 nw80Var8 = new nw80("WISEODDS", 7);
        nw80 nw80Var9 = new nw80("SCRATCH_CARDS", 8);
        g = nw80Var9;
        nw80 nw80Var10 = new nw80("TV_GAMES", 9);
        h = nw80Var10;
        nw80 nw80Var11 = new nw80("TV_BET", 10);
        i = nw80Var11;
        nw80 nw80Var12 = new nw80("VULKAN", 11);
        j = nw80Var12;
        nw80 nw80Var13 = new nw80("CRASH", 12);
        k = nw80Var13;
        nw80 nw80Var14 = new nw80("KENO", 13);
        l = nw80Var14;
        nw80 nw80Var15 = new nw80("ASIAN", 14);
        m = nw80Var15;
        nw80 nw80Var16 = new nw80("BOARD_GAMES", 15);
        n = nw80Var16;
        nw80 nw80Var17 = new nw80("SKILL_GAMES", 16);
        o = nw80Var17;
        nw80 nw80Var18 = new nw80("CARD_GAMES", 17);
        p = nw80Var18;
        nw80 nw80Var19 = new nw80("LOTTO", 18);
        q = nw80Var19;
        nw80 nw80Var20 = new nw80("POKER", 19);
        r = nw80Var20;
        nw80 nw80Var21 = new nw80("FAST_BET", 20);
        s = nw80Var21;
        nw80 nw80Var22 = new nw80("NOT_SET", 21);
        t = nw80Var22;
        nw80 nw80Var23 = new nw80("AGGREGATOR", 22);
        u = nw80Var23;
        nw80 nw80Var24 = new nw80("BRAND", 23);
        v = nw80Var24;
        nw80 nw80Var25 = new nw80("MY_AGGREGATOR", 24);
        w = nw80Var25;
        nw80 nw80Var26 = new nw80("LEGION_POKER", 25);
        x = nw80Var26;
        nw80 nw80Var27 = new nw80("AVIATOR", 26);
        y = nw80Var27;
        nw80 nw80Var28 = new nw80("JET_X", 27);
        z = nw80Var28;
        nw80 nw80Var29 = new nw80("CHICKEN_PROFIT", 28);
        A = nw80Var29;
        nw80 nw80Var30 = new nw80("JACKPOT", 29);
        B = nw80Var30;
        nw80 nw80Var31 = new nw80("QUICK_PLAY", 30);
        Y = nw80Var31;
        nw80[] nw80VarArr = {nw80Var, nw80Var2, nw80Var3, nw80Var4, nw80Var5, nw80Var6, nw80Var7, nw80Var8, nw80Var9, nw80Var10, nw80Var11, nw80Var12, nw80Var13, nw80Var14, nw80Var15, nw80Var16, nw80Var17, nw80Var18, nw80Var19, nw80Var20, nw80Var21, nw80Var22, nw80Var23, nw80Var24, nw80Var25, nw80Var26, nw80Var27, nw80Var28, nw80Var29, nw80Var30, nw80Var31};
        Z = nw80VarArr;
        f1 = new c0o(nw80VarArr);
    }

    public static nw80 valueOf(String str) {
        return (nw80) Enum.valueOf(nw80.class, str);
    }

    public static nw80[] values() {
        return (nw80[]) Z.clone();
    }

    public final long getId() {
        switch (ordinal()) {
            case 0:
                return 37L;
            case 1:
                return 1L;
            case 2:
                return 47L;
            case 3:
                return 8L;
            case 4:
                return 41L;
            case 5:
                return 12L;
            case 6:
                return 58L;
            case 7:
                return 92L;
            case 8:
                return 66L;
            case 9:
                return 51L;
            case 10:
                return 142L;
            case 11:
                return 65L;
            case 12:
                return 149L;
            case 13:
                return 49L;
            case 14:
                return 151L;
            case 15:
                return 16L;
            case 16:
                return 103L;
            case 17:
                return 99L;
            case 18:
                return 101L;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return 102L;
            case 20:
                return 175L;
            case 21:
                return 0L;
            case 22:
                return 23L;
            case 23:
                return 108L;
            case 24:
                return 111L;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return 24L;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return 163L;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return 150L;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return 799L;
            case AvailableCode.HMS_IS_SPOOF /* 29 */:
                return 145L;
            case AvailableCode.USER_ALREADY_KNOWS_SERVICE_UNAVAILABLE /* 30 */:
                return 880L;
            default:
                t9f.b();
                return 0L;
        }
    }
}
