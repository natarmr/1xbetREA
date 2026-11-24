package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
public final class ni20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ni20 f23563a;
    public static final ni20 b;
    public static final /* synthetic */ ni20[] c;

    static {
        ni20 ni20Var = new ni20("SIMPLE", 0);
        f23563a = ni20Var;
        ni20 ni20Var2 = new ni20("PROMO", 1);
        b = ni20Var2;
        c = new ni20[]{ni20Var, ni20Var2};
    }

    public static ni20 valueOf(String str) {
        return (ni20) Enum.valueOf(ni20.class, str);
    }

    public static ni20[] values() {
        return (ni20[]) c.clone();
    }
}
