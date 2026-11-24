package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class bmk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bmk0 f2840a;
    public static final bmk0 b;
    public static final bmk0 c;
    public static final bmk0 d;
    public static final /* synthetic */ bmk0[] e;

    static {
        bmk0 bmk0Var = new bmk0("PERFECT_WIN", 0);
        f2840a = bmk0Var;
        bmk0 bmk0Var2 = new bmk0("TIME_WIN", 1);
        b = bmk0Var2;
        bmk0 bmk0Var3 = new bmk0("KNOCKOUT_WIN", 2);
        c = bmk0Var3;
        bmk0 bmk0Var4 = new bmk0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3);
        d = bmk0Var4;
        e = new bmk0[]{bmk0Var, bmk0Var2, bmk0Var3, bmk0Var4};
    }

    public static bmk0 valueOf(String str) {
        return (bmk0) Enum.valueOf(bmk0.class, str);
    }

    public static bmk0[] values() {
        return (bmk0[]) e.clone();
    }
}
