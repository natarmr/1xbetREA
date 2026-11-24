package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class fcq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xak f9322a;
    public static final fcq b;
    public static final fcq c;
    public static final fcq d;
    public static final fcq e;
    public static final /* synthetic */ fcq[] f;

    static {
        fcq fcqVar = new fcq(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        b = fcqVar;
        fcq fcqVar2 = new fcq("RANDOM", 1);
        c = fcqVar2;
        fcq fcqVar3 = new fcq("BEARS", 2);
        d = fcqVar3;
        fcq fcqVar4 = new fcq("BULLS", 3);
        e = fcqVar4;
        f = new fcq[]{fcqVar, fcqVar2, fcqVar3, fcqVar4};
        f9322a = new xak((byte) 18);
    }

    public static fcq valueOf(String str) {
        return (fcq) Enum.valueOf(fcq.class, str);
    }

    public static fcq[] values() {
        return (fcq[]) f.clone();
    }

    public final String C() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "";
        }
        if (iOrdinal == 1) {
            return "random";
        }
        if (iOrdinal == 2) {
            return "bear";
        }
        if (iOrdinal == 3) {
            return "bull";
        }
        t9f.b();
        return null;
    }
}
