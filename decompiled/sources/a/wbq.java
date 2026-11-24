package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class wbq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wbq f38891a;
    public static final wbq b;
    public static final wbq c;
    public static final /* synthetic */ wbq[] d;

    static {
        wbq wbqVar = new wbq("HIGH", 0);
        f38891a = wbqVar;
        wbq wbqVar2 = new wbq("LOW", 1);
        b = wbqVar2;
        wbq wbqVar3 = new wbq(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
        c = wbqVar3;
        d = new wbq[]{wbqVar, wbqVar2, wbqVar3};
    }

    public static wbq valueOf(String str) {
        return (wbq) Enum.valueOf(wbq.class, str);
    }

    public static wbq[] values() {
        return (wbq[]) d.clone();
    }
}
