package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class cp5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cp5 f4728a;
    public static final cp5 b;
    public static final /* synthetic */ cp5[] c;

    static {
        cp5 cp5Var = new cp5("THEME", 0);
        f4728a = cp5Var;
        cp5 cp5Var2 = new cp5("STATIC", 1);
        b = cp5Var2;
        c = new cp5[]{cp5Var, cp5Var2};
    }

    public static cp5 valueOf(String str) {
        return (cp5) Enum.valueOf(cp5.class, str);
    }

    public static cp5[] values() {
        return (cp5[]) c.clone();
    }
}
