package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class sfr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sfr f32130a;
    public static final sfr b;
    public static final sfr c;
    public static final /* synthetic */ sfr[] d;

    static {
        sfr sfrVar = new sfr(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        f32130a = sfrVar;
        sfr sfrVar2 = new sfr("DEFAULT", 1);
        b = sfrVar2;
        sfr sfrVar3 = new sfr("YUV", 2);
        c = sfrVar3;
        d = new sfr[]{sfrVar, sfrVar2, sfrVar3};
    }

    public static sfr valueOf(String str) {
        return (sfr) Enum.valueOf(sfr.class, str);
    }

    public static sfr[] values() {
        return (sfr[]) d.clone();
    }
}
