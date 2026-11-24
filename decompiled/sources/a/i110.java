package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class i110 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i110 f13973a;
    public static final i110 b;
    public static final i110 c;
    public static final i110 d;
    public static final i110 e;
    public static final i110 f;
    public static final /* synthetic */ i110[] g;

    static {
        i110 i110Var = new i110("SUP", 0);
        f13973a = i110Var;
        i110 i110Var2 = new i110("TOP", 1);
        b = i110Var2;
        i110 i110Var3 = new i110("MID", 2);
        c = i110Var3;
        i110 i110Var4 = new i110("JUN", 3);
        d = i110Var4;
        i110 i110Var5 = new i110("ADC", 4);
        e = i110Var5;
        i110 i110Var6 = new i110(GrsBaseInfo.CountryCodeSource.UNKNOWN, 5);
        f = i110Var6;
        g = new i110[]{i110Var, i110Var2, i110Var3, i110Var4, i110Var5, i110Var6};
    }

    public static i110 valueOf(String str) {
        return (i110) Enum.valueOf(i110.class, str);
    }

    public static i110[] values() {
        return (i110[]) g.clone();
    }
}
