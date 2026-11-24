package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class a410 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a410 f201a;
    public static final a410 b;
    public static final a410 c;
    public static final a410 d;
    public static final a410 e;
    public static final a410 f;
    public static final /* synthetic */ a410[] g;

    static {
        a410 a410Var = new a410("HORDE", 0);
        f201a = a410Var;
        a410 a410Var2 = new a410("DRAGON", 1);
        b = a410Var2;
        a410 a410Var3 = new a410("RIFTHERALD", 2);
        c = a410Var3;
        a410 a410Var4 = new a410("BARON_NASHOR", 3);
        d = a410Var4;
        a410 a410Var5 = new a410("ATAKHAN", 4);
        e = a410Var5;
        a410 a410Var6 = new a410(GrsBaseInfo.CountryCodeSource.UNKNOWN, 5);
        f = a410Var6;
        g = new a410[]{a410Var, a410Var2, a410Var3, a410Var4, a410Var5, a410Var6};
    }

    public static a410 valueOf(String str) {
        return (a410) Enum.valueOf(a410.class, str);
    }

    public static a410[] values() {
        return (a410[]) g.clone();
    }
}
