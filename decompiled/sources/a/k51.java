package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class k51 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k51 f17696a;
    public static final k51 b;
    public static final /* synthetic */ k51[] c;

    static {
        k51 k51Var = new k51("BACK", 0);
        f17696a = k51Var;
        k51 k51Var2 = new k51("TRY_AGAIN", 1);
        b = k51Var2;
        c = new k51[]{k51Var, k51Var2};
    }

    public static k51 valueOf(String str) {
        return (k51) Enum.valueOf(k51.class, str);
    }

    public static k51[] values() {
        return (k51[]) c.clone();
    }
}
