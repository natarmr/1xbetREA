package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ug20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ug20 f35603a;
    public static final ug20 b;
    public static final ug20 c;
    public static final /* synthetic */ ug20[] d;

    static {
        ug20 ug20Var = new ug20("LITE_NO_TABS", 0);
        f35603a = ug20Var;
        ug20 ug20Var2 = new ug20("MEDIUM_CUSTOM_BACKGROUND", 1);
        b = ug20Var2;
        ug20 ug20Var3 = new ug20("FULL_SCREEN_SLIDER", 2);
        c = ug20Var3;
        d = new ug20[]{ug20Var, ug20Var2, ug20Var3};
    }

    public static ug20 valueOf(String str) {
        return (ug20) Enum.valueOf(ug20.class, str);
    }

    public static ug20[] values() {
        return (ug20[]) d.clone();
    }
}
