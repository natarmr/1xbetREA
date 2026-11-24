package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class fdh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fdh0 f9358a;
    public static final fdh0 b;
    public static final fdh0 c;
    public static final fdh0 d;
    public static final fdh0 e;
    public static final fdh0 f;
    public static final /* synthetic */ fdh0[] g;

    static {
        fdh0 fdh0Var = new fdh0("NOT_STARTED", 0);
        f9358a = fdh0Var;
        fdh0 fdh0Var2 = new fdh0("PLAYER_ONE_TURN", 1);
        b = fdh0Var2;
        fdh0 fdh0Var3 = new fdh0("PLAYER_TWO_TURN", 2);
        c = fdh0Var3;
        fdh0 fdh0Var4 = new fdh0("PLAYER_ONE_WIN", 3);
        d = fdh0Var4;
        fdh0 fdh0Var5 = new fdh0("PLAYER_TWO_WIN", 4);
        e = fdh0Var5;
        fdh0 fdh0Var6 = new fdh0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 5);
        f = fdh0Var6;
        g = new fdh0[]{fdh0Var, fdh0Var2, fdh0Var3, fdh0Var4, fdh0Var5, fdh0Var6};
    }

    public static fdh0 valueOf(String str) {
        return (fdh0) Enum.valueOf(fdh0.class, str);
    }

    public static fdh0[] values() {
        return (fdh0[]) g.clone();
    }
}
