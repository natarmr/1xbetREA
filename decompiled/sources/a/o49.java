package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class o49 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o49 f24622a;
    public static final o49 b;
    public static final /* synthetic */ o49[] c;

    static {
        o49 o49Var = new o49("VIDEO", 0);
        f24622a = o49Var;
        o49 o49Var2 = new o49("ZONE", 1);
        b = o49Var2;
        c = new o49[]{o49Var, o49Var2};
    }

    public static o49 valueOf(String str) {
        return (o49) Enum.valueOf(o49.class, str);
    }

    public static o49[] values() {
        return (o49[]) c.clone();
    }
}
