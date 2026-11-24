package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class t150 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t150 f33153a;
    public static final t150 b;
    public static final t150 c;
    public static final /* synthetic */ t150[] d;

    static {
        t150 t150Var = new t150("AUTH", 0);
        f33153a = t150Var;
        t150 t150Var2 = new t150("BONUS_BANNER", 1);
        b = t150Var2;
        t150 t150Var3 = new t150("AUTH_BANNER", 2);
        c = t150Var3;
        d = new t150[]{t150Var, t150Var2, t150Var3};
    }

    public static t150 valueOf(String str) {
        return (t150) Enum.valueOf(t150.class, str);
    }

    public static t150[] values() {
        return (t150[]) d.clone();
    }
}
