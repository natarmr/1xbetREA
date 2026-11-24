package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class c050 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c050 f3507a;
    public static final c050 b;
    public static final c050 c;
    public static final /* synthetic */ c050[] d;

    static {
        c050 c050Var = new c050("Default", 0);
        f3507a = c050Var;
        c050 c050Var2 = new c050("UserInput", 1);
        b = c050Var2;
        c050 c050Var3 = new c050("PreventUserInput", 2);
        c = c050Var3;
        d = new c050[]{c050Var, c050Var2, c050Var3};
    }

    public static c050 valueOf(String str) {
        return (c050) Enum.valueOf(c050.class, str);
    }

    public static c050[] values() {
        return (c050[]) d.clone();
    }
}
