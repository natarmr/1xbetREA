package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class xtc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xtc f41459a;
    public static final /* synthetic */ xtc[] b;

    /* JADX INFO: Fake field, exist only in values array */
    xtc EF0;

    static {
        xtc xtcVar = new xtc(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        xtc xtcVar2 = new xtc("ANDROID_FIREBASE", 1);
        f41459a = xtcVar2;
        b = new xtc[]{xtcVar, xtcVar2};
    }

    public static xtc valueOf(String str) {
        return (xtc) Enum.valueOf(xtc.class, str);
    }

    public static xtc[] values() {
        return (xtc[]) b.clone();
    }
}
