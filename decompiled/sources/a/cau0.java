package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class cau0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wxs0 f4031a;
    public static final cau0 b;
    public static final cau0 c;
    public static final cau0 d;
    public static final cau0 e;
    public static final cau0 f;
    public static final cau0 g;
    public static final cau0 h;
    public static final cau0 i;
    public static final cau0 j;
    public static final /* synthetic */ cau0[] k;

    static {
        cau0 cau0Var = new cau0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 0);
        b = cau0Var;
        cau0 cau0Var2 = new cau0("UNVERIFIED", 1);
        c = cau0Var2;
        cau0 cau0Var3 = new cau0("VERIFICATION_DATA_ACCEPTED", 2);
        d = cau0Var3;
        cau0 cau0Var4 = new cau0("VERIFICATION_IN_PROGRESS", 3);
        e = cau0Var4;
        cau0 cau0Var5 = new cau0("VERIFICATION_DENIED", 4);
        f = cau0Var5;
        cau0 cau0Var6 = new cau0("CLARIFICATION_REQUIRED", 5);
        g = cau0Var6;
        cau0 cau0Var7 = new cau0("VERIFICATION_SUCCESSFUL", 6);
        h = cau0Var7;
        cau0 cau0Var8 = new cau0("PARTNER_VERIFICATION_ERROR", 7);
        i = cau0Var8;
        cau0 cau0Var9 = new cau0("REVERIFICATION_REQUIRED", 8);
        j = cau0Var9;
        k = new cau0[]{cau0Var, cau0Var2, cau0Var3, cau0Var4, cau0Var5, cau0Var6, cau0Var7, cau0Var8, cau0Var9};
        f4031a = new wxs0((byte) 7);
    }

    public static cau0 valueOf(String str) {
        return (cau0) Enum.valueOf(cau0.class, str);
    }

    public static cau0[] values() {
        return (cau0[]) k.clone();
    }
}
