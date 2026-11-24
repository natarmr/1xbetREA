package a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class udo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final udo0 f35490a;
    public static final udo0 b;
    public static final udo0 c;
    public static final /* synthetic */ udo0[] d;

    static {
        udo0 udo0Var = new udo0("Tabs", 0);
        f35490a = udo0Var;
        udo0 udo0Var2 = new udo0("Divider", 1);
        b = udo0Var2;
        udo0 udo0Var3 = new udo0("Indicator", 2);
        c = udo0Var3;
        d = new udo0[]{udo0Var, udo0Var2, udo0Var3};
    }

    public static udo0 valueOf(String str) {
        return (udo0) Enum.valueOf(udo0.class, str);
    }

    public static udo0[] values() {
        return (udo0[]) d.clone();
    }
}
