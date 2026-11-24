package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class v2s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ v2s0[] f36702a = {new v2s0("SLOTS", 0), new v2s0("LIVE_AGGREGATOR", 1), new v2s0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2)};

    /* JADX INFO: Fake field, exist only in values array */
    v2s0 EF5;

    public static v2s0 valueOf(String str) {
        return (v2s0) Enum.valueOf(v2s0.class, str);
    }

    public static v2s0[] values() {
        return (v2s0[]) f36702a.clone();
    }
}
