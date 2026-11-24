package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class evq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final evq0 f8484a;
    public static final evq0 b;
    public static final evq0 c;
    public static final /* synthetic */ evq0[] d;

    static {
        evq0 evq0Var = new evq0("On", 0);
        f8484a = evq0Var;
        evq0 evq0Var2 = new evq0("Off", 1);
        b = evq0Var2;
        evq0 evq0Var3 = new evq0("Indeterminate", 2);
        c = evq0Var3;
        d = new evq0[]{evq0Var, evq0Var2, evq0Var3};
    }

    public static evq0 valueOf(String str) {
        return (evq0) Enum.valueOf(evq0.class, str);
    }

    public static evq0[] values() {
        return (evq0[]) d.clone();
    }
}
