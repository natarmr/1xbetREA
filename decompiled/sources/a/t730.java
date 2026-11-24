package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class t730 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t730 f33447a;
    public static final t730 b;
    public static final t730 c;
    public static final t730 d;
    public static final /* synthetic */ t730[] e;

    static {
        t730 t730Var = new t730("CLASSIC", 0);
        f33447a = t730Var;
        t730 t730Var2 = new t730("ADVANCED", 1);
        b = t730Var2;
        t730 t730Var3 = new t730("DASHBOARD", 2);
        c = t730Var3;
        t730 t730Var4 = new t730("LITE", 3);
        d = t730Var4;
        e = new t730[]{t730Var, t730Var2, t730Var3, t730Var4};
    }

    public static t730 valueOf(String str) {
        return (t730) Enum.valueOf(t730.class, str);
    }

    public static t730[] values() {
        return (t730[]) e.clone();
    }
}
