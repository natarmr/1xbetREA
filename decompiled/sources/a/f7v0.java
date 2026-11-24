package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class f7v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f7v0 f9077a;
    public static final f7v0 b;
    public static final f7v0 c;
    public static final f7v0 d;
    public static final f7v0 e;
    public static final f7v0 f;
    public static final f7v0 g;
    public static final f7v0 h;
    public static final f7v0 i;
    public static final f7v0 j;
    public static final f7v0 k;
    public static final f7v0 l;
    public static final f7v0 m;
    public static final f7v0 n;
    public static final /* synthetic */ f7v0[] o;

    static {
        f7v0 f7v0Var = new f7v0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        f9077a = f7v0Var;
        f7v0 f7v0Var2 = new f7v0("FLYWEIGHT", 1);
        b = f7v0Var2;
        f7v0 f7v0Var3 = new f7v0("BANTAMWEIGHT", 2);
        c = f7v0Var3;
        f7v0 f7v0Var4 = new f7v0("FEATHERWEIGHT", 3);
        d = f7v0Var4;
        f7v0 f7v0Var5 = new f7v0("LIGHTWEIGHT", 4);
        e = f7v0Var5;
        f7v0 f7v0Var6 = new f7v0("WELTERWEIGHT", 5);
        f = f7v0Var6;
        f7v0 f7v0Var7 = new f7v0("MIDDLEWEIGHT", 6);
        g = f7v0Var7;
        f7v0 f7v0Var8 = new f7v0("LIGHT_HEAVYWEIGHT", 7);
        h = f7v0Var8;
        f7v0 f7v0Var9 = new f7v0("HEAVYWEIGHT", 8);
        i = f7v0Var9;
        f7v0 f7v0Var10 = new f7v0("MENS_POUND_FOR_POUND", 9);
        j = f7v0Var10;
        f7v0 f7v0Var11 = new f7v0("WOMENS_SW", 10);
        k = f7v0Var11;
        f7v0 f7v0Var12 = new f7v0("WOMENS_FLW", 11);
        l = f7v0Var12;
        f7v0 f7v0Var13 = new f7v0("WOMENS_BW", 12);
        m = f7v0Var13;
        f7v0 f7v0Var14 = new f7v0("WOMENS_POUND_FOR_POUND", 13);
        n = f7v0Var14;
        o = new f7v0[]{f7v0Var, f7v0Var2, f7v0Var3, f7v0Var4, f7v0Var5, f7v0Var6, f7v0Var7, f7v0Var8, f7v0Var9, f7v0Var10, f7v0Var11, f7v0Var12, f7v0Var13, f7v0Var14};
    }

    public static f7v0 valueOf(String str) {
        return (f7v0) Enum.valueOf(f7v0.class, str);
    }

    public static f7v0[] values() {
        return (f7v0[]) o.clone();
    }
}
