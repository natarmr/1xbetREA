package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class x310 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x310 f40194a;
    public static final x310 b;
    public static final x310 c;
    public static final x310 d;
    public static final x310 e;
    public static final x310 f;
    public static final x310 g;
    public static final x310 h;
    public static final /* synthetic */ x310[] i;

    static {
        x310 x310Var = new x310("CHEMTECH_DRAGON", 0);
        f40194a = x310Var;
        x310 x310Var2 = new x310("FIRE_DRAGON", 1);
        b = x310Var2;
        x310 x310Var3 = new x310("EARTH_DRAGON", 2);
        c = x310Var3;
        x310 x310Var4 = new x310("WATER_DRAGON", 3);
        d = x310Var4;
        x310 x310Var5 = new x310("AIR_DRAGON", 4);
        e = x310Var5;
        x310 x310Var6 = new x310("HEXTECH_DRAGON", 5);
        f = x310Var6;
        x310 x310Var7 = new x310("ELDER_DRAGON", 6);
        g = x310Var7;
        x310 x310Var8 = new x310(GrsBaseInfo.CountryCodeSource.UNKNOWN, 7);
        h = x310Var8;
        i = new x310[]{x310Var, x310Var2, x310Var3, x310Var4, x310Var5, x310Var6, x310Var7, x310Var8};
    }

    public static x310 valueOf(String str) {
        return (x310) Enum.valueOf(x310.class, str);
    }

    public static x310[] values() {
        return (x310[]) i.clone();
    }
}
