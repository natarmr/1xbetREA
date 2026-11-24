package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ydu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ydu0 f42458a;
    public static final ydu0 b;
    public static final ydu0 c;
    public static final ydu0 d;
    public static final ydu0 e;
    public static final ydu0 f;
    public static final /* synthetic */ ydu0[] g;

    static {
        ydu0 ydu0Var = new ydu0("PRE_MATCH", 0);
        f42458a = ydu0Var;
        ydu0 ydu0Var2 = new ydu0("MATCH_RUNNING", 1);
        b = ydu0Var2;
        ydu0 ydu0Var3 = new ydu0("PLAYER_ONE_WIN", 2);
        c = ydu0Var3;
        ydu0 ydu0Var4 = new ydu0("PLAYER_TWO_WIN", 3);
        d = ydu0Var4;
        ydu0 ydu0Var5 = new ydu0("DRAW", 4);
        e = ydu0Var5;
        ydu0 ydu0Var6 = new ydu0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 5);
        f = ydu0Var6;
        g = new ydu0[]{ydu0Var, ydu0Var2, ydu0Var3, ydu0Var4, ydu0Var5, ydu0Var6};
    }

    public static ydu0 valueOf(String str) {
        return (ydu0) Enum.valueOf(ydu0.class, str);
    }

    public static ydu0[] values() {
        return (ydu0[]) g.clone();
    }
}
