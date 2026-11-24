package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class wf5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wf5 f39052a;
    public static final wf5 b;
    public static final wf5 c;
    public static final wf5 d;
    public static final wf5 e;
    public static final wf5 f;
    public static final wf5 g;
    public static final wf5 h;
    public static final wf5 i;
    public static final wf5 j;
    public static final /* synthetic */ wf5[] k;

    static {
        wf5 wf5Var = new wf5("DISTRIBUTION", 0);
        f39052a = wf5Var;
        wf5 wf5Var2 = new wf5("PLAYER_TURN", 1);
        b = wf5Var2;
        wf5 wf5Var3 = new wf5("BANKER_TURN", 2);
        c = wf5Var3;
        wf5 wf5Var4 = new wf5("PLAYER_ROUND_WIN", 3);
        d = wf5Var4;
        wf5 wf5Var5 = new wf5("BANKER_ROUND_WIN", 4);
        e = wf5Var5;
        wf5 wf5Var6 = new wf5("DRAW_ROUND", 5);
        f = wf5Var6;
        wf5 wf5Var7 = new wf5("PLAYER_WIN", 6);
        g = wf5Var7;
        wf5 wf5Var8 = new wf5("BANKER_WIN", 7);
        h = wf5Var8;
        wf5 wf5Var9 = new wf5("DRAW_GAME", 8);
        i = wf5Var9;
        wf5 wf5Var10 = new wf5(GrsBaseInfo.CountryCodeSource.UNKNOWN, 9);
        j = wf5Var10;
        k = new wf5[]{wf5Var, wf5Var2, wf5Var3, wf5Var4, wf5Var5, wf5Var6, wf5Var7, wf5Var8, wf5Var9, wf5Var10};
    }

    public static wf5 valueOf(String str) {
        return (wf5) Enum.valueOf(wf5.class, str);
    }

    public static wf5[] values() {
        return (wf5[]) k.clone();
    }
}
