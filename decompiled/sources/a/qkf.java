package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class qkf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final qkf f28881a;
    public static final qkf b;
    public static final qkf c;
    public static final qkf d;
    public static final qkf e;
    public static final qkf f;
    public static final /* synthetic */ qkf[] g;

    static {
        qkf qkfVar = new qkf("FIRST_TEAM_BAN", 0);
        f28881a = qkfVar;
        qkf qkfVar2 = new qkf("SECOND_TEAM_BAN", 1);
        b = qkfVar2;
        qkf qkfVar3 = new qkf("FIRST_TEAM_PICK", 2);
        c = qkfVar3;
        qkf qkfVar4 = new qkf("SECOND_TEAM_PICK", 3);
        d = qkfVar4;
        qkf qkfVar5 = new qkf("DECIDER_MAP", 4);
        e = qkfVar5;
        qkf qkfVar6 = new qkf(GrsBaseInfo.CountryCodeSource.UNKNOWN, 5);
        f = qkfVar6;
        g = new qkf[]{qkfVar, qkfVar2, qkfVar3, qkfVar4, qkfVar5, qkfVar6};
    }

    public static qkf valueOf(String str) {
        return (qkf) Enum.valueOf(qkf.class, str);
    }

    public static qkf[] values() {
        return (qkf[]) g.clone();
    }
}
