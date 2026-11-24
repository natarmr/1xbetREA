package a;

import com.huawei.hms.api.ConnectionResult;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class z70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hfk0 f43894a;
    public static final z70 b;
    public static final z70 c;
    public static final z70 d;
    public static final z70 e;
    public static final z70 f;
    public static final z70 g;
    public static final z70 h;
    public static final z70 i;
    public static final z70 j;
    public static final z70 k;
    public static final z70 l;
    public static final z70 m;
    public static final z70 n;
    public static final z70 o;
    public static final z70 p;
    public static final z70 q;
    public static final z70 r;
    public static final z70 s;
    public static final z70 t;
    public static final z70 u;
    public static final z70 v;
    public static final /* synthetic */ z70[] w;

    static {
        z70 z70Var = new z70("ZERO", 0);
        b = z70Var;
        z70 z70Var2 = new z70("ONE", 1);
        c = z70Var2;
        z70 z70Var3 = new z70("TWO", 2);
        d = z70Var3;
        z70 z70Var4 = new z70("THREE", 3);
        e = z70Var4;
        z70 z70Var5 = new z70("FOUR", 4);
        f = z70Var5;
        z70 z70Var6 = new z70("FIVE", 5);
        g = z70Var6;
        z70 z70Var7 = new z70("SIX", 6);
        h = z70Var7;
        z70 z70Var8 = new z70("SEVEN", 7);
        i = z70Var8;
        z70 z70Var9 = new z70("EIGHT", 8);
        j = z70Var9;
        z70 z70Var10 = new z70("NINE", 9);
        k = z70Var10;
        z70 z70Var11 = new z70("TEN", 10);
        l = z70Var11;
        z70 z70Var12 = new z70("ELEVEN", 11);
        m = z70Var12;
        z70 z70Var13 = new z70("TWELVE", 12);
        n = z70Var13;
        z70 z70Var14 = new z70("FIRST_HALF", 13);
        o = z70Var14;
        z70 z70Var15 = new z70("LAST_HALF", 14);
        p = z70Var15;
        z70 z70Var16 = new z70("LOW", 15);
        q = z70Var16;
        z70 z70Var17 = new z70("MIDDLE", 16);
        r = z70Var17;
        z70 z70Var18 = new z70("HIGH", 17);
        s = z70Var18;
        z70 z70Var19 = new z70("RED", 18);
        t = z70Var19;
        z70 z70Var20 = new z70("BLACK", 19);
        u = z70Var20;
        z70 z70Var21 = new z70("EMPTY", 20);
        v = z70Var21;
        w = new z70[]{z70Var, z70Var2, z70Var3, z70Var4, z70Var5, z70Var6, z70Var7, z70Var8, z70Var9, z70Var10, z70Var11, z70Var12, z70Var13, z70Var14, z70Var15, z70Var16, z70Var17, z70Var18, z70Var19, z70Var20, z70Var21};
        f43894a = new hfk0((byte) 12);
    }

    public static z70 valueOf(String str) {
        return (z70) Enum.valueOf(z70.class, str);
    }

    public static z70[] values() {
        return (z70[]) w.clone();
    }

    public final String a() {
        switch (ordinal()) {
            case 0:
                return "0";
            case 1:
                return "1";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "7";
            case 8:
                return "8";
            case 9:
                return "9";
            case 10:
                return "10";
            case 11:
                return "11";
            case 12:
                return "12";
            case 13:
                return "1-6";
            case 14:
                return "7-12";
            case 15:
                return "LO";
            case 16:
                return "MID";
            case 17:
                return "HI";
            case 18:
                return "RED";
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return "BLACK";
            case 20:
                return "";
            default:
                t9f.b();
                return null;
        }
    }
}
