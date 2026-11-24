package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class abp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final abp0 f591a;
    public static final abp0 b;
    public static final abp0 c;
    public static final abp0 d;
    public static final abp0 e;
    public static final abp0 f;
    public static final /* synthetic */ abp0[] g;

    static {
        abp0 abp0Var = new abp0("UNDEFINED", 0);
        f591a = abp0Var;
        abp0 abp0Var2 = new abp0("SUPPORT", 1);
        b = abp0Var2;
        abp0 abp0Var3 = new abp0("MID_LANE", 2);
        c = abp0Var3;
        abp0 abp0Var4 = new abp0("TOP_LANE", 3);
        d = abp0Var4;
        abp0 abp0Var5 = new abp0("JUNGLE", 4);
        e = abp0Var5;
        abp0 abp0Var6 = new abp0("BOT_LANE", 5);
        f = abp0Var6;
        g = new abp0[]{abp0Var, abp0Var2, abp0Var3, abp0Var4, abp0Var5, abp0Var6};
    }

    public static abp0 valueOf(String str) {
        return (abp0) Enum.valueOf(abp0.class, str);
    }

    public static abp0[] values() {
        return (abp0[]) g.clone();
    }
}
