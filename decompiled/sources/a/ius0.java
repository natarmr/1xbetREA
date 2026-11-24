package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class ius0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ius0 f15412a;
    public static final ius0 b;
    public static final ius0 c;
    public static final ius0 d;
    public static final ius0 e;
    public static final ius0 f;
    public static final ius0 g;
    public static final ius0 h;
    public static final ius0 i;
    public static final ius0 j;
    public static final /* synthetic */ ius0[] k;

    static {
        ius0 ius0Var = new ius0("DISTRIBUTION", 0);
        f15412a = ius0Var;
        ius0 ius0Var2 = new ius0("PLAYER_TURN", 1);
        b = ius0Var2;
        ius0 ius0Var3 = new ius0("DEALER_TURN", 2);
        c = ius0Var3;
        ius0 ius0Var4 = new ius0("PLAYER_ROUND_WIN", 3);
        d = ius0Var4;
        ius0 ius0Var5 = new ius0("DEALER_ROUND_WIN", 4);
        e = ius0Var5;
        ius0 ius0Var6 = new ius0("DRAW_ROUND", 5);
        f = ius0Var6;
        ius0 ius0Var7 = new ius0("PLAYER_WIN", 6);
        g = ius0Var7;
        ius0 ius0Var8 = new ius0("DEALER_WIN", 7);
        h = ius0Var8;
        ius0 ius0Var9 = new ius0("DRAW_GAME", 8);
        i = ius0Var9;
        ius0 ius0Var10 = new ius0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 9);
        j = ius0Var10;
        k = new ius0[]{ius0Var, ius0Var2, ius0Var3, ius0Var4, ius0Var5, ius0Var6, ius0Var7, ius0Var8, ius0Var9, ius0Var10};
    }

    public static ius0 valueOf(String str) {
        return (ius0) Enum.valueOf(ius0.class, str);
    }

    public static ius0[] values() {
        return (ius0[]) k.clone();
    }
}
