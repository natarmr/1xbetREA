package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class l700 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l700 f19534a;
    public static final l700 b;
    public static final l700 c;
    public static final /* synthetic */ l700[] d;

    /* JADX INFO: Fake field, exist only in values array */
    l700 EF0;

    static {
        l700 l700Var = new l700(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        l700 l700Var2 = new l700("LINE_GROUP", 1);
        f19534a = l700Var2;
        l700 l700Var3 = new l700("LIVE_GROUP", 2);
        b = l700Var3;
        l700 l700Var4 = new l700("CYBER_GROUP", 3);
        c = l700Var4;
        d = new l700[]{l700Var, l700Var2, l700Var3, l700Var4, new l700("STREAM", 4), new l700("LINE_FAVORITE", 5), new l700("RESULTS", 6), new l700("RESULTS_HISTORY", 7), new l700("RESULTS_LIVE", 8), new l700("LIVE_FAVORITE", 9), new l700("BETS_ON_OWN", 10)};
    }

    public static l700 valueOf(String str) {
        return (l700) Enum.valueOf(l700.class, str);
    }

    public static l700[] values() {
        return (l700[]) d.clone();
    }
}
