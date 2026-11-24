package a;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class ano0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g9m0 f1166a;
    public static final ano0 b;
    public static final ano0 c;
    public static final ano0 d;
    public static final ano0 e;
    public static final /* synthetic */ ano0[] f;

    static {
        ano0 ano0Var = new ano0("YELLOW_CARDS", 0);
        b = ano0Var;
        ano0 ano0Var2 = new ano0("RED_CARDS", 1);
        c = ano0Var2;
        ano0 ano0Var3 = new ano0("CORNERS", 2);
        d = ano0Var3;
        ano0 ano0Var4 = new ano0(GrsBaseInfo.CountryCodeSource.UNKNOWN, 3);
        e = ano0Var4;
        f = new ano0[]{ano0Var, ano0Var2, ano0Var3, ano0Var4};
        f1166a = new g9m0();
    }

    public static ano0 valueOf(String str) {
        return (ano0) Enum.valueOf(ano0.class, str);
    }

    public static ano0[] values() {
        return (ano0[]) f.clone();
    }
}
