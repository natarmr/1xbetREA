package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class mk80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mk80 f21934a;
    public static final mk80 b;
    public static final /* synthetic */ mk80[] c;

    static {
        mk80 mk80Var = new mk80("NO_ERROR", 0);
        f21934a = mk80Var;
        mk80 mk80Var2 = new mk80("CONTENT_ERROR", 1);
        b = mk80Var2;
        c = new mk80[]{mk80Var, mk80Var2};
    }

    public static mk80 valueOf(String str) {
        return (mk80) Enum.valueOf(mk80.class, str);
    }

    public static mk80[] values() {
        return (mk80[]) c.clone();
    }
}
