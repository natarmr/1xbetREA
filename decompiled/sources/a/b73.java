package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class b73 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b73 f2083a;
    public static final b73 b;
    public static final /* synthetic */ b73[] c;

    static {
        b73 b73Var = new b73("BoundReached", 0);
        f2083a = b73Var;
        b73 b73Var2 = new b73("Finished", 1);
        b = b73Var2;
        c = new b73[]{b73Var, b73Var2};
    }

    public static b73 valueOf(String str) {
        return (b73) Enum.valueOf(b73.class, str);
    }

    public static b73[] values() {
        return (b73[]) c.clone();
    }
}
