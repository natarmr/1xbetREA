package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class u1u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u1u0 f34918a;
    public static final u1u0 b;
    public static final u1u0 c;
    public static final /* synthetic */ u1u0[] d;

    static {
        u1u0 u1u0Var = new u1u0("ATTACK", 0);
        f34918a = u1u0Var;
        u1u0 u1u0Var2 = new u1u0("DEFEND", 1);
        b = u1u0Var2;
        u1u0 u1u0Var3 = new u1u0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 2);
        c = u1u0Var3;
        d = new u1u0[]{u1u0Var, u1u0Var2, u1u0Var3};
    }

    public static u1u0 valueOf(String str) {
        return (u1u0) Enum.valueOf(u1u0.class, str);
    }

    public static u1u0[] values() {
        return (u1u0[]) d.clone();
    }
}
