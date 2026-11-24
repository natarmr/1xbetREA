package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class sjo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final sjo0 f32312a;
    public static final sjo0 b;
    public static final /* synthetic */ sjo0[] c;

    static {
        sjo0 sjo0Var = new sjo0("COLORED", 0);
        f32312a = sjo0Var;
        sjo0 sjo0Var2 = new sjo0("BADGED", 1);
        b = sjo0Var2;
        c = new sjo0[]{sjo0Var, sjo0Var2};
    }

    public static sjo0 valueOf(String str) {
        return (sjo0) Enum.valueOf(sjo0.class, str);
    }

    public static sjo0[] values() {
        return (sjo0[]) c.clone();
    }
}
