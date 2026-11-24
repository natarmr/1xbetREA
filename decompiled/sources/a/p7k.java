package a;

import com.huawei.hms.android.HwBuildEx;

/* JADX INFO: loaded from: classes3.dex */
public enum p7k {
    LIMIT_2500(2500),
    LIMIT_5000(5000),
    LIMIT_10000(HwBuildEx.VersionCodes.CUR_DEVELOPMENT),
    LIMIT_20000(20000),
    UNLIMITED(999999999),
    UNKNOWN(-1);

    public static final std b = new std();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26510a;

    p7k(int i2) {
        this.f26510a = i2;
    }
}
