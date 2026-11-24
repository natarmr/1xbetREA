package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class isf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final isf f15300a;
    public static final isf b;
    public static final isf c;
    public static final isf d;
    public static final isf e;
    public static final isf f;
    public static final /* synthetic */ isf[] g;

    static {
        isf isfVar = new isf("TERRORIST_WIN", 0);
        f15300a = isfVar;
        isf isfVar2 = new isf("BOMB_DETONATE", 1);
        b = isfVar2;
        isf isfVar3 = new isf("COUNTER_WIN", 2);
        c = isfVar3;
        isf isfVar4 = new isf("BOMB_DEFUSED", 3);
        d = isfVar4;
        isf isfVar5 = new isf("HOSTAGES_RESCUED", 4);
        e = isfVar5;
        isf isfVar6 = new isf(GrsBaseInfo.CountryCodeSource.UNKNOWN, 5);
        f = isfVar6;
        g = new isf[]{isfVar, isfVar2, isfVar3, isfVar4, isfVar5, isfVar6};
    }

    public static isf valueOf(String str) {
        return (isf) Enum.valueOf(isf.class, str);
    }

    public static isf[] values() {
        return (isf[]) g.clone();
    }
}
