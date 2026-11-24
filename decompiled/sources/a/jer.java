package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class jer {

    /* JADX INFO: Fake field, exist only in values array */
    jer EF5;
    public static final /* synthetic */ jer[] b = {new jer("Function", 0), new jer("SuspendFunction", 1), new jer("KFunction", 2), new jer("KSuspendFunction", 3), new jer(GrsBaseInfo.CountryCodeSource.UNKNOWN, 4)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pek f16389a = new pek();

    public static jer valueOf(String str) {
        return (jer) Enum.valueOf(jer.class, str);
    }

    public static jer[] values() {
        return (jer[]) b.clone();
    }
}
