package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class yo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final yo0 f42963a;
    public static final yo0 b;
    public static final yo0 c;
    public static final yo0 d;
    public static final yo0 e;
    public static final /* synthetic */ yo0[] f;

    static {
        yo0 yo0Var = new yo0("TOP", 0);
        f42963a = yo0Var;
        yo0 yo0Var2 = new yo0("BOTTOM", 1);
        b = yo0Var2;
        yo0 yo0Var3 = new yo0("MIDDLE", 2);
        c = yo0Var3;
        yo0 yo0Var4 = new yo0("SINGLE", 3);
        d = yo0Var4;
        yo0 yo0Var5 = new yo0("NONE", 4);
        e = yo0Var5;
        f = new yo0[]{yo0Var, yo0Var2, yo0Var3, yo0Var4, yo0Var5};
    }

    public static yo0 valueOf(String str) {
        return (yo0) Enum.valueOf(yo0.class, str);
    }

    public static yo0[] values() {
        return (yo0[]) f.clone();
    }
}
