package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class c890 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c890 f3903a;
    public static final c890 b;
    public static final c890 c;
    public static final c890 d;
    public static final c890 e;
    public static final /* synthetic */ c890[] f;

    static {
        c890 c890Var = new c890("LOADING", 0);
        f3903a = c890Var;
        c890 c890Var2 = new c890("CONTENT", 1);
        b = c890Var2;
        c890 c890Var3 = new c890("NETWORK_ERROR", 2);
        c = c890Var3;
        c890 c890Var4 = new c890("ERROR_DATA", 3);
        d = c890Var4;
        c890 c890Var5 = new c890("ERROR_HTTP", 4);
        e = c890Var5;
        f = new c890[]{c890Var, c890Var2, c890Var3, c890Var4, c890Var5};
    }

    public static c890 valueOf(String str) {
        return (c890) Enum.valueOf(c890.class, str);
    }

    public static c890[] values() {
        return (c890[]) f.clone();
    }
}
