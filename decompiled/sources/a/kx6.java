package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class kx6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kx6 f19037a;
    public static final kx6 b;
    public static final kx6 c;
    public static final /* synthetic */ kx6[] d;

    static {
        kx6 kx6Var = new kx6("Primary", 0);
        f19037a = kx6Var;
        kx6 kx6Var2 = new kx6("Error", 1);
        b = kx6Var2;
        kx6 kx6Var3 = new kx6("Disabled", 2);
        c = kx6Var3;
        d = new kx6[]{kx6Var, kx6Var2, kx6Var3};
    }

    public static kx6 valueOf(String str) {
        return (kx6) Enum.valueOf(kx6.class, str);
    }

    public static kx6[] values() {
        return (kx6[]) d.clone();
    }
}
