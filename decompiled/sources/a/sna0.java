package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class sna0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sna0 f32484a;
    public static final sna0 b;
    public static final sna0 c;
    public static final sna0 d;
    public static final sna0 e;
    public static final /* synthetic */ sna0[] f;

    static {
        sna0 sna0Var = new sna0("SPADES", 0);
        f32484a = sna0Var;
        sna0 sna0Var2 = new sna0("CLUBS", 1);
        b = sna0Var2;
        sna0 sna0Var3 = new sna0("DIAMONDS", 2);
        c = sna0Var3;
        sna0 sna0Var4 = new sna0("HEARTS", 3);
        d = sna0Var4;
        sna0 sna0Var5 = new sna0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 4);
        e = sna0Var5;
        f = new sna0[]{sna0Var, sna0Var2, sna0Var3, sna0Var4, sna0Var5};
    }

    public static sna0 valueOf(String str) {
        return (sna0) Enum.valueOf(sna0.class, str);
    }

    public static sna0[] values() {
        return (sna0[]) f.clone();
    }
}
