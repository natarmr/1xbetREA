package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class i6l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i6l f14245a;
    public static final i6l b;
    public static final i6l c;
    public static final /* synthetic */ i6l[] d;

    static {
        i6l i6lVar = new i6l(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        f14245a = i6lVar;
        i6l i6lVar2 = new i6l("RADIANT", 1);
        b = i6lVar2;
        i6l i6lVar3 = new i6l("DIRE", 2);
        c = i6lVar3;
        d = new i6l[]{i6lVar, i6lVar2, i6lVar3};
    }

    public static i6l valueOf(String str) {
        return (i6l) Enum.valueOf(i6l.class, str);
    }

    public static i6l[] values() {
        return (i6l[]) d.clone();
    }
}
