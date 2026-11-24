package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class o31 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o31 f24558a;
    public static final o31 b;
    public static final o31 c;
    public static final /* synthetic */ o31[] d;

    static {
        o31 o31Var = new o31("TAKE_PART", 0);
        f24558a = o31Var;
        o31 o31Var2 = new o31("LATER", 1);
        b = o31Var2;
        o31 o31Var3 = new o31("IGNORE", 2);
        c = o31Var3;
        d = new o31[]{o31Var, o31Var2, o31Var3};
    }

    public static o31 valueOf(String str) {
        return (o31) Enum.valueOf(o31.class, str);
    }

    public static o31[] values() {
        return (o31[]) d.clone();
    }
}
