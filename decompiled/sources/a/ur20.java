package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ur20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ur20 f36144a;
    public static final ur20 b;
    public static final ur20 c;
    public static final /* synthetic */ ur20[] d;

    static {
        ur20 ur20Var = new ur20("NORMAL", 0);
        f36144a = ur20Var;
        ur20 ur20Var2 = new ur20("INCREASED", 1);
        b = ur20Var2;
        ur20 ur20Var3 = new ur20("DECREASED", 2);
        c = ur20Var3;
        d = new ur20[]{ur20Var, ur20Var2, ur20Var3};
    }

    public static ur20 valueOf(String str) {
        return (ur20) Enum.valueOf(ur20.class, str);
    }

    public static ur20[] values() {
        return (ur20[]) d.clone();
    }
}
