package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class wpf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wpf f39542a;
    public static final wpf b;
    public static final wpf c;
    public static final /* synthetic */ wpf[] d;

    static {
        wpf wpfVar = new wpf("TERRORIST", 0);
        f39542a = wpfVar;
        wpf wpfVar2 = new wpf("COUNTER_TERRORIST", 1);
        b = wpfVar2;
        wpf wpfVar3 = new wpf(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
        c = wpfVar3;
        d = new wpf[]{wpfVar, wpfVar2, wpfVar3};
    }

    public static wpf valueOf(String str) {
        return (wpf) Enum.valueOf(wpf.class, str);
    }

    public static wpf[] values() {
        return (wpf[]) d.clone();
    }
}
