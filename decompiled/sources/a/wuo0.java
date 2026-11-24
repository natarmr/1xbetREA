package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class wuo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s9m0 f39800a;
    public static final wuo0 b;
    public static final wuo0 c;
    public static final wuo0 d;
    public static final wuo0 e;
    public static final wuo0 f;
    public static final wuo0 g;
    public static final wuo0 h;
    public static final wuo0 i;
    public static final /* synthetic */ wuo0[] j;

    static {
        wuo0 wuo0Var = new wuo0("NONE", 0);
        b = wuo0Var;
        wuo0 wuo0Var2 = new wuo0("ACTIVE", 1);
        c = wuo0Var2;
        wuo0 wuo0Var3 = new wuo0("PAUSE", 2);
        d = wuo0Var3;
        wuo0 wuo0Var4 = new wuo0("CANCELED", 3);
        e = wuo0Var4;
        wuo0 wuo0Var5 = new wuo0("BASE_TASK_COMPLETED", 4);
        f = wuo0Var5;
        wuo0 wuo0Var6 = new wuo0("WAITING_PAYMENT", 5);
        g = wuo0Var6;
        wuo0 wuo0Var7 = new wuo0("COMPLETED", 6);
        h = wuo0Var7;
        wuo0 wuo0Var8 = new wuo0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 7);
        i = wuo0Var8;
        j = new wuo0[]{wuo0Var, wuo0Var2, wuo0Var3, wuo0Var4, wuo0Var5, wuo0Var6, wuo0Var7, wuo0Var8};
        f39800a = new s9m0();
    }

    public static wuo0 valueOf(String str) {
        return (wuo0) Enum.valueOf(wuo0.class, str);
    }

    public static wuo0[] values() {
        return (wuo0[]) j.clone();
    }

    public final int getId() {
        switch (ordinal()) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 7;
            case 5:
                return 9;
            case 6:
                return 10;
            default:
                return 0;
        }
    }
}
