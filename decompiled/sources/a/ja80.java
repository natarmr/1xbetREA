package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ja80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ja80 f16178a;
    public static final ja80 b;
    public static final /* synthetic */ ja80[] c;

    static {
        ja80 ja80Var = new ja80("Together", 0);
        f16178a = ja80Var;
        ja80 ja80Var2 = new ja80("Sequentially", 1);
        b = ja80Var2;
        c = new ja80[]{ja80Var, ja80Var2};
    }

    public static ja80 valueOf(String str) {
        return (ja80) Enum.valueOf(ja80.class, str);
    }

    public static ja80[] values() {
        return (ja80[]) c.clone();
    }
}
