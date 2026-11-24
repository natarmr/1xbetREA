package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class hrj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hrj0 f13533a;
    public static final hrj0 b;
    public static final hrj0 c;
    public static final hrj0 d;
    public static final /* synthetic */ hrj0[] e;

    static {
        hrj0 hrj0Var = new hrj0("CACHE", 0);
        f13533a = hrj0Var;
        hrj0 hrj0Var2 = new hrj0("NETWORK", 1);
        b = hrj0Var2;
        hrj0 hrj0Var3 = new hrj0("EMPTY", 2);
        c = hrj0Var3;
        hrj0 hrj0Var4 = new hrj0("ERROR", 3);
        d = hrj0Var4;
        e = new hrj0[]{hrj0Var, hrj0Var2, hrj0Var3, hrj0Var4};
    }

    public static hrj0 valueOf(String str) {
        return (hrj0) Enum.valueOf(hrj0.class, str);
    }

    public static hrj0[] values() {
        return (hrj0[]) e.clone();
    }
}
