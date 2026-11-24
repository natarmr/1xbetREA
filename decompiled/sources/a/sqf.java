package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class sqf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sqf f32627a;
    public static final sqf b;
    public static final sqf c;
    public static final sqf d;
    public static final /* synthetic */ sqf[] e;

    static {
        sqf sqfVar = new sqf(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        f32627a = sqfVar;
        sqf sqfVar2 = new sqf("ROUND_START", 1);
        b = sqfVar2;
        sqf sqfVar3 = new sqf("ROUND_OVER", 2);
        c = sqfVar3;
        sqf sqfVar4 = new sqf("GAME_ON_MAP_OVER", 3);
        d = sqfVar4;
        e = new sqf[]{sqfVar, sqfVar2, sqfVar3, sqfVar4};
    }

    public static sqf valueOf(String str) {
        return (sqf) Enum.valueOf(sqf.class, str);
    }

    public static sqf[] values() {
        return (sqf[]) e.clone();
    }
}
