package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ni40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ni40 f23564a;
    public static final ni40 b;
    public static final ni40 c;
    public static final ni40 d;
    public static final ni40 e;
    public static final ni40 f;
    public static final /* synthetic */ ni40[] g;

    static {
        ni40 ni40Var = new ni40(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        f23564a = ni40Var;
        ni40 ni40Var2 = new ni40("IN_HERO_SELECTION", 1);
        b = ni40Var2;
        ni40 ni40Var3 = new ni40("WAITING_FOR_START", 2);
        c = ni40Var3;
        ni40 ni40Var4 = new ni40("PLAY", 3);
        d = ni40Var4;
        ni40 ni40Var5 = new ni40("MAP_FINISHED", 4);
        e = ni40Var5;
        ni40 ni40Var6 = new ni40("MATCH_FINISHED", 5);
        f = ni40Var6;
        g = new ni40[]{ni40Var, ni40Var2, ni40Var3, ni40Var4, ni40Var5, ni40Var6};
    }

    public static ni40 valueOf(String str) {
        return (ni40) Enum.valueOf(ni40.class, str);
    }

    public static ni40[] values() {
        return (ni40[]) g.clone();
    }
}
