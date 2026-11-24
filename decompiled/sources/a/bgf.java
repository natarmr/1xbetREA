package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class bgf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bgf f2552a;
    public static final bgf b;
    public static final bgf c;
    public static final bgf d;
    public static final /* synthetic */ bgf[] e;

    static {
        bgf bgfVar = new bgf(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        f2552a = bgfVar;
        bgf bgfVar2 = new bgf("INVISIBLE", 1);
        b = bgfVar2;
        bgf bgfVar3 = new bgf("VISIBLE", 2);
        c = bgfVar3;
        bgf bgfVar4 = new bgf("SHINE", 3);
        d = bgfVar4;
        e = new bgf[]{bgfVar, bgfVar2, bgfVar3, bgfVar4};
    }

    public static bgf valueOf(String str) {
        return (bgf) Enum.valueOf(bgf.class, str);
    }

    public static bgf[] values() {
        return (bgf[]) e.clone();
    }
}
