package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ekg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ekg0 f7950a;
    public static final ekg0 b;
    public static final ekg0 c;
    public static final ekg0 d;
    public static final /* synthetic */ ekg0[] e;

    static {
        ekg0 ekg0Var = new ekg0("LOSS", 0);
        f7950a = ekg0Var;
        ekg0 ekg0Var2 = new ekg0("DRAW", 1);
        b = ekg0Var2;
        ekg0 ekg0Var3 = new ekg0("WIN", 2);
        c = ekg0Var3;
        ekg0 ekg0Var4 = new ekg0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3);
        d = ekg0Var4;
        e = new ekg0[]{ekg0Var, ekg0Var2, ekg0Var3, ekg0Var4};
    }

    public static ekg0 valueOf(String str) {
        return (ekg0) Enum.valueOf(ekg0.class, str);
    }

    public static ekg0[] values() {
        return (ekg0[]) e.clone();
    }
}
