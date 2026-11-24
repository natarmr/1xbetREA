package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class u6d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u6d0 f35133a;
    public static final u6d0 b;
    public static final /* synthetic */ u6d0[] c;

    static {
        u6d0 u6d0Var = new u6d0("HTTP", 0);
        f35133a = u6d0Var;
        u6d0 u6d0Var2 = new u6d0("SOCKS", 1);
        b = u6d0Var2;
        c = new u6d0[]{u6d0Var, u6d0Var2};
    }

    public static u6d0 valueOf(String str) {
        return (u6d0) Enum.valueOf(u6d0.class, str);
    }

    public static u6d0[] values() {
        return (u6d0[]) c.clone();
    }
}
