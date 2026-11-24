package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class uue0 {
    public static final tue0 Companion;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a8z f36296a;
    public static final uue0 b;
    public static final uue0 c;
    public static final uue0 d;
    public static final /* synthetic */ uue0[] e;

    /* JADX INFO: Fake field, exist only in values array */
    uue0 EF0;

    static {
        uue0 uue0Var = new uue0("PHONE", 0);
        uue0 uue0Var2 = new uue0("COUNTRY", 1);
        uue0 uue0Var3 = new uue0("REGION", 2);
        b = uue0Var3;
        uue0 uue0Var4 = new uue0("CITY", 3);
        c = uue0Var4;
        uue0 uue0Var5 = new uue0("CURRENCY", 4);
        uue0 uue0Var6 = new uue0("NATIONALITY", 5);
        uue0 uue0Var7 = new uue0("MANUAL_ENTRY", 6);
        uue0 uue0Var8 = new uue0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 7);
        d = uue0Var8;
        e = new uue0[]{uue0Var, uue0Var2, uue0Var3, uue0Var4, uue0Var5, uue0Var6, uue0Var7, uue0Var8};
        Companion = new tue0();
        f36296a = maz.a(wez.f39042a, new o6e0((byte) 25));
    }

    public static uue0 valueOf(String str) {
        return (uue0) Enum.valueOf(uue0.class, str);
    }

    public static uue0[] values() {
        return (uue0[]) e.clone();
    }
}
