package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class mls {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mls f22008a;
    public static final mls b;
    public static final mls c;
    public static final mls d;
    public static final /* synthetic */ mls[] e;

    static {
        mls mlsVar = new mls(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        f22008a = mlsVar;
        mls mlsVar2 = new mls("RUNE", 1);
        b = mlsVar2;
        mls mlsVar3 = new mls("TOWER_KILL", 2);
        c = mlsVar3;
        mls mlsVar4 = new mls("HERO_KILL", 3);
        d = mlsVar4;
        e = new mls[]{mlsVar, mlsVar2, mlsVar3, mlsVar4};
    }

    public static mls valueOf(String str) {
        return (mls) Enum.valueOf(mls.class, str);
    }

    public static mls[] values() {
        return (mls[]) e.clone();
    }
}
