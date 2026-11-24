package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class dx80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final dx80 f6836a;
    public static final dx80 b;
    public static final /* synthetic */ dx80[] c;

    static {
        dx80 dx80Var = new dx80("CLOSED", 0);
        f6836a = dx80Var;
        dx80 dx80Var2 = new dx80("OPEN", 1);
        b = dx80Var2;
        c = new dx80[]{dx80Var, dx80Var2};
    }

    public static dx80 valueOf(String str) {
        return (dx80) Enum.valueOf(dx80.class, str);
    }

    public static dx80[] values() {
        return (dx80[]) c.clone();
    }
}
