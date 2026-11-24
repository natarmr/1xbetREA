package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class hee {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hee f12919a;
    public static final hee b;
    public static final hee c;
    public static final hee d;
    public static final hee e;
    public static final /* synthetic */ hee[] f;

    static {
        hee heeVar = new hee(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        f12919a = heeVar;
        hee heeVar2 = new hee("UFC_TOP_RANK", 1);
        b = heeVar2;
        hee heeVar3 = new hee("UFC_CHAMPION", 2);
        c = heeVar3;
        hee heeVar4 = new hee("UFC_TEMPORARY_CHAMPION", 3);
        d = heeVar4;
        hee heeVar5 = new hee("UFC_NEWCOMER", 4);
        e = heeVar5;
        f = new hee[]{heeVar, heeVar2, heeVar3, heeVar4, heeVar5};
    }

    public static hee valueOf(String str) {
        return (hee) Enum.valueOf(hee.class, str);
    }

    public static hee[] values() {
        return (hee[]) f.clone();
    }
}
