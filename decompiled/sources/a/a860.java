package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class a860 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wsz f411a;
    public static final a860 b;
    public static final a860 c;
    public static final a860 d;
    public static final a860 e;
    public static final a860 f;
    public static final a860 g;
    public static final /* synthetic */ a860[] h;

    /* JADX INFO: Fake field, exist only in values array */
    a860 EF0;

    static {
        a860 a860Var = new a860("ACTIVE", 0);
        a860 a860Var2 = new a860("EXCEPTION", 1);
        b = a860Var2;
        a860 a860Var3 = new a860("APPROVED", 2);
        c = a860Var3;
        a860 a860Var4 = new a860("REJECTED", 3);
        d = a860Var4;
        a860 a860Var5 = new a860("EXPIRED", 4);
        e = a860Var5;
        a860 a860Var6 = new a860("EXCEEDED_ATTEMPTS", 5);
        f = a860Var6;
        a860 a860Var7 = new a860(GrsBaseInfo.CountryCodeSource.UNKNOWN, 6);
        g = a860Var7;
        h = new a860[]{a860Var, a860Var2, a860Var3, a860Var4, a860Var5, a860Var6, a860Var7};
        f411a = new wsz();
    }

    public static a860 valueOf(String str) {
        return (a860) Enum.valueOf(a860.class, str);
    }

    public static a860[] values() {
        return (a860[]) h.clone();
    }
}
