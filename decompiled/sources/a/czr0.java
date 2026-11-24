package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class czr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final czr0 f5237a;
    public static final czr0 b;
    public static final czr0 c;
    public static final /* synthetic */ czr0[] d;

    static {
        czr0 czr0Var = new czr0("PREPARE", 0);
        f5237a = czr0Var;
        czr0 czr0Var2 = new czr0("ACTIVE", 1);
        b = czr0Var2;
        czr0 czr0Var3 = new czr0("COMPLETE", 2);
        c = czr0Var3;
        d = new czr0[]{czr0Var, czr0Var2, czr0Var3};
    }

    public static czr0 valueOf(String str) {
        return (czr0) Enum.valueOf(czr0.class, str);
    }

    public static czr0[] values() {
        return (czr0[]) d.clone();
    }
}
