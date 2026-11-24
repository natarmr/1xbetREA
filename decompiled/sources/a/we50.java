package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class we50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final we50 f39003a;
    public static final we50 b;
    public static final we50 c;
    public static final we50 d;
    public static final /* synthetic */ we50[] e;

    /* JADX INFO: Fake field, exist only in values array */
    we50 EF0;

    static {
        we50 we50Var = new we50("SETTINGS", 0);
        we50 we50Var2 = new we50("PERSONAL_AREA", 1);
        f39003a = we50Var2;
        we50 we50Var3 = new we50("SECURITY_SETTINGS", 2);
        b = we50Var3;
        we50 we50Var4 = new we50("LOGIN", 3);
        c = we50Var4;
        we50 we50Var5 = new we50(GrsBaseInfo.CountryCodeSource.UNKNOWN, 4);
        d = we50Var5;
        e = new we50[]{we50Var, we50Var2, we50Var3, we50Var4, we50Var5};
    }

    public static we50 valueOf(String str) {
        return (we50) Enum.valueOf(we50.class, str);
    }

    public static we50[] values() {
        return (we50[]) e.clone();
    }
}
