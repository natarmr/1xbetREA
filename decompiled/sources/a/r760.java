package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class r760 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final evz f29964a;
    public static final r760 b;
    public static final r760 c;
    public static final r760 d;
    public static final r760 e;
    public static final r760 f;
    public static final r760 g;
    public static final r760 h;
    public static final r760 i;
    public static final r760 j;
    public static final r760 k;
    public static final r760 l;
    public static final r760 m;
    public static final /* synthetic */ r760[] n;

    static {
        r760 r760Var = new r760("SCORE", 0);
        b = r760Var;
        r760 r760Var2 = new r760("YELLOW_CARD", 1);
        c = r760Var2;
        r760 r760Var3 = new r760("CORNER", 2);
        d = r760Var3;
        r760 r760Var4 = new r760("RED_CARD", 3);
        e = r760Var4;
        r760 r760Var5 = new r760("PENALTY", 4);
        f = r760Var5;
        r760 r760Var6 = new r760("ONE_MINUTE", 5);
        g = r760Var6;
        r760 r760Var7 = new r760("FIVE_MINUTES", 6);
        h = r760Var7;
        r760 r760Var8 = new r760("FIFTEEN_MINUTES", 7);
        i = r760Var8;
        r760 r760Var9 = new r760("THIRTY_MINUTES", 8);
        j = r760Var9;
        r760 r760Var10 = new r760("ONE_HOUR", 9);
        k = r760Var10;
        r760 r760Var11 = new r760("REPLACE", 10);
        l = r760Var11;
        r760 r760Var12 = new r760(GrsBaseInfo.CountryCodeSource.UNKNOWN, 11);
        m = r760Var12;
        n = new r760[]{r760Var, r760Var2, r760Var3, r760Var4, r760Var5, r760Var6, r760Var7, r760Var8, r760Var9, r760Var10, r760Var11, r760Var12};
        f29964a = new evz();
    }

    public static r760 valueOf(String str) {
        return (r760) Enum.valueOf(r760.class, str);
    }

    public static r760[] values() {
        return (r760[]) n.clone();
    }
}
