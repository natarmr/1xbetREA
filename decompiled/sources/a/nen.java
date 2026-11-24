package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class nen {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final nen f23393a;
    public static final nen b;
    public static final nen c;
    public static final /* synthetic */ nen[] d;

    static {
        nen nenVar = new nen("ATTACKER", 0);
        f23393a = nenVar;
        nen nenVar2 = new nen("DEFENDER", 1);
        b = nenVar2;
        nen nenVar3 = new nen(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
        c = nenVar3;
        d = new nen[]{nenVar, nenVar2, nenVar3};
    }

    public static nen valueOf(String str) {
        return (nen) Enum.valueOf(nen.class, str);
    }

    public static nen[] values() {
        return (nen[]) d.clone();
    }
}
