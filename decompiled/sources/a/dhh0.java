package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class dhh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dhh0 f6091a;
    public static final dhh0 b;
    public static final dhh0 c;
    public static final dhh0 d;
    public static final /* synthetic */ dhh0[] e;

    static {
        dhh0 dhh0Var = new dhh0("LIVE_MODE", 0);
        f6091a = dhh0Var;
        dhh0 dhh0Var2 = new dhh0("LINE_MODE", 1);
        b = dhh0Var2;
        dhh0 dhh0Var3 = new dhh0("LINE_LIVE_MODE", 2);
        c = dhh0Var3;
        dhh0 dhh0Var4 = new dhh0("PREVIEW_MODE", 3);
        d = dhh0Var4;
        e = new dhh0[]{dhh0Var, dhh0Var2, dhh0Var3, dhh0Var4};
    }

    public static dhh0 valueOf(String str) {
        return (dhh0) Enum.valueOf(dhh0.class, str);
    }

    public static dhh0[] values() {
        return (dhh0[]) e.clone();
    }
}
