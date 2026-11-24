package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class zjk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zjk f44484a;
    public static final zjk b;
    public static final zjk c;
    public static final zjk d;
    public static final zjk e;
    public static final zjk f;
    public static final zjk g;
    public static final /* synthetic */ zjk[] h;

    static {
        zjk zjkVar = new zjk("ONE", 0);
        f44484a = zjkVar;
        zjk zjkVar2 = new zjk("TWO", 1);
        b = zjkVar2;
        zjk zjkVar3 = new zjk("THREE", 2);
        c = zjkVar3;
        zjk zjkVar4 = new zjk("FOUR", 3);
        d = zjkVar4;
        zjk zjkVar5 = new zjk("FIVE", 4);
        e = zjkVar5;
        zjk zjkVar6 = new zjk("SIX", 5);
        f = zjkVar6;
        zjk zjkVar7 = new zjk(GrsBaseInfo.CountryCodeSource.UNKNOWN, 6);
        g = zjkVar7;
        h = new zjk[]{zjkVar, zjkVar2, zjkVar3, zjkVar4, zjkVar5, zjkVar6, zjkVar7};
    }

    public static zjk valueOf(String str) {
        return (zjk) Enum.valueOf(zjk.class, str);
    }

    public static zjk[] values() {
        return (zjk[]) h.clone();
    }
}
