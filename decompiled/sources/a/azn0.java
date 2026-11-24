package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class azn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final azn0 f1726a;
    public static final azn0 b;
    public static final /* synthetic */ azn0[] c;

    static {
        azn0 azn0Var = new azn0("GREEN", 0);
        f1726a = azn0Var;
        azn0 azn0Var2 = new azn0("RED", 1);
        b = azn0Var2;
        c = new azn0[]{azn0Var, azn0Var2};
    }

    public static azn0 valueOf(String str) {
        return (azn0) Enum.valueOf(azn0.class, str);
    }

    public static azn0[] values() {
        return (azn0[]) c.clone();
    }
}
