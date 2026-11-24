package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class vyc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vyc0 f38241a;
    public static final vyc0 b;
    public static final /* synthetic */ vyc0[] c;

    static {
        vyc0 vyc0Var = new vyc0("Primary", 0);
        f38241a = vyc0Var;
        vyc0 vyc0Var2 = new vyc0("Disabled", 1);
        b = vyc0Var2;
        c = new vyc0[]{vyc0Var, vyc0Var2};
    }

    public static vyc0 valueOf(String str) {
        return (vyc0) Enum.valueOf(vyc0.class, str);
    }

    public static vyc0[] values() {
        return (vyc0[]) c.clone();
    }
}
