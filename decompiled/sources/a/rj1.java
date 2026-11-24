package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class rj1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final rj1 f30569a;
    public static final rj1 b;
    public static final rj1 c;
    public static final /* synthetic */ rj1[] d;

    static {
        rj1 rj1Var = new rj1("SEARCH_AGGREGATOR_PROVIDERS", 0);
        f30569a = rj1Var;
        rj1 rj1Var2 = new rj1("MY_AGGREGATOR_PROVIDERS", 1);
        rj1 rj1Var3 = new rj1("GIFTS", 2);
        b = rj1Var3;
        rj1 rj1Var4 = new rj1(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3);
        c = rj1Var4;
        d = new rj1[]{rj1Var, rj1Var2, rj1Var3, rj1Var4};
    }

    public static rj1 valueOf(String str) {
        return (rj1) Enum.valueOf(rj1.class, str);
    }

    public static rj1[] values() {
        return (rj1[]) d.clone();
    }
}
